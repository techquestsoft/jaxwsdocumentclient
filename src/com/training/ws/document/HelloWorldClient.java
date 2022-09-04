package com.training.ws.document;

public class HelloWorldClient {
    public static void main(String[] args) throws Exception {
        java.net.URL url = new java.net.URL("http://localhost:7779/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        javax.xml.namespace.QName qname = new javax.xml.namespace.QName("http://document.ws.training.com/", "HelloWorldImplService");

        javax.xml.ws.Service service = javax.xml.ws.Service.create(url, qname);
        com.training.ws.document.HelloWorld hello = service.getPort(com.training.ws.document.HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("javatpoint document"));

    }

}