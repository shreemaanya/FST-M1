package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net/webelements/login-form/");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		driver.findElement(By.xpath("//input[contains(@id,\"username\")]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[contains(@id,\"password\")]")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[contains(text(),\"Submit\")]")).click();
		
		System.out.println("New Title:" + driver.getTitle());
		
		//driver.quit();

	}

}
