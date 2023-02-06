package neoStoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxPasswordPage 
{
	@FindBy(id="txt_accesspin") private WebElement EnterPasswordField;
	@FindBy(id="lnk_submitaccesspin") private WebElement SubmitButton;
	public NeoStoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	////////////////////////
	public void enterPassword()
	{
		EnterPasswordField.sendKeys("5678");
	}
	public void clickOnSubmitButton() throws InterruptedException
	{
		Thread.sleep(1000);
		SubmitButton.click();
	}
	
}
