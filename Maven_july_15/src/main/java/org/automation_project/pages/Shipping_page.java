package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_page {
	public WebDriver driver;
	@FindBy(xpath = "//input[@id='cgv']")
	private WebElement tc_checkbox;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement shipping;

	public Shipping_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getTc_checkbox() {
		return tc_checkbox;
	}

	public WebElement getShipping() {
		return shipping;
	}
}
