package Test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

	
		WebDriver driver;
		//constructor
		public LoginPage(WebDriver lDriver)
		{
			this.driver=lDriver;
			
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath="//*[@id=\"loginlabel\"]") WebElement loginclick;
		
		
	@FindBy(name="log") WebElement uname;
		
		@FindBy(name="pwd") WebElement pass;
		
		@FindBy(name="wp-submit") WebElement loginButton;
		
		@FindBy(xpath="//*[@id=\"gk-login-toggle\"]/i") WebElement logoutimage;
		
		@FindBy(xpath="//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a") WebElement logoutclick;
		public void loginPortal(String username,String password)
		{
			
			loginclick.click();
			uname.sendKeys(username);
			pass.sendKeys(password);
			
			driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click() ;
			
		}
}
