@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is on login page of oilpalm screens
  When The User enters with the username and passwords ipt data details 
  And Clicks on the logins button from the login details pag
  Then the page will be Navigated to the Dashboards home menu pag
  And check with the Click on the Live Collection details screen
  
  @Data_t3
  Scenario: Active grid Check with State selection details
  Then check with the Click on the State selection details
  
  @Data_t3
  Scenario: Active grid check with the Select collection center details
  Then check with the Click on the State selection details
  And check with the Click on the Select collection center details
  
  @Data_t3
  Scenario: Active gird check with the From date selection from the grid
  Then check with the Click on the State selection details
  And check with the Click on the Select collection center details
  And check with the From date input selection input details
  
  @Data_t3
  Scenario: Active grid check with the search button criteria details
  Then check with the Click on the State selection details
  And check with the Click on the Select collection center details
  And check with the Search button resutls
  Then check with the Total Collection details 
  
  