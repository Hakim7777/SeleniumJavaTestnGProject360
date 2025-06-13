package Test.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProviders {

    private Properties pro;

    public ConfigDataProviders() {
        File src = new File("./Configuration/config.properties");

        try (FileInputStream fis = new FileInputStream(src)) {
            pro = new Properties();
            pro.load(fis);
        } catch (IOException e) {
            System.out.println("Not able to load config file: " + e.getMessage());
            pro = null;
        }
    }

    public String getBrowser() {
        if (pro != null) {
            return pro.getProperty("browser");
        } else {
            System.out.println("Properties not loaded, returning default browser 'chrome'");
            return "chrome";
        }
    }

    public String getStagingUrl() {
        if (pro != null) {
            return pro.getProperty("testurl");
        } else {
            System.out.println("Properties not loaded, returning default URL 'http://demo.itlearn360.com/'");
            return "http://demo.itlearn360.com/";
        }
    }
}
