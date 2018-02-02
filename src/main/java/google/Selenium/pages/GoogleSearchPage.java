package google.Selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class GoogleSearchPage extends AbstractPage {

    public GoogleSearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how= How.XPATH, using ="//input[@id='lst-ib']")
    private WebElement inputFieldLocator; // = By.xpath("//input[@id='lst-ib']");

    //private WebElement searchField;


    public void searchFor (String text){
        WebElement searchField;
        searchField = waitFor(presenceOfElementLocated(inputFieldLocator));
        inputFieldLocator.sendKeys(text);
        inputFieldLocator.submit();
    }
}
