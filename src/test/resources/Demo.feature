Feature: Validating AdactinHotel Page

Scenario: Validate AdactinHotel Logi page for valid username,invalid password

	Given User is an login page 
	
	When User enter a valid username and invalid password
	
	And User click login button 
	
	Then Error Message should be declared




