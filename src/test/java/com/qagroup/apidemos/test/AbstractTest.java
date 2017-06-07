package com.qagroup.apidemos.test;

import org.testng.annotations.AfterClass;

import com.qagroup.app.ApiDemos;


public class AbstractTest {
			
	@AfterClass(alwaysRun = true)
	 public void tearDown() {
	 ApiDemos.close();
	 }
	
}
