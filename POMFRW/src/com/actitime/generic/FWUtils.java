package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FWUtils implements IAutoConstant {
	/**
	 * used to verify the page based on Arguments
	 * @param driver
	 * @param expectedTitle
	 */
	public static void verifyPage(WebDriver driver,String expectedTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("The ExpectedPage Title is: "+expectedTitle);
		}
		else
		{
			System.out.println("The ExpectedPage Title is not Displayed : "+actualTitle);
		}
	}
	
	/**
	 * used to read data from Excel based on Arguments
	 * @param path
	 * @param sheet
	 * @param rn
	 * @param cn
	 * @return
	 */
	public static String read_XL_Data(String path,String sheet,int row,int cell)
	{
		String data="";
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			data=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	/**
	 * used to write data into Excel based on Arguments
	 * @param path
	 * @param sheet
	 * @param rn
	 * @param cn
	 */
	public static void write_XL_Data(String path,String sheet,int row,int cell )
	{
		int v=0;
		try
		{
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue(v);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to get row count
	 * @param path
	 * @param sheet
	 * @return
	 */
	public static int xl_Row_Count(String path,String sheet)
	{
		int rowCount=0;
		try
		{
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			rowCount=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowCount;
	}
	
	/**
	 * used to create an object for WebDriverWait 
	 * @param driver
	 */
	public static void explctWait(WebDriver driver)
	{
		new WebDriverWait(driver,ETO);
	}
	
	
	/**
	 * used to create an object for Actions class
	 * @param driver
	 */
	public static void action(WebDriver driver)
	{
		new Actions(driver);
	}
	
	
	/**
	 * used to create an object for Select class
	 * @param element
	 */
	public static void sel(WebElement element)
	{
		new Select(element);
	}
	
	/**
	 * used to take Screenshot based on Arguments
	 * @param driver
	 * @param path
	 */
	public static void takesScreenShot(WebDriver driver,String path)
	{
		try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src,des);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	
	
	
	

}
