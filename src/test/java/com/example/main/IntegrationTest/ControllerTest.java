package com.example.main.IntegrationTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void testPerformAllOperations() throws Exception {
    
		String contentAsString = this.mockMvc.perform(get("/allOperations").param("inputA", "1").param("inputB", "2"))
		.andExpect(status().isOk())
		.andReturn()
        .getResponse()
        .getContentAsString();
		
		assertThat(contentAsString).contains("success");
	}
	
	@Test
	public void testmultiLevelOperation() throws Exception {
    
		String contentAsString = this.mockMvc.perform(get("/multiLevelOperation").param("inputA", "1").param("inputB", "2"))
		.andExpect(status().isOk())
		.andReturn()
        .getResponse()
        .getContentAsString();
		
		assertThat(contentAsString).contains("success");
	}
	
	
}
