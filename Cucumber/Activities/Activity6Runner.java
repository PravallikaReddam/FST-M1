package TestRunner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Cucumber_Practise/Features/Activity1.feature",
        glue = {"stepDefinitions"},
        plugin = { "pretty" ,"html:target/Reports/index.html", "json:target/Reports/cucumber.json" },
        tags = "@activity5",
        monochrome = true
)

public class Activity6Runner {
}