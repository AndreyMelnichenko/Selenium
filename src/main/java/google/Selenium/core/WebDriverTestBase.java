package google.Selenium.core;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

@Listeners({google.Selenium.core.TestListener.class})
public class WebDriverTestBase {
    protected WebDriver driver;
    //private static String OS = System.getProperty("os.name").toLowerCase();
    //private Browser browser = Browser.valueOf(System.getProperty("browser"));

    @BeforeClass
    protected void SetUp() {
        FirefoxDriverManager.getInstance().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterClass
    public void ClosePage() {
        driver.close();
    }

}
