package com.google;

import google.core.WebDriverTestBase;
import google.pages.GoogleLoginPage;
import google.pages.GoogleResultPage;
import google.pages.GoogleSearchPage;
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
        loginPage.inputPass();

    }
}
