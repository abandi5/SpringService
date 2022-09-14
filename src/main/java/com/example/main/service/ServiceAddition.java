package com.example.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceAddition implements ServiceMathOperation {


	@Autowired
	private ServiceSubract serviceSubract;

	@Override
	public Integer operation(int a, int b) {
		return a+b;
	}

	public void doAddition(int a, int b) {
		
		System.out.println("Addition of two numbers:"+this.operation(a, b));
		serviceSubract.doSubstract(a,b);
		
	}
	
	

}
