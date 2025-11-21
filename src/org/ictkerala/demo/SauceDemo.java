package org.ictkerala.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SauceDemo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		WebElement uname=driver.findElement(By.id("user-name"));
		uname.sendKeys("standard_user");
		WebElement passwrd=driver.findElement(By.id("password"));
		passwrd.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		}

}

