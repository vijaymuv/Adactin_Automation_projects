package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_to_cart1 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement Quantity_btn1;
	
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement size_of_dress1;
	
	@FindBy(xpath = "//a[@id='color_14']")
	private WebElement color_dress1;
	
	public Add_to_cart1(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getQuantity_btn1() {
		return Quantity_btn1;
	}

	public WebElement getSize_of_dress1() {
		return size_of_dress1;
	}

	public WebElement getColor_dress1() {
		return color_dress1;
	}

	public WebElement getAdd_to_cart_btn1() {
		return add_to_cart_btn1;
	}

	@FindBy(xpath = "//span[.='Add to cart']")
	private WebElement add_to_cart_btn1;
}


