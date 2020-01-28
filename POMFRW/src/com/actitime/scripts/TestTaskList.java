package com.actitime.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.pages.LoginPage;
import com.actitime.pages.TaskListPage;

public class TestTaskList {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
			Thread.sleep(1000);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("admin");
		lp.setPassWord("manager");
		lp.clickOnLoginBtn();
		
		Thread.sleep(3000);
		TaskListPage tlp = new TaskListPage(driver);
		Thread.sleep(2000);
		tlp.clickTasks();
		Thread.sleep(2000);
		tlp.clickAddNew();
		Thread.sleep(1000);
		tlp.clickNewCustomer();
		Thread.sleep(2000);
		tlp.CustomerName("amjath sabha aurangwale");
		Thread.sleep(2000);
		tlp.AddDescription("highly motivated");
		Thread.sleep(2000);
		tlp.clickCreateCustomer();
	
		
		
	
		
	}

}
