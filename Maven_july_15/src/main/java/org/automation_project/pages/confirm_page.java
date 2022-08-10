package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirm_page {
	public WebDriver driver;
	@FindBy(xpath = "//button[@type='submit']//child::span[.='I confirm my order']")
	private WebElement confirm;
	public confirm_page(WebDriver driver2) {
this.driver= driver2;
PageFactory.initElements(driver, this);
	
	}
	
	public WebElement getConfirm() {
		return confirm;
	}


}

