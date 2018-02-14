package com.google;

import google.Selenium.core.WebDriverTestBase;
import google.Selenium.pages.DropdownMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class DropdownMenuTest extends WebDriverTestBase {

    private final String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";

    //@Test
    public void testDropDownMenu(){
        driver.get(url);
        DropdownMenuPage dropdownMenuPage = new DropdownMenuPage(driver);
        driver.switchTo().frame("iframeResult");
        String defaultdAuto = dropdownMenuPage.getActualelement(dropdownMenuPage.getMenu());
        System.out.println(defaultdAuto);
        dropdownMenuPage.setElement();
        String choosedAuto = dropdownMenuPage.getActualelement(dropdownMenuPage.getMenu());
        assertFalse(defaultdAuto.equals(choosedAuto));
        Assert.assertEquals(dropdownMenuPage.setElement(),dropdownMenuPage.getActualelement(dropdownMenuPage.getMenu()));
        System.out.println("Choosed element: "+dropdownMenuPage.setElement());
        System.out.println("Displayed element: "+ dropdownMenuPage.getActualelement(dropdownMenuPage.getMenu()));
    }
}
