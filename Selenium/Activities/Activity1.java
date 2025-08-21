package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net/");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		//driver.findElement(By.className("card")).click();
		
		driver.findElement(By.linkText("About Us")).click();
		
		System.out.println("New title :" + driver.getTitle());
		
		
		driver.quit();
	}

}
