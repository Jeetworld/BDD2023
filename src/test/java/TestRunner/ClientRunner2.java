package TestRunner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "@Failed_Scenarios/failed_scenarios.txt",
			glue="StepDefinition",
			monochrome= true, 
			//dryRun=false, 
			tags="@SMOKETESTS",
			plugin= {
					"pretty", 
					"html:target/htmlreport.html",
					"json:target/jsonReport.json",
					"junit:target/junitreport.xml"
					//"rerun:Failed_Scenarios/failed_scenarios.txt"
			}
				)
public class ClientRunner2{
	

}
