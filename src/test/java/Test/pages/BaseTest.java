package Test.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Test.Utility.BrowserFactory;
import Test.Utility.ConfigDataProviders;

public class BaseTest {

    public WebDriver driver;
    public ConfigDataProviders config;

    @BeforeClass
    public void setUp() {
        config = new ConfigDataProviders();
        String browser = config.getBrowser();
        String url = config.getStagingUrl();

        driver = BrowserFactory.startApplication(driver, browser, url);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            //driver.quit();
        }
    }

    public void captureScreenShot(WebDriver driver, String testName) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
        FileUtils.copyFile(src, dest);
    }
}
