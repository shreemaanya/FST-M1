package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.id("checkbox"));
			
		driver.findElement(By.xpath("//button[contains(text(),\"Toggle Checkbox\")]")).click();
		
		System.out.println(checkbox.isDisplayed());
		
		driver.findElement(By.xpath("//button[contains(text(),\"Toggle Checkbox\")]")).click();
		
		System.out.println(checkbox.isDisplayed());
	
		driver.quit();

	}

}
