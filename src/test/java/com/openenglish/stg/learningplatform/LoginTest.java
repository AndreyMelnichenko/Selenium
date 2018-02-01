package com.openenglish.stg.learningplatform;

import google.Selenium.core.WebDriverTestBase;
import learningplatform.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends WebDriverTestBase {
    private String login = "shiosaky@gmail.com.oe";
    private String password = "123456";

    @Test
    public void loginPage() {
        driver.get("https://learningplatform.stg.openenglish.com");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setInputLogin(login, password);

    }
}
