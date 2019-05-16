package com.qadevelopers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadHandling {

	public static void main(String[] args) throws InterruptedException {
		
		// add browser settings using chromeOptions
		ChromeOptions cop = new ChromeOptions();
		cop.addArguments("start-maximized");
		cop.addArguments("--incognito");
		cop.addArguments("--disable-extensions");
		
		//Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver(cop);
		driver.get("http://demo.guru99.com/test/upload/");
		
		// This is applicable only if the web element type should be file
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:/Users/aa353637/Desktop/fileuploadtest.txt");
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
