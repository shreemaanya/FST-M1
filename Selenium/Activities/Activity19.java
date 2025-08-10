package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity19 {

	public static void main(String[] args) {
		
			//create a driver object 
			WebDriver driver = new FirefoxDriver(); //ChromeDriver() or EdgeDriver()
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			//Open browser
			driver.get("https://training-support.net/webelements/alerts");
			
			//verify page title 
			System.out.println("Page title is :" + driver.getTitle());
			
			//Find the button to open a confirmation alert and click it
			driver.findElement(By.id("confirmation")).click();
			
			//Switch the focus from the main window to the Alert box and get the text in it and print it.
			Alert confirmationAlert = driver.switchTo().alert();
			System.out.println("Text in alert is " + confirmationAlert.getText());
			
			//Close the alert once with OK
			confirmationAlert.accept();
								
			//Close the alert once with OK
			//confirmationAlert.dismiss();
			
			System.out.println(driver.findElement(By.id("result")).getText());
			
			//Close the browser 
				driver.quit(); 	

	}

}
