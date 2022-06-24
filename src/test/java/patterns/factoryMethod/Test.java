package patterns.factoryMethod;

import org.openqa.selenium.WebDriver;

public class Test {

    @org.testng.annotations.Test
    public void test() {
        WebDriver driver = DriverFactory.getDriver("chrome").createDriver();
    }
}
