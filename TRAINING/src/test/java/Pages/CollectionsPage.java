package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class CollectionsPage extends BaseClass {
	
	@Then("click the Products")
	public void click_the_products() throws IOException {
       try
       {
		driver.findElement(By.xpath("(//p[text()='Products'])[2]")).click();
		//reportStep("Products button is clicked successfully", "pass");
       }
       catch(Exception e) {
    	  // reportStep("Products buton is not clicked successfully"+e,"fail");
			System.out.println(e);
		}
	}

	@Then("select the Hair products")
	public void select_the_hair_products() throws IOException {
       try
       {
		driver.findElement(By.xpath("//p[text()='Hair Beauty Bath']")).click();
		//reportStep("Hair Product is selected successfully", "pass");
       }
       catch(Exception e) {
    	 //  reportStep("Hair Product is not clicked ", "pass");
			System.out.println(e);
		}
	    }


}
