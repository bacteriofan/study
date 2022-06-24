package patterns.factoryMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {

    @Override
    WebDriver createDriver() {
        return new FirefoxDriver();
    }
}
