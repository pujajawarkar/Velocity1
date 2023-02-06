package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class Base
{      
	protected  static WebDriver driver;//static keyword is used to avoid duplicacy of driver

   public void launchBrowser() throws IOException
        {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	   
       driver=new ChromeDriver();
       
       driver.manage().window().maximize();
       
       //driver.get("https://neostox.com/");
       driver.get(Utility.readDataFromPropertyFile("urlQa"));
       Utility.implicitWait(1000, driver);
	   Reporter.log("launching browser ", true);
	   //comment_1
	   //comment_2
	   //comment 3 added in mvn base class
	   //comment4

        }
}
