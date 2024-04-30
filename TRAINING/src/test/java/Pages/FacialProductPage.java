package Pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class FacialProductPage extends BaseClass {
	
	public void clickFacialProduct() {
		driver.findElement(By.xpath("//p[Text()='Facial Products']/folowing::p")).click();

	}

	public void clickLipFantastic() {
		driver.findElement(By.xpath("//p[Text()=']/folowing::p")).click();
	}
}
