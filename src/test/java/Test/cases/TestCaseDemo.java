package Test.cases;

import org.testng.annotations.Test;
import Test.pages.BaseTest;

public class TestCaseDemo extends BaseTest {

    @Test
    public void testcheck() {
        System.out.println("Test is running...");
        System.out.println("Title is: " + driver.getTitle());
    }
}
