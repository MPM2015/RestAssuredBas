Feature: StatusCode_Response_Details

		Scenario: Valid Status Code Verification
		When User Inputs Valid API Details
		Then Status Code Matched
		
		Scenario: Invalid Status Code Verification
		When User Inputs invalid API Details
		Then Status Code Mismatched
		
		
		