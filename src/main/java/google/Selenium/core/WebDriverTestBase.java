package google.Selenium.core;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.*;

@Listeners({google.Selenium.core.TestListener.class})
public class WebDriverTestBase {
    protected WebDriver driver;
    //private String browser = System.getProperty("browser", CHROME);


    @BeforeClass
    protected void SetUp() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "63.0");
        WebDriver driver = new RemoteWebDriver(new
                URL("http://a.melnychenko:2bd030ff-f8a5-4149-9dce-0828e8bc4100@ondemand.saucelabs.com:80/wd/hub"),
                caps); //2bd030ff-f8a5-4149-9dce-0828e8bc4100

            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        @AfterClass
        public void ClosePage () {
            driver.close();
        }

    }
