package com.selenium.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.utilityfiles.base_class2;

public class singledropdown_month extends base_class2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");	
		driver.manage().deleteAllCookies();
		WebElement clickcrtbtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		clickcrtbtn.click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s2 = 	new Select(day);
		s2.selectByVisibleText("6");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(month);
		s.selectByIndex(3);
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s1 = new Select(year);
		s1.selectByValue("2019");
get_firstSelected_Options(year);	
	}
}
