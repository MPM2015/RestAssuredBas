package stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class requestZipCode90210_checkStatusAndContentType_expectApplication200Json {

	Response response;
	int responsecode;
	String responsebody;

	
	  	
	@When("^Valid API URL Details$")
	public void user_Inputs_Valid_API_Details() throws Throwable {
		Response response = RestAssured.get("http://api.zippopotam.us/us/90210");
		responsecode = response.statusCode();
		responsebody = response.contentType();
	    
	}
	
	@Then("^Status Code is Matched for JSON$")
	public void statusResponseMatch() throws Throwable {
		Assert.assertEquals(responsecode, 200);

	}

	@Then("^ContentType is JSON for the given API URL$")
	public void ContentTypeResponseMatch() throws Throwable {
		Assert.assertEquals(responsebody,"application/json");
	    
	}
	
	

}
