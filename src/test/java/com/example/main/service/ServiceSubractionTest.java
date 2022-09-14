package com.example.main.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;


@SpringBootTest
public class ServiceSubractionTest {

	@Autowired
	private ServiceSubract serviceSubract;
	
	@SpyBean
	private ServiceMultiplication serviceMultiplication;
	

	@SpyBean
	private ServiceDivision serviceDivision;
	
	
	@Test
	public void testMultiServiceLevel_ServiceSubract() throws Exception {
		serviceSubract.doSubstract(10, 3);
		verify(serviceMultiplication, times(1)).doMultiplication(10, 3);
		verify(serviceDivision, times(1)).doDivision(10, 3);

	}

	@Test
	public void testSubractionOperation() {
		int result = serviceSubract.operation(10, 5);
		assertEquals(5, result);
	
}
	
}
