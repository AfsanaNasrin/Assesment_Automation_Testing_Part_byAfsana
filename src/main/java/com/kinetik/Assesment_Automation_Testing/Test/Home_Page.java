package com.kinetik.Assesment_Automation_Testing.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.kinetik.Assesment_Automation_Testing.Utils.DriverManager;
import com.kinetik.Assesment_Automation_Testing.Utils.UrlTextUtils;
import com.kinetik.Assesment_Automation_Testing.Utils.XpathUtils;

import junit.framework.Assert;

public class Home_Page {

	private WebDriver driver = null;

	@Test

	public void HomePageTitleVerify() throws InterruptedException {

		driver = DriverManager.driver;
		driver.get(UrlTextUtils.BaseURL.baseURL);
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Text.TextHomepageTitle);
		System.out.println("Home Page Title Verifyed!");
	}

	@Test(dependsOnMethods = "HomePageTitleVerify")

	public void ProductCart() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath(XpathUtils.AddProducttoCart.ClickOnCart1));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathUtils.AddProducttoCart.ClickOnCart2)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathUtils.AddProducttoCart.ClickOnViewCart)).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Text.CartpageTitle);
		System.out.println("Cart Page is displayed!");
		Thread.sleep(2000);
		// driver.findElement(By.xpath(XpathUtils.AddProducttoCart.)).click();
		driver.findElement(By.xpath(XpathUtils.AddProducttoCart.ProcceedToCheckOut)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathUtils.AddProducttoCart.RegisterLogin)).click();
		
		
	}

}
