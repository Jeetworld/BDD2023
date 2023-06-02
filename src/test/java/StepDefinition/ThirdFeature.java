package StepDefinition;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.datatable.DataTable;

public class ThirdFeature {
	
	@Given("i have cred")
	public void i_have_cred() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("BKcode:: i have crred");
	}
	@When("i enter the user and pass")
	public void i_enter_the_user_and_pass() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("BKcode:: i enter user cred");
	}
	@Then("it will redirect me to homepage")
	public void it_will_redirect_me_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("BKcode: it will rediret to homepage");
	   
	}
	@Given("when I create access req")
	public void when_i_create_access_req() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("code:: when i raise access req");
	}
	@When("Req no is gneerated")
	public void req_no_is_gneerated() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("code:: when req no is geneated");
	}
	@Then("automation job will get success")
	public void automation_job_will_get_success() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("code:: automation job will success");
	    
	}
	@Then("below items are updated")
	public void below_items_are_updated(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		System.out.println(" below items are updated"+data.get(0).get(0));
		System.out.println(" below items are updated"+data.get(0).get(1));
		System.out.println(" below items are updated"+data.get(0).get(2));
		System.out.println(" below items are updated"+data.get(0).get(3));
		
	    
	}

}
