import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    @BeforeMethod
    public void browserSetUp() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Browser Opened");
    }
    @Test
    public void homePage(){
        String actTitle = driver.getTitle();
        String expTitle = "Training Support";
        System.out.println("Page title is: " + actTitle);
        Assert.assertEquals(actTitle,expTitle);
    }
    @Test
    public void invalidTC(){
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(),"black");
    }
    @Test(enabled = false)
    public void skippedTC(){
        System.out.println("This method will not print");
    }
    @Test
    public void printException(){
        System.out.println("This method will throw exception");
        throw new SkipException("Skipping test case");

    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
        System.out.println("Browser Closed");
    }
}
