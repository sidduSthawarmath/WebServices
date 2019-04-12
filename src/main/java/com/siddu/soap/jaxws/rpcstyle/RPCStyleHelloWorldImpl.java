package com.siddu.soap.jaxws.rpcstyle;

import javax.jws.WebService;

@WebService(endpointInterface = "com.siddu.soap.jaxws.rpcstyle.RPCStyleHelloWorld")
public class RPCStyleHelloWorldImpl implements RPCStyleHelloWorld {

	public String getMessage() {
		return "This is JAX-WS RPC style soap service";
	}

}
