package Basepart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;
	public Properties p;


	public WebDriver initializeDriver() throws IOException{
		
        p = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Selenium\\Java New\\Test123\\src\\main\\java\\Basepart\\data.properties");
		
		p.load(fis);
		String browserName = p.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome and IE  driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("ff")){
			
			driver = new FirefoxDriver();	
		}else if(browserName.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver", "E:\\Selenium\\Chrome and IE  driver\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}    
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	
	}
	
	

}
