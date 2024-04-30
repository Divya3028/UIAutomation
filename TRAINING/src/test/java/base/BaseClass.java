package base;
import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;
import com.beust.jcommander.JCommander.Builder;
import com.google.common.io.Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests{

	public static ChromeDriver driver;
	public static WebDriverWait wait;
	public static ExtentReports extent;
	public String testName, testDescription, testAuthor, testCategory;
	public Select sc;
	public static ExtentTest test;
	
//	@BeforeSuite
//	public void startReport() {
//		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
//		reporter.setAppendExisting(true);	
//		extent=new ExtentReports();
//		extent.attachReporter(reporter);
//	}
//	
//	@BeforeClass
//	public void assignTestDetails()
//	{
//		test =  extent.createTest(testName, testDescription);
//		test.assignAuthor(testAuthor);
//		test.assignCategory(testCategory);
//	}
//	
//	
//	public int takeSnap() throws IOException{
//		int ranNum =(int) (Math.random()* 99999 + 99999);
//		File src = driver.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./../snaps/img.png");
//		//File dest = new File("D:\\eclipse workspace\\TRAINING\\snaps\\img.png");
//		Files.copy(src,dest);
//		return ranNum;
//	}
//	
//	
//	public void reportStep(String msg, String status) throws IOException{
//		
//		if (status.equalsIgnoreCase("Pass")) 
//		{
//			test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath("./snaps/img"+takeSnap()+".png").build());
//			//test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath("D:\\eclipse workspace\\TRAINING\\snaps\\img"+takeSnap()+".png").build());
//
//		}
//		else if( status.equalsIgnoreCase("fail")) {
//			test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath("./snaps/img"+takeSnap()+".png").build());
//		}
//	}
//	
//	@AfterSuite
//	public void stopReport()
//	{
//		extent.flush();
//	}
	
//	@BeforeMethod
//	public void preCondition() {
//		try
//		{
//		driver = new ChromeDriver();
//		driver.get("https://commercejs-demo-store.netlify.app/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//	}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//	
//	@AfterMethod
//	public void postCondition() {
//		
//		try
//		{
//		driver.quit();
//	
//	}
//	catch(Exception e) {
//		System.out.println(e);
//	}
//	}
	}
