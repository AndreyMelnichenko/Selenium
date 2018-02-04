package google.Selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPage extends AbstractPage {

    public GoogleSearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how= How.XPATH, using ="//input[@id='lst-ib']")
    private WebElement inputFieldLocator; // = By.xpath("//input[@id='lst-ib']");

    @FindBy(how = How.XPATH, using = "//a[@class='gb_Xf gb_Fa gb_Eb']")
    private WebElement goGoogleEnter;

    @FindBy(how = How.XPATH, using = "//span[@class='gb_ab gbii']")
    private WebElement logoPic;

    @FindBy(how = How.XPATH, using = "//div[@class='gb_Db']")
    private WebElement actualMail;

    public void searchFor (String text){
        inputFieldLocator.sendKeys(text);
        inputFieldLocator.submit();
    }
    public void goLoginPage(){
        goGoogleEnter.isDisplayed();
        goGoogleEnter.click();
    }
    public String getActualMail(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,2);
        WebElement logo = wait.until(ExpectedConditions.elementToBeClickable(logoPic));
        logo.click();
        WebElement actMail = wait.until(ExpectedConditions.visibilityOf(actualMail));
        return actMail.getText();
    }
}
