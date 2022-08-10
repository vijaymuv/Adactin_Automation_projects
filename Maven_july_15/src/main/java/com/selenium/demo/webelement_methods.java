package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilityfiles.base_class2;

public class webelement_methods extends base_class2{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\005\\\\eclipse-workspace\\\\Seleniumjava\\\\driver\\\\chromedriver.exe");
			WebDriver driver = new 	ChromeDriver();
			driver.get("https://www.instagram.com/");
			Thread.sleep(3000);
			WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
			email.sendKeys("bcd@gmail.com");
			System.out.println(get_Attribute(email));
			System.out.println(get_tagname(email));
			System.out.println(get_location(email));
			System.out.println(get_cssvalue(email, "color"));
			System.out.println(get_rectange(email));
	}

}
