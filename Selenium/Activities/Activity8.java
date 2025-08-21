package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		//open the page
		driver.get("https://training-support.net/webelements/mouse-events");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		WebElement Cargolockbutton = driver.findElement(By.xpath("//h1[contains(text(),\"Cargo.lock\")]"));
		WebElement Cargotomlbutton = driver.findElement(By.xpath("//h1[contains(text(),\"Cargo.toml\")]"));
		WebElement Seachbutton = driver.findElement(By.xpath("//h1[contains(text(),\"src\")]"));
		WebElement Targetbutton = driver.findElement(By.xpath("//h1[contains(text(),\"target\")]"));
		
		builder.click(Cargolockbutton).pause(1000).moveToElement(Cargotomlbutton).pause(5000).click(Cargotomlbutton).build().perform();
		String Result = driver.findElement(By.id("result")).getText();
		System.out.println(Result);
		builder.doubleClick(Seachbutton).pause(1000).moveToElement(Targetbutton).contextClick(Targetbutton).build().perform();
		builder.click(driver.findElement(By.xpath("//span[contains(text(),\"Open\")]"))).pause(5000).build().perform();
		String Result2 = driver.findElement(By.id("result")).getText();
		System.out.println(Result2);
		driver.quit();

	}

}
