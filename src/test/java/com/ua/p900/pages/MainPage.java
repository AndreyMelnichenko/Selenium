package com.ua.p900.pages;

import google.Selenium.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends AbstractPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"authorization-input-email\"]")
    private WebElement loginField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"authorization-input-pass\"]")
    private WebElement passField;

    public MainPage(WebDriver driver){super(driver);}

    public void fillFields(String login, String password){
        loginField.sendKeys(login);
        passField.sendKeys(password);
    }
}
