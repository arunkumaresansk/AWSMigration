package com.test.aws.migration;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestClass1 {

	@Test
	public void testMethod1() {

	}

	/*@Test
	public void testMethod2() {
		assertTrue(true);
	}

	@Test
	public void testMethod3() throws Exception {
		privateMethod();
	}

	@Test
	public void testMethod4() {

	}

	@Test
	public void testMethod5() {
		assertTrue(false);
	}

	@Test
	public void testMethod6() {
		assertTrue(false);
	}

	@Test
	public void testMethod7() {
		assertTrue(false);
	}*/

	@Test
	public void testMethod8(){
		
	}
	
	@Test
	public void testMethod9(){
		
	}
	
	@Test
	public void testMethod10(){
		
	}
	
	private void privateMethod() throws Exception {
		System.out.println("Call to private method");
		throw new Exception("Random Failure");
	}

}
