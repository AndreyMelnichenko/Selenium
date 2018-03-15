package ua.p900.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import ua.p900.pages.MainPage;

public class LoginSteps {
    private static final String PERSONAL_CABINET = "http://p900.lenal.company/login";

    private WebDriver driver;
    private MainPage mainPage;
    @Given("I am on Log-in page")
    public void openMainPage(){
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.get(PERSONAL_CABINET);
    }
    @When("I fill in \"Username\" with \"([^\"]*)\" and \"Password\" with \"([^\"]*)\"")
    public void fillPersonalData(String login, String password){
        mainPage = PageFactory.initElements(driver,MainPage.class);
        mainPage.fillFields(login, password);
    }
    @Then("I should see \"([^\"]*)\" message")
    public void warningMessage(String errorMessage){
        mainPage = PageFactory.initElements(driver,MainPage.class);
        mainPage.getErrorMessage(errorMessage);
    }

}
