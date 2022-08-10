package org.testNg;

import java.io.IOException;
import java.time.Duration;
import org.adactin.pages.page_object_manager_adactin;
import org.adactin.testNg.adactin_pom_runnerclass;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.automation_project.pages.page_object_manager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utilityfiles.base_class;

public class Asserts extends base_class {
	
	public static WebDriver driver = base_class.Browser_launch("chrome");
	public static page_object_manager_adactin adactin = new page_object_manager_adactin(driver);
	public static Logger log = Logger.getLogger(adactin_pom_runnerclass.class);
public static page_object_manager mystore = new page_object_manager(driver);
	@Test
	public void Adactin_hotel() throws IOException {
	
		PropertyConfigurator.configure("log4j (1).properties");
		log.info("url launch");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		get_url("https://adactinhotelapp.com/");
		send_keys(adactin.getPage().getEmail(),particular_cell("file", 0, 8, 5));
		send_keys(adactin.getPage().getPass(), particular_cell("file", 0, 9, 5));
		click_btn(adactin.getPage().getLogin());
		String s = "http://automationpractice.com/index.php";
		String current_url = current_url("actual");
	
	Assert.assertEquals(s, current_url);

	}
	@Test
public void Automation_myStore() {
		get_url("http://automationpractice.com");
	click_btn(mystore.getLogin().getSignin());
		send_keys(mystore.getLogin().getEmail(),"black0326@gmail.com");	
		send_keys(mystore.getLogin().getPassword(),"black0326");
		click_btn(mystore.getLogin().getLogin());

	}
	@Test
	private void soft_assert() {

		String a = "java";
		String b = "python";
		SoftAssert s = new SoftAssert();
		s.assertEquals(a, b);
	s.assertAll();
	System.out.println("is correct");
		
	}

}
