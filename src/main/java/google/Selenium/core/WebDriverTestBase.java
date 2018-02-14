package google.Selenium.core;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.CHROME;

@Listeners({google.Selenium.core.TestListener.class})
public class WebDriverTestBase {
    protected WebDriver driver;
    private String browser = System.getProperty("browser", CHROME);

    @BeforeClass
    protected void SetUp() {
        Configuration.browser = browser;
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void ClosePage() {
        driver.close();
    }

}
