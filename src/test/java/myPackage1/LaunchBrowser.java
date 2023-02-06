package myPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser 
{  //we can launch browser using two ways
	//1) using browser driver downloading 
	//2) usind WebDriverManager=> here no need to specify path and no need to download browser driver 
	//

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	}

}
