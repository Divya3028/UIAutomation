package day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


	public class CommerceJSDemoStoreTestNG extends BaseTestNG{

		   
		   
		   
		    @Test
		    public void testCommerceJSDemoStore() {
		        driver.findElement(By.linkText("Shop now")).click();
		        
		        driver.findElement(By.xpath("(//p[text()='Products'])[2]")).click();
		        driver.findElement(By.xpath("//p[text()='Hair Beauty Bath']")).click();
		        driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		        
		        driver.findElement(By.xpath("(//*[name()='svg'])[1]")).click();
		       WebElement chkout =  driver.findElement(By.xpath("//a[text()='Checkout']"));
		       chkout.click();

		      //select[@name='fulfillment[shipping_method]']
		        WebElement shpdd = driver.findElement(By.xpath("//select[@name='fulfillment[shipping_method]']"));
		        //Dropdown
		        Select sc = new Select(shpdd);
		        sc.selectByVisibleText("Worldwide - $5.00 USD");
		        
		        driver.findElement(By.xpath("//button[text()='Make payment']")).click();
		        WebElement order = driver.findElement(By.xpath("//p[@class='text-center font-color-light mb-5']"));
		       String orderNum = order.getText();
		        
		        System.out.println( orderNum);
		        
		    }
		   
}
