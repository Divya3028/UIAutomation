package day2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTestNG {
	public static ChromeDriver driver;
	 @BeforeMethod
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://commercejs-demo-store.netlify.app/");
	        System.out.println("Launched URL successfully");
	    }
	 @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
}
