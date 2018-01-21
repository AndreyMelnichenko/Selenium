package google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePassPage {
    private By passFieldLocator = By.xpath("//input[@type='password']");
    private WebElement passField;
    private String pass = "************************";
    private By passButtonLocator = By.cssSelector("#passwordNext > content");
    private WebDriver driver;

    public GooglePassPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputPass (){
        passField = driver.findElement(passFieldLocator);
        passField.click();
        passField.sendKeys(pass);
        WebElement passButton = driver.findElement(passButtonLocator);
        passButton.click();
    }
}
