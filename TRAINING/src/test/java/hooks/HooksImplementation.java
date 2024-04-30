package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImplementation extends BaseClass {
	@Before
	public void preCondition() {
		try
		{
		driver = new ChromeDriver();
		driver.get("https://commercejs-demo-store.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@After
	public void postCondition() {
		
		try
		{
		driver.quit();
	
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}
