package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.service.ClassroomBl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomTest {
	
	@Autowired
	ClassroomBl c;

	@Test
	public void test1() {
		assertEquals(c.getNumber(1),2);
	}
	
	@Test
	public void test2() {
		assertEquals(c.getNumber(3),6);
	}
	
	@Test
	public void test3() {
		assertEquals(c.getNumber(0),0);
	}

}
