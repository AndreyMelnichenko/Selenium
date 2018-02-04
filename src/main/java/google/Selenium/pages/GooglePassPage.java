package google.Selenium.pages;

import google.Selenide.util.PropertiesCache;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePassPage extends AbstractPage {

    @FindBy(how= How.XPATH, using ="//*[@id=\"password\"]/div[1]/div/div[1]/input")//input[@type='password']");
    private WebElement passField;

    @FindBy(how= How.CSS, using ="#passwordNext > content > span")
    private WebElement passButton;

    public GooglePassPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void inputPass (WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 2);
        WebElement inputPass = wait.until(ExpectedConditions.visibilityOf(passField));
        inputPass.sendKeys(PropertiesCache.getProperty("login.pass"));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(passButton));
        button.click();
    }
}
