package com.test.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@javax.jws.WebService(endpointInterface = "com.test.ws.IMyServer", targetNamespace = "http://impl.webservice.test.com/", serviceName = "MyServerImplService", portName = "MyServerImplPort", wsdlLocation = "WEB-INF/wsdl/MyServerImplService.wsdl")
public class MyServerImplPortImpl {

	public String getMyName(String arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

}