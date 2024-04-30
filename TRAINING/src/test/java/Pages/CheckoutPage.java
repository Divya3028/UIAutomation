package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class CheckoutPage extends BaseClass {
	
	@Then("goto the Shipping Method")
	public void goto_the_shipping_method() {
        
		try {
			WebElement shpdd = driver.findElement(By.xpath("//select[@name='fulfillment[shipping_method]']"));
		
        sc = new Select(shpdd);
        sc.selectByVisibleText("Worldwide - $5.00 USD");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	   }

	
	@Then("click the Payment button")
	public void click_the_payment_button() {
        
		try
		{
		driver.findElement(By.xpath("//button[text()='Make payment']")).click();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	    }

}
