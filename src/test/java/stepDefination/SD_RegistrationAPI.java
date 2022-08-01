package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.then;

public class SD_RegistrationAPI {

	@Given("^I want to execute UserRegistration API$")
	public void i_want_to_execute_UserRegistration_API() throws Throwable {
	    RestAssured.baseURI= "https://reqres.in/";
	    given().queryParam("page", 2).header("Content- Type", "application/json");
	}
	@When("^I submit the POST request to create Single User$")
	public void i_submit_the_POST_request_to_create_Single_User() throws Throwable {
	   when().post("api/users").
	   then().assertThat().statusCode(201);
	 //  then().assertThat().statusCode(201);
	}
	@Then("^I should get (\\d+) success status code with respose body$")
	public void i_should_get_success_status_code_with_respose_body(int arg1) throws Throwable {
	  // then().assertThat().statusCode(201);
	}
	
	
}
