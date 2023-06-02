package StepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Epam {
	
	
	@Before
	public void setUp() {
		System.out.println("***BEFORE HOOK***");
		//this is to check git push
	}
	
	@After
	public void tearDown() {
		System.out.println("***AFTER HOOK***");
	}
	
	@Given("I have user credentials")
	public void i_have_user_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("this is background GIVEN ");
	}
	@Given("I have admin user credentials")
	public void i_have_admin_user_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("i have admin user cred");
	}
	@When("I open the login page")
	public void i_open_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I open the facebook login page");
	}
	@When("enter the {string} and {string}")
	public void enter_the_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Lets try with username "+ string+ " and password "+string2);
	}
	@Then("It should redirect me to Homepage")
	public void it_should_redirect_me_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(" WOWW !!  It redirects me to fb homepage !! ");
	}
	
	
	//////////////////////////////////////////FOR DATA TABLE
	
	@Given("I want to login in Twitter")
	public void i_want_to_login_in_twitter() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("ABout to login in twitter");
	}
	@When("I enter the login details for below users")
	public void i_enter_the_login_details_for_below_users(DataTable dataTable) throws Exception {
		List<List<String>> data = dataTable.asLists(String.class);
		System.out.println("login for "+data.get(0).get(0));
		System.out.println("login for "+data.get(0).get(1));
		System.out.println("login for "+data.get(0).get(2));
		System.out.println("login for "+data.get(0).get(3));
		System.out.println("login for "+data.get(0).get(4));
		//throw new Exception("this is custom exception !!");
	    
	}
	@Then("I am able to login for every user")
	public void i_am_able_to_login_for_every_user() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
