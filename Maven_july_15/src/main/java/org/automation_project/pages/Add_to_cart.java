package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_to_cart {
	
	public WebDriver driver;
	@FindBy(xpath = "//li[@id='thumbnail_11']")
	private WebElement color_image;

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement Quantity_btn;
	
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement size_of_dress;
	
	@FindBy(xpath = "//ul[@id='color_to_pick_list']//child::a[@id='color_24']")
	private WebElement color_dress;
	
	public Add_to_cart(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getColor_image() {
		return color_image;
	}

	public WebElement getQuantity_btn() {
		return Quantity_btn;
	}

	public WebElement getSize_of_dress() {
		return size_of_dress;
	}

	public WebElement getColor_dress() {
		return color_dress;
	}

	public WebElement getAdd_to_cart_btn() {
		return add_to_cart_btn;
	}

	@FindBy(xpath = "//span[.='Add to cart']")
	private WebElement add_to_cart_btn;
}


