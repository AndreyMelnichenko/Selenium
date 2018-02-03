package google.Selenium.pages;

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
    public void selectItem(WebElement menu){
        Select selectObject = new Select(menu);
        selectObject.deselectByValue("Audi");
    }
    public WebElement getChoosedAuto(WebElement menu){
        Select selectObject = new Select(menu);
        return selectObject.getFirstSelectedOption();
    }
}
