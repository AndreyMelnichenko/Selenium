package com.google;

import google.Selenium.core.WebDriverTestBase;
import google.Selenium.pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Feature("Advanced interactions")
@Story("PROM-111")
public class AlertTest extends WebDriverTestBase {
    private final String alertPage = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
    private final String dragAndDropPage = "https://www.google.com.ua";

    @Description
    @Test
    public void alertTest() {
        driver.get(alertPage);
        driver.switchTo().frame("iframeResult");
        AlertPage alertPage = PageFactory.initElements(driver, AlertPage.class);
        alertPage.pushButton();
        alertPage.alertToOk(driver);
    }

    @Test
    public void dragAndDrop(){
        driver.get(dragAndDropPage);
        GoogleSearchPage searchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
        searchPage.goLoginPage();
        GoogleLoginPage loginPage = PageFactory.initElements(driver, GoogleLoginPage.class);
        loginPage.inputLogin();
        GooglePassPage passPage = PageFactory.initElements(driver, GooglePassPage.class);
        passPage.inputPass(driver);
        searchPage.goToGoogleDrive();
        GoogleDrivePage googleDrivePage = PageFactory.initElements(driver, GoogleDrivePage.class);
        googleDrivePage.goTocatalog(driver);
    }
}
