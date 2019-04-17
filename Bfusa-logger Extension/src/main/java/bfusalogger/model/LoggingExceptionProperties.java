package bfusalogger.model;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Example;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

public class LoggingExceptionProperties {
	
	@Parameter
	@Optional
	@DisplayName("Exception Code")
	@Summary("Exception Status Code")
	@Example("400")
	private String exStatusCode;
	

	@Parameter
	@Optional
	@DisplayName("Error Message")
	@Summary("Error Message for any Mule Exception")
	@Example("#[error.exception.message]")
	private String exMessage ;
	
	@Parameter
	@Optional
	@DisplayName("Error Detail")
	@Summary("Error details for any Mule Exception")
	@Example("#[error.exception.detailMessage]")
	private String exDetail ;
	
	public String getExStatusCode() {
		return exStatusCode;
	}

	public void setExStatusCode(String exStatusCode) {
		this.exStatusCode = exStatusCode;
	}

	public String getExMessage() {
		return exMessage;
	}

	public void setExMessage(String exMessage) {
		this.exMessage = exMessage;
	}

	public String getExDetail() {
		return exDetail;
	}

	public void setExDetail(String exDetail) {
		this.exDetail = exDetail;
	}



}
