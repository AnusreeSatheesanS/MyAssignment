package StepDefinition;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadDynamic extends ProjectSpecificMethod {
	@When("Click on crmsfa button")
	public void click_on_crmsfa_button() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on Lead button")
	public void click_on_lead_button() {
	driver.findElement(By.linkText("Leads")).click(); 
	}

	@When("Click on Create Lead Button")
	public void click_on_create_lead_button2() {
	driver.findElement(By.linkText("Create Lead")).click();  
	}

	@When("Enter the companyName as {string}")
	public void enter_the_company_name_as(String compname) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compname);    
	}
	
	@When("Enter the firstName as {string}")
	public void enter_the_first_name_as(String fname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname); 
	}

	@When("Enter the lastName as {string}")
	public void enter_the_last_name_as(String lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);  
	}

	@When("Click on CreateLead Button")
	public void click_on_create_lead_button() {
	driver.findElement(By.name("submitButton")).click(); 
	}

	@Then("Verify Lead is created")
	public void verify_lead_is_created() {
		String title=driver.getTitle();
		if(title.contains("Leaftaps"))
		{
			System.out.println("Login is not successfull");
		}
		else {
			System.out.println("Login is successfull");
		}
	}
}
