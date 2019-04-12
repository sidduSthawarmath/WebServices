package com.siddu.soap.jaxws.documentstyle;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class DocumentStyleHelloWorldClient {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:7070/SOAP-WebServices/services/DocumentStyleHelloWorldImpl?wsdl");
		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://documentstyle.jaxws.soap.siddu.com/", "DocumentStyleHelloWorldImplService");
		Service service = Service.create(url, qname);
		DocumentStyleHelloWorld hello = service.getPort(DocumentStyleHelloWorld.class);
		System.out.println(hello.getMessage());
	}
}
