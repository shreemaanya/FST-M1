package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
	public static void main(String[] args) {
		//create a driver object 
		WebDriver driver = new FirefoxDriver(); //ChromeDriver() or EdgeDriver()
		
		//Open browser
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		//verify page title 
		System.out.println("Page title is :" + driver.getTitle());
		
		//Interactions - Find the text field 
		WebElement text = driver.findElement(By.id("textInput"));
		
		//Check if the text field is enabled and print it
		System.out.println("Text field is enabled : " + text.isEnabled());
		
		//Click the "Checkbox" button.
		driver.findElement(By.id("textInputButton")).click();
		
		//Check if the checkbox is selected again and print the result.
		System.out.println("text is enabled: " + text.isEnabled());
		
		System.out.println("Page title is :" + driver.getTitle());
						
		//Close the browser 
			driver.quit(); 
	}

}
