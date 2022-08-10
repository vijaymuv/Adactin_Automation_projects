package org.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_annotations {
	@BeforeSuite
	private void java_pack() {
System.out.println("create package");
	}
	@BeforeTest
	private void create_class() {
System.out.println("create class ");
	}
	@BeforeClass
	private void create_method() {
System.out.println("create method");
	}
	@BeforeMethod
	private void code_for_url() {
		System.out.println("code for url inside method");
	}
	@Test(priority=1)
	private void browser_launch() {
System.out.println("browser launch");
	}@Test(priority=2)
	private void url() {
	System.out.println("abc - url");
	}
@AfterMethod
private void login_page() {
System.out.println("login into page");
}
@AfterClass
private void iphone_order() {
System.out.println("order iphone");
}
@AfterTest
private void payment_ip() {
System.out.println("payment done");
}
@AfterSuite
private void logout() {
System.out.println("logout page");
}

}
