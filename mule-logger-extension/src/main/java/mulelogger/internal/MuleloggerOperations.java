package mulelogger.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import java.util.TreeMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import mulelogger.model.LocationInfoProperties;
import mulelogger.model.LoggingExceptionProperties;
import mulelogger.model.LoggingHttpProperties;
import mulelogger.model.LoggingProperties;

import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.api.component.location.ComponentLocation;
import org.mule.runtime.extension.api.annotation.param.Config;


/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class MuleloggerOperations {
	
	protected Log Logger;

  /**
   * Example of an operation that uses the configuration and a connection instance to perform some action.
   */
 // @MediaType(value = ANY, strict = false)
 // public String retrieveInfo(@Config MuleloggerConfiguration configuration, @Connection MuleloggerConnection connection){
 //   return "Using Configuration [" + configuration.getConfigId() + "] with Connection id [" + connection.getId() + "]";
 // }
  @MediaType(value = ANY, strict =false)
  public void MuleCustomLogger(@ParameterGroup(name = "AppLog") LoggingProperties loggingProperties,
		  @ParameterGroup(name="HttpLog") LoggingHttpProperties logHttpProperties,
		  @ParameterGroup(name="Exception") LoggingExceptionProperties logExpProperties,
		  @ParameterGroup(name="LocationInfo") LocationInfoProperties logLocationInfo,
		  ComponentLocation locationInfo,
		  @Config MuleloggerConfiguration logConfiguration){
	      initLogger("com.mule.logger");
	  try {
		  
		  Gson jsonData = new GsonBuilder().setPrettyPrinting().create();
		  TreeMap<String, Object> logContent = new TreeMap<String, Object>();
		  
		  if (logLocationInfo.getLogLocationInfo() == true) {
			  TreeMap<String, Object> logLocationData = new TreeMap<String, Object>();
        	  logLocationData.put("location", locationInfo.getLocation());
        	  logLocationData.put("root_container", locationInfo.getRootContainerName());
        	  logLocationData.put("component", locationInfo.getComponentIdentifier().getIdentifier().toString());
        	  logLocationData.put("file_name", locationInfo.getFileName().orElse(""));
        	  logLocationData.put("line_in_file", String.valueOf(locationInfo.getLineInFile().orElse(null)));
        	  
              logContent.put("log_location", logLocationData);
          }
		  
		  logContent.put("app_name", logConfiguration.getAppName());
          logContent.put("app_version", logConfiguration.getAppVersion());
          logContent.put("app_env", logConfiguration.getEnv());
          logContent.put("app_thread", Thread.currentThread().getName());
          if(loggingProperties.equals(null)){
        	  logLevel("Logging Properties is Empty","INFO");
          }else {
        	  logContent.put("log_data", loggingProperties);
          }
          
          if(logHttpProperties.equals(null)){
        	  logLevel("Logging Http Properties is Empty","INFO");
          }else {
        	  logContent.put("log_http", logHttpProperties);
          }
          
          if(logExpProperties.equals(null)){
        	  logLevel("Log Exception Properties is Empty","INFO");
          }else {
        	  logContent.put("log_exception", logExpProperties);
          }
          
          if(logConfiguration.getappEnableLogging()== true) {
        	  logLevel(jsonData.toJson(logContent), loggingProperties.getLevel());
          }else if(loggingProperties.getLevel() !="INFO") {
        	  logLevel(jsonData.toJson(logContent), loggingProperties.getLevel());
          }
	  }
	  catch(Exception e)
	  {
		  logLevel("Falied to Build the JSON" + e.getMessage(), "ERROR");
	  }
	  
  }
	
  
  protected void initLogger(String category) {
      this.Logger = LogFactory.getLog(category);
  }

  /**
   * Protected Methods are not exposed as operations
   */
  	 protected void logLevel(String logMessage, String logLevel) {
  		 
  		 switch(logLevel) {
  		 
  		 	case "TRACE":
  		 		Logger.trace(logMessage);
  		 		break;
  		 	case "ERROR":
  		 		Logger.error(logMessage);
  		 		break;
  		 	case "WARN":
  		 		Logger.warn(logMessage);
  		 		break;
  		 	case "DEBUG":
  		 		Logger.debug(logMessage);
  		 		break;
  		 	case "INFO":
  		 		Logger.info(logMessage);
  		 		break;
  		 	default:
  		 		break;
  		 }
  	 }
  
}
