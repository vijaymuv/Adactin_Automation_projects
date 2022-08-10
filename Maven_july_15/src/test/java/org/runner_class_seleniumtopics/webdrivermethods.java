package org.runner_class_seleniumtopics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.utilityfiles.base_class;

	public class webdrivermethods extends base_class {
		public static void main(String[] args) {
			Browser_launch("chrome");
			get_url("https://www.instagram.com");
	System.out.println(get_title("title"));
	System.out.println("currentUrl:"+current_url("url"));
	driver.navigate().to("https://www.youtube.com/");
	System.out.println("title2:"+get_title("title"));
	System.out.println("currentUrl2:"+current_url("url"));
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().refresh();
	Dimension d = new Dimension(700, 590);
	driver.manage().window().setSize(d);
	driver.quit();
	String title3 = driver.getTitle();
	System.out.println("title2:"+title3);
	
	}

}
