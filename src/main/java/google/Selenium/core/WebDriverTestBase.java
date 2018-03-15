package google.Selenium.core;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.concurrent.TimeUnit;

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
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void ClosePage() {
        driver.quit();
    }

}
