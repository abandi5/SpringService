package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.service.OperationService;

@RestController
public class OperationController {

	@Autowired
	private OperationService operationService;
	
	@GetMapping("/allOperations")
	public ResponseEntity<String> getAllOperations(@RequestParam(name = "inputA") Integer inputA,
			@RequestParam(name="inputB") Integer inputB)
	{
		operationService.performAllOperation(inputA, inputB);
		
		return new ResponseEntity<String>("success",HttpStatus.OK);
		
	}
	
	@GetMapping("/multiLevelOperation")
	public ResponseEntity<String> multiLevelOperation(@RequestParam(name = "inputA") Integer inputA,
			@RequestParam(name="inputB") Integer inputB) throws Exception
	{
		
		operationService.doOperation(inputA, inputB);
		
		
		return new ResponseEntity<String>("success",HttpStatus.OK); 
		
		
	}
	
}
