package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  @FindBy(id="username")
  private WebElement unTb;
  
  @FindBy(name="pwd")
  private WebElement pwTb;
  
  @FindBy(id="loginButton")
  private WebElement lgnBtn;
  
 // @FindBy(xpath="(//span[@class='errormsg'])[1]")
 // private WebElement ErrMsg;
  
  public LoginPage(WebDriver driver)
   {
	  PageFactory.initElements(driver, this);
   }
  
  public void setUserName(String un)
  {
	  unTb.sendKeys(un);
  }
  
  public void setPassWord(String pw)
  {
	  pwTb.sendKeys(pw);
  }
  
  public void clickOnLoginBtn()
  {
	  lgnBtn.click();
  }
  
  //public void verifyErrMsg()
  //{
//	  if(ErrMsg.isDisplayed())
//		  System.out.println("The ErrMsg is displayed: "+ErrMsg.getText());
 // }
}
