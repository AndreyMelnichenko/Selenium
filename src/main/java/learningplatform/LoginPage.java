package learningplatform;

import google.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class LoginPage extends WebDriverTestBase {
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By inputLoginLocator = By.xpath("//input[@id='username']");
    private WebElement inputLogin;
    private By popUpLocator = By.xpath("//a[@id='banner-continue-btn']");
    private WebElement popUp;
    private By passwordLocator = By.xpath("//input[@id='password']");
    private WebElement password;
    private By progressBarLocator = By.xpath("//div[@id='level-progress']");
    private WebElement progressBar;

    public void setInputLogin (String login, String pass){
        popUp=driver.findElement(popUpLocator);
        popUp.click();
        inputLogin=driver.findElement(inputLoginLocator);
        inputLogin.clear();
        inputLogin.sendKeys(login);
        password=driver.findElement(passwordLocator);
        password.click();
        password.sendKeys(pass);
        password.submit();
        progressBar=driver.findElement(progressBarLocator);
        assertTrue(progressBar.isDisplayed());
    }

}
