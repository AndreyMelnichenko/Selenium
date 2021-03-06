package com.google;

import google.Selenide.util.PropertiesCache;
import google.Selenium.core.WebDriverTestBase;
import google.Selenium.pages.*;
import io.qameta.allure.Description;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchGoogleTest extends WebDriverTestBase {

    private final String searchData = "Selenium";
    private final String url = "https://www.google.com.ua";

    @Test (priority = 1)
    public void searchGoogleTest() {
        driver.get(url);

        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);
        page.searchFor(searchData);
        GoogleResultPage resultPage = PageFactory.initElements(driver, GoogleResultPage.class);
        assertTrue(resultPage.findLink().getText().contains(searchData)); //searchData
    }
    @Description ("Log-in test")
    @Test (priority = 3)
    public void loginPage() {
        driver.get(url);
        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);
        page.goLoginPage();
        GoogleLoginPage loginPage = PageFactory.initElements(driver, GoogleLoginPage.class);
        loginPage.inputLogin();
        GooglePassPage passPage = PageFactory.initElements(driver, GooglePassPage.class);
        passPage.inputPass(driver);
        Assert.assertEquals(page.getActualMail(driver), PropertiesCache.getProperty("login.user"));
    }

    @Test (priority = 2)
    public void newsPage(){
        driver.get(url);
        GoogleNewPage news = PageFactory.initElements(driver, GoogleNewPage.class);
        news.goNewsPage();
        assertEquals(news.getActualPage(),"Украина");
        //assertEquals(news.getActualPage(),"World");
    }
}

