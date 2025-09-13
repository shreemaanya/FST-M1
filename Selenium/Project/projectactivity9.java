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

public class projectactivity9 {
	
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
				driver.get("https://alchemy.hguy.co/jobs/wp-admin");
			}
	
	@Test
		public void TitleTest() {
				//Assertions
				Assert.assertEquals(driver.getTitle(), "Log In ‹ Alchemy Jobs — WordPress");
	}
	
	
	@Test(dependsOnMethods = { "TitleTest" })
	public void LoginTest() {
			
		WebElement username = driver.findElement(By.id("user_login"));
		username.sendKeys("root");
		WebElement password = driver.findElement(By.id("user_pass"));
		password.sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
		//Asssertions
		String LoginPageTitle = driver.getTitle();
		Assert.assertEquals(LoginPageTitle, "Dashboard ‹ Alchemy Jobs — WordPress");
		}
	
	@Test(dependsOnMethods = { "TitleTest", "LoginTest" })
	public void Joblists() {
			
		driver.findElement(By.xpath("//*[@id=\"menu-posts-job_listing\"]/a/div[3]")).click();
				
		driver.findElement(By.xpath("//a[@class=\"page-title-action\"]")).click();
		driver.findElement(By.id("post-title-0")).sendKeys("Buisiness Analyst");
		driver.findElement(By.id("_company_website")).sendKeys("abc@ibm.com");
		driver.findElement(By.id("_job_location")).sendKeys("London");
		driver.findElement(By.id("_company_name")).sendKeys("XEROX");
		driver.findElement(By.id("_application")).sendKeys("abhiram@cklabs.com");
		driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button")).click();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin/edit.php?post_type=job_listing");
		driver.findElement(By.id("post-search-input")).sendKeys("Buisiness Analyst");
		String NewJob = driver.findElement(By.xpath("//a[contains(text(),'Buisiness Analyst')]")).getText();
		System.out.println(NewJob);
		//Assertions
		Assert.assertEquals(NewJob, "Buisiness Analyst");
		
		}
		
	@AfterClass 
		
		public void teardown() {
		//close the browser
		driver.quit();

}
}
