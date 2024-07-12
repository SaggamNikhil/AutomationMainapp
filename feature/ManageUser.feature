@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is on login page screen of oilpalm projects
  When The User enter with the valid username and password inputs details 
  Then the page will be Navigated to the Dashboards home menu pages details
  And check with the click on the Settings modules
 
@Dat_test1
 Scenario: Navigated to the Manage User screen
 Then check with the click on the Manage user screen
 
@Dat_test2
Scenario: Verify with the click on the Add User action button 
 Then check with the click on the Manage user screen
 And check with the Click on the Add user action button
 
@Dat_test3
Scenario Outline: Validate with the First name input field validations
 Then check with the click on the Manage user screen
 And check with the Click on the Add user action button
 And check with the First name input field details
 
 #And check with the Firstname input validations"<Firstname>"
 #Examples: 
 #|Firstname|
 #|Ram raj!@!|
 #|1234665|
 #|ThisIsAPasswordWithExactly50CharactersAllowedyoucaq|
 #|Rama Test|
 
@Dat_test4
Scenario: Validate with the Last name input field validations
 Then check with the click on the Manage user screen
 And check with the Click on the Add user action button
 And check with the First name input field details
 And check with the Last name input field details
 
@Dat_test5
Scenario: Validate with the User name input field validations
 Then check with the click on the Manage user screen
 And check with the Click on the Add user action button
 And check with the First name input field details
 And check with the Last name input field details
 Then check with the Username input field details 
 
@Dat_test6
Scenario: Validate with the Password input field validations
Then check with the click on the Manage user screen
And check with the Click on the Add user action button
And check with the First name input field details
And check with the Last name input field details
Then check with the Username input field details 
And check with the Password input field validation details  
And check with the Confirm Password input field validation details

@Dat_test7
Scenario: Validate with the Contact number input field validations
Then check with the click on the Manage user screen
And check with the Click on the Add user action button
And check with the First name input field details
And check with the Last name input field details
Then check with the Username input field details 
And check with the Password input field validation details  
And check with the Confirm Password input field validation details
Then check with the Contact number input field validation details

@Dat_test8
Scenario: verify with the Role selection input field validations
Then check with the click on the Manage user screen
And check with the Click on the Add user action button
And check with the First name input field details
And check with the Last name input field details
Then check with the Username input field details 
And check with the Password input field validation details  
And check with the Confirm Password input field validation details
Then check with the Contact number input field validation details
And check with the Role selection input field validations

@Dat_test9
Scenario: verify with the Final assessment done by selection input field validations
Then check with the click on the Manage user screen
And check with the Click on the Add user action button
And check with the First name input field details
And check with the Last name input field details
Then check with the Username input field details 
And check with the Password input field validation details  
And check with the Confirm Password input field validation details
Then check with the Contact number input field validation details
And check with the Role selection input field validations
And check with the Final assessment done by input field validation

@Dat_test10
Scenario: verify with the Reporting manager selection input field validations
Then check with the click on the Manage user screen
And check with the Click on the Add user action button
And check with the First name input field details
And check with the Last name input field details
Then check with the Username input field details 
And check with the Password input field validation details  
And check with the Confirm Password input field validation details
Then check with the Contact number input field validation details
And check with the Role selection input field validations
And check with the Final assessment done by input field validation
Then check with the Reporting manager selection input field validations

@Dat_test11
Scenario: verify with the L1 manager selection input field validations
Then check with the click on the Manage user screen
And check with the Click on the Add user action button
And check with the First name input field details
And check with the Last name input field details
Then check with the Username input field details 
And check with the Password input field validation details  
And check with the Confirm Password input field validation details
Then check with the Contact number input field validation details
And check with the Role selection input field validations
And check with the Final assessment done by input field validation
Then check with the Reporting manager selection input field validations
And check with the L one manager selection input field validations

@Dat_test12
Scenario: verify with the L2 manager selection input field validations
Then check with the click on the Manage user screen
And check with the Click on the Add user action button
And check with the First name input field details
And check with the Last name input field details
Then check with the Username input field details 
And check with the Password input field validation details  
And check with the Confirm Password input field validation details
Then check with the Contact number input field validation details
And check with the Role selection input field validations
And check with the Final assessment done by input field validation
Then check with the Reporting manager selection input field validations
And check with the L one manager selection input field validations
And check with the L two manager selection input field validations

@Dat_test13
Scenario: verify with the Employee code input field validations
Then check with the click on the Manage user screen
And check with the Click on the Add user action button
And check with the First name input field details
And check with the Last name input field details
Then check with the Username input field details 
And check with the Password input field validation details  
And check with the Confirm Password input field validation details
Then check with the Contact number input field validation details
And check with the Role selection input field validations
And check with the Final assessment done by input field validation
Then check with the Reporting manager selection input field validations
And check with the L one manager selection input field validations
And check with the L two manager selection input field validations
Then check with the Employee code input validation details

@Dat_test14
Scenario: verify with the Staet selection input field validations
Then check with the click on the Manage user screen
And check with the Click on the Add user action button
And check with the First name input field details
And check with the Last name input field details
Then check with the Username input field details 
And check with the Password input field validation details  
And check with the Confirm Password input field validation details
Then check with the Contact number input field validation details
And check with the Role selection input field validations
And check with the Final assessment done by input field validation
Then check with the Reporting manager selection input field validations
And check with the L one manager selection input field validations
And check with the L two manager selection input field validations
Then check with the Employee code input validation details
And check with the State selection dropdown input details

@Dat_test15
Scenario: verify with the Cluster selection  input field validations
Then check with the click on the Manage user screen
And check with the Click on the Add user action button
And check with the First name input field details
And check with the Last name input field details
Then check with the Username input field details 
And check with the Password input field validation details  
And check with the Confirm Password input field validation details
Then check with the Contact number input field validation details
And check with the Role selection input field validations
And check with the Final assessment done by input field validation
Then check with the Reporting manager selection input field validations
And check with the L one manager selection input field validations
And check with the L two manager selection input field validations
Then check with the Employee code input validation details
And check with the State selection dropdown input details
Then check with the Cluster selection dropdown input details


@Dat_test16
Scenario: verify with the Select office type selection  input field validations
Then check with the click on the Manage user screen
And check with the Click on the Add user action button
And check with the First name input field details
And check with the Last name input field details
Then check with the Username input field details 
And check with the Password input field validation details  
And check with the Confirm Password input field validation details
Then check with the Contact number input field validation details
And check with the Role selection input field validations
And check with the Final assessment done by input field validation
Then check with the Reporting manager selection input field validations
And check with the L one manager selection input field validations
And check with the L two manager selection input field validations
Then check with the Employee code input validation details
And check with the State selection dropdown input details
Then check with the Cluster selection dropdown input details
And check with the select office type option details

@Dat_test17
Scenario: verify with the Save action button field 
Then check with the click on the Manage user screen
And check with the Click on the Add user action button
And check with the First name input field details
And check with the Last name input field details
Then check with the Username input field details 
And check with the Password input field validation details  
And check with the Confirm Password input field validation details
Then check with the Contact number input field validation details
And check with the Role selection input field validations
And check with the Final assessment done by input field validation
Then check with the Reporting manager selection input field validations
And check with the L one manager selection input field validations
And check with the L two manager selection input field validations
Then check with the Employee code input validation details
And check with the State selection dropdown input details
Then check with the Cluster selection dropdown input details
And check with the select office type option details
And check with the click on the Save action button 