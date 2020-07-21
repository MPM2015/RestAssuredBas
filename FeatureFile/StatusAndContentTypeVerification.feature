Feature: StatusAndContentType_Response_Details

		Scenario: StatusAndContentType Verification
		When Valid API URL Details
		Then Status Code is Matched for JSON
		And ContentType is JSON for the given API URL
		
		
		