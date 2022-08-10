package org.testNg;

import org.testng.annotations.Test;

public class groups_demo {
	@Test(groups="iphone")
	private void iphone_13() {
System.out.println("iphone 11 @ 599");
	}
	
	@Test(groups="iphone")
	private void iphone_12() {
System.out.println("iphone 12 $ 779");
	}
	
	@Test(groups="samsung")
	private void samsung_s22() {
System.out.println("samsung_s22 $ 799");
	}
	
	@Test(groups="samsung")
	private void samsungs21() {
System.out.println("samsungs21 $ 579");
	}
	@Test(groups="jbl")
	private void jbl_earphone() {
System.out.println("jbl earphones $ 99");
	}
	
	@Test(groups="laptop")
	private void hp_icore3() {
System.out.println("hp_icore9 $ 1299");
	}
}
