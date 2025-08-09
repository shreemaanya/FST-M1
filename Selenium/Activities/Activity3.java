package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		
			//create a driver object 
			WebDriver driver = new FirefoxDriver(); //ChromeDriver() or EdgeDriver()
			
			//Open browser
			driver.get("https://training-support.net/webelements/login-form");
			
			//verify page title 
			driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("password");
			
			driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
			
			String message = driver.findElement(By.xpath("//h1")).getText();
			
			System.out.println("Login success message:" + message);
			
			System.out.println("Page title is :" + driver.getTitle());
							
			//Close the browser 
			driver.quit(); 

	}

	}


