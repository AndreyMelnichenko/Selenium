package google.Selenide.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchPage {
    private SelenideElement search = $(By.xpath("//input[@id='lst-ib']"));
    private SelenideElement firstElement = $(By.xpath("//div[@class='rc']/h3/a[1]"));
    private ElementsCollection allElements = $$(By.xpath("//div[@class='rc']/h3/a"));



    public GoogleSearchPage searchFor(String searchData) {
        search.val(searchData).submit();
        return this;
    }
    public void compare (String searchData){
        firstElement.should(visible, text(searchData));
    }
    public ElementsCollection getAllElements(){
        return allElements;
    }
}
