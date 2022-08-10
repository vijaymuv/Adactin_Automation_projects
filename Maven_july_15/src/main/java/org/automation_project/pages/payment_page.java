package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class payment_page {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement payment;

	public payment_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPayment() {
		
		
		return payment;
	}
}
