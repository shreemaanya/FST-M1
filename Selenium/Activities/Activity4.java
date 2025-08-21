package activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net/webelements/target-practice");
		//get the title and print
		System.out.println("page title is :" + driver.getTitle());
		
		String Hearderthreetext = driver.findElement(By.xpath("//h3[contains(text(), \"#3\")]")).getText();
        System.out.println("Header3 text: " + Hearderthreetext);
		
       String Headerfivecolor = driver.findElement(By.xpath("//h5[contains(text(), \"#5\")]")).getCssValue("color");
        System.out.println("Header five color:" + Headerfivecolor);
        
		System.out.println("classes under purple button: " + driver.findElement(By.xpath("//button[contains(text(),\"Purple\")]")).getDomAttribute("class"));
		
        System.out.println("Text of Slate button: " + driver.findElement(By.xpath("//button[contains(text(),\"Slate\")]")).getText());
       
		
		driver.quit();

	}

}
