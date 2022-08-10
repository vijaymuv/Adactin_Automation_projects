package org.adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class booking_page {
	public WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotel;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement no_of_room;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement check_in;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement check_out;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement children;
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search_brn;

	public booking_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNo_of_room() {
		return no_of_room;
	}

	public WebElement getCheck_in() {
		return check_in;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearch_brn() {
		return search_brn;
	}

}
