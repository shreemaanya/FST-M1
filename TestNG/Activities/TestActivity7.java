package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestActivity7 {
	//declare driver
		WebDriver driver;
		WebDriverWait wait;
			
		@BeforeClass
		public void setup() {
			//initialize driver and wait 
			driver = new FirefoxDriver();
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			//Open page 
			driver.get("https://training-support.net/webelements/login-form");
		}
			
		@Test(priority=0)
			public void pageTitleTest() {
			//Assertions
			Assert.assertEquals(driver.getTitle(),"Training support");
			
		}
		@DataProvider (name = "InvalidCreds")
		public Object[][] creds(){
			return new Object[][] {{"admin","wrongpassword"},{"wrong","incorrect"},{"delete","table"}};
			
		}
		@Test(priority=1,dataProvider = "InvalidCreds")
		public void invalidLoginTest(String username,String password) {
			//find elements 
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		
		//clear fields 
		usernameField.clear();
		passwordField.clear();
		
		//enter creds
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		submitButton.click();
		
		//Assertion
		String message =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subheading"))).getText();
		assertEquals(message,"Invalidcredentials");
						
		}
							
		@AfterClass
		public void tearDown() {							 				
			//close browser
			driver.quit();
}}
