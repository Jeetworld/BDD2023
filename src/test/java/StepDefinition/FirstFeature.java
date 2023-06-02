package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstFeature {
	
	@Given("I have cred for fb")
	public void i_have_cred_for_fb() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this given state");
	    
	}
	@When("I login with correct username {string} and password {string}")
	public void i_login_with_correct_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is when state with username:: "+string+" and "+string2);
	   
	}
	@Then("Homepage should show with correct data")
	public void homepage_should_show_with_correct_data() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("this is then state");
	  // throw new Exception("this is manual exception");

}
	
	@Then("I can operate fb application")
	public void i_can_operate_fb_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is then state");
	   
	}
	@Then("only as a end user")
	public void only_as_a_end_user() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is than 2 state");

	}
	
	@Given("I have gmail cred")
	public void i_have_gmail_cred() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("code:: i have gmail cred ");
	}
	@When("I enter gmail username and password")
	public void i_enter_gmail_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("code i enter the gamil user and pass");
	}
	@When("hit login button")
	public void hit_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("code:: when hit login btn");
	}
	@Then("I will redirect to homepage of gmail")
	public void i_will_redirect_to_homepage_of_gmail() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("code:: than i will redirct to homepage");
	}
	
}
