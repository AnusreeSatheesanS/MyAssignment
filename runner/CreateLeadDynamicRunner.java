package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src/test/java/Features/CreateLead.feature",glue="StepDefinition",publish=true,
	monochrome=true)
	public class CreateLeadDynamicRunner extends AbstractTestNGCucumberTests {

	}
