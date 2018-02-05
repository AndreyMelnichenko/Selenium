package google.Selenium.pages;

import google.Selenium.util.RandomMinMax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenuPage {

    private WebDriver driver;
    public DropdownMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    private By menuLocator = By.xpath("/html/body/select");
    private WebElement menu;

    public WebElement getMenu(){
        menu=driver.findElement(menuLocator);
        return  menu;
    }
    public String getActualelement(WebElement menu) {
        Select select = new Select(menu);
        return select.getFirstSelectedOption().getText();
    }
    public String setElement (){
        Select select = new Select(menu);
        int i;
        do {
            i=RandomMinMax.Go(0,3);
        } while (i==0);
        select.selectByIndex(i);
        return select.getFirstSelectedOption().getText();
    }
}
