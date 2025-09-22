package Testrunner;


import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "\\src\\test\\resources\\Parallel",   // path to your .feature files
	    glue = "parallelsteps",                     // your step defs package
	    plugin = {"pretty", "html:target/cucumber-report.html"},
	    monochrome = true
	)


public class ParallelrunnerTest extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true)
    public Object[][] scenarios() {
       
            return super.scenarios();
    }

}
