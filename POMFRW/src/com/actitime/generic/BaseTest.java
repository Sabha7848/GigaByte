package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract public class BaseTest implements IAutoConstant {
	static
	{
	System.setProperty(CHROM_KEY,CHROM_VALUE);
	}
	
	public static WebDriver driver;
	public static void openApplication()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	public static void closeApplication()
	{
		driver.close();
	}
}
