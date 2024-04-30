package TestRunner;

import org.testng.annotations.BeforeTest;

import base.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="D:\\eclipse workspace\\TRAINING\\src\\test\\java\\Features",
							glue ={"Pages","hooks"},
							monochrome =true,
							publish=true,
							tags="@day1"
							)
public class CommerceRunner extends BaseClass {

	@BeforeTest
	public void setValues()
	{
		testName="HairBeautyProduct";
		testDescription="verify order ID of HairBeauty Product";
		testAuthor="Divya";
		testCategory="Regression";
		
	}
}
