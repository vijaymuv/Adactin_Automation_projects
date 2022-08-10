package org.adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class payment_page {
	
	
	public WebDriver driver;	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement first_name;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement text_area;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement credit_card_no;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardtype;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expire_month;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expire_year;
	
	public payment_page(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getText_area() {
		return text_area;
	}

	public WebElement getCredit_card_no() {
		return credit_card_no;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpire_month() {
		return expire_month;
	}

	public WebElement getExpire_year() {
		return expire_year;
	}

	public WebElement getCvv_no() {
		return cvv_no;
	}

	public WebElement getBook_now_btn() {
		return book_now_btn;
	}

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv_no;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book_now_btn;

}
