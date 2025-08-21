package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net/");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains(text(),\"About Us\")]")).click();
		
		//driver.findElement(By.xpath("//h3[contains(text(), \"#3\")]")).getText();
		System.out.println("New title: " + driver.getTitle());
		
		
		
		//driver.quit();

	}

}
