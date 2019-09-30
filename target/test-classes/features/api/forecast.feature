Feature: Verify GET Forecast API

Scenario: Verify Current Forecast API with Valid data
	Given The user have proper API key
	When The user sents GET request and get the Timestamp and weather value
	Then API response should return status as 200
	And Response content type should be json
	And Validate Response has status code


