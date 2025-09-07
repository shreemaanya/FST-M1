package activities;

import static org.testng.Assert.assertEquals;

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

	// declaring the required objects

	AppiumDriver driver;
	WebDriverWait wait;

	// setup function
	@BeforeClass
	public void setUp() throws MalformedURLException, URISyntaxException {
		// Define the capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setApp("C:/Users/PavaniGudiboina/eclipse-workspace/FST_Appium/Calculator.apk");

		options.noReset();

		// set the Appium server url
		URL serverUrl = new URI("http://localhost:4723").toURL();

		// Initialize the driver

		driver = new AndroidDriver(serverUrl, options);
	}

	// Test Method
	@Test
	public void multipleTest() {
		// find and tap the number 5
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5")).click();
		// find and tap the multiply button
		driver.findElement(AppiumBy.accessibilityId("multiply")).click();
		// find and tap number 6
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_6")).click();
		// find and tap equals button
		driver.findElement(AppiumBy.accessibilityId("equals")).click();

		// get the result and assert the value
		String result = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final")).getText();
		assertEquals(result, "30");
	}

	@AfterClass
	public void tearDown() {
		// close the app
		driver.quit();

	}
}
