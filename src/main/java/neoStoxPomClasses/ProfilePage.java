package neoStoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement SignInButton;//1
	
	public ProfilePage(WebDriver driver )//2
	{
		PageFactory.initElements( driver, this);
	}
}
