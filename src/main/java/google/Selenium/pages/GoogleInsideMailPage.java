package google.Selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleInsideMailPage {

    private WebDriver driver;
    private By personalLogoLocator = By.xpath("//span[@class='gb_ab gbii']");
    private WebElement personalLogo;
    private By personalMailFieldLocator = By.xpath("//div[@class='gb_Cb']");
    private WebElement personalMailField;

    public GoogleInsideMailPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkEnter(){
        personalLogo = driver.findElement(personalLogoLocator);
        personalLogo.click();
        personalMailField = driver.findElement(personalMailFieldLocator);
        return personalMailField.getText();
    }
}
