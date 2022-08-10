package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Back_to_order_page {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement back_to_order;
	public Back_to_order_page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getBack_to_order() {
		return back_to_order;
	}
	
}
