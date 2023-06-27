package com.pratik.service;

public class TestClient {
	public static void main(String[] args) throws Exception {
		java.net.URL url = new java.net.URL("http://localhost:8080/Axis1-WS/services/CalService?wsdl");
		org.apache.axis.client.Service service = new org.apache.axis.client.Service();
		CalServiceSoapBindingStub stub = new CalServiceSoapBindingStub(url, service);
		int result = stub.add(100, 50);
		System.out.println(result);
	}
}
