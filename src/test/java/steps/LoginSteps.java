package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	@Given("User is at the login screen")
	public void precondition()
	{
		System.out.println("Given statement");
	}
	
	@When("User enters username")
	public void enterningUsername()
	{
		System.out.println("Username entered");
	}
	
	@When("User enters password")
	public void EnterningPassword()
	{
		System.out.println("Password entered");
	}
	
	@When("User click on login button")
	public void ClickOnLoginButton()
	{
		System.out.println("Clicked on login button");
	}
	
	@Then("User should see the home page")
	public void ValidateLogin() 
	{
		System.out.println("Home page is displayed");
	}
	
	
	@Given("User is at the login page")
	public void NavToLoginPage()
	{
		System.out.println("At login page");
	}
	
	@Then("Page title should get display")
	public void ValidatePageTitle() 
	{
		System.out.println("Validated page title");
	}


}
