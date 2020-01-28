package com.actitime.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.BaseTest;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class TestValidLoginPage extends BaseTest {
		public static void main(String[] args) throws InterruptedException {
			BaseTest.openApplication();
			//create loginPage object
			LoginPage lp = new LoginPage(driver);
			//call the pageObject  method for perform actions in the Username and Password TextBox
			lp.setUserName("admin");
			lp.setPassWord("manager");
			lp.clickOnLoginBtn();
			
			
		

	}

}
