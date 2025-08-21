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
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//open the page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		
		System.out.println("Check box visible?" + checkbox.isDisplayed());
		
		WebElement Toggle = driver.findElement(By.xpath("//button[text()=\"Toggle Checkbox\"]"));
		
		Toggle.click();
		
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		System.out.println("Check box visible?" + checkbox.isDisplayed());
		
		
		Toggle.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
		System.out.println("Checkbox is selected? " + checkbox.isSelected());
		
		driver.quit();

		
		driver.quit();

	}

}
