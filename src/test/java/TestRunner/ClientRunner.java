package TestRunner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/Feature/Epam.feature",
			glue="StepDefinition",
			monochrome= true, 
			//dryRun=false, 
			tags="@REGRESSIONTESTS",
			plugin= {
					"pretty", 
					"html:target/htmlreport.html",
					"json:target/jsonReport.json",
					"junit:target/junitreport.xml",
					"rerun:Failed_Scenarios/failed_scenarios.txt"
			}
				)
public class ClientRunner{
	

}
