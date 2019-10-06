package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    private static WebDriver driver;
    private WebDriverSingleton() {}

    public static WebDriver getInstance() {
        if (null == driver) {//if the browser is not open

//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\dom\\IdeaProjects\\MyWebsiteTestedSelenium\\src\\test\\java\\drivers\\chromedriver77.exe");
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver77.exe");

            driver = new ChromeDriver();//opens browser
        }
        return driver;
    }

    public static void quit() {
        if(null != driver) {
            driver.quit();
        }
        driver = null;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
