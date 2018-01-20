package google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLoginPage {
    private By loginFieldLocator = By.cssSelector("#identifierId");
    private WebElement loginField;
    private String login="a.melnychenko@lenal.biz";
    private By loginButtonLocator = By.cssSelector("#identifierNext > content > span");
    private WebElement loginButton;
    private By passFieldLocator = By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input");
    private WebElement passField;
    private String pass = "sDKkYlEB8YdXO2dXmNsc";
    private By passButtonLocator = By.cssSelector("#passwordNext > content");
    private WebElement passButton;
    protected WebDriver driver;

    public GoogleLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputLogin(){
        loginField = driver.findElement(loginFieldLocator);
        loginField.sendKeys(login);
        loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }
    public void inputPass (){
        passField=driver.findElement(passFieldLocator);
        passField.sendKeys(pass);
        passButton=driver.findElement(passButtonLocator);
        passButton.click();
    }
}
