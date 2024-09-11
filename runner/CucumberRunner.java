package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src/test/java/Features/Login.feature",glue="StepDefinition",publish=true,
	monochrome=true)
	public class CucumberRunner extends AbstractTestNGCucumberTests {

	}
