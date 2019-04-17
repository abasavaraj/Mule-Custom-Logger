# Mule-logger Extension

The default Mule logger is simple to use for logging but does not provide complete information with Corelation.  It also doesn’t provide a way to generate structured or consistent log messages. 

This custom logger generate structured logs and enforces standards on the log data to be generated. The idea of this module should be to generate consistently structured logs in JSON format.the Developer can import this module into his Mule project and provide specific information. The Module will convert the data into JSON and publish the logs.

com.mule.logger: {
  "app_env": "Dev",
  "app_name": "Test",
  "app_thread": "[MuleRuntime].cpuLight.12: [hello-world].hello-worldFlow.CPU_LITE @668e0bd0",
  "app_version": "1.0.0",
  "log_data": {
    "masterCorrelation_ID": "2d225bb7-185e-458c-a9f5-1ddebc3086ee",
    "currentCorrelation_ID": "035648b5-0f4c-4d05-abcb-958bebba8b0b",
    "message": "This is a Test message",
    "level": "INFO",
    "trace": "START",
    "sourceSystem": "SAP",
    "targetSystem": "SQLSERVER",
    "transactionDateTime": "2019-04-17T12:12:10.269-07:00[America/Los_Angeles]",
    "payload": ""
  },
  "log_exception": {},
  "log_http": {
    "relativePath": "/helloWorld",
    "method": "GET",
    "localAddress": "127.0.0.1/127.0.0.1:8081",
    "remoteAddress": "/127.0.0.1:50987"
  },
  "log_location": {
    "component": "mule-logger:mule-custom-logger",
    "file_name": "hello-world.xml",
    "line_in_file": "16",
    "location": "hello-worldFlow/processors/1",
    "root_container": "hello-worldFlow"
  }
}


...

To use this Module
...


Add this dependency to your application pom.xml

```
<groupId>org.mule.extension</groupId>
<artifactId>mule-logger</artifactId>
<version>4.0.0</version>
<classifier>mule-plugin</classifier>
```
