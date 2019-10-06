package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    private static WebDriver driver;
    private WebDriverSingleton() {}

    public static WebDriver getInstance() {
        if (null == driver) {//if the browser is not open

            //it is deleted because it downloaded chromedriver78, but I can't update from 77 to 78
//            WebDriverManager.chromedriver().setup();

            //that is for firefox browser
//            WebDriverManager.firefoxdriver().setup();

            //manual chromedriver loading
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\dom\\IdeaProjects\\MyWebsiteTestedSelenium\\src\\test\\java\\drivers\\chromedriver76.exe");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\dom\\IdeaProjects\\MyWebsiteTestedSelenium\\src\\test\\java\\drivers\\chromedriver77.exe");
//            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver77.exe");
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\dom\\IdeaProjects\\MyWebsiteTestedSelenium\\src\\test\\java\\drivers\\chromedriver78.exe");

            //relative path also doesn't work
//            System.setProperty("webdriver.chrome.driver", "chromedriver77.exe");

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
