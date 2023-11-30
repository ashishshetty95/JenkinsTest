package com.project.Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoClass1_Test {
	public WebDriver driver;
	@Test(groups = "Smoke")
	public void test21() {
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		Reporter.log("--Smoke1--", true);
	}
	@Test(groups="Regression")
	public void test22() {
		Reporter.log("--Regression1--", true);
	}
}
