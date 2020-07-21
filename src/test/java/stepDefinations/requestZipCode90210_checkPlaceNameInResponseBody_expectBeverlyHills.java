package stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class requestZipCode90210_checkPlaceNameInResponseBody_expectBeverlyHills {

	Response response;
	int responsecode;
	String responsebody;

	
	  	
	@When("^Valid URL Details$")
	public void valid_URL_Details() throws Throwable {
		Response response = RestAssured.get("http://api.zippopotam.us/us/90210");
		//response.body().jsonPath("places[0].'place name'",equalTo(operand:"beverly Hills"));
		
	}

	@Then("^Place should match as Beverly Hills$")
	public void place_should_match_as_Beverly_Hills() throws Throwable {
		
	    
	}
	
	
	
	

}
