package com.siddu.soap.jaxws.rpcstyle;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface RPCStyleHelloWorld {
	
	@WebMethod
	public String getMessage();
	

}
