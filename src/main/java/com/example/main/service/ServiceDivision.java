package com.example.main.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceDivision implements ServiceMathOperation{

	@Override
	public Integer operation(int a, int b) {
		return a/b;
		
	}



	public void doDivision(int a, int b) {

		System.out.println("division of two numbers "+this.operation(a, b));
	}

}
