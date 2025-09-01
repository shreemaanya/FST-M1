package Activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
	//declare the required objects 
		AppiumDriver driver;
		WebDriverWait wait;
		
		//Setup function
		@BeforeClass
		public void setUp() throws MalformedURLException, URISyntaxException {
			//Define the capabilities 
			UiAutomator2Options options = new UiAutomator2Options();
			options.setPlatformName("android");
			options.setAutomationName("UiAutomator2");
			//options.setApp("path/to/application.apk"); or 
			options.setAppPackage("com.google.android.calculator");
			options.setAppActivity("com.android.calculator2.Calculator");
			options.noReset();
			
			//com.google.android.calculator/com.android.calculator2.Calculator bnds=[540,1341][800,1705] }
			//set the Appium server URL
			URL serverUrl = new URI("http://localhost:4723").toURL();
			
			//Initialize the driver 
			driver = new AndroidDriver(serverUrl,options);
			
					
		}
		// Test method
	    @Test
	    public void multiplyTest() {
	        // Perform the calculation
	    	//Find and tap the number 5 
	        driver.findElement(AppiumBy.id("digit_5")).click();
	      //Find and tap the multiply button 
	        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
	      //Find and tap the number 6 
	        driver.findElement(AppiumBy.id("digit_6")).click();
	      //Find and tap the equals button 
	        driver.findElement(AppiumBy.accessibilityId("equals")).click();
	 
	        // Find the result
	        String result = driver.findElement(AppiumBy.id("result_final")).getText();
	 
	        // Assertion
	        Assert.assertEquals(result, "30");
	    }
		@AfterClass
		public void tearDown() {
			driver.quit();
			
}
}
