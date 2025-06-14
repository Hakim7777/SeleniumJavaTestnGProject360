import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashBoardPage {
    WebDriver driver;
    WebDriverWait wait;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void dashboardclick() {
        WebElement dashboardLink = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='login-list']/li[1]/a"))
        );
        dashboardLink.click();
    }
}
