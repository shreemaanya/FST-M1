package Activities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {
		//declare driver
		WebDriver driver;
		WebDriverWait wait;
			
		@BeforeClass
		public void setup() {
			//initialize driver and wait 
			driver = new FirefoxDriver();
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			//Open page 
			driver.get("https://training-support.net/");
		}
		@Test(priority=0)
		public void homePageTest() {
		//Assertions
		Assert.assertEquals(driver.getTitle(),"Training Support");
		
	}
			
		@Test(priority=1)
			public void pageTitleTest() {
			//Assertions
			Assert.assertEquals(driver.getTitle(),"Training Support");
			
		}
		@Test(priority=2)
		public void aboutPageTest() {
		//Find and click the About us link
			driver.findElement(By.linkText("About Us")).click();
			//Assertion for page title 
		Assert.assertEquals(driver.getTitle(),"About Training Support");
		
	}
		@AfterClass
		public void tearDown() {							//teardown or cleanup to close everything after use 				
			//close browser
			driver.quit();
		}

	}


