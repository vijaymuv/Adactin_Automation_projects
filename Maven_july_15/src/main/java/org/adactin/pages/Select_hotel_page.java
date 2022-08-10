package org.adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel_page {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement select_hotel;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue_btn;

	public Select_hotel_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSelect_hotel() {
		return select_hotel;
	}
	public WebElement getContinue_btn() {
		return continue_btn;
	}
}
