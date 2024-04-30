package SauceLab;

import org.testng.annotations.AfterMethod;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SauceBaseTestNG {

	public static ChromeDriver driver;

	        @BeforeMethod       
	        public void SauceLabDemo() {
	    		
	    		
	    	    driver = new ChromeDriver();

	    		driver.manage().window().maximize();
	    		driver.manage().deleteAllCookies();
	    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    		
	    		driver.get("https://www.saucedemo.com/");
	    		
	        }
				@AfterMethod
	    	    public void tearDown() {
	    	        driver.quit();
	    		
}}
