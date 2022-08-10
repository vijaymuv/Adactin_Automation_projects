package com.selenium.demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilityfiles.base_class2;

public class web_Driver_methods extends base_class2 {
	
	private void webdriver_meth() {
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		System.out.println("tilte:"+get_title("url"));
		System.out.println("page" +get_page_source("url"));
		Dimension size = driver.manage().window().getSize();
		System.out.println("size:"+size);
Dimension d = new Dimension(700, 600);
driver.manage().window().setSize(d);
driver.manage().window().getSize();

	}
	public static void main(String[] args) {
		
		Browser_launch("chrome");
		get_url("https://adactinhotelapp.com/");
		navigate_to("https://www.google.com/");
		delete_all_cookies();
		maximize_page();
		full_screen();
		set_size(560,750);
		get_size();
		


	}

}
