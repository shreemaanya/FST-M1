package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;



public class Activity4 {

	public static void main(String[] args) {
	//create a driver object 
			WebDriver driver = new FirefoxDriver(); //ChromeDriver() or EdgeDriver()
			
			//Open browser
			driver.get("https://training-support.net/webelements/target-practice");
			
			//verify page title 
			System.out.println("Page title is :" + driver.getTitle());
			
			//Interactions - Find the 3rd header on the page
			String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(),'#3')]")).getText();
			System.out.println(thirdHeaderText);
			//Find the 5th header on the page and print it's color.
			WebElement fifthHeaderText = driver.findElement(By.xpath("//h5[contains(text(),'#5')]"));
			System.out.println(fifthHeaderText.getText());
			Color fifthHeaderColor = Color.fromString(fifthHeaderText.getCssValue("Color"));
			
			 System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
		     System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());
			
		  // Find the violet button and print its classes
		     String purpleButtonClass = driver.findElement(By.xpath("//button[text()=\"Purple\"]")).getDomAttribute("class");
		     System.out.println(purpleButtonClass);
		     
		  // Find the grey button and print its text
		        String slateButtonText = driver.findElement(By.xpath("//button[contains(@class,\"slate\")]")).getText();
		        System.out.println(slateButtonText);
		     		     
			System.out.println("Page title is :" + driver.getTitle());
							
			//Close the browser 
				driver.quit(); 

}
}