@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is on login page of oilpalm projects 
  When The User enter with the valid username and password inputs data details 
  Then the page will be Navigated to the Dashboards home main menu pages details
  And verfiy with the click on the Settings modules
  
@Smoke_1
Scenario: navigated to the manage Tablet screen
Then check with the click on the Manage tablet screen

@D_2
Scenario: Verify with the Clicking on the Add tablet button
Then check with the click on the Manage tablet screen
And check with the clicking on the Add tablet action button

@D_3
Scenario: Verify with the IMEI number input details
Then check with the click on the Manage tablet screen
And check with the clicking on the Add tablet action button
Then check with the IMEI number input details validations

@D_4
Scenario: Verify with the IMEI number two input details
Then check with the click on the Manage tablet screen
And check with the clicking on the Add tablet action button
Then check with the IMEI number input details validations
And check with the IMEI number two input details validations

@D_5
Scenario: Validate with the Brand name input details
Then check with the click on the Manage tablet screen
And check with the clicking on the Add tablet action button
Then check with the IMEI number input details validations
And check with the IMEI number two input details validations
Then check with the Brand name input details

@D_6
Scenario: verify with the Save input details
Then check with the click on the Manage tablet screen
And check with the clicking on the Add tablet action button
Then check with the IMEI number input details validations
And check with the IMEI number two input details validations
Then check with the Brand name input details
And check with the Save action button input details

@D_7
Scenario: verify with the Edit input details 
Then check with the click on the Manage tablet screen
And check with the clicking on the Add tablet action button
Then check with the IMEI number input details validations
And check with the IMEI number two input details validations
Then check with the Brand name input details
And check with the Save action button input details
Then check with the Click on the Edit action button