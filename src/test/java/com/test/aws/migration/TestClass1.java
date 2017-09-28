package com.test.aws.migration;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test
	public void testMethod1Class1(){
		
	}
	
	@Test
	public void testMethod2Class1(){
		assertTrue(true);
	}

	@Test
	public void testMethod3Class1(){
		privateMethod();
	}
	
	private void privateMethod(){
		System.out.println(10 / 0);
	}
	
}
