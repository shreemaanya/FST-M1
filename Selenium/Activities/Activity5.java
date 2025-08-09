package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity5 {

	public static void main(String[] args) {
		//create a driver object 
		WebDriver driver = new FirefoxDriver(); //ChromeDriver() or EdgeDriver()
		
		//Open browser
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		//verify page title 
		System.out.println("Page title is :" + driver.getTitle());
		
		//Interactions - Find the checkbox input element,Check if it is visible on the page.
		System.out.println(driver.findElement(By.id("checkbox")).isDisplayed());
		
		//Click the "Remove Checkbox" button.
		driver.findElement(By.xpath("//button[text()=\"Toggle Checkbox\"]")).click();
		
		//Check if it is visible again and print the result.
		System.out.println(driver.findElement(By.id("checkbox")).isDisplayed());
		//click the toggle button again 
		driver.findElement(By.xpath("//button[text()=\"Toggle Checkbox\"]")).click();
		
		//Check if it is visible again and print the result.
		System.out.println(driver.findElement(By.id("checkbox")).isDisplayed());
		
		System.out.println("Page title is :" + driver.getTitle());
						
		//Close the browser 
			driver.quit(); 
	}

}
