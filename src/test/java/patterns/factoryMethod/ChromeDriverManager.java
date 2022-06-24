package patterns.factoryMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{
    @Override
    WebDriver createDriver() {
        return new ChromeDriver();
    }
}
