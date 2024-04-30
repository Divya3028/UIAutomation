package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class OrderPage extends BaseClass{
	
	@Then("read the order and print the console")
	public void read_the_order_and_print_the_console() {
        
		try
		{
		WebElement order = driver.findElement(By.xpath("//p[@class='text-center font-color-light mb-5']"));
       String orderNum = order.getText();
       driver.quit();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	   }



}
