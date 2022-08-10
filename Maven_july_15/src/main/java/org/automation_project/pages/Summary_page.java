package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_page {
	public WebDriver driver;
	@FindBy(xpath = "//span[.='Proceed to checkout']")
	private WebElement summary;

	public Summary_page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSummary() {
		return summary;
	}

}
