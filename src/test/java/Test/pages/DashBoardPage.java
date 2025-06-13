package Test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;
	//constructor
	public DashBoardPage(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"login-list\"]/li[1]/a") WebElement dash ;
	@FindBy(xpath ="//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a") WebElement offerAcademie;
	@FindBy(xpath = "//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button")WebElement SubscribeButton;

	public void dashboardclick()
	{
		dash.click();
		offerAcademie.click();
		SubscribeButton.click();
		}
}
