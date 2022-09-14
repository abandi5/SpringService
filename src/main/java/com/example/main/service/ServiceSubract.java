package com.example.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceSubract implements ServiceMathOperation {

	@Autowired
	private ServiceMultiplication serviceMultiplication;
	
	@Override
	public Integer operation(int a, int b) {
		return a-b;
	}

	public void doSubstract(int a, int b){
		
		System.out.println("Multiplication of two numbers:"+this.operation(a, b));
		serviceMultiplication.doMultiplication(a,b);
		
	}

}
