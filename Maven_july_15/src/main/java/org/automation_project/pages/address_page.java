package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class address_page {
	
	public WebDriver driver;
	@FindBy(xpath = "//textarea[@name='message']")
	private WebElement text_area;
	
	@FindBy(xpath = "//span[.='Proceed to checkout']")
	private WebElement address;

	public address_page(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver, this);
	
	}

	public WebElement getText_area() {
		return text_area;
	}

	public WebElement getAddress() {
		return address;
	}
	
}
