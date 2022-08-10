package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement signin;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	public login_page(WebDriver driver) {
this.driver= driver;
PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(xpath = "//i[@class='icon-lock left']")
	private WebElement login;
	
}
