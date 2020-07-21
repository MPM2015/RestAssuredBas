package stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class requestZipCode90210_logRequestAndResponseDetails3 {

	Response response;
	String responsebody;

	@When("^Provide API Details$")
	public void provide_API_Details() throws Throwable {
		Response response = RestAssured.get("http://api.zippopotam.us/us/90210");
		String responsebody = response.prettyPeek().prettyPrint();
		}

	@Then("^Log body$")
	public void log_only_the_request_body() throws Throwable {

		Assert.assertEquals(responsebody,responsebody);
		

	}

}
