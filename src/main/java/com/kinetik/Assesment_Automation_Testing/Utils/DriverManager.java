package com.kinetik.Assesment_Automation_Testing.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class DriverManager {

	static {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Business Automation Ltd. Office\\Automation_Test\\chromedriver.exe");

	}

	public static WebDriver driver = new ChromeDriver();

	DriverManager() {

	}

}
