package google.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class WebDriverTestBase {
    protected WebDriver driver;

    @BeforeClass
    protected void SetUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
   /* @AfterClass
    public void ClosePage() {
        driver.close();
    }*/

}
