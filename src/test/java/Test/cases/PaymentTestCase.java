package Test.cases;

import org.testng.annotations.Test;

import Test.Utility.ReadExcelFile;
import Test.pages.BaseTest;
import Test.pages.DashBoardPage;
import Test.pages.LoginPage;
import Test.pages.PaymentPage;

public class PaymentTestCase extends BaseTest {

    String fileName = System.getProperty("user.dir") + "\\TestData\\TestInfo.xlsx";

    @Test(priority = 1)
    
    public void testcourses() {
        LoginPage lp = new LoginPage(driver);
        String username = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
        String password = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
        lp.loginPortal(username, password);

        DashBoardPage dp = new DashBoardPage(driver);
        dp.dashboardclick();

   
        String cardnum = ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 1); 
        String expdate = ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 2); 
        String cvcnu   = ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 3); 


        
        System.out.println("Card Number: " + cardnum);
        System.out.println("Expiry Date: " + expdate);
        System.out.println("CVC: " + cvcnu);

        PaymentPage pg = new PaymentPage(driver);
        pg.paymentOption( cardnum, expdate, cvcnu);
    }
}
