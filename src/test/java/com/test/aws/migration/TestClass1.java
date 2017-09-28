package com.test.aws.migration;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestClass1 {

	@Test
	public void testMethod1Class1() {

	}

	@Test
	public void testMethod2Class1() {
		assertTrue(true);
	}

	@Test
	public void testMethod3Class1() {
		privateMethod();
	}

	@Test
	public void testMethod4() {

	}

	@Test
	public void testMethod5() {

	}

	@Test
	public void testMethod6() {

	}

	@Test
	public void testMethod7() {

	}

	@Test
	public void testMethod8(){
		
	}
	
	@Test
	public void testMethod9(){
		
	}
	
	@Test
	public void testMethod10(){
		
	}
	private void privateMethod() {
		System.out.println("Call to private method");
	}

}
