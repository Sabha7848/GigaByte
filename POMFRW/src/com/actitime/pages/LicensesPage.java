package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LicensesPage {
	
	@FindBy(xpath="//nobr[text()='Product Edition:']/../../td[2]")
	private WebElement productEdition;
	
	@FindBy(xpath="//nobr[text()='Issue Date:']/../../td[2]")
	private WebElement issueDate;
	
	public LicensesPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifyProductEdition()
	{
		String ePEdition="actiTIME 2017.4";
		String aPEdition=productEdition.getText();
		if(ePEdition.equals(aPEdition))
		{
			System.out.println("The Expected ProductEdition is: "+ePEdition);
		}
		else
		{
			System.out.println("The Actual ProductEdition is :"+aPEdition);
		}
	}
	public void verifyIssueDate()
	{
		String eIDate="Jul 14, 2017";
		String aIDate=issueDate.getText();
		if(eIDate.equals(aIDate))
		{
			System.out.println("The Expected IssueDate is: "+eIDate);
		}
		else
		{
			System.out.println("The Actual IssueDate is : "+aIDate);
		}
	
	}

}
