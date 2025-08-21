package activities;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		
		//open the page
		driver.get("https://training-support.net/webelements/alerts");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		driver.findElement(By.id("simple")).click();
		// Switch focus to the alert
		Alert simpleAlert = driver.switchTo().alert();
		 // Print the text in the alert
		String Alerttext = simpleAlert.getText();
		System.out.println("Simple Alert text:" + Alerttext);
		
		 // Close the alert by clicking OK
		simpleAlert.accept();
		 // Print the message
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();
	}

}
