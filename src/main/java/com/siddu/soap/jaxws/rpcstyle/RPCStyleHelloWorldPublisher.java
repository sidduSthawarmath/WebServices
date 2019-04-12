package com.siddu.soap.jaxws.rpcstyle;

import javax.xml.ws.Endpoint;

public class RPCStyleHelloWorldPublisher {
	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:7070/SOAP-WebServices/services/RPCStyleHelloWorldImpl", new RPCStyleHelloWorldImpl());  	
	}
}

