package org.testng.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunTest {

	@Parameters("test001_name")
	@Test
	public void test001(String name) {
		System.out.println("this is a test001 method. name: " + name);
	}
	
	@Parameters({"test002_num1", "test002_num2"})
	@Test
	public void test002(int num1, int num2) {
		System.out.println("this is a test002 method.");
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	@Test
	public void test003() {
		System.out.println("this is a test003 method.");
	}
	
	@Test
	public void test004() {
		System.out.println("this is a test004 method.");
	}
}
