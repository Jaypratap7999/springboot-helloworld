package com.test.sprintboot_helloworld;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class SprintbootHelloworldApplicationTests {

	@Autowired
	private WebApplicationContext applicationContext;

	@Test
	void contextLoads() {
	}

	@Test
	void helloEndpointReturnsExpectedResponse() throws Exception {
		MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(applicationContext).build();

		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().string("return doXYZ(......)"));
	}

}
