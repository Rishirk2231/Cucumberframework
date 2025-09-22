package Steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataImplementation {
	
	
	//We use asList for only single column
	
	@Given("Datas for email in login page")
	public void datas_for_email_in_login_page(DataTable dataTable) throws InterruptedException {
	    
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//		WebElement email = driver.findElement(By.id("email"));
//		
//		List<String> asList = dataTable.asList();
//		
//		for(int i=0; i<asList.size(); i++) {
//			
//			
//			email.sendKeys(asList.get(i));
//			Thread.sleep(2000);
//			email.clear();
//		}
		
		
		// Now we using for two columns
		
		List<List<String>> asLists = dataTable.asLists();
		
//		List<String> list = asLists.get(2);
//		
//		for(String l:list) {
//			
//			System.out.println(l);
//			
//		}
		
		System.out.println("To print all datas");
		
		for(int i=0; i<asLists.size(); i++) {
			
			for(int j=0; j<asLists.get(i).size(); j++) {
				
				System.out.println(asLists.get(i).get(j));
			}
			
			
		}
		
		
	}

}
