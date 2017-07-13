package br.com.danielbgg.ws.soap.helloworld;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class HelloWorldPublisher {

	public static void main(String[] args) {
		System.out.println("Initializing server...");
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	}

}