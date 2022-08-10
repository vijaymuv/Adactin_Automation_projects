package org.automation_project.pages;

import org.openqa.selenium.WebDriver;

public class page_object_manager {
	public WebDriver driver;
	private login_page login;
	private dress_page dress;
	private Add_to_cart cart;
	private proceed_page proceed;
	private address_page address;
	private Back_to_order_page back_to_order;
	private logout_page logout;
	
	private Add_to_cart1 cart1;
	private dress_page1 dress1;
	

	public Add_to_cart1 getCart1() {
		
		if(cart1==null) {
			cart1= new Add_to_cart1(driver);
		}
		return cart1;
	}

	public dress_page1 getDress1() {
		if(dress1==null) {
			dress1= new dress_page1(driver);
		}
		return dress1;
	}

	public logout_page getLogout() {
		if(logout==null) {
			logout = new logout_page(driver);
		}
		return logout;
	}

	public dress_page getDress() {
		
		if(dress==null) {
			dress = new dress_page(driver);
		}
		return dress;
	}

	public Add_to_cart getCart() {
		if(cart==null) {
			cart = new Add_to_cart(driver);
		}
		return cart;
	}

	public proceed_page getProceed() {
		if(proceed==null) {
			proceed = new proceed_page(driver);
		}
		return proceed;
	}

	public address_page getAddress() {
		if(address==null) {
			address = new address_page(driver);
		}
		return address;
	}

	public Back_to_order_page getBack_to_order() {
		if(back_to_order==null) {
			back_to_order = new Back_to_order_page(driver);
		}
		return back_to_order;
	}

	public confirm_page getConfirm() {
		if(confirm==null) {
			confirm = new confirm_page(driver);
		}
		return confirm;
	}

	public payment_page getPayment() {
		if(payment==null) {
			payment = new payment_page(driver);
		}
		return payment;
	}

	public Shipping_page getShipping() {
		if(shipping==null) {
			shipping = new Shipping_page(driver);
		}
		return shipping;
	}

	public Summary_page getSummary() {
		if(summary==null) {
			summary = new Summary_page(driver);
		}
		return summary;
	}

	private confirm_page confirm;
	private payment_page payment;
	private Shipping_page shipping;
	private Summary_page summary;
	public  page_object_manager(WebDriver driver) {
	this.driver=driver;
	}

	public login_page getLogin() {
		
		if(login==null) {
			login = new login_page(driver);
		}
	return login;
		
	}
	

	
	
}


