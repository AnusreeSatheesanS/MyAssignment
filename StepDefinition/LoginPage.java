package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod{


@Given("Launch the browser and Load the URL")
public void launch_the_browser_and_load_the_url() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

@When("Enter the username as {string}")
public void enter_the_username_as_demo_sales_manager(String uname) {
driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys(uname);
}

@When("Enter the password as {string}")
public void enter_the_password_as_crmsfa(String pwd) {
driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(pwd);   
}

@When("Click on Login button")
public void click_on_login_button() {
driver.findElement(By.xpath("//input[@value='Login']")).click();   
}

@Then("Verify the login is successful")
public void verify_the_login_is_successful() {
String title=driver.getTitle();
if(title.contains("Leaftaps"))
{
	System.out.println("Login is successfull");
}
else {
	System.out.println("Login is unsuccessfull");
}
}

@But("Verify the login is not successful")
public void negativeLogin() {
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
