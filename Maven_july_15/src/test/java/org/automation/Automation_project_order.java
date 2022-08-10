	package org.automation;

import java.time.Duration;

import org.automation_project.pages.page_object_manager;
import org.automation_project.pages.personal_details_page;
import org.automation_project.pages.sign_in_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilityfiles.base_class;
import org.utilityfiles.base_class2;

public class Automation_project_order extends base_class2 {
	public static WebDriver driver;
	public static WebDriverWait wait;
public static sign_in_page sign = new sign_in_page(driver);
//public static create_an_account_page create_page = new crete_an_account_page(driver);
public static personal_details_page personal_page = new personal_details_page(driver);
public static page_object_manager mystore = new page_object_manager(driver);

	
	public static void register_account() {
		WebElement Signup1 = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
			click_btn(Signup1);
			WebElement Email = driver.findElement(By.xpath("//input[@id='email_create']"));
			send_keys(Email,"black0326@gmail.com");

		WebElement create_account_btn = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		create_account_btn.click();
		WebElement Title = driver.findElement(By.xpath("//input[@id='id_gender2']"));
		click_btn(Title);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
send_keys(firstname, "blackp");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
send_keys(lastname, "panther forever");
WebElement emailid = driver.findElement(By.xpath("//input[@id='customer_lastname']//following::input[@id='email']"));
		emailid.sendKeys("antman032688@gmail.com");
		clears(emailid);
		emailid.sendKeys("black0326@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		send_keys(password, "black0326");
		WebElement days = driver.findElement(By.xpath("//select[@name='days']"));  
select_dropdown(days,"text", "5  ");
		WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
		select_dropdown(month,"text", "May ");
		WebElement years = driver.findElement(By.xpath("//select[@name='years']"));
		select_dropdown(years,"text", "2018  ");
		WebElement checkbox_newsletter = driver.findElement(By.xpath("//input[@name='newsletter']"));
		click_btn(checkbox_newsletter);
		
		WebElement checkbox_offer = driver.findElement(By.xpath("//input[@name='optin']"));
click_btn(checkbox_offer);
		
		// your address
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstname']"));
		send_keys(firstName,"supermans");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastname']"));
		send_keys(lastName,"forever");
		WebElement companyname = driver.findElement(By.xpath("//input[@id='company']"));
		send_keys(companyname,"marvel studios & dc");

		
		WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
		send_keys(address,"france, paris");
		
		
		WebElement address_line_1 = driver.findElement(By.xpath("//input[@id='address2']"));
		send_keys(address_line_1,"eiffel tower");
		
		
		WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
		send_keys(City,"chengam tv");
		

		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
select_dropdown(state,"text", "Arizona");
		
		WebElement postal_code = driver.findElement(By.xpath("//input[@name='postcode']"));
		send_keys(postal_code,"85018");

		
		WebElement 	additional_info = driver.findElement(By.xpath("//textarea[@name='other']"));
		send_keys(additional_info,"no info");

		WebElement home_phone_no = driver.findElement(By.xpath("//input[@name='phone']"));
		send_keys(home_phone_no,"9819246741");
		WebElement mobile_phone = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		send_keys(mobile_phone,"8345383239");


		WebElement address_for_future = driver.findElement(By.xpath("//input[@name='alias']"));
		send_keys(address_for_future, "no");
		WebElement register_btn = driver.findElement(By.xpath("//span[text()='Register']"));
		click_btn(register_btn);
		
		
		}
	public static void order_place() throws InterruptedException {
		
		WebElement signin = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		click_btn(signin);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
		WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
send_keys(emailid, "black0326@gmail.com");
wait.until(ExpectedConditions.visibilityOf(emailid));

		WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
send_keys(pass, "black0326");
		WebElement login= driver.findElement(By.xpath("//i[@class='icon-lock left']"));
click_btn(login);
		WebElement dresses = driver.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Dresses']"));
		actions(dresses);
				
		wait.until(ExpectedConditions.visibilityOf(dresses));
		WebElement eveningdress = driver.findElement(By.xpath(""
				+ "//li[@id='category-thumbnail']//following::a[@title='Dresses']//following::li//a[@title='Evening Dresses']"));
		wait.until(ExpectedConditions.visibilityOf(dresses));
		actions(eveningdress);

		click_btn(eveningdress);
		Thread.sleep(3000);
	WebElement images = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
click_btn(images);
//frames("index", "0");
	WebElement another_image = driver.findElement(By.xpath("//li[@id='thumbnail_11']"));
	click_btn(another_image);
	WebElement Quantity_btn = driver.findElement(By.xpath("//i[@class='icon-plus']"));
click_btn(Quantity_btn);
	WebElement size_of_dress = driver.findElement(By.xpath("//select[@id='group_1']"));
	select_dropdown(size_of_dress,"text", "M");
	WebElement color_of_dress = driver.findElement(By.xpath("//ul[@id='color_to_pick_list']//child::a[@id='color_24']"));
	click_btn(color_of_dress);
	WebElement add_to_cart = driver.findElement(By.xpath("//span[.='Add to cart']"));
click_btn(add_to_cart);
	driver.switchTo().defaultContent();

	WebElement proceed_to_checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	click_btn(proceed_to_checkout);

WebElement order_details = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));

click_btn(order_details);

WebElement textbox = driver.findElement(By.xpath("//textarea[@name='message']"));
send_keys(textbox, "ordered");
	WebElement Address_proceed_to_checkout = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));

	click_btn(Address_proceed_to_checkout);
	WebElement terms_of_service = driver.findElement(By.xpath("//input[@id='cgv']"));

	click_btn(terms_of_service);
	WebElement shipping = driver.findElement(By.xpath("//button[@name='processCarrier']"));

	click_btn(shipping);
	WebElement payment = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
	click_btn(payment);
	WebElement confirm_btn = driver.findElement(By.xpath("//button[@type='submit']//child::span[.='I confirm my order']"));
	click_btn(confirm_btn);
	WebElement back_to_order = driver.findElement(By.xpath("//a[@title='Back to orders']"));
	click_btn(back_to_order);
	WebElement logout = driver.findElement(By.xpath("//a[@title='Log me out']"));
	logout.click();
	}
		public static void main(String[] args) throws InterruptedException {
			driver = Browser_launch("chrome");
			get_url("http://automationpractice.com");
	order_place();
		
		}

}
    

//img[@id='thumb_4']