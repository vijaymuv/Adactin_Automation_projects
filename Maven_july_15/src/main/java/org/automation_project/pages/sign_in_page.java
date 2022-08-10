package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sign_in_page {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement sign_in;

	public sign_in_page(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
	}

	public WebElement getSign_in() {
		return sign_in;
	}

}
