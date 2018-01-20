package google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    private WebDriver driver;
    private By searchFieldLocator = By.xpath("//input[@id='lst-ib']");
    private WebElement searchField;

    public GoogleSearchPage (WebDriver driver){
        this.driver=driver;
    }

    public void searchFor (String text){
        searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(text);
        searchField.submit();
    }
}
