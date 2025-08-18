package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity2 {
    
    WebDriver driver;
    WebDriverWait wait;
    
    @BeforeClass
    public void setup() {
        // Initialize driver and wait
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Open page 
        driver.get("https://training-support.net/webelements/target-practice/");
    }
    
    @Test(priority = 0)
    public void titleTest() {
        // Assertions
        Assert.assertEquals(driver.getTitle(), "Selenium: Target Practice");
    }
    
    @Test(priority = 1)  // Should fail if incorrect
    public void blackbuttonTest() {
        // Correct selector (assuming the button has id='blackButton')
        WebElement blackButton = driver.findElement(By.id("blackButton"));
        
        // Assertions
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "Black");
    }
    
    @Test(enabled = false)  // Will be skipped
    public void subHeadingTest() {
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }
    
    @Test(priority = 3)
    public void skipTest() {
        // This test will be skipped
        throw new SkipException("Skipping test case");
    }
    
    @AfterClass
    public void tearDown() {
        // Close browser
        driver.quit();
    }
}
