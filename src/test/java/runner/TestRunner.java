package runner;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/resources",
                glue="stepdefinition",
                dryRun=false,
                plugin="json:target\report.json")
public class TestRunner extends AbstractTestNGCucumberTests{
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {	return super.scenarios();	}}