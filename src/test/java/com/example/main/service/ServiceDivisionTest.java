package com.example.main.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceDivisionTest {

	@Autowired
	private ServiceDivision serviceDivision;
	
	@Test
	public void testMultiServiceLevel_ServiceDivision() throws Exception {
		serviceDivision.doDivision(10, 3);

	}

	@Test
	public void testDivisionOperation() {
		int result = serviceDivision.operation(10, 5);
		assertEquals(2, result);
	
}
	
}
