package amazonepackage;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Basepart.Base;
import pageObject.HomePage;
import pageObject.Swiftcodepage;



public class AmazoneTest extends Base {

	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	
	@Test
	public void amazoneimge() throws IOException{
		
		driver.get(p.getProperty("url1"));
		HomePage hp = new HomePage(driver);
		hp.allUrl();
		
	}
	
	@Test
	public void banknameswfcode() throws IOException{
		
		driver.get(p.getProperty("url2"));
		Swiftcodepage sc = new Swiftcodepage(driver);
		sc.bankname();		
	}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}

}
