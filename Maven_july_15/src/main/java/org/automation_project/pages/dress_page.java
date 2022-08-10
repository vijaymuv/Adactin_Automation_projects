package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dress_page {
	public WebDriver driver;
@FindBy(xpath = "//li[@id='category-thumbnail']//following::a[@title='Dresses']")
private WebElement dresses;


@FindBy(xpath = "//li[@id='category-thumbnail']//following::a[@title='Dresses']//following::li//a[@title='Evening Dresses']")
private WebElement evening_dress;

public dress_page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);

}

public WebDriver getDriver() {
	return driver;
}

public WebElement getDresses() {
	return dresses;
}

public WebElement getEvening_dress() {
	return evening_dress;
}

public WebElement getImages() {
	return images;
}

@FindBy(xpath = "//img[@alt='Printed Dress']")
private WebElement images;


}
