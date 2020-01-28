package com.actitime.scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.pages.LoginPage;

public class TestLoginPage {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("admin");
		lp.clickOnLoginBtn();
		Thread.sleep(1000);
		
		lp.setPassWord("manager");
		lp.clickOnLoginBtn();
		Thread.sleep(1000);
		
		lp.setUserName("amjath");
		lp.setPassWord("pathan");
		lp.clickOnLoginBtn();
		Thread.sleep(1000);
		
		lp.clickOnLoginBtn();
		
	}

}
