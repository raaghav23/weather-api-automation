Feature: Verify Get Current Weather Data

Scenario: Verify Current Weather API with Valid data
	Given The user have valid API key
	When The user sents GET request and get the state code value
	Then API should return status as 200
	And Response content type should be application json
	And Response should have status code

