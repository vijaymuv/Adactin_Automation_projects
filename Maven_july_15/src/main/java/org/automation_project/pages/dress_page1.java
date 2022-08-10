package org.automation_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dress_page1 {
	public WebDriver driver;
@FindBy(xpath = "//li[@id='category-thumbnail']//following::a[@title='T-shirts']")
private WebElement tshirt1;


public dress_page1(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);

}

public WebDriver getDriver() {
	return driver;
}

public WebElement gettshirt1() {
	return tshirt1;
}


public WebElement getImages1() {
	return images;
}

@FindBy(xpath = "//a[@class='product_img_link']")
private WebElement images;


}
