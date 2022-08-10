package org.adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout_page {
	public WebDriver driver;
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement Logout_btn;
	public logout_page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}
	public WebElement getLogout_btn() {
		return Logout_btn;
	}

}
