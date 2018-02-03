package google.Selenium.pages;

import google.Selenide.util.PropertiesCache;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLoginPage {
    private By loginFieldLocator = By.cssSelector("#identifierId");
    private WebElement loginField;
    //private String login="a.melnychenko@lenal.biz";
    private By loginButtonLocator = By.cssSelector("#identifierNext > content > span");
    private WebElement loginButton;

    private WebDriver driver;

    public GoogleLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputLogin(){
        loginField = driver.findElement(loginFieldLocator);
        loginField.sendKeys(PropertiesCache.getProperty("login.user"));
        loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }
    public String getLogin() {
        return PropertiesCache.getProperty("login.user");
    }

}
