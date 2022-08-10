package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proceed_page {
	public WebDriver driver;
	public proceed_page(WebDriver driver2) {

	
	this.driver= driver2;
	PageFactory.initElements(driver, this);
			
	}

	public WebElement getProceed_to_checkout() {
		return proceed_to_checkout;
	}
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed_to_checkout;

}
