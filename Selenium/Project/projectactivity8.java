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

public class projectactivity8 {
	
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
		
	@AfterClass 
		
		public void teardown() {
		//close the browser
		driver.quit();

}
}
