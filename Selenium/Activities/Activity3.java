import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

         driver.findElement(By.id("firstName")).sendKeys("xyz");
         driver.findElement(By.id("lastName")).sendKeys("123");
         driver.findElement(By.id("email")).sendKeys("xyz@example.com");
         driver.findElement(By.id("number")).sendKeys("1234567890");
         driver.findElement(By.cssSelector(".ui.green.button")).click();
        driver.close();
    }
}