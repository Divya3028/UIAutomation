package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class HairBeautyPathPage extends BaseClass{

	@Then("add the selected product to the cart")
	public void add_the_selected_product_to_the_cart() throws IOException {
        try
        {
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		//reportStep("selected Hair Product addded to cart successfully", "pass");
        }
        catch(Exception e) {
        	//reportStep("selected Hair Product is not addded to cart successfully", "fail");
			System.out.println(e);
		}
	  }

	@Then("go to the cart")
	public void go_to_the_cart() throws IOException {
        try
        {
		driver.findElement(By.xpath("(//*[name()='svg'])[1]")).click();
		//reportStep("Added Product in the cart is dispalyed successfully", "pass");
        }
        catch(Exception e) {
        	//reportStep("Added Product in the cart is dispalyed successfully", "fail");
			System.out.println(e);
		}
	}

	@Then("checkout the product")
	public void checkout_the_product() throws IOException {
	    try
	    {
		WebElement chkout =  driver.findElement(By.xpath("//a[text()='Checkout']"));
chkout.click();
//reportStep("Checkout is clicked successfully", "pass");

	    }
	    catch(Exception e) {
	    //	reportStep("Checkout is not clicked", "fail");
			System.out.println(e);
		}
	   }


}
