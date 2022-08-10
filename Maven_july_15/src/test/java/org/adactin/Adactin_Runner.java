package org.adactin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.utilityfiles.base_class;

public class Adactin_Runner extends base_class {
public static 	WebDriver driver;
public static ChromeOptions options;

	public static void main(String[] args) {
	
			driver=Browser_launch("chrome");
			get_url("https://adactinhotelapp.com/");

			WebElement user_name = driver.findElement(By.xpath("//input[@id='username']"));
			send_keys(user_name, "Vijay0326");
			WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
			send_keys(pass,"W492OL");
			WebElement login = driver.findElement(By.xpath("//input[@class='login_button']"));
			click_btn(login);
			
			WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
select_dropdown(location,"text", "Brisbane");
			//select_dropdown(location, "Brisbane");
			WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
			Select_dropdown(hotels, "Hotel Hervey");
			
			WebElement room_type = driver.findElement(By.xpath("//select[@name='room_type']"));
			Select_dropdown(room_type, "Super Deluxe");
			
			WebElement room_no = driver.findElement(By.xpath("//select[@name='room_nos']"));
			Select_dropdown(room_no, "3 - Three");
			WebElement check_in = driver.findElement(By.xpath("//input[@name='datepick_in']"));
			send_keys(check_in,"07/07/2022");
			WebElement check_out = driver.findElement(By.xpath("//input[@name='datepick_out']"));
			send_keys(check_out,"08/07/2022");
		WebElement adult_per_room = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select_dropdown(adult_per_room, "3 - Three");
		WebElement children_pr = driver.findElement(By.xpath("//select[@name='child_room']"));
Select_dropdown(children_pr, "1 - One");

		WebElement search_btn = driver.findElement(By.xpath("//input[@id='Submit']"));
		click_btn(search_btn);
		WebElement search_hotel = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		click_btn(search_hotel);
		WebElement continue_btn = driver.findElement(By.xpath("//input[@id='continue']"));
		
click_btn(continue_btn);
		WebElement First_name = driver.findElement(By.xpath("//input[@id='first_name']"));
		send_keys(First_name, "python");
		WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
send_keys(last_name, "javascript");
		
		WebElement text_area = driver.findElement(By.xpath("//textarea[@name='address']"));

		send_keys(text_area, "null");
		WebElement creditcard_no = driver.findElement(By.xpath("//input[@id='cc_num']"));
send_keys(creditcard_no, "9943926771876543");
		WebElement card_type = driver.findElement(By.xpath("//select[@id='cc_type']"));

	Select_dropdown(card_type, "American Express");
	
		WebElement expired_mon = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
Select_dropdown(expired_mon, "November");

WebElement expired_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select_dropdown(expired_year, "2017");
		
				WebElement cvv_no = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
send_keys(cvv_no, "334")	;			
				WebElement book_now_btn= driver.findElement(By.xpath("//input[@id='book_now']"));
click_btn(book_now_btn);

WebElement logout_btn = driver.findElement(By.xpath("//a[.='Logout']"));
					//logout_btn.click();
					
		
		
	}

}
