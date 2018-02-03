package com.google;

import google.Selenium.core.WebDriverTestBase;
import google.Selenium.pages.DropdownMenuPage;
import org.testng.annotations.Test;

public class DropdownMenuTest extends WebDriverTestBase {

    private final String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";

    @Test
    public void testDropDownMenu(){
        driver.get(url);
        DropdownMenuPage dropdownMenuPage = new DropdownMenuPage(driver);
        driver.switchTo().frame(dropdownMenuPage.getMenu());
        String choosedAuto = dropdownMenuPage.getMenu().getText();
        dropdownMenuPage.selectItem(dropdownMenuPage.getMenu());
        dropdownMenuPage.getChoosedAuto(dropdownMenuPage.getMenu());

    }
}
