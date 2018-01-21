package com.google;

import google.core.WebDriverTestBase;
import google.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchGoogleTest extends WebDriverTestBase {

    private String searchData = "Selenium";

    @Test
    public void searchGooglePageObjectTest(){
        driver.get("https://www.google.com.ua");
        GoogleSearchPage searchPage = new GoogleSearchPage(driver);
        searchPage.searchFor(searchData);
        GoogleResultPage resultPage = new GoogleResultPage(driver);
        assertTrue(resultPage.findLink().getText().contains(searchData));
    }
    @Test
    public void loginPage(){
        driver.get("https://gmail.com");
        GoogleLoginPage loginPage = new GoogleLoginPage(driver);
        loginPage.inputLogin();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        GooglePassPage passPage = new GooglePassPage(driver);
        passPage.inputPass();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        GoogleInsideMailPage insideMailPage = new GoogleInsideMailPage(driver);
        assertTrue((insideMailPage.checkEnter()).equals(loginPage.getLogin()));

    }
}
