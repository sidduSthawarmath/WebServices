
package com.siddu.soap.jaxws.documentstyle;

import javax.jws.WebService;

@WebService(endpointInterface = "com.siddu.soap.jaxws.documentstyle.DocumentStyleHelloWorld")
public class DocumentStyleHelloWorldImpl implements DocumentStyleHelloWorld {

	public String getMessage() {
		return "This is JAX-WS Document style soap service";
	}

}
