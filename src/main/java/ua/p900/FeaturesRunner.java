package ua.p900;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/*@CucumberOptions(features = "src/test/java/com/ua/p900/fetures/login", format = {"pretty",
        "html:target/site/cucumber-pretty"})
public class FeaturesRunner extends AbstractTestNGCucumberTests {
    private WebDriver driver;

    @BeforeClass
    protected void SetUp(){
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
    }
    @AfterClass
    protected void TearDown (){
        driver.quit();
    }
}*/
