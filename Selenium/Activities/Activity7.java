package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		WebElement textInput = driver.findElement(By.id("textInput"));
		System.out.println(textInput.isEnabled());
		driver.findElement(By.id("textInputButton")).click();
		System.out.println(textInput.isEnabled());
		textInput.sendKeys("Welcome");
		System.out.println(textInput.getDomProperty("value"));
		driver.quit();
	}

}
