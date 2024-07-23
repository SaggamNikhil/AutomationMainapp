@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is login page of the oilpalm project screens
  When The Users enters with the a username and password inputs details 
  Then the page will be Navigate to the Dashboards Main menu details screens 
  And verify with the click on the Settings modules nav menu
  
@Smoke_Target_approval_navigation
Scenario: Verify with the navigated to the Target Approval screen
Then  check with the navigated to the target Approvals screen

@Validated_details1
Scenario: Check with the Manager selection Dropdown input details
Then  check with the navigated to the target Approvals screen
And check with the Manager selection Dropdown input details 

@Validated_details2
Scenario: Check with the User selection Dropdown input details
Then  check with the navigated to the target Approvals screen
And check with the Manager selection Dropdown input details 
And check with the Select user Drodown field details

@Validated_details3
Scenario: Check with the Search selection details
Then  check with the navigated to the target Approvals screen
And check with the Manager selection Dropdown input details 
And check with the Select user Drodown field details
Then check with the clicking on the Search action button from the grid

@Validated_details4
Scenario: Check with the Clear button action details
Then  check with the navigated to the target Approvals screen
And check with the Manager selection Dropdown input details 
And check with the Select user Drodown field details
Then check with the clicking on the Search action button from the grid
And check with the Clicking on the clear action button from the grid

@Validated_details5
Scenario: Check with the L2 Manager action details
Then  check with the navigated to the target Approvals screen
And check with the Manager selection Dropdown input details 
And check with the Select user Drodown field details
Then check with the clicking on the Search action button from the grid
And check with the Clicking on the clear action button from the grid
And check with the select Manager as L2 manager details

@Validated_details6
Scenario: Check with the L2 Manager User selection details
Then  check with the navigated to the target Approvals screen
And check with the Manager selection Dropdown input details 
And check with the Select user Drodown field details
Then check with the clicking on the Search action button from the grid
And check with the Clicking on the clear action button from the grid
And check with the select Manager as L2 manager details
And check with the select user for L2 manager details