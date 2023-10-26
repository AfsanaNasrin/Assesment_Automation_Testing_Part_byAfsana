package com.kinetik.Assesment_Automation_Testing.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.kinetik.Assesment_Automation_Testing.Utils.DriverManager;
import com.kinetik.Assesment_Automation_Testing.Utils.XpathUtils;

public class SignUp_Page {

	private WebDriver driver = null;

	@Test

	public void MoveToSignUpPage() throws InterruptedException {

		driver = DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.SignUp.Name)));
		driver.findElement(By.xpath(XpathUtils.SignUp.Name)).click();

		System.out.println("Welcome to sign up module");
		driver.findElement(By.xpath(XpathUtils.SignUp.Name)).sendKeys("afsana");
		Thread.sleep(1000);
		driver.findElement(By.xpath(XpathUtils.SignUp.Email)).sendKeys("afsanaa@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(XpathUtils.SignUp.SignUpButton)).click();

		// ENTER ACCOUNT INFORMATION

		Thread.sleep(1000);

		driver.findElement(By.xpath(XpathUtils.SignUp.Title)).click();
		driver.findElement(By.xpath(XpathUtils.SignUp.Password)).sendKeys("test1");
		driver.findElement(By.xpath(XpathUtils.SignUp.newsletter)).click();
		driver.findElement(By.xpath(XpathUtils.SignUp.First_Name)).sendKeys("test1");
		driver.findElement(By.xpath(XpathUtils.SignUp.Last_Name)).sendKeys("test1");
		driver.findElement(By.xpath(XpathUtils.SignUp.Company)).sendKeys("test1");
		driver.findElement(By.xpath(XpathUtils.SignUp.Address)).sendKeys("test1");
		driver.findElement(By.xpath(XpathUtils.SignUp.Address2)).sendKeys("test1");
//		driver.findElement(By.xpath(XpathUtils.SignUp.Country)).sendKeys("test");
		driver.findElement(By.xpath(XpathUtils.SignUp.State)).sendKeys("test1");
		driver.findElement(By.xpath(XpathUtils.SignUp.City)).sendKeys("test1");
		driver.findElement(By.xpath(XpathUtils.SignUp.Zipcode)).sendKeys("test1");
		driver.findElement(By.xpath(XpathUtils.SignUp.Mobile_Number)).sendKeys("test1");

		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.SignUp.Clickon_CreateAccount)).click();
		Thread.sleep(6000);
		
		System.out.println("Account Creation Successfully Done");
		driver.findElement(By.xpath(XpathUtils.SignUp.Continue)).click();
		
		System.out.println("10. Verify 'ACCOUNT CREATED!' and click 'Continue' button =>Done");

	}

}
