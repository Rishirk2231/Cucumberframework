package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginsteps {
	
	WebDriver driver;
	
	@Given("User launches the test page")
	public void launchUrl() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://staging-ddpoints.mydd.app/supplier_v5/index.php");
		driver.manage().window().maximize();
	    
	}

	@When("User enters a emailid")
	public void userEmail() {
		
		driver.findElement(By.id("username")).sendKeys("dhivyan@mydd.app");
	    
	}

	@When("User enters a password")
	public void userPassword() {
	    
		driver.findElement(By.id("password")).sendKeys("DDUser123");
		
	}

	@When("User clicks a signin button")
	public void userSignin() {
		
		driver.findElement(By.name("submit")).click();
	    
	}

	@Then("User should redirect to the dashboard page")
	public void dashboardPage() {
		
		
		String text = driver.findElement(By.xpath("//h4[text() ='Dashboard']")).getText();
		
		if(text.equals("Dashboard")) {
		System.out.println(text);
		}
		else {
		driver.close();
		}
	    
	}

}
