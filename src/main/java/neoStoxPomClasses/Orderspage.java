package neoStoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/////this class is created just for sake of understanding git branch creation and add this class to branch1
public class Orderspage {
@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement SignInButton;//1
	
	public Orderspage(WebDriver driver )//2
	{
		PageFactory.initElements( driver, this);
	}
}
