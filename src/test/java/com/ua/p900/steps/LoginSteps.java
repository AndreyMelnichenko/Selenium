package com.ua.p900.steps;

import com.ua.p900.FeaturesRunner;
import com.ua.p900.pages.MainPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import google.Selenium.core.WebDriverTestBase;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginSteps {
    private static final String PERSONAL_CABINET = "http://p900.lenal.company/login";

    private WebDriver driver;
    private MainPage mainPage;
    @Given("I am on personal cabinet page")
    public void openMainPage(){
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.get(PERSONAL_CABINET);
    }
    @When("I fill my login \"([^\"]*)\" and password \"([^\"]*)\"")
    public void fillPersonalData(String login, String password){
        mainPage = PageFactory.initElements(driver,MainPage.class);
        mainPage.fillFields(login, password);
    }

}
