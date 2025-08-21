package seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class projectactivity6 {

	//Declare class objects 
	
			WebDriver driver;
			WebDriverWait wait;
			
			
			//Browser setup function
			@BeforeClass(alwaysRun = true)
			
			public void setUp() {
				//initialize driver and wait 
				
				driver = new FirefoxDriver();
				wait = new WebDriverWait(driver,Duration.ofSeconds(10));
						//open the page
						driver.get("https://alchemy.hguy.co/jobs");
					}
			
			@Test(groups = { "HeaderTests"})
				public void JobspagetitleTest() {
						//Assertions
				WebElement jobslink = driver.findElement(By.id("menu-item-24"));
				jobslink.click();
				String Jobspagetitle = driver.getTitle();
				Assert.assertEquals(Jobspagetitle, "Jobs – Alchemy Jobs");	
			}
			
				
			@Test(dependsOnMethods = { "JobspagetitleTest" }, groups = { "HeaderTests" })
			
			public void SearchJob() {
				
				WebElement jobslink = driver.findElement(By.id("search_keywords"));	
				jobslink.sendKeys("Banking");
				WebElement searchjobsbutton = driver.findElement(By.xpath("//div[contains(@class,\"search_submit\")]"));
				searchjobsbutton.click();
				
				// Wait for the results container to be visible
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("job_listings")));
				// Optionally wait for list items
				//List<WebElement> joblist1 = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[contains(@class,\"job_listing type-\")]")));
				//int size = joblist1.size();
				WebElement listContainer = driver.findElement(By.className("job_listings"));
				Assert.assertEquals(true, listContainer.isDisplayed());
				
				
			}
			
			@Test(dependsOnMethods = { "JobspagetitleTest","SearchJob" }, groups = { "HeaderTests" })
			
			public void Applyjob() throws InterruptedException {
				
				List<WebElement> joblist1 = wait.until(
						ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[contains(@class,\"job_listing type-\")]")));
				Thread.sleep(1000);
					joblist1.get(0).click(); // clicks the first job in the list
								
				String title = driver.getTitle();
				Assert.assertEquals(title, "SAP Testing – Alchemy Jobs");
				driver.findElement(By.xpath("//*[@id=\"post-5867\"]/div/div/div/div[3]/input")).click();
				String email = driver.findElement(By.className("job_application_email")).getText();
				System.out.println(email);
				Assert.assertEquals(email, "abc@gmail.com");
				
			}
					
			
			@AfterClass 
				
				public void teardown() {
				//close the browser
				driver.quit();
}
}
