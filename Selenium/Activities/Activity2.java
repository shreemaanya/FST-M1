package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net/webelements/login-form/");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.cssSelector("body > div > main > div > div > div > div > div.mx-auto.my-5.flex.flex-col.justify-center.align-middle > form > button")).click();
		//driver.findElement(By.xpath("//button[text]"));	
		//driver.quit();
		
		   // Print the confirmation message
     System.out.println(driver.getTitle());
	}

}


// diff between classname/id and CSSselector both using same html locator class
//diff btwn name- attribute and tagname (div, p, h3,h5 )in HTML locator we are reffering is Name
