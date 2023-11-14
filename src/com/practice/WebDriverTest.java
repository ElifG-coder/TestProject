package com.practice;

public class WebDriverTest {

	public static void main(String[] args) {
	WebDriver dr=new ChromeDriver();
	dr.openBrowser();
	dr.closeBrowser();
	dr.maximizeWindow();
	dr.findElement();
	dr.takePicture();
	
	
	WebDriver dr1=new FireFoxDriver();
	dr1.openBrowser();
	dr1.closeBrowser();
	dr1.maximizeWindow();
	dr1.findElement();
	dr1.takePicture();

	}

}
