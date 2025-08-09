package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
	public static void main(String[] args) {
		//create a driver object 
		WebDriver driver = new FirefoxDriver(); //ChromeDriver() or EdgeDriver()
		
		//Open browser
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		//verify page title 
		System.out.println("Page title is :" + driver.getTitle());
		
		//Interactions - Find the checkbox input element,Check if it is selected on the page.
		
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		System.out.println("Checkbox is selected: " + checkbox.isSelected());
		
		//Click the "Checkbox" button.
		checkbox.click();
		
		//Check if the checkbox is selected again and print the result.
		System.out.println("Checkbox is selected: " + checkbox.isSelected());
		
		System.out.println("Page title is :" + driver.getTitle());
						
		//Close the browser 
			driver.close(); 
	}

}
