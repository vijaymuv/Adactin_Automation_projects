package org.testNg;

import org.testng.annotations.Test;

public class Expected_exception {
	@Test(expectedExceptions=ArithmeticException.class)
public void Number() {
System.out.println(10/0);
}
}
