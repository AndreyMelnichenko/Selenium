package google.Selenium.core;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.UnexpectedException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

@Listeners({google.Selenium.core.TestListener.class})
public class WebDriverTestBase {
    protected WebDriver driver;
    private String browser = System.getProperty("browser", "remote");
    public static final String USERNAME = "a.melnychenko";
    public static final String ACCESS_KEY = "2bd030ff-f8a5-4149-9dce-0828e8bc4100";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

    @Parameters({"platform", "remoteBrowser"})
    @BeforeClass
    protected void SetUp(@Optional String platform, @Optional String remoteBrowser) throws MalformedURLException, UnexpectedException {
        if ((System.getProperty("user.name").toLowerCase()).equals("andrey")) {
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
                case "remote":
                    DesiredCapabilities caps = setDesiredCapabilities(platform, remoteBrowser);
                    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
                    break;
            }
        } else {
            DesiredCapabilities caps = DesiredCapabilities.chrome();
            caps.setCapability("platform", "Windows 10");
            caps.setCapability("version", "63.0");
            caps.setCapability("screenResolution", "1280x1024");

            driver = new RemoteWebDriver(new URL(URL), caps);

        }

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
    }

    private DesiredCapabilities setDesiredCapabilities(String platform, String remoteBrowser) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        if ((System.getProperty("os.name").toLowerCase()).equals("linux")) {
            if (platform.equalsIgnoreCase(Platform.LINUX.name())) {
                caps.setPlatform(Platform.LINUX);
                caps.setBrowserName(remoteBrowser);
            }
        } else {
            if (platform.equalsIgnoreCase(Platform.WIN10.name())) {
                caps.setPlatform(Platform.WIN10);
                caps.setBrowserName(remoteBrowser);
            }
        }
        return caps;
    }

    @AfterClass
    public void ClosePage() {
        driver.quit();
    }

}
