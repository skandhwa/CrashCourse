package Utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	static String browsername;
	public static WebDriver driver;
	
	public static WebDriver initializeDriver() 
	{
		try {
			browsername=ReadDataFromProperty.readDatafromProperty().getProperty("browser");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			try {
				driver.get(ReadDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
		}
		
		if(browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			try {
				driver.get(ReadDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
		}
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			try {
				driver.get(ReadDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
		}

		return driver;
		
	}
	
	
	public static String getTitleOfPage()
	{
		String Title=driver.getTitle();
		return Title;
	}
	
	public static void scrollDown()
	{
        JavascriptExecutor js=  (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)", "");
	}
	
	public static void addImplicitWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void closeDriver()
	{
		driver.close();
	}
	
	
	
	
	
	
	

}
