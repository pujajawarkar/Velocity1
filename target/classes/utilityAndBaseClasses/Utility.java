package neoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	//excel
	//wait
	//screenShot
	//scrolIntoView
	
	//read data from property file
	public static String readDataFromPropertyFile(String key) throws IOException
	{   

		Properties prop = new Properties();
		
		FileInputStream myFile = new FileInputStream("C:\\selenium\\myProperty.properties");
         
		prop.load(myFile);
		
		String value = prop.getProperty(key);
		
		System.out.println(value);
		Reporter.log("reading data from Property File", true);
		Reporter.log("data is "+value, true);
		return value;
		
		
	}
	
	public static String readDataFromExcel(int row ,int cell) throws EncryptedDocumentException, IOException
	{
        File excelN= new File("C:\\selenium\\Velocity.xlsx");
	    Sheet mySheet = WorkbookFactory.create(excelN).getSheet("Sheet4");
	    String value = mySheet.getRow(row).getCell(cell).getStringCellValue();// row and cell varies
		Reporter.log("data is "+value , true);

	    return value;
	    
		 
	  //  Reporter.log("Reading data from excel: row is "+row+" cell "+cell, true);
	}
	
	public static void implicitWait(int time,WebDriver driver )
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Reporter.log("Waiting time is "+time+"ms", true);

	}
	
	public static void takeScreenShot(WebDriver driver, String  fileName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\selenium\\SS"+fileName+".png");
		FileHandler.copy(src, dest);
		Reporter.log("taking ScreenShot", true);
		Reporter.log("taken ScreenShot saved at "+dest, true);


	}
	
	public static void scrollIntoView(WebDriver driver, WebElement  element)
	
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("scrollIntoView to "+element, true);

	}

}
