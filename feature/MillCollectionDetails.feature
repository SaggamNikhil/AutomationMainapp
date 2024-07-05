@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is on login page screen
  When The User enters with the username and passwords input details
  And Clicks on the logins button from the login details page
  Then the page will be Navigated to the Dashboards home menu
  And Dashboard menu click on the Mill Collection Details screen
  
  @Data_validation_check
  Scenario: Active grid Select Mill Selection details
  Then verify with the Active grid Select mill details
  
  @Data_validation_check
  Scenario: Active grid check with the From date selection input details
  Then verify with the Active grid Select mill details
  And check with the From date selection input details
  
  @Data_validation_check
  Scenario: Active grid check with the Search button result details
  Then verify with the Active grid Select mill details
  And check with the From date selection input details
  And verify with the click on the Search button 
  
  @Data_validation_check
  Scenario: Active grid check with the Search button result details
  Then verify with the Active grid Select mill details
  And check with the From date selection input details
  And verify with the click on the Search button 
  Then check with the View Print details