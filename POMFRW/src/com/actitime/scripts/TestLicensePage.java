package com.actitime.scripts;

import com.actitime.generic.BaseTest;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LicensesPage;
import com.actitime.pages.LoginPage;

public class TestLicensePage extends BaseTest{
	public static void main(String[] args) throws InterruptedException {
		BaseTest.openApplication();
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("admin");
		lp.setPassWord("manager");
		lp.clickOnLoginBtn();
		
		Thread.sleep(3000);
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.clickOnSettings();
		Thread.sleep(2000);
		ettp.clickOnLicenses();
		
		Thread.sleep(2000);
		LicensesPage Lic = new LicensesPage(driver);
		Lic.verifyProductEdition();
		Thread.sleep(2000);
		Lic.verifyIssueDate();	
	}

}
