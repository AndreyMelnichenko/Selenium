package google.Selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DragAndDrop extends AbstractPage {

    public DragAndDrop(WebDriver driver) {
        super(driver);
    }

    private WebDriver driver;
    @FindBy(how = How.XPATH, using = "//*[@id=\"sample\"]/div[1]/span[1]/div/div[3]")
    private WebElement water;
    @FindBy(how = How.XPATH, using = "//*[@id=\"myDiagramDiv\"]/canvas")
    private WebElement cancas;


    public void moveElement(){
        /*WebElement elementToDrag = waitFor(ExpectedConditions.visibilityOf(water));
        Actions builder = new Actions(driver);
        builder.clickAndHold(elementToDrag).moveToElement(cancas, 120,120).release(cancas).build();
        builder.perform();*/
    }

}
