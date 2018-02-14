package com.google;

import com.codeborne.selenide.Configuration;
import google.Selenide.pages.GoogleSearchPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class SelenideGoogleTest {
    private String searchData = "Selenide";

    @Test
    public void searchGoogleTest() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "CHROME";
        open("https://www.google.com.ua");
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchFor(searchData);
        googleSearchPage.compare(searchData);

    }
    @Test
    public void searchCompareTest(){
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "CHROME";
        open("https://www.google.com.ua");
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchFor(searchData);
        googleSearchPage.getAllElements()
                .shouldHaveSize(10)
                .forEach(selenideElement -> selenideElement.should(text(searchData)))
                ;
    }
}
