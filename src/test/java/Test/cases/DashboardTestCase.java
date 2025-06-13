package Test.cases;


import org.testng.annotations.Test;
import Test.Utility.ReadExcelFile;
import Test.pages.BaseTest;
import Test.pages.DashBoardPage;
import Test.pages.LoginPage;

public class DashboardTestCase extends BaseTest {
	
	String fileName=System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";
	
	@Test(priority =1)
	void testcourses (){
		
		LoginPage lp=new LoginPage(driver);
		String username= ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password= ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginPortal(username, password);
		
		DashBoardPage dp=new DashBoardPage(driver);
		
		dp.dashboardclick();
	}

}