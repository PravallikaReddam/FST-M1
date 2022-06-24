package Activities;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {
        AndroidDriver driver;
        WebDriverWait wait;
    private Object Dimension;

    @BeforeMethod
        public void browserSetUp() throws MalformedURLException {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("Android");
            options.setAutomationName("UiAutomator2");
            options.setAppPackage("com.miui.calculator");
            options.setAppActivity(".cal.CalculatorActivity");
            options.noReset();
            URL serverURL = new URL("http://localhost:4723/wd/hub");
            driver = new AndroidDriver(serverURL, options);
            System.out.println("Browser opened");
        }
    @Test
    public void calculatorTest(){

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text='Calculator']")));
        driver.findElement(AppiumBy.id("digit_8")).click();
        driver.findElement(AppiumBy.id("op_mul")).click();
        driver.findElement(AppiumBy.id("digit_3")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Equals\"]")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("result")));
        String result = driver.findElement(AppiumBy.id("result")).getText();

        Assert.assertEquals(result, "24");
    }

      @AfterMethod
        public void closeBrowser(){
            driver.quit();
            System.out.println("Browser Closed");
        }
    }






