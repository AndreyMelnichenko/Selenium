package google.Selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleNewPage extends AbstractPage {

    public GoogleNewPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(how = How.XPATH, using = "//a[@class='gb_b gb_dc']")
    private WebElement options;
    @FindBy(how = How.XPATH, using = "//*[@id=\"gb5\"]")
    private WebElement goNews;
    @FindBy(how = How.XPATH, using = "//span[text()='Украина']")
    private WebElement selectItem;
    @FindBy(how = How.XPATH, using = "(//span[@class='adH5zf'])[2]")
    private WebElement actItem;

    public void goNewsPage(){
       WebElement presentedOption= waitFor(ExpectedConditions.elementToBeClickable(options));
       presentedOption.click();
       WebElement newsPage = waitFor(ExpectedConditions.elementToBeClickable(goNews));
       newsPage.click();
       WebElement selectNewsItem = waitFor(ExpectedConditions.elementToBeClickable(selectItem));
       selectNewsItem.click();
    }
    public String getActualPage(){
        WebElement presentItem = waitFor(ExpectedConditions.visibilityOf(actItem));
        return presentItem.getText();
    }
}
