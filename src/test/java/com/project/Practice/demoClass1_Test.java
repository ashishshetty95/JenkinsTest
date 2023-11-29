package com.project.Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoClass1_Test {
	@Test(groups = "Smoke")
	public void test21() {
		Reporter.log("--Smoke1--", true);
	}
	@Test(groups="Regression")
	public void test22() {
		Reporter.log("--Regression1--", true);
	}
}
