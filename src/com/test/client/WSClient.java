package com.test.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.test.ws.IMyServer;


public class WSClient {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://192.168.10.152:9999/myws");
		QName qName = new QName("http://impl.webservice.test.com/", "MyServerImplService");
		Service service = Service.create(url, qName);
		IMyServer myServer = service.getPort(IMyServer.class);
		String name = " 周旭 ";
		String backMsg = myServer.getMyName(name);
		System.out.println(backMsg);
	}
	
}
