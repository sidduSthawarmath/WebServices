package com.siddu.soap.jaxws.documentstyle;

import javax.xml.ws.Endpoint;

public class DocumentStyleHelloWorldPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7070/SOAP-WebServices/services/DocumentStyleHelloWorldImpl",
				new DocumentStyleHelloWorldImpl());
	}
}
