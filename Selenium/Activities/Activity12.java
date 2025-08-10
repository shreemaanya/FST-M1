package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	 public static void main(String[] args) {
	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));   

	        // Open the page
	        driver.get("https://training-support.net/webelements/dynamic-content");
	        // Print the title of the page
	        System.out.println("Page title: " + driver.getTitle());

	        // Find and click the "Click me!" button
	        driver.findElement(By.id("genButton")).click();
	        //Wait till the word "release" appears.
	        if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"),"release"))) {
	        	System.out.println("Word found: " + driver.findElement(By.id("word")).getText());
	        }
	        
	      
	        

	        // Close the browser
	        driver.quit();
	    }
	}
