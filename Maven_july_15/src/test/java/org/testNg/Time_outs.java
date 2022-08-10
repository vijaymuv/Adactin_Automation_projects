package org.testNg;

import org.testng.annotations.Test;
import org.utilityfiles.base_class;

public class Time_outs extends base_class {
	
	@Test(timeOut=30000)
	private void browser_la() {
Browser_launch("chrome");
get_url("https://www.youtube.com/");
	}

}
