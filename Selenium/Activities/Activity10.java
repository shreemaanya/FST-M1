package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

		public static void main(String[] args) {
	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        // Create the Actions object
	        Actions builder = new Actions(driver);

	        // Open the page
	        driver.get("https://training-support.net/webelements/drag-drop");
	        // Print the title of the page
	        System.out.println("Page title: " + driver.getTitle());

	        // Find the ball and simulate a click and drag to move it into "Dropzone 1
	        WebElement football = driver.findElement(By.id("ball"));
	        //Find the Dropzone1
	        WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
	        //Find the Dropzone2
	        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
	        
	        // Perform drag and drop to dropzone 1
	        builder.clickAndHold(football).moveToElement(dropzone1).pause(500).release().build().perform();
	        if(dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
	        System.out.println("Ball dropped in dropzone1");	
	        }
	     // Perform drag and drop to dropzone 2
	        builder.clickAndHold(football).moveToElement(dropzone2).pause(500).release().build().perform();
	        if(dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
	        System.out.println("Ball dropped in dropzone2");	
	        }
	     // Close the browser
	        driver.quit();
	        }      

	}


