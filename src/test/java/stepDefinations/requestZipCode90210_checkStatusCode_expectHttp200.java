package stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class requestZipCode90210_checkStatusCode_expectHttp200 {

	Response response;
	int responsecode;

	
	  /*public void requestUsZipcode90210_checkStatusCode_expectHttp200()
	  {
	  
		  given().when().get("http://api.zippopotam.us/us/90210").then().assertThat().
		  statusCode(200);
	  
	  }*/
	 

	@When("^User Inputs Valid API Details$")
	public void validInputAPIDetails() throws Throwable {
		Response response = RestAssured.get("http://api.zippopotam.us/us/90210");
		responsecode = response.statusCode();

	}

	@Then("^Status Code Matched$")
	public void statusResponseMatch() throws Throwable {
		Assert.assertEquals(responsecode, 200);

	}
	
	@When("^User Inputs invalid API Details$")
	public void user_Inputs_invalid_API_Details() throws Throwable {
		Response response = RestAssured.get("http://api.zippopotam.us/us/9021034");
		responsecode = response.statusCode();
	    
	}

	@Then("^Status Code Mismatched$")
	public void statusResponseMismatch() throws Throwable {
		Assert.assertEquals(responsecode, 404);
	    
	}
	
	

}
