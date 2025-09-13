package Activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity7 {
    // Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        // Server Address
        URL serverURL = new URI("http://localhost:4723").toURL();

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Open the page in Chrome
        driver.get("https://training-support.net/webelements/lazy-loading");

        // Switch to WEBVIEW context
        Set<String> contexts = driver.getContextHandles();
        for (String context : contexts) {
            System.out.println("Available context: " + context);
            if (context.contains("WEBVIEW_chrome")) {
                driver.context(context);
                break;
            }
        }
    }

    // Test method
    @Test
    public void uiScrollableTest() {
        // Launch Chrome
        driver.get("https://example.com"); // replace with your URL

        // Switch to web context
        Set<String> contexts = driver.getContextHandles();
        for (String context : contexts) {
            System.out.println("Available context: " + context);
        }
        driver.context("WEBVIEW_chrome");

        // Now wait for <img>
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement image = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img")));

        Assert.assertTrue(image.isDisplayed(), "Image is not visible!");
    }


    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        if (driver != null) {
            driver.quit();
        }
    }
}
