package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "src\\test\\resources\\orangelogin.feature",
		glue= "Steps",
		publish=true,
		plugin = {"pretty", "html:target/output.html", "junit:target/output.xml", "json:target/output.json"},
		monochrome = true,
		dryRun = false,
		tags="@Outline"
		
		)

public class TestrunnerClass {
	
	

}
