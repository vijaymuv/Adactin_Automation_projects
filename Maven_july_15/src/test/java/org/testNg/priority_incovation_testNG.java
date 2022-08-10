package org.testNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class priority_incovation_testNG {
	@Ignore
	@Test(priority = 3)
	private void production() {
System.out.println("20th century fox");

	}
	@Test(priority = -1)
	private void studios() {
System.out.println("marvel studios");
	}
@Test(priority = 0,invocationCount = -1)
	private void movie_name() {
System.out.println("Antman & wasp");
	}
@Test(priority = 1,invocationCount = 2,invocationTimeOut = 5000)
private void post_credit() {
System.out.println("kang the conqueror");
}
}
