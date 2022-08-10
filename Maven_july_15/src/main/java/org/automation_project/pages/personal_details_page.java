package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class personal_details_page {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='id_gender2']")
	private WebElement gender;
	public personal_details_page(WebDriver driver2) {
this.driver= driver2;
PageFactory.initElements(driver, this);
	
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getDays() {
		return days;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getNewsletter() {
		return newsletter;
	}
	public WebElement getCheckbox_0ffer() {
		return checkbox_0ffer;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getCompanyname() {
		return companyname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getAddress_line_1() {
		return address_line_1;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getPostalcode() {
		return postalcode;
	}
	public WebElement getTextarea() {
		return textarea;
	}
	public WebElement getPhno() {
		return phno;
	}
	public WebElement getMobileno() {
		return mobileno;
	}
	public WebElement getAddress_for_future() {
		return address_for_future;
	}
	public WebElement getRegister_btn() {
		return register_btn;
	}
	@FindBy(xpath = "//input[@name='customer_firstname']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@name='customer_lastname']")
	private WebElement lastname;
	@FindBy(xpath = "//input[@id='customer_lastname']//following::input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@name='passwd']")
	private WebElement pass;
	@FindBy(xpath = "//select[@name='days']")
	private WebElement days;
	@FindBy(xpath = "//select[@name='months']")
	private WebElement month;
	@FindBy(xpath = "//select[@name='years']")
	private WebElement year;
	@FindBy(xpath = "//input[@name='newsletter']")
	private WebElement newsletter;
	@FindBy(xpath = "//input[@name='optin']")
	private WebElement checkbox_0ffer;
	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "///input[@id='company']")
	private WebElement companyname;
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement address;
	@FindBy(xpath = "//input[@id='address2']")
	private WebElement address_line_1;
	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;
	@FindBy(xpath = "//select[@name='id_state']")
	private WebElement state;
	@FindBy(xpath = "//input[@name='postcode']")
	private WebElement postalcode;
	@FindBy(xpath = "//textarea[@name='other']")
	private WebElement textarea;
	
	// country need to add
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phno;
	@FindBy(xpath = "//input[@name='phone_mobile']")
	private WebElement mobileno;
	@FindBy(xpath = "//input[@name='alias']")
	private WebElement address_for_future;
	@FindBy(xpath = "//span[text()='Register']")
	private WebElement register_btn;
}
