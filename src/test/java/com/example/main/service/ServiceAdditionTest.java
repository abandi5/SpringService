package com.example.main.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

@SpringBootTest
public class ServiceAdditionTest {

	@Autowired
	private ServiceAddition serviceAddition;

	@SpyBean
	private ServiceDivision serviceDivision;

	@SpyBean
	private ServiceSubract serviceSubract;

	@SpyBean
	private ServiceMultiplication serviceMultiplication;

	@Test
	public void testMultiServiceLevel_ServiceAddition() throws Exception {
		serviceAddition.doAddition(10, 2);
		verify(serviceSubract, times(1)).doSubstract(10, 2);
		verify(serviceMultiplication, times(1)).doMultiplication(10, 2);
		verify(serviceDivision, times(1)).doDivision(10, 2);

	}

	@Test
	public void testAdditionOperation() {
		int result = serviceAddition.operation(10, 5);
		assertEquals(15, result);

	}
}
