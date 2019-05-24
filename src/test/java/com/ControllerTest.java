package com;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {
	private MockMvc mockMvc;
	
	@Autowired  
    private WebApplicationContext wac;
	
	
    @Before
    public void setup() {  
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();  
    }  
	
    @Test
    public void test1() throws Exception {
    	MvcResult result=mockMvc.perform(get("/base").content(new byte[0])).andReturn();
    	assertEquals(result.getResponse().getContentAsString(),"1");
    	
    }
	
	
}
