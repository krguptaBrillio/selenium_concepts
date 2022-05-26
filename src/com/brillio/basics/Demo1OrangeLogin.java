package com.brillio.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1OrangeLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krgupta\\OneDrive - Brillio\\Desktop\\selenium training\\chromedriver_win32\\chromedriver.exe" );
		System.setProperty("webdriver.edge.driver","C:\\Users\\krgupta\\OneDrive - Brillio\\Desktop\\selenium training\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
	//	WebDriver driver =new EdgeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		String title =driver.getTitle();
		System.out.println(title);
		
		//enter user
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//enter pwd
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//click login
		driver.findElement(By.id("btnLogin")).click();
		
		driver.getCurrentUrl();
		
		driver.findElement(By.id("welcome")).click();
		
		Thread.sleep(3000); //unconditional wait
		
		driver.findElement(By.linkText("Logout")).click();
		
	//	driver.quit();
		
		
	}

}
