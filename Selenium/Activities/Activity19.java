package activities;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net/webelements/alerts");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		driver.findElement(By.id("confirmation")).click();
		
		Alert ConfirmAlert = driver.switchTo().alert();
		
		String Alerttext = ConfirmAlert.getText();
		
		System.out.println(Alerttext);

		ConfirmAlert.accept();
		
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();


	}

}
