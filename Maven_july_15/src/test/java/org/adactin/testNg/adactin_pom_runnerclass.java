package org.adactin.testNg;

import java.io.IOException;
import java.time.Duration;

import org.adactin.pages.page_object_manager_adactin;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilityfiles.base_class;


public class adactin_pom_runnerclass extends base_class {
	public static WebDriver driver = base_class.Browser_launch("chrome");
	public static page_object_manager_adactin adactin = new page_object_manager_adactin(driver);
	public static Logger log = Logger.getLogger(adactin_pom_runnerclass.class);
@BeforeMethod
public void login() throws IOException {
	log.info("url launch");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
			get_url("https://adactinhotelapp.com/");
			send_keys(adactin.getPage().getEmail(),particular_cell("file", 0, 8, 5));
			send_keys(adactin.getPage().getPass(), particular_cell("file", 0, 9, 5));
			click_btn(adactin.getPage().getLogin());

}

	@Test
	public void Adactin_hotel() throws IOException {
	
		PropertyConfigurator.configure("log4j (1).properties");
		
		select_dropdown(adactin.getBook().getLocation(),"text",particular_cell("file", 0, 12,5));
		select_dropdown(adactin.getBook().getHotel(),"text",particular_cell("file", 0,13,5));
		select_dropdown(adactin.getBook().getRoomtype(),"text", particular_cell("file", 0,14,5));
		select_dropdown(adactin.getBook().getNo_of_room(),"text", particular_cell("file", 0,15,5));
		adactin.getBook().getCheck_in().clear();
		send_keys(adactin.getBook().getCheck_in(),particular_cell("file", 0,16,5));
		adactin.getBook().getCheck_out().clear();
		send_keys(adactin.getBook().getCheck_out(),particular_cell("file", 0,19,5));
		
		select_dropdown(adactin.getBook().getAdult(),"text",particular_cell("file", 0,17,5));
		select_dropdown(adactin.getBook().getChildren(),"text", particular_cell("file", 0,18,5));
		click_btn(adactin.getBook().getSearch_brn());
		click_btn(adactin.getHotel().getSelect_hotel());
		click_btn(adactin.getHotel().getContinue_btn());
		send_keys(adactin.getPayment().getFirst_name(), particular_cell("file", 0,22,5));
		send_keys(adactin.getPayment().getLastname(), particular_cell("file", 0,23,5));
		send_keys(adactin.getPayment().getText_area(), particular_cell("file", 0,24,5));
		send_keys(adactin.getPayment().getCredit_card_no(), particular_cell("file", 0,25,5));
		select_dropdown(adactin.getPayment().getCardtype(),"text", particular_cell("file", 0,26,5));
		select_dropdown(adactin.getPayment().getExpire_month(),"text", particular_cell("file", 0,27,5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		select_dropdown(adactin.getPayment().getExpire_year(),"index", particular_cell("file", 0,28,5));
		send_keys(adactin.getPayment().getCvv_no(), particular_cell("file", 0,29,5));
		click_btn(adactin.getPayment().getBook_now_btn());
log.info("hotel booked");	}
	
	
	@AfterMethod
	public void logout() {
		click_btn(adactin.getLogout().getLogout_btn());

		
	}

	}

