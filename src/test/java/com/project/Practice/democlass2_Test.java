package com.project.Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class democlass2_Test {
	@Test(groups="Regression")
	public void test21() {
		Reporter.log("--Regression2--", true);
	}
	@Test(groups = "Smoke")
	public void test22() {
		Reporter.log("--Smoke2--", true);
	}
}
