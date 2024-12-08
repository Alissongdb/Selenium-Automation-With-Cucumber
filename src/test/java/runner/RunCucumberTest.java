package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/", "html:target/reports/"},
        features = "src/test/resources/features",
        tags = "@cadastro",
        glue = {"steps"}
)

public class RunCucumberTest {

    public static WebDriver driver;

    @BeforeClass
    public static void start() {
        driver = new SafariDriver();

    }

    @AfterClass
    public static void stop() {
        driver.quit();
    }
}