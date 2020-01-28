package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(xpath="(//div[contains(text(),'Settings')])[1]")
	private WebElement settings;

	@FindBy(linkText="Licenses")
	private WebElement Licenses;
	
	public EnterTimeTrackPage(WebDriver driver)
	   {
		  PageFactory.initElements(driver, this);
	   }
	
	public void clickOnSettings()
	{
		settings.click();
	}
	
	public void clickOnLicenses()
	{
		Licenses.click();
	}
	
}
