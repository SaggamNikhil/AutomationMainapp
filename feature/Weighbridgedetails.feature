@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is on login page of oilpalm screen
  When The User enters with the username and passwords ip data details 
  And Clicks on the logins button from the login details screens
  Then the page will be Navigated to the Dashboards home menu pages
  And Check with the Clicking on the Weighbridge details screen
  
  @Data_validt1
  Scenario: Active grid check with the Select Mill Dropdown functionality
  Then check with the Select Mill Dropdown input field 
  
  @Data_validt1
  Scenario: Active grid check with the Select Status Dropdown functionality
  Then check with the Select Mill Dropdown input field 
  And check with the Select Status Dropdown input field
  
  @Data_validt1
  Scenario: Active grid check with the From date selection input details
  Then check with the Select Mill Dropdown input field 
  And check with the Select Status Dropdown input field
  And check with the From Date selection ip details
  
  @Data_validt1
  Scenario: Active grid check with the Search button details 
  Then check with the Select Mill Dropdown input field 
  And check with the Select Status Dropdown input field
  And check with the From Date selection ip details
  When Click on the Search actions button input details
  
  @Data_validt1
  Scenario: Active grid check with the Weighbridge total count
  Then check with the Select Mill Dropdown input field 
  And check with the Select Status Dropdown input field
  And check with the From Date selection ip details
  When Click on the Search actions button input details
  And check with the In progress and processed weight bridge details count
 
 @Data_validt1
    Scenario: Active grid check with the Print Token details
  Then check with the Select Mill Dropdown input field 
  And check with the Select Status Dropdown input field
  And check with the From Date selection ip details
  When Click on the Search actions button input details
  And check with the In progress and processed weight bridge details count
  Then check with the click on the Print Token details 