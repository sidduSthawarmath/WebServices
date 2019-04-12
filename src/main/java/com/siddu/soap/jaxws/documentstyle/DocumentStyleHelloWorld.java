package com.siddu.soap.jaxws.documentstyle;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface DocumentStyleHelloWorld {
	
	@WebMethod
	public String getMessage();
	

}
