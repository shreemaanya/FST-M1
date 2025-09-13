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

public class projectactivity3 {
	
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
				String image_url = driver.findElement(By.xpath("//img[contains(@class, \"attachment-large size-large wp-post-image\")]")).getAttribute("src");
				System.out.println(image_url);
				Assert.assertEquals(image_url, "https://alchemy.hguy.co/jobs/wp-content/uploads/2019/09/career-corporate-job-776615-e1569782235456-1024x271.jpg");	
			}
			
				
			@AfterClass 
				
				public void teardown() {
				//close the browser
				driver.quit();

}
}
