package stepDefination;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_RegistrationAPI {

	@Given("^I want to execute UserRegistration API$")
	public void i_want_to_execute_UserRegistration_API() throws Throwable {
	    RestAssured.baseURI= "https://reqres.in";
	   // RestAssured.baseURI= "https://bosdev-surveys.haygroup.com/internal/kfadvance/";
	    given()
	    .queryParam("page", 2)
	    .header("Content- Type", "application/json");
	}
	@When("^I submit the POST request to create Single User$")
	public void i_submit_the_POST_request_to_create_Single_User() throws Throwable {
	   when()
	   .post("/v1/User/Login").
	   then()
	   .assertThat().statusCode(201);
	   System.out.println("Executed");
	 
	}
	@Then("^I should get (\\d+) success status code with respose body$")
	public void i_should_get_success_status_code_with_respose_body(int arg1) throws Throwable {
	  // then().assertThat().statusCode(201);
	}
	
}




