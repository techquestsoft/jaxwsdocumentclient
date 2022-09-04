package com.training.ws.document;

//Service Endpoint Interface
@javax.jws.WebService
@javax.jws.soap.SOAPBinding(style = javax.jws.soap.SOAPBinding.Style.DOCUMENT)
public interface HelloWorld {

    @javax.jws.WebMethod
    String getHelloWorldAsString(String name);

}