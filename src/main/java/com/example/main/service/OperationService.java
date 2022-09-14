package com.example.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationService {

	@Autowired
	private ServiceAddition serviceAddition;

	@Autowired
	private ServiceDivision serviceDivision;

	@Autowired
	private ServiceSubract serviceSubract;

	@Autowired
	private ServiceMultiplication serviceMultiplication;

	public void performAllOperation(int a, int b) {

		int addition = serviceAddition.operation(a, b);
		System.out.println("addition of two numbers" + addition);

		int subraction = serviceSubract.operation(a, b);
		System.out.println("subraction of two numbers" + subraction);

		int division = serviceDivision.operation(a, b);
		System.out.println("division of two numbers" + division);

		int multiplication = serviceMultiplication.operation(a, b);
		System.out.println("multiplication of two numbers" + multiplication);

	}

	public void doOperation(int a, int b) {
		serviceAddition.doAddition(a, b);
	}
}
