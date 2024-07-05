@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is on login page navgations
  When The User enters with the username and passwords details
  And Clicks on the logins button from login details page
  Then the page will be Navigate to the Dashboards home menu
  And Dashboard menu click on the Consignment Merge screen
  
  @Data_vali
  Scenario: Verify with active grid Status Type Dropdown field
  Then check with the Active grid Status type Dropdown selection field
  
  @Data_vali
  Scenario: Verify with the active grid Select collection center dropdown field
  Then check with the Active grid Status type Dropdown selection field
  And check with the Active grid Select collection center dropdown field
  
  @Data_vali1 
  Scenario: Active grid check with the From date selection input details
  Then check with the Active grid Status type Dropdown selection field
  And check with the Active grid Select collection center dropdown field
  Then verify with the From date input selection details
  
  @Data_vali2 
  Scenario: Active grid check with the Vehicle number input details
  Then check with the Active grid Status type Dropdown selection field
  And check with the Active grid Select collection center dropdown field
  Then verify with the From date input selection details
  And check with the Vehicle number input details validation
  
  @Data_vali3 
  Scenario: Active grid check with the Search result criteria input details
  Then check with the Active grid Status type Dropdown selection field
  And check with the Active grid Select collection center dropdown field
  Then verify with the From date input selection details
  And check with the Vehicle number input details validation
  When click on the search details button 
  
  @Data_vali4 
  Scenario: Active grid check with the Checkbox selection details
  Then check with the Active grid Status type Dropdown selection field
  And check with the Active grid Select collection center dropdown field
  Then verify with the From date input selection details
  And check with the Vehicle number input details validation
  When click on the search details button 
  Then check with the Checkbox selection from the Active grid  
    
  @Data_vali5 
  Scenario: Active grid check with the Merge action button details
  Then check with the Active grid Status type Dropdown selection field
  And check with the Active grid Select collection center dropdown field
  Then verify with the From date input selection details
  And check with the Vehicle number input details validation
  When click on the search details button 
  Then check with the Checkbox selection from the Active grid 
  When Click on the Merge action button  