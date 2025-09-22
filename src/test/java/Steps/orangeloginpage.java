package Steps;

import java.time.Duration;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeloginpage {
	
	WebDriver driver;
	
	
	//Hooks
	
	@Before("@Outline")
	public void setup(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
//	@Before(order=1) 
//	public void launchurl(){
//		
//		
//		
//	}
	
	@Given("User launches the orange hrm page")
	public void launchorangeurl() {
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}
	@When("User enters a username for the login page")
	public void usernameorange() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
	   
	}
	@When("User enters a password for the login page")
	public void passwordorange() {
		
		driver.findElement(By.name("password")).sendKeys("admin123");
	    
	}
	@When("User clicks a login button for login page")
	public void loginbutton() {
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	    
	}
	@Then("User should see the dashboard page for orange hrm")
	public void dashboardpage() {
		
		String text = driver.findElement(By.xpath("//h6[text() = 'Dashboard']")).getText();
		
		if(text.equals("Dashboard")) {
			
			System.out.println("User is on home page");
			
		}
		else {
			
			System.out.println("User is not on home page");
		}
		
		
	   
	}
	
	
	
	// For parameters
	
	@When("User enters a username {string} for the login page")
	public void user_enters_a_username_for_the_login_page(String uname) {
	   
		driver.findElement(By.name("username")).sendKeys(uname);
	}

	@When("User enters a password {string} for the login page")
	public void user_enters_a_password_for_the_login_page(String pass) {
	   
		driver.findElement(By.name("password")).sendKeys(pass);
		
	}
	
//	@After(order=1)
//	public void beforetear() {
//		
//		System.out.println("Before quit");
//		
//	}
	
	@After("@Outline")
	public void tear() {
		
		driver.quit();
		
	}

}
