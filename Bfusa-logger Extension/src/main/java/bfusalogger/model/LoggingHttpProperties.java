package bfusalogger.model;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Example;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

public class LoggingHttpProperties {
	
	@Parameter
	@Optional
	@DisplayName("ClientID")
	@Summary("Client ID")
	@Example("#[attributes.clientID]")
	private String clientID;
	
	@Parameter
	@Optional
	@DisplayName("relative Path")
	@Summary("Http relative Path")
	@Example("#[attributes.relativePath]")
	private String relativePath;
	
	@Parameter
	@Optional
	@DisplayName("Http method")
	@Summary("Http Method")
	@Example("#[attributes.method]")
	private String method;
	
	@Parameter
	@Optional
	@DisplayName("Local address")
	@Summary("Http local address")
	@Example("#[attributes.localAddress]")
	private String localAddress;
	
	@Parameter
	@Optional
	@DisplayName("Remote address")
	@Summary("Http Remote address")
	@Example("#[attributes.remoteAddress]")
	private String remoteAddress;
	
	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getRelativePath() {
		return relativePath;
	}

	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	public String getRemoteAddress() {
		return remoteAddress;
	}

	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}

	

}
