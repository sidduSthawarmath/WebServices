package com.siddu.soap.jaxws.rpcstyle;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class RPCStyleHelloWorldClient {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:7070/SOAP-WebServices/services/RPCStyleHelloWorldImpl?wsdl");
		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://rpcstyle.jaxws.soap.siddu.com/", "RPCStyleHelloWorldImplService");
		Service service = Service.create(url, qname);
		RPCStyleHelloWorld hello = service.getPort(RPCStyleHelloWorld.class);
		System.out.println(hello.getMessage());
	}
}
