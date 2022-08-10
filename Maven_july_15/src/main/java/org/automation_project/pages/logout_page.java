package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout_page {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Log me out']")
	private WebElement logout;

	public logout_page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}
	

		}
