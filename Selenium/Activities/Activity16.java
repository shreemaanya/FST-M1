package activities;

//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		//create a driver object 
		WebDriver driver = new FirefoxDriver(); //ChromeDriver() or EdgeDriver()
		
		//Open browser
		driver.get("https://training-support.net/webelements/selects");
		
		//verify page title 
		System.out.println("Page title is :" + driver.getTitle());
		
		//On single select - Select the second option using the visible text.
		Select dropdown = new Select(driver.findElement(By.cssSelector("select.h-10")));
		dropdown.selectByVisibleText("One");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// Select the third option using index
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// Select the fourth option using value attribute
		dropdown.selectByValue("three");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// Print all the options
        System.out.println("Options in the dropdown: ");
        for(WebElement option : dropdown.getOptions()) {
            System.out.println(option.getText());
        }
							
		//Close the browser 
			driver.quit(); 

	}

}
