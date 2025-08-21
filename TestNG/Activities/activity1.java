package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class activity1 {
	
	
	//Declare class objects 
	
		WebDriver driver;
		WebDriverWait wait;
		
		
		//Browser setup function
		@BeforeClass
		
		public void setUp() {
			//initialize driver and wait 
			
			driver = new FirefoxDriver();
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
					//open the page
					driver.get("https://training-support.net");
				}
		
		@Test
			public void homepageTest() {
					//Assertions
					Assert.assertEquals(driver.getTitle(), "Training Support");
		}
		
		@Test
		
		public void aboutpageTest() {
			//find and click about us link
			//assertion for page title
			
			driver.findElement(By.linkText("About Us")).click();
			
			Assert.assertEquals(driver.getTitle(), "About training Support");
		}
		
		@AfterClass 
			
			public void teardown() {
			//close the browser
			driver.quit();
	}

}
