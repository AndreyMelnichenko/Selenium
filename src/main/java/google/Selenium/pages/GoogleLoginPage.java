package google.Selenium.pages;

import google.Selenide.util.PropertiesCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleLoginPage extends AbstractPage {
    @FindBy(how = How.CSS, using = "#identifierId")
    private WebElement loginField;
    @FindBy(how = How.CSS, using="#identifierNext > content > span")
    private WebElement loginButton;

    public GoogleLoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputLogin(){
        WebElement sendLogin = waitFor(ExpectedConditions.visibilityOf(loginField));
        sendLogin.sendKeys(PropertiesCache.getProperty("login.user"));
        WebElement clikButton = waitFor(ExpectedConditions.elementToBeClickable(loginButton));
        clikButton.click();
    }
}
