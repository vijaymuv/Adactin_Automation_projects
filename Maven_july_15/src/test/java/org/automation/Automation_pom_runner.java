package org.automation;

import java.time.Duration;

import org.adactin.testNg.adactin_pom_runnerclass;
import org.apache.log4j.Logger;
import org.automation_project.pages.page_object_manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilityfiles.base_class2;

public class Automation_pom_runner extends base_class2 {
	public static WebDriver driver = base_class2.Browser_launch("chrome");
	public static Logger log = Logger.getLogger(adactin_pom_runnerclass.class);
	public static page_object_manager mystore = new page_object_manager(driver);

	public static void main(String[] args) {
		get_url("http://automationpractice.com/index.php");
		click_btn(mystore.getLogin().getSignin());
		send_keys(mystore.getLogin().getEmail(), "black0326@gmail.com");
		send_keys(mystore.getLogin().getPassword(), "black0326");
		click_btn(mystore.getLogin().getLogin());
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
wait.until(ExpectedConditions.visibilityOf(mystore.getDress().getDresses()));
		actions(mystore.getDress().getDresses());
		
		actions(mystore.getDress().getEvening_dress());

		click_btn(mystore.getDress().getEvening_dress());
		click_btn(mystore.getDress().getImages());

		frames("index", 0);
		wait.until(ExpectedConditions.visibilityOf(mystore.getCart().getColor_image()));

		click_btn(mystore.getCart().getColor_image());
		click_btn(mystore.getCart().getQuantity_btn());
		select_dropdown(mystore.getCart().getSize_of_dress(), "text", "M");
		click_btn(mystore.getCart().getColor_dress());
		click_btn(mystore.getCart().getAdd_to_cart_btn());
	default_frames();
		click_btn(mystore.getProceed().getProceed_to_checkout());
		click_btn(mystore.getSummary().getSummary());
		send_keys(mystore.getAddress().getText_area(), "ordered");
		click_btn(mystore.getAddress().getAddress());

		click_btn(mystore.getShipping().getTc_checkbox());

		click_btn(mystore.getShipping().getShipping());

		click_btn(mystore.getPayment().getPayment());
		click_btn(mystore.getConfirm().getConfirm());
		click_btn(mystore.getBack_to_order().getBack_to_order());
		//dress t shirt
		
		wait.until(ExpectedConditions.visibilityOf(mystore.getDress1().gettshirt1()));		
click_btn(mystore.getDress1().gettshirt1());
				click_btn(mystore.getDress1().getImages1());

				frames("index", 0);
		click_btn(mystore.getCart1().getQuantity_btn1());
		select_dropdown(mystore.getCart1().getSize_of_dress1(), "text", "M");
		click_btn(mystore.getCart1().getColor_dress1());
		click_btn(mystore.getCart1().getAdd_to_cart_btn1());
	default_frames();
		click_btn(mystore.getProceed().getProceed_to_checkout());
		click_btn(mystore.getSummary().getSummary());
		send_keys(mystore.getAddress().getText_area(), "ordered");
		click_btn(mystore.getAddress().getAddress());

		click_btn(mystore.getShipping().getTc_checkbox());

		click_btn(mystore.getShipping().getShipping());

		click_btn(mystore.getPayment().getPayment());
		click_btn(mystore.getConfirm().getConfirm());
		click_btn(mystore.getBack_to_order().getBack_to_order());
		
		
		

		click_btn(mystore.getLogout().getLogout());
	}

}


/*Examples:
|username|pass|
|black0326@gmail.com|black0326|
|Vijay0326|W492OL| */