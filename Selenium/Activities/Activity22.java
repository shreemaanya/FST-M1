package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//open the page
		driver.get("https://training-support.net/webelements/popups");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		driver.findElement(By.id("launcher")).click();
		
		// Wait for the modal to appear
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		
		// Find the input fields
		
		
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        // Enter the credentials
        username.sendKeys("admin");
        password.sendKeys("password");
        // Click the submit button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Print the success message
        String message = driver.findElement(By.cssSelector("h2.text-center")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        driver.quit();
		
		
		
		
		driver.quit();

	}

}
