@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is on login page of oilpalm project page 
  When The Users enters with the valid username and password inputs data details 
  Then the page will be Navigated to the Dashboards home main menu pages screens
  And verify with the click on the Settings module
  
 @Sm_1
 Scenario: navigated to the user consignment screen
 Then check with the click on the User consignment screen 
 
 
 @da_1
  Scenario: Verify with the Assign User consignment action button input details
  Then check with the click on the User consignment screen 
  And check with the Click on the Assign user consignment action button