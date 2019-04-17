package bfusalogger.internal;

import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Example;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
@Operations(BfusaloggerOperations.class)
//@ConnectionProviders(BfusaloggerConnectionProvider.class)
public class BfusaloggerConfiguration {

  @Parameter
  @DisplayName ("Application Name")
  @Summary("Name of the Mule Application")
  @Example("#{app_name}")
  private String appName;
  
  @Parameter
  @DisplayName ("Application Version")
  @Summary("Mule Application Version")
  @Example("#{app_version}")
  private String appVersion;
  
  @Parameter
  @DisplayName ("Environmnet")
  @Summary("Environment Details")
  @Example("#{env}")
  private String env;
  
  @Parameter
  @DisplayName ("Application Type")
  @Summary("Mule Application Type")
  @Example("#{app_type}")
  private String appType;
  

@Parameter
  @DisplayName ("Application Info logging")
  @Summary("Application Enable Info Logging")
  @Example("#{app.enable.infologging}")
  private boolean appEnableLogging;
  
  public String getAppName() {
	return appName;
}
  
  public String getAppVersion() {
	return appVersion;
}

public void setAppVersion(String appVersion) {
	this.appVersion = appVersion;
}

public String getEnv() {
	return env;
}

public void setEnv(String env) {
	this.env = env;
}

public String getAppType() {
	return appType;
}

public void setAppType(String appType) {
	this.appType = appType;
}

public void setAppName(String appName) {
	this.appName = appName;
}

public boolean getappEnableLogging() {
	return appEnableLogging;
}

}
