package google.Selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertPage extends AbstractPage {

    //private WebDriver driver;
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "/html/body/button")
    private WebElement button;

    public void pushButton(){
        WebElement visibleButton = waitFor(ExpectedConditions.elementToBeClickable(button));
        visibleButton.click();
    }
    public void alertToOk(WebDriver driver){
        Actions builder = new Actions(driver);
        driver.switchTo().alert().accept();
    }


}
