package org.testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider {
@DataProvider
	public String [][] details(){
		
		String [][] a = {
				{"yamaha@gmail.com", "mt1@5"},	
				{"Royalenfield@gmail.com","Royal@350"},
				{"jawa@gmail.com","jawa@350"}
		};
		return a;
}
	
	
}
