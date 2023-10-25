package com.kinetik.Assesment_Automation_Testing.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

	public void ProductCart() {

		driver.findElement(By.xpath(XpathUtils.AddProducttoCart.ClickOnCart)).click();
	}

}
