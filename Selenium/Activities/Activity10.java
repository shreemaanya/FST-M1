package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		//open the page
		driver.get("https://training-support.net/webelements/drag-drop");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		WebElement Ball = driver.findElement(By.id("ball"));
		WebElement Dropzone1 = driver.findElement(By.id("dropzone1"));
		WebElement Dropzone2 = driver.findElement(By.id("dropzone2"));
		
		builder.clickAndHold(Ball).moveToElement(Dropzone1).build().perform();

		if(Dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
			System.out.println("Ball dropped to Zone 1");
		}
				

        // Perform drag and drop to dropzone 2
        builder.dragAndDrop(Ball, Dropzone2).pause(5000).build().perform();
        
        if(Dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball dropped to Zone 2");
        

        // Close the browser
        driver.quit();
    }
		

	}

}
