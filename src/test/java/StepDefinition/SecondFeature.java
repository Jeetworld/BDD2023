package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondFeature {
	
	@Given("I have lnk cred")
	public void i_have_lnk_cred() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("code:: i have lnk cred ");
	}
	@When("I enter the username as {string} and password as {string}")
	public void i_enter_the_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("i am entring the user "+string+ " and pass "+string2);
	}
	@Then("it should land me to homepage")
	public void it_should_land_me_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("code :: it should land to homepage");
	    
	}


}
