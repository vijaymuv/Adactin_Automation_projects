package org.testNg;

import org.testng.annotations.Test;

public class Abc_class extends data_provider {

	@Test(dataProvider="details",dataProviderClass = data_provider.class)
		public void login(String email, String pass) {
			
			System.out.println(email);
			System.out.println(pass);
		
	}
}

