package com.payroll.emp.service;

import static org.junit.Assert.*;
import com.payroll.emp.core.Employee;

import org.junit.Before;
import org.junit.Test;

public class SampleClassTest {
	SampleClass sc=new SampleClass();
	@Before
	public void setup(){
	}
	
	@Test
	public void testReverseWord(){
			assertEquals("ahen ",sc.reverseWord("neha"));
	}
	@Test
	public void testReverseWord1(){
		String str1=sc.reverseWord(null);

//			assertNotNull(sc.reverseWord(null));
//			assertEquals("ahen",sc.reverseWord(""));
//			assertFalse(str1,is(not(emptyString())));
			//assertThat("String is empty",

		assertNull(str1);
	}
}
