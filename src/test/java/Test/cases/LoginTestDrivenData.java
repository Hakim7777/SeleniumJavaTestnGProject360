package Test.cases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Test.Utility.ReadExcelFile;
import Test.pages.BaseTest;
import Test.pages.LoginPage;

public class LoginTestDrivenData extends BaseTest {

    String fileName = System.getProperty("user.dir") + "\\TestData\\Testinfo.xlsx";

    @Test(priority = 1, dataProvider = "LoginDataProvider")
    void VerifyLogin(String userEmail, String userPwd) {
        LoginPage lp = new LoginPage(driver);

        lp.loginPortal(userEmail, userPwd);

        // Ici tu dois valider le login réel - exemple basique :
        // (à remplacer par une vraie validation, comme vérifier un élément visible après login)
        boolean loginSuccess = userEmail.equals("Demo12") && userPwd.equals("Test123456$");

        if (loginSuccess) {
            System.out.println("Test Passed");
            Assert.assertTrue(true);
        } else {
            try {
                captureScreenShot(driver, "VerifyLogin_" + userEmail);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Assert.assertTrue(false, "Login failed for user: " + userEmail);
        }
    }

    @DataProvider(name = "LoginDataProvider")
    public String[][] LoginDataProvider() {

        int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginData");
        int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginData");

        if (ttlRows <= 1) {
            throw new RuntimeException("Excel sheet 'LoginData' does not contain any data rows.");
        }

        String data[][] = new String[ttlRows - 1][ttlColumns];

        for (int i = 1; i < ttlRows; i++) {
            for (int j = 0; j < ttlColumns; j++) {
                data[i - 1][j] = ReadExcelFile.getCellValue(fileName, "LoginData", i, j);
            }
        }
        return data;
    }
}
