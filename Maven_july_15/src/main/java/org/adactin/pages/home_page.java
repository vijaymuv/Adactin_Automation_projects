package org.adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page {
	public WebDriver driver;
	@FindBy(xpath = "//input[@id='username']")
private WebElement email;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;
	@FindBy(xpath ="//input[@class='login_button']" )
	private WebElement login;
	public home_page(WebDriver driver) {
this.driver=driver;	
PageFactory.initElements(driver, this);
	}
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
}
