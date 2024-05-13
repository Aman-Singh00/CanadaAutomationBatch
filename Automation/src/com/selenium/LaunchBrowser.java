package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		
		//how to launch the browser in previous versions
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//launch the chromeBrowser
		WebDriver driver = new ChromeDriver();
		
		
		
		
	}
	

	
}
