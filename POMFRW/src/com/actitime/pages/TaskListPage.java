package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	 @FindBy(id="username")
	  private WebElement unTb;
	  
	  @FindBy(name="pwd")
	  private WebElement pwTb;
	  
	  @FindBy(xpath="//div[text()='Login ']")
	  private WebElement lgnBtn;
	  
	  @FindBy(xpath="//div[text()='TASKS']")
	  private WebElement task;
	  
	  @FindBy(xpath="//div[text()='Add New']")
	  private WebElement AddNew;
	  
	  @FindBy(xpath="//div[text()='+ New Customer']")
	  private WebElement NewCus;

	  @FindBy(id="customerLightBox_nameField")
	  private WebElement CusName;
	  
	  @FindBy(id="customerLightBox_descriptionField")
	  private WebElement AddDesc;
	  
	  @FindBy(xpath="//span[text()='Create Customer']")
	  private WebElement CreateCus;
	  
	    
	public TaskListPage(WebDriver driver)
	   {
		  PageFactory.initElements(driver, this);
	   }
	  
	  public void actiLogin(String un,String pwd)
	  {
		 unTb.sendKeys(un); 
		 pwTb.sendKeys(pwd);
		 lgnBtn.click();
	  }
	  
	  public void clickTasks()
	  {
		  task.click();
	  }
	  
	  public void clickAddNew()
	  {
		  AddNew.click();
	  }
	  
	  public void clickNewCustomer()
	  {
		  NewCus.click();
	  }
	  
	  public void CustomerName(String custname)
	  {
		  CusName.sendKeys(custname);
	  }
	  
	  public void AddDescription(String descp)
	  {
		  AddDesc.sendKeys(descp);;
	  }
	  
	  public void clickCreateCustomer()
	  {
		  CreateCus.click();
	  }
	 
}
