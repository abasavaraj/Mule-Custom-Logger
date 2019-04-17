package mulelogger.model;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Example;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

public class LocationInfoProperties {
	
	@Parameter
	@Optional(defaultValue = "true")
	@DisplayName("Log Location Info")
	@Summary("Enable Logging the Location Info")
	private boolean logLocationInfo;

	public boolean getLogLocationInfo() {
		return logLocationInfo;
	}

}
