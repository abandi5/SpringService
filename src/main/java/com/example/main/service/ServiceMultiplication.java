package com.example.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceMultiplication implements ServiceMathOperation{

	@Autowired
	private ServiceDivision serviceDivision;
	
	@Override
	public Integer operation(int a, int b) {
		return a*b;
	}

	public void doMultiplication(int a, int b) {

		System.out.println("division of two numbers:"+this.operation(a, b));
		try {
			serviceDivision.doDivision(a,b);
         } catch (Exception e) {
        	 System.out.println("exception occurs");

}
		
	}

}
