package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
		
		public static void main(String[] args) {
			//create a driver object 
			WebDriver driver = new FirefoxDriver(); //ChromeDriver() or EdgeDriver()
			
			//Open browser
			driver.get("https://training-support.net/webelements/login-form");
			
			//verify page title 
			System.out.println("Page title is :" + driver.getTitle());
			
			//Interactions
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("password");
			driver.findElement(By.className("svelte-1pdjkmx")).click();
			driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
			
			//String message = driver.findElement(By.cssSelector("h1.text-emerald-500")).getText();
			// Print the confirmation message
	        String message = driver.findElement(By.tagName("h1")).getText();
	        System.out.println(message);

			//driver.findElement(By.xpath("//button[text()='Submit']")).click();
			
			System.out.println("Page title is :" + driver.getTitle());
					
			//Close the browser 
			driver.quit(); 
		}

}
