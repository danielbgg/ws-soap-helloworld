package br.com.danielbgg.ws.soap.helloworld;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "br.com.danielbgg.ws.soap.helloworld.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}