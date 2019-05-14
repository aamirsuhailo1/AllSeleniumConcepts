package com.qadevelopers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowsersHandling {

	public static void main(String[] args) {
		
		// add browser settings using chromeOptions
		ChromeOptions cop = new ChromeOptions();
		cop.addArguments("start-maximized");
		cop.addArguments("--incognito");
		cop.addArguments("--disable-extensions");
		
		//Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		WebDriver driverCC = new ChromeDriver(cop);
		driverCC.get("https://www.google.com");
		driverCC.quit();
		
		//Launch Firefox
		System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
		WebDriver driverFF = new FirefoxDriver();
		driverFF.get("https://www.google.com");
		driverFF.quit();
		
		//Launch Internet Explorer
		System.setProperty("webdriver.ie.driver", "./resources/IEDriverServer.exe");
		WebDriver driverIE = new InternetExplorerDriver();
		driverIE.get("https://www.google.com");
		driverIE.quit();
		
		
		
	}

}
