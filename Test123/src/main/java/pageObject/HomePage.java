package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	By images = By.tagName("img"); 
	
	public void allUrl()
	{
		List<WebElement> all = driver.findElements(images);
		System.out.println("Count of all images"+all.size());
		
         for(int i=0; i<all.size();i++){
			
			System.out.println(all.get(i).getAttribute("src"));
		}
	}
	
	
	
	
}
