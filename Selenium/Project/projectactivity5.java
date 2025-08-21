package seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class projectactivity5 {

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
					driver.get("https://alchemy.hguy.co/jobs");
				}
		
		@Test
			public void JobspagetitleTest() {
					//Assertions
			WebElement jobslink = driver.findElement(By.id("menu-item-24"));
			jobslink.click();
			String Jobspagetitle = driver.getTitle();
			Assert.assertEquals(Jobspagetitle, "Jobs – Alchemy Jobs");	
		}
		
			
		@AfterClass 
			
			public void teardown() {
			//close the browser
			driver.quit();
}
}
