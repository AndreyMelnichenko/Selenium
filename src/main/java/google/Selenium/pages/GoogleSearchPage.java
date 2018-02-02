package google.Selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchPage extends AbstractPage {

    public GoogleSearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how= How.XPATH, using ="//input[@id='lst-ib']")
    private WebElement inputFieldLocator; // = By.xpath("//input[@id='lst-ib']");

    @FindBy(how = How.XPATH, using = "//a[@class='gb_Xf gb_Fa gb_Eb']")
    private WebElement goGoogleEnter;


    public void searchFor (String text){
        //searchField = waitFor(presenceOfElementLocated(inputFieldLocator));
        inputFieldLocator.sendKeys(text);
        inputFieldLocator.submit();
    }
    public void goLoginPage(){
        goGoogleEnter.isDisplayed();
        goGoogleEnter.click();
    }
}
