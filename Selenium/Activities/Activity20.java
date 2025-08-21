package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		
		//open the page
		driver.get("https://training-support.net/webelements/alerts");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
			
		driver.findElement(By.id("prompt")).click();
		
		Alert PromtAlert = driver.switchTo().alert();
		
		String Alerttext = PromtAlert.getText();
		
		System.out.println(Alerttext);
		
		PromtAlert.sendKeys("Hello Alerts");
		
		Thread.sleep(1000);
		
		PromtAlert.accept();
		
		driver.quit();
		
		System.out.println(driver.findElement(By.id("result")).getText());
		
		

	}

}
