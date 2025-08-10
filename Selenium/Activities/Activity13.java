package activities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

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
		
		//Find and print all the cell values in the third row of the table.
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]"));
		System.out.println("thirdRow values : ");
		for(WebElement cell : thirdRow) {
            System.out.println(cell.getText());
        }
		
		// Print the cell value of the second row and second column
		WebElement cellValue = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		System.out.println("second row and second column cellvalue is :" + cellValue.getText());
		
		//close browser
		driver.quit();
		}

}
