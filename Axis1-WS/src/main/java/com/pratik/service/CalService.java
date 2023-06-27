package com.pratik.service;

/*
 To see whether WebServices successfully deployed on the server or not 
 Checkout below URL -
 
 http://localhost:8080/Axis1-WS/services/CalService?wsdl

 */

public class CalService {

	public int add(int i, int j) {

		if (i < 1 && j < 1) {
			throw new ArithmeticException("Pls send valid values");
		}

		return i + j;
	}
}
