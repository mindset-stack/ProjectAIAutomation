package com.blazeclan.qa.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.blazeclan.qa.base.CommonFunctions;
import com.blazeclan.qa.logging.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser extends CommonFunctions{

	
	public static WebDriver selectDriver(String browser) {
		
		switch(browser){
		case"chrome":
		ChromeOptions options=  new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		//options.addArguments("no-sandbox");
		
		
		WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver(); 
	//driver= WebDriverManager.chromedriver().capabilities(options).create();
		
		

			
		Log.info("chrome browser selected");
		break;
	default:
		System.out.println("Please provide browser name");
	//System.setProperty("webdriver.chrome.driver", "D://Latestchromedriverexe//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
		DriverManager.setDriver(driver);
		return DriverManager.getDriver();
	
	
		
		
	}
	
	
}
