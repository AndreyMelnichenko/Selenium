package google.Selenium.core;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.UnexpectedException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

@Listeners({google.Selenium.core.TestListener.class})
public class WebDriverTestBase {
    protected WebDriver driver;
    private String browser = System.getProperty("browser", CHROME);
    public static final String USERNAME = "a.melnychenko";
    public static final String ACCESS_KEY = "2bd030ff-f8a5-4149-9dce-0828e8bc4100";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

    @BeforeClass
    protected void SetUp() throws MalformedURLException, UnexpectedException {
        if ((System.getProperty("user.name")).equals("andrey")) {
            Configuration.browser = browser;
            switch (browser) {
                case CHROME:
                    ChromeDriverManager.getInstance().setup();
                    driver = new ChromeDriver();
                    break;
                case FIREFOX:
                    FirefoxDriverManager.getInstance().setup();
                    driver = new FirefoxDriver();
                    break;
            }
        } else {
            /*DesiredCapabilities caps = DesiredCapabilities.chrome();
            caps.setCapability("platform", "Windows 10");
            caps.setCapability("version", "63.0");
            caps.setCapability("screenResolution", "1280x1024");

            driver = new RemoteWebDriver(new URL(URL), caps);*/
        }

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void ClosePage() {
        driver.quit();
    }

}
