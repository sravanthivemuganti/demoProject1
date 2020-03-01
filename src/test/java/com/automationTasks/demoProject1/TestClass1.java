package com.automationTasks.demoProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {

	public static WebDriver driver;

	@BeforeMethod
	public void lauchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void test1() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Test 1 title is : "+ driver.getTitle());
		}
	@Test
	public void test2() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Test 2 title is : "+ driver.getTitle());
	}
	@Test
	public void test3() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Test 3 title is : "+ driver.getTitle());
	}
	@Test
	public void test4() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Test 4 title is : "+ driver.getTitle());
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();      
	}
}
