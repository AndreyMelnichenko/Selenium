package ua.p900.pages;

import google.Selenium.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class MainPage extends AbstractPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"authorization-input-email\"]")
    private WebElement loginField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"authorization-input-pass\"]")
    private WebElement passField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"authorization-form\"]/div[3]/input")
    private WebElement submit;
    @FindBy(how = How.XPATH, using = "//html/body/main/div/div/div/div[1]/div/div/section")
    private WebElement errorMessage;

    public MainPage(WebDriver driver){super(driver);}

    public void fillFields(String login, String password){
        loginField.sendKeys(login);
        passField.sendKeys(password);
        submit.click();

    }

    public void getErrorMessage (String warningMessage){
        Assert.assertEquals(errorMessage.getText(),warningMessage);
    }
}
