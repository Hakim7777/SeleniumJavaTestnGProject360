package Test.cases;
import org.testng.annotations.Test;

import Test.Utility.ReadExcelFile;
import Test.pages.BaseTest;
import Test.pages.LoginPage;
import Test.pages.SearchPage;

public class SerachTestCase extends BaseTest {
	
	String fileName=System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";
	
	@Test(priority =1)
	void searchCourseTesr()
	{
		LoginPage lp=new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginPortal(username, password);
		
		SearchPage sp= new SearchPage(driver);
		String serachCourse=ReadExcelFile.getCellValue(fileName, "SearchCourse", 0, 0);
		sp.serachCourse(serachCourse);
	}

    
}

