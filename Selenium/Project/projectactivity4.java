package seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class projectactivity4 {
	
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
		public void heading2Test() {
				//Assertions
		String heading2 = driver.findElement(By.xpath("//h2[contains(text(),\"Quia quis non\")]")).getText();
		Assert.assertEquals(heading2, "Quia quis non");	
	}
	
		
	@AfterClass 
		
		public void teardown() {
		//close the browser
		driver.quit();
	

}
}
