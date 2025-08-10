package activities;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		//create a driver object 
		WebDriver driver = new FirefoxDriver(); //ChromeDriver() or EdgeDriver()
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
			
		//Open browser
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		//verify page title 
		System.out.println("Page title is :" + driver.getTitle());
			
		//Interactions - Find the checkbox input element,Check if it is visible on the page.
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		System.out.println("Checkbox is visible :" + checkbox.isDisplayed());
				
		//Click the "Remove Checkbox" button.
		driver.findElement(By.xpath("//button[text()=\"Toggle Checkbox\"]")).click();
				
		// Wait for it to disappear
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		        
		//Check if it is visible again and print the result.
		System.out.println("Checkbox is visible :" + checkbox.isDisplayed());
				
		//click the toggle button again 
		driver.findElement(By.xpath("//button[text()=\"Toggle Checkbox\"]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
				
		//Check if it is selected and print the result.
		System.out.println("Checkbox is selected :" + checkbox.isSelected());
							
		//Close the browser 
		driver.quit(); 

	}

}
