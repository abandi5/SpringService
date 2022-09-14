package com.example.main.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

@SpringBootTest
public class ServiceMultiplicationTest {

	@Autowired
	private ServiceMultiplication serviceMultiplication;
	
	@SpyBean
	private ServiceDivision serviceDivision;
	
	
	@Test
	public void testMultiServiceLevel_ServiceMultiplication() throws Exception {
		serviceMultiplication.doMultiplication(10, 2);
		verify(serviceDivision, times(1)).doDivision(10, 2);

	}

	@Test
	public void testMultiplicationOperation() {
		int result = serviceMultiplication.operation(10, 5);
		assertEquals(50, result);
	
}
	
	
}
