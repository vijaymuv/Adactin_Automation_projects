package org.testNg;

import org.testng.annotations.Test;

public class Description_dependOnmethods {
	
	@Test
public void car() {
System.out.println(10/0);
}
	@Test(description="yamaha bike model")
	private void bike() {
System.out.println("yamaha mt -15");
	}
	@Test
	private void mobile() {
System.out.println("iphone 12");
	}
	@Test(dependsOnMethods="car")
	private void offers() {
System.out.println("offers");
	}
}
