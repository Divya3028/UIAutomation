package SauceLab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SauceLabPlainScript {

	public void SauceLabDemo() {
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/");
		
		String homepage = driver.getTitle();
		System.out.println(homepage);
		
		WebElement usernamebox = driver.findElement(By.id("username"));
		usernamebox.sendKeys("standard_user");

			
		WebElement passwordbox = driver.findElement(By.id("password"));
		passwordbox.sendKeys("secret_sauce");
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();


		WebElement Gotocart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		Gotocart.click();

		WebElement Checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		Checkout.click();

		WebElement FirstName = driver.findElement(By.xpath("//input[@id='first-name']"));
		FirstName.click();

		
		WebElement LastName = driver.findElement(By.xpath("//input[@id='last-name']"));
		LastName.click();

		
		
		WebElement postalCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		postalCode.click();

		
		
		WebElement ContinueButton = driver.findElement(By.xpath("//input[@id='continue']"));
		ContinueButton.click();

		
		
		WebElement FinishButton = driver.findElement(By.xpath("//button[@id='finish']"));
		FinishButton.click();

		
	}
        

}
