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
  
@da_2
Scenario: Verify with the Role selection from the dropdown list
  Then check with the click on the User consignment screen 
  And check with the Click on the Assign user consignment action button
  And check with the Role selection from the dropdown list
  
@da_3
Scenario: Verify with the User selection from the Dropdown list
  Then check with the click on the User consignment screen 
  And check with the Click on the Assign user consignment action button
  And check with the Role selection from the dropdown list
  And check with the user selection from the dropdown list
  
@da_4
  Scenario: Verify with the Nursery code selection from the Dropdown list
  Then check with the click on the User consignment screen 
  And check with the Click on the Assign user consignment action button
  And check with the Role selection from the dropdown list
  And check with the user selection from the dropdown list
  And check with the Nursery code selection from the dropdown list
  
  @da_5
  Scenario: Verify with the Consignment code from the Dropdown list
  Then check with the click on the User consignment screen 
  And check with the Click on the Assign user consignment action button
  And check with the Role selection from the dropdown list
  And check with the user selection from the dropdown list
  And check with the Nursery code selection from the dropdown list
  Then check with the Consignment code from the Dropdown list
  
 @da_6
  Scenario: Verify with the Save details from the popup screen
  Then check with the click on the User consignment screen 
  And check with the Click on the Assign user consignment action button
  And check with the Role selection from the dropdown list
  And check with the user selection from the dropdown list
  And check with the Nursery code selection from the dropdown list
  Then check with the Consignment code from the Dropdown list
  When the popup screen clicking on the Save action button  
  
 @da_7
 Scenario: Check with the Active grid actions by Edit button
  Then check with the click on the User consignment screen 
  And check with the Click on the Assign user consignment action button
  And check with the Role selection from the dropdown list
  And check with the user selection from the dropdown list
  And check with the Nursery code selection from the dropdown list
  Then check with the Consignment code from the Dropdown list
  When the popup screen clicking on the Save action button  
  And check with the Active grid by clicking on the edit button