package com.project.Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoClass1_Test {
	@Test(groups = "Smoke")
	public void test21() {
		Reporter.log("--test1--", true);
	}
	@Test
	public void test22() {
		Reporter.log("--test2--", true);
	}
}
