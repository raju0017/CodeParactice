package com.practies.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunching {

	public static void main(String[] args)
	{
		FirefoxDriver f = new FirefoxDriver();
		f.manage().window().maximize();
		f.get("http://www.google.com");
		// or f.navigate().to("http://www.google.com");
		f.navigate().refresh();
		
		String url = f.getCurrentUrl();
		System.out.println(url);
		
		String title = f.getTitle(); 
		System.out.println(title);
		
		
		
		
		f.close();
		//or f.quit();
	}

}
