package org.testNg;

import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class test_demo {

	@Test
	public void login() {
		System.out.println("login");
	}
		@BeforeTest
	public void meth() {
System.out.println("chrome");		
	}
		@AfterTest
		public void logout() {
	System.out.println("logout");		
		}
		@Test
		public void dress() {
			System.out.println("dress");
		}
		
		@Test
		public void mobile() {
			System.out.println("mobile");
		}

}
