import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    @BeforeMethod
    public void browserSetUp() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
        System.out.println("Browser Opened");
    }
    @Test
    public void login(){
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//BUTTON[@onclick='signIn()'][text()='Log in']")).click();
        String actTitle = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", actTitle);
        System.out.println("login successfully");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
        System.out.println("Browser Closed");
    }
}
