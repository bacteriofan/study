package patterns.factoryMethod;

public class DriverFactory {

    public static DriverManager getDriver(String type) {
        DriverManager driverManager = null;
        switch (type) {
            case "chrome":
                driverManager = new ChromeDriverManager();
                break;
            case "firefox":
                driverManager = new FirefoxDriverManager();
                break;

        }
        return driverManager;
    }
}
