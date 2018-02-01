package google.pages;

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

    //@FindBy(how= How.XPATH, xpath ="//input[@id='lst-ib']")
    private By inputFieldLocator = By.xpath("//input[@id='lst-ib']");
    private WebElement searchField;

    public void searchFor (String text){
        //searchField = driver.findElement();
        searchField = waitFor(presenceOfElementLocated(inputFieldLocator));
        searchField.sendKeys(text);
        searchField.submit();

    }
}
