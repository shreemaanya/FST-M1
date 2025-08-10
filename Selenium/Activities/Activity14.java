package activities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {

	public static void main(String[] args) {
		//create a driver object 
				WebDriver driver = new FirefoxDriver(); //ChromeDriver() or EdgeDriver()
								
				//Open browser
				driver.get("https://training-support.net/webelements/tables");
						
				//verify page title 
				System.out.println("Page title is :" + driver.getTitle());
				
				//Find the number of rows and columns in the table and print them.
				List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
				System.out.println(rows.size());
				
				List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
				System.out.println(cols.size());
				
				//Find and print the Book Name in the 5th row.
				WebElement cellValue = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
				System.out.println("Book Name in 5th row is :" + cellValue.getText());
				
				//Click the header of the Price column to sort it in ascending order.
				driver.findElement(By.xpath("//table/thead/tr/th[5]")).click();
				
				// Print the cell value of the second row and second column again
				cellValue = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));    
//here if we write it as WebElement then it throws error as we have another webelement with same name as cellValue , if we remove webelement tag then it just reuses the variable without errors 
				System.out.println("second row and second column cellvalue is :" + cellValue.getText());
				
				//close browser
				driver.quit();

	}

}
