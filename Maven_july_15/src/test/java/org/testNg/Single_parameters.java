package org.testNg;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Single_parameters{
	@Parameters({"id","pass"})
	@Test
	private void login(@Optional("java")String email, String pass) {
System.out.println(email);
	System.out.println(pass);
	
	}
}