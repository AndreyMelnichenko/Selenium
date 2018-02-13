package google.Selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleDrivePage extends AbstractPage {
    public GoogleDrivePage(WebDriver driver) {
        super(driver);
    }
    //private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nt:D:label\"]/div/span")
    private WebElement rootCatalog;
    @FindBy(how = How.XPATH, using = "//*[@id=\"nt:D;14:label\"]/div/span")
    private WebElement testCatalog;
    @FindBy(how = How.XPATH, using = "//*[@id=\":7l\"]/div[1]")
    private WebElement insideArea;
    @FindBy(how = How.XPATH, using = "//*[@id=\":1b\"]/div/div[2]/div/div/div[3]/div/div[1]/div/div[3]")
    private WebElement centerFolder;


    public void goTocatalog(WebDriver driver){
        WebElement expandRootCatalog = waitFor(ExpectedConditions.elementToBeClickable(rootCatalog));
        Actions action = new Actions(driver);
        action.moveToElement(expandRootCatalog).doubleClick().build().perform();
        WebElement testFolder = waitFor(ExpectedConditions.visibilityOf(testCatalog));
        testFolder.click();
        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.visibilityOf(centerFolder));
        //WebElement folderCenter = waitFor(ExpectedConditions.);
        action.moveToElement(centerFolder).contextClick().build().perform();
    }
}
