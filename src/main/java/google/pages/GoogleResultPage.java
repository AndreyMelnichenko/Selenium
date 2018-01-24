package google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class GoogleResultPage {
    @FindBy(how=How.XPATH, xpath = "//div[@class='rc']/h3/a[1]")
    private WebElement linkField;
    //private WebDriver driver;

    /*public GoogleResultPage(WebDriver driver) {
        this.driver = driver;
    }*/
    public WebElement findLink (){
        //linkField=;
        //new WebDriverWait(driver, 10)
        return linkField;
    }
}
