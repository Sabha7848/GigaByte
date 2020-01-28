package com.actitime.scripts;

import com.actitime.generic.BaseTest;
import com.actitime.pages.LoginPage;

public class TestInvalidLoginPage extends BaseTest {
	public static void main(String[] args) throws InterruptedException {
		BaseTest.openApplication();
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("Amjath");
		lp.clickOnLoginBtn();
		Thread.sleep(2000);
		
		lp.setPassWord("khan");
		lp.clickOnLoginBtn();
		Thread.sleep(2000);
		
		lp.clickOnLoginBtn();
		Thread.sleep(2000);
		
		lp.setUserName("1234");
		lp.setPassWord("2");
		lp.clickOnLoginBtn();
		Thread.sleep(2000);
		
		lp.setUserName(" ");
		lp.setPassWord(" ");
		lp.clickOnLoginBtn();
		Thread.sleep(2000);
		
		BaseTest.closeApplication();
		
		
		
		
		
		
	}

}
