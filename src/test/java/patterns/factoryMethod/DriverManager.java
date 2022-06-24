package patterns.factoryMethod;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    abstract WebDriver createDriver();
}
