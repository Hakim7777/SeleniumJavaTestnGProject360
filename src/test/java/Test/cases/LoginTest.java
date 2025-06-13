package Test.cases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Test.Utility.ReadExcelFile;
import Test.pages.BaseTest;
import Test.pages.LoginPage;

public class LoginTest extends BaseTest{
	
	String fileName=System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";
	@Test(priority =1,dataProvider="LoginDataProvider")
	
	void verifyLogin() {
		
		LoginPage  lp=new LoginPage(driver) ;
		
		String username="Demo12";
		String password="Test123456$";
		lp.loginPortal(username,password);
		
		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click() ;
	}
	
@DataProvider(name="LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		
		
		int ttlRows= ReadExcelFile.getRowCount(fileName, "LoginData");
		int ttlColumns= ReadExcelFile.getColCount(fileName, "LoginData");
		
		String data[][]= new String[ttlRows-1][ttlColumns];
		
		for(int i=1;i<ttlRows;i++)
		{
			for(int j=0;j<ttlColumns;j++)
			{
				data[i-1][j]=ReadExcelFile.getCellValue(fileName, "LoginData", i, j);
			}
		}
		return data;
}

}
