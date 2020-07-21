package stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertThrows;

public class requestZipCode90210_checkContentType_expectApplicationJson {

	Response response;
	int responsecode;
	String responsebody;

	
	  	
	@When("^Valid API Details$")
	public void user_Inputs_Valid_API_Details() throws Throwable {
		Response response = RestAssured.get("http://api.zippopotam.us/us/90210");
		responsebody = response.contentType();
	    
	}
	
	
	@Then("^ContentType is JSON$")
	public void ContentTypeResponseMatch() throws Throwable {
		Assert.assertEquals(responsebody,"application/json");
			
	    
	}
	
	
	
	

}
