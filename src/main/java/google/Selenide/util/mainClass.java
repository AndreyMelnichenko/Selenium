package google.Selenide.util;

import static google.Selenide.util.PropertiesCache.getProperty;

public class mainClass {
    public static void main(String[] args) {
        System.out.println(getProperty("login.pass"));
    }
}
