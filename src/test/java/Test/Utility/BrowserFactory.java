package Test.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class BrowserFactory {

    public static WebDriver startApplication(WebDriver driver, String browserName, String appUrl) {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("ie") || browserName.equalsIgnoreCase("internet explorer")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();

        } else {
            System.out.println("We do not support this browser: " + browserName);
            return null;
        }

        // Timeout configurations
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Open the app URL
        driver.get(appUrl);

        return driver;
    }

   /* public static void quitBrowser(WebDriver driver) {
        if (driver != null) {
           driver.quit();*/
    }
