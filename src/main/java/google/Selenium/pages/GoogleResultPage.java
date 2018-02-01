package google.Selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleResultPage extends AbstractPage {
    @FindBy(how=How.XPATH, xpath = "//div[@class='rc']/h3/a[1]")
    private WebElement linkField;

    public GoogleResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement findLink (){
        return linkField;
    }
}
