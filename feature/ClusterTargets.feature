@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is login page of oilpalm project screens
  When The Users enters with the verify username and password inputs details 
  Then the page will be Navigated to the Dashboards Main menu details screens 
  And verify with the click on the Settings modules navigate menu
  
@Smoke_nav_ClusterKRA
Scenario: Verify with the Navigation to the Cluster KRA screen
Then check with the navigated to the Cluster KRA screen

@Validate_data1
Scenario: Verify with the Search Cluster criteria
Then check with the navigated to the Cluster KRA screen
And check with the Search cluster criteria

@Validate_data2
Scenario: Verify with the Actions by Edit action button click
Then check with the navigated to the Cluster KRA screen
And check with the Search cluster criteria
And verify with actions by Edit button click

@Validate_data3
Scenario: Verify with the update Monthly target popup details 
Then check with the navigated to the Cluster KRA screen
And check with the Search cluster criteria
And verify with actions by Edit button click    
Then check with the update Monthly target popup details

@Validate_data4
Scenario: Verify with the update Monthly target popup details 
Then check with the navigated to the Cluster KRA screen
And check with the Search cluster criteria
And verify with actions by Edit button click    
Then check with the update Monthly target popup details
And check with the click on the View monthly target details