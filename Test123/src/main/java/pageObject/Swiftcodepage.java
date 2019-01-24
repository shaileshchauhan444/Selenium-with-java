package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Swiftcodepage {

	

		WebDriver driver;
		
		public Swiftcodepage(WebDriver driver){
			
			this.driver = driver;
			
		}
		
		By code = By.xpath("//table[@class='swift']"); 
		
		
		public void bankname(){
			
			List<WebElement> all = driver.findElements(By.xpath("//table[@class='swift']/tbody/tr"));
			System.out.println(all.size());
			
			for(int i=2; i<all.size();i++){
				
				  if(i==7 || i ==21 || i==35 || i==49) {
					    continue;
				          }
						
				
			String table1 = driver.findElement(By.xpath("//table[@class='swift']/tbody/tr["+i+"]/td[2]")).getText();
			
				
			String table2 = driver.findElement(By.xpath("//table[@class='swift']/tbody/tr["+i+"]/td[5]/a[1]")).getText();
			
			System.out.println("Bank name is ="+table1+" and Swift code = "+table2);
			
			}
		}
		
				
}
