package google.Selenide.core;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

import static org.openqa.selenium.remote.BrowserType.*;

public class SelenideTestBase {

    protected WebDriver driver;
    private String browser = System.getProperty("browser",CHROME);

    @BeforeClass
    protected void SetUp() {
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
            case IE:
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
        }

    }
}
