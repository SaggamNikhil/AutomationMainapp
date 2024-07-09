@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is on login page screen of oilpalm
  When The User enters with the username and passwords ip details 
  And Clicks on the logins button from the login details screen
  Then the page will be Navigated to the Dashboards home menu page
  And Dashboard menu click on the Consignment to mill screen
  
  @Data_v1
  Scenario: Active grid check with Collection center Dropdown field details
  Then Verify with the Select Collection center from the Drop down field
  
  @Data_v2
  Scenario: Active grid check with the From date selection input details
  Then Verify with the Select Collection center from the Drop down field
  And Verify with the Select From date input details 
  
  @Data_v3
  Scenario: Active grid check with the Search button input details
  Then Verify with the Select Collection center from the Drop down field
  And Verify with the Select From date input details 
  And Verify with the Search button criteria results
  
  @Data_V4
  Scenario: Active grid Check with the Total inserted records details
  Then Verify with the Select Collection center from the Drop down field
  And Verify with the Select From date input details 
  And Verify with the Search button criteria results
  And check with the All details input count details
  
  @Data_V5
  Scenario: Active grid check with the View receipt details 
  Then Verify with the Select Collection center from the Drop down field
  And Verify with the Select From date input details 
  And Verify with the Search button criteria results
  And check with the All details input count details
  Then check with the clicking on the View Receipt details 
  
  @Data_V6
  Scenario: Active grid search data with the between From date and Todate 
  And Verify with the Select From date input details 
  And Verify with the Search button criteria results
  And check with the All details input count details
  Then check with the clicking on the View Receipt details 