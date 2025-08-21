package seleniumproject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class projectactivity7 {
	
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
		public void Postajoblink() {
				//Assertions
		WebElement PostaJoblink = driver.findElement(By.xpath("//a[contains(text(),\"Post a Job\")]"));
		PostaJoblink.click();
		String PostaJobpagetitle = driver.getTitle();
		System.out.println(PostaJobpagetitle);
		Assert.assertEquals(PostaJobpagetitle, "Post a Job – Alchemy Jobs");	
	}
	
	@Test (dependsOnMethods = { "Postajoblink" }, groups = { "HeaderTests" })
	
	public void Postajob() throws InterruptedException {
		
		WebElement PostaJoblink = driver.findElement(By.xpath("//a[contains(text(),\"Post a Job\")]"));
		PostaJoblink.click();
		String PostaJobpagetitle = driver.getTitle();
		System.out.println(PostaJobpagetitle);
		WebElement YourEmail = driver.findElement(By.id("create_account_email"));
		YourEmail.sendKeys("testjob@ibm.com");
		WebElement jobTitle = driver.findElement(By.id("job_title"));
		jobTitle.sendKeys("AutomationSeniourTester");
		WebElement jobLocation = driver.findElement(By.id("job_location"));
		jobLocation.sendKeys("Noida");
		WebElement jobTypedropdown = driver.findElement(By.id("job_type"));
		Select singleSelect = new Select(jobTypedropdown);
        // Select the second option using visible text
        singleSelect.selectByVisibleText("Internship");
					
		// 1. Locate the iframe—adjust the selector as needed
		WebElement iframe = driver.findElement(By.id("job_description_ifr"));

		// 2. Switch into the iframe context
		driver.switchTo().frame(iframe);

		// 3. Find the editable body and input your text
		WebElement body = driver.findElement(By.xpath("//*[@id=\"tinymce\"]"));
		body.clear();
		body.sendKeys("Job description: Need 5+ years of Automation experience and Healthm Insurance domain knowledge");

		// 4. Return to the main document
		driver.switchTo().defaultContent();
		
		WebElement appemail = driver.findElement(By.id("application"));
		appemail.sendKeys("testjob@abc.com");
		Thread.sleep(1000);
		// Pass the WebElement to the Select object
		
		WebElement CompanyName = driver.findElement(By.id("company_name"));
		CompanyName.sendKeys("WellMark");
		
					
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/form/p/input[4]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"job_preview_submit_button\"]")).click();
		
	}
	
		
@Test(dependsOnMethods = { "Postajoblink","Postajob" }, groups = { "HeaderTests" })

public void SearchJob() {
	WebElement jobslink = driver.findElement(By.id("menu-item-24"));
	jobslink.click();
	WebElement search = driver.findElement(By.id("search_keywords"));	
	search.sendKeys("AutomationSeniourTester");
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
	@AfterClass 
		
		public void teardown() {
		//close the browser
		driver.quit();

}
}
