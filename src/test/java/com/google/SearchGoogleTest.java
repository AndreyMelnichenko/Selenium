package com.google;

import google.Selenium.pages.GoogleLoginPage;
import google.Selenium.pages.GoogleResultPage;
import google.Selenium.pages.GoogleSearchPage;
import google.Selenium.core.WebDriverTestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SearchGoogleTest extends WebDriverTestBase {

    private final String searchData = "Selenium";
    private final  String url = "https://www.google.com.ua";

    @Test
    public void searchGoogleTest(){
        driver.get(url);
        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);
        page.searchFor(searchData);
        GoogleResultPage resultPage = PageFactory.initElements(driver, GoogleResultPage.class);
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
    }
}
