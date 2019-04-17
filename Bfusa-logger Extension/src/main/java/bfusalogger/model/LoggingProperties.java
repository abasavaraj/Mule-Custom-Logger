package bfusalogger.model;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Example;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

public class LoggingProperties {
	
	@Parameter
	@Optional
	@DisplayName("Master CorrelationID")
	@Summary("Unique Identifier for Master Process")
	@Example("#[vars.MasterCorrelationId]")
	private String masterCorrelation_ID;
	
	@Parameter
	@Optional
	@DisplayName("Current CorrelationID")
	@Summary("Unique Identifier for Child Process")
	@Example("#[vars.CorrelationId]")
	private String currentCorrelation_ID;

	@Parameter
	@Optional
	@DisplayName("Message")
	@Summary("Message to be Logged")
	@Example("Mule Process Message")
	private String message;
	
	@Parameter
	@Optional(defaultValue="INFO")
	@DisplayName("Log level")
	@Summary("Log level for Logging")
	@Example("#[p('application.loglevel')]")
	private String level;

	@Parameter
	@Optional(defaultValue="START")
	@DisplayName("Processing State")
	@Summary("Processing State in the Mule flow")
	@Example("START")
	private String trace ;
	
	@Parameter
	@Optional
	@DisplayName("SourceSystem")
	@Summary("Source System in the Mule flow")
	@Example("SAP")
	private String sourceSystem ;
	
	@Parameter
	@Optional
	@DisplayName("TargetSystem")
	@Summary("Target System in the Mule flow")
	@Example("SQLSERVER")
	private String targetSystem ;
	
	@Parameter
	@Optional
	@DisplayName("Transaction DateTime")
	@Summary("Transaction Datetime in \"yyyy-MM-dd'T'HH:mm:ss\"")
	@Example("#[now()]")
	private String transactionDateTime ;
	
	@Parameter
	@Optional
	@DisplayName("Payload")
	@Summary("Message Payload")
	@Example("#[write(payload,\"application/json\")]")
	String payload ;
	
	public String getMasterCorrelation_ID() {
		return masterCorrelation_ID;
	}

	public void setMasterCorrelation_ID(String masterCorrelation_ID) {
		this.masterCorrelation_ID = masterCorrelation_ID;
	}

	public String getCurrentCorrelation_ID() {
		return currentCorrelation_ID;
	}

	public void setCurrentCorrelation_ID(String currentCorrelation_ID) {
		this.currentCorrelation_ID = currentCorrelation_ID;
	}
	
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getTargetSystem() {
		return targetSystem;
	}

	public void setTargetSystem(String targetSystem) {
		this.targetSystem = targetSystem;
	}

	public String getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(String transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



	public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}


}
