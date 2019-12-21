package com.abc.selenium;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser
{
	@Test
	public void launchChrome()
	{
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com");
		 
		 driver.quit();
		 
		
	}

}
