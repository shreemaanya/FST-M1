package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity20 {

	public static void main(String[] args) {
		//create a driver object 
		WebDriver driver = new FirefoxDriver(); //ChromeDriver() or EdgeDriver()
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//Open browser
		driver.get("https://training-support.net/webelements/alerts");
		
		//verify page title 
		System.out.println("Page title is :" + driver.getTitle());
		
		//Find the button to open a confirmation alert and click it
		driver.findElement(By.id("prompt")).click();
		
		//Switch the focus from the main window to the Alert box and get the text in it and print it.
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("Text in alert is " + promptAlert.getText());
		
		//Type "Awesome!" into the prompt.
		promptAlert.sendKeys("Lakshmi");
		
		//Close the alert once with OK
		promptAlert.accept();
								
		System.out.println(driver.findElement(By.id("result")).getText());
		
		//Close the browser 
			driver.quit(); 	

	}

}
