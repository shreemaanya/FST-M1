package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity1 {

	public static void main(String[] args) {
		//create a driver object 
		WebDriver driver = new FirefoxDriver(); //ChromeDriver() or EdgeDriver()
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//Open browser
		driver.get("https://training-support.net/");
		
		//verify page title 
		System.out.println("Page title is :" + driver.getTitle());
		
		//Find and click the About us link
		//WebElement aboutlink = findElement(By.linkText("About Us");
		//aboutlink.click();
		driver.findElement(By.linkText("About Us")).click(); // chain function
		
		System.out.println("New Page title is :" + driver.getTitle());
						
		//Close the browser 
			driver.quit(); 

}
}
