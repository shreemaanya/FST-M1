package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		//open the page
		driver.get("https://training-support.net/webelements/keyboard-events");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		builder.sendKeys("This is comming from selenium").build().perform();
		
		String text = driver.findElement(By.xpath("//h1[contains(@class,\"mt-3 text-center text-4xl font-semibold text-black\")]")).getText();
		System.out.println(text);
		driver.quit();

	}

}
