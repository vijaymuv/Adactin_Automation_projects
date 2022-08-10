package org.adactin.pages;

import org.openqa.selenium.WebDriver;

public class page_object_manager_adactin {
	public WebDriver driver;
	private home_page page ;
	private booking_page book;
	private Select_hotel_page hotel;
	private payment_page payment;
	private logout_page logout;
	public logout_page getLogout() {
		if (logout==null) {
			logout=new logout_page(driver);
	}
		return logout;
		}
	public page_object_manager_adactin(WebDriver driver2) {
this.driver=driver2;
}
	public home_page getPage() {
		if (page==null) {
			page=new home_page(driver);
			
		}
		return page;
	}
	public booking_page getBook() {
		if (book==null) {
			book=new booking_page(driver);
			
		}
		return book;
	}
	public Select_hotel_page getHotel() {
		if (hotel==null) {
			hotel=new Select_hotel_page(driver);
			
		}
		return hotel;
	}
	public payment_page getPayment() {
		if (payment==null) {
			payment=new payment_page(driver);
			
		}
		
		return payment;
	}
	

}
