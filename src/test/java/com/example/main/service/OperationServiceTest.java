package com.example.main.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

@SpringBootTest
public class OperationServiceTest {

	@Autowired
	private OperationService operationService;

	@SpyBean
	private ServiceAddition serviceAddition;

	@SpyBean
	private ServiceDivision serviceDivision;

	@SpyBean
	private ServiceSubract serviceSubract;

	@SpyBean
	private ServiceMultiplication serviceMultiplication;

	@Test
	public void testperformAllOperationSuccess() {

		operationService.performAllOperation(2, 1);
		verify(serviceAddition, times(1)).operation(2, 1);
		verify(serviceDivision, times(1)).operation(2, 1);
		verify(serviceMultiplication, times(1)).operation(2, 1);
		verify(serviceSubract, times(1)).operation(2, 1);
	}

	@Test
	public void testMultiServiceLevel() throws Exception {

		operationService.doOperation(5, 2);
		verify(serviceAddition, times(1)).doAddition(5, 2);
		verify(serviceDivision, times(1)).doDivision(5, 2);
		verify(serviceMultiplication, times(1)).doMultiplication(5, 2);
		verify(serviceSubract, times(1)).doSubstract(5, 2);

	}

	@Test
	public void testMultiServiceLevel_OperationService() throws Exception {

		operationService.doOperation(10, 0);
		verify(serviceAddition, times(1)).doAddition(10, 0);
		verify(serviceSubract, times(1)).doSubstract(10, 0);
		verify(serviceMultiplication, times(1)).doMultiplication(10, 0);
		verify(serviceDivision, times(1)).doDivision(10, 0);

	}

}
