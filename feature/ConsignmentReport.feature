@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is on login page navgati
  When User enters with the username and passwords details
  And Clicks on the logins button from login pag
  Then Navigate to the Dashboards home pag
  Then click on the Consignment Report screen
  
  @Data_val
  Scenario: Active grid Type selection
  Then check with the active grid Type dropdown selection
  
    
  @Data_val
  Scenario: Active grid Status Type selection
  Then check with the active grid Type dropdown selection
  And check with the Select Status Type from the Dropdown selection field
  
  @Data_val
  Scenario: Active grid Select collection center
  Then check with the active grid Type dropdown selection
  And check with the Select Status Type from the Dropdown selection field
  And check with the Select Collection center from the Dropdown Field
  
  @Data_val
  Scenario: Active grid Select From date input details
  Then check with the active grid Type dropdown selection
  And check with the Select Status Type from the Dropdown selection field
  And check with the Select Collection center from the Dropdown Field
  Then check with the Validate with the From date input selection
  
  @Data_val
  Scenario: Search With Valid Criteria
  Then check with the active grid Type dropdown selection
  And check with the Select Status Type from the Dropdown selection field
  And check with the Select Collection center from the Dropdown Field
  Then check with the Validate with the From date input selection
  And verify with the Clicking on the Search button result details
  
  @Data_val
  Scenario: Verify With the View Receipt action button click
  Then check with the active grid Type dropdown selection
  And check with the Select Status Type from the Dropdown selection field
  And check with the Select Collection center from the Dropdown Field
  Then check with the Validate with the From date input selection
  And verify with the Clicking on the Search button result details
  Then check with the View Receipt button click
  
  @Data_val
  Scenario: Verify With the From date and To date between data
  Then check with the Validate with the From date input selection
  And verify with the Clicking on the Search button result details
  Then check with the View Receipt button click
  
  @Data_val
  Scenario: Verify with the  Select collection cneter dropdown field
  And check with the Select Collection center from the Dropdown Field
  Then check with the Validate with the From date input selection
  And verify with the Clicking on the Search button result details
  Then check with the View Receipt button click
  
   	
  