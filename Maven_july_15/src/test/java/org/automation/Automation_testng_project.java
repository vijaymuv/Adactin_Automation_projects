package org.automation;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.automation_project.pages.page_object_manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilityfiles.base_class;

public class Automation_testng_project extends base_class{
	
	public static WebDriver driver = base_class.Browser_launch("chrome");
	public static Logger log = Logger.getLogger(Automation_pom_runner.class);
	public static page_object_manager mystore = new page_object_manager(driver);
@BeforeMethod
private void login() throws IOException {

	PropertyConfigurator.configure("log4j (1).properties");
	log.info("url launch");
			get_url("http://automationpractice.com");
			click_btn(mystore.getLogin().getSignin());
			send_keys(mystore.getLogin().getEmail(), particular_cell("file", 0,28,5));
			send_keys(mystore.getLogin().getPassword(), particular_cell("file", 0,29,5));
			click_btn(mystore.getLogin().getLogin());
}
	@Test
	private void mystore() throws IOException {

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
wait.until(ExpectedConditions.visibilityOf(mystore.getDress().getDresses()));
		actions(mystore.getDress().getDresses());
		
		actions(mystore.getDress().getEvening_dress());

		click_btn(mystore.getDress().getEvening_dress());
		click_btn(mystore.getDress().getImages());
		driver.switchTo().frame(0);

		click_btn(mystore.getCart().getColor_image());
		click_btn(mystore.getCart().getQuantity_btn());
		select_dropdown(mystore.getCart().getSize_of_dress(), "text", particular_cell("file", 0,35,5));
		click_btn(mystore.getCart().getColor_dress());
		click_btn(mystore.getCart().getAdd_to_cart_btn());
		driver.switchTo().defaultContent();
		click_btn(mystore.getProceed().getProceed_to_checkout());
		click_btn(mystore.getSummary().getSummary());
		send_keys(mystore.getAddress().getText_area(), particular_cell("file", 0,42,5));
		click_btn(mystore.getAddress().getAddress());

		click_btn(mystore.getShipping().getTc_checkbox());

		click_btn(mystore.getShipping().getShipping());

		click_btn(mystore.getPayment().getPayment());
		click_btn(mystore.getConfirm().getConfirm());
		click_btn(mystore.getBack_to_order().getBack_to_order());

		
	}
	@AfterMethod
	public void logout() {
		click_btn(mystore.getLogout().getLogout());
		log.info("dress ordered");
		
	}

}
