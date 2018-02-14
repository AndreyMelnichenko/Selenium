package com.google;

import google.Selenium.core.WebDriverTestBase;
import google.Selenium.pages.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AlertTest extends WebDriverTestBase {
    private final String alertPage = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
    private final String dragAndDropPage = "https://www.google.com.ua";


    public void alertTest() {
        driver.get(alertPage);
        driver.switchTo().frame("iframeResult");
        AlertPage alertPage = PageFactory.initElements(driver, AlertPage.class);
        alertPage.pushButton();
        alertPage.alertToOk(driver);

    }

    
    public void dragAndDrop(){
        driver.get(dragAndDropPage);
        GoogleSearchPage searchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
        searchPage.goLoginPage();
        GoogleLoginPage loginPage = PageFactory.initElements(driver, GoogleLoginPage.class);
        loginPage.inputLogin();
        GooglePassPage passPage = PageFactory.initElements(driver, GooglePassPage.class);
        passPage.inputPass(driver);

        searchPage.goToGoogleDrive();

    }

}
