package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_an_account_page {
	public 	WebDriver driver;
	
	@FindBy(xpath ="//input[@id='email_create']")
	private WebElement email;
	
	@FindBy(xpath = "//i[@class='icon-user left']")
	private WebElement create_an_account;

	public create_an_account_page(WebDriver driver) {
this.driver= driver;
PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCreate_an_account() {
		return create_an_account;
	}
	
	

}
