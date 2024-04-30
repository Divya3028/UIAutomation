package Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.When;

public class HomePage extends BaseClass {

	@When("i click the shop now button")
	public void i_click_the_shop_now_button() throws IOException {
		
		try
		{
		driver.findElement(By.linkText("Shop now")).click();
		//reportStep("Shop now button is clicked successfully", "pass");
		}
		catch(Exception e) {
			//reportStep("Shop now buton is not clicked successfully"+e,"fail");
			System.out.println(e);
		} 
	   }



}
