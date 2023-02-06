package neoStoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignInPage
{

	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement MobNoField;
	@FindBy(xpath = "(//a[text()='Sign In'])[2]") private WebElement SignInButton;
	//////////////////
	
	public NeoStoxSignInPage(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	
	////////////////////////
	public void enterMobileNumber()
	{
		MobNoField.sendKeys("9284483301");
	}
	
	public void clickOnSignInButton()
	{
		 SignInButton.click();
	}

	

}
