
@OilPalm_Requirement
Feature: feature to test Modules functionality
@Geoboundaries_done_smoke1
Scenario Outline: User navigates to Login page
Given the users has entered"<username>"
And the users has entered1"<password>"
And  User click on the LogIn 
Then Users navigated to the home page
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |

@Geoboundaries_Done_smoke2
Scenario Outline: Navigated to the Activities Screen
Given the users has entered"<username>"
And the users has entered1"<password>"
And  User click on the LogIn 
Then Users navigated to the home page
Then Click on the Activities module main menus
Examples: 
      | username | password | 
      | admin    | P@ssw0rd |
      
@Geoboundaries_Done_Smoke3
Scenario Outline: Navigated to the Geoboundaries Done Plots Menu
Given the users has entered"<username>"
And the users has entered1"<password>"
And  User click on the LogIn 
Then Users navigated to the home page
Then Click on the Activities module main menu
And click on the Geo Boundaries Done Plots menu
Examples: 
      | username | password | 
      | admin    | P@ssw0rd |
      
@Geoboundaries_Done_Data1
Scenario Outline: Filter data with Geo location Type wise
Given the users has entered"<username>"
And the users has entered1"<password>"
And  User click on the LogIn 
Then Users navigated to the home page
Then Click on the Activities module main menus
And click on the Geo Boundaries Done Plots menu
Then Check with the Select Location details  
Examples: 
      | username | password | 
      | admin    | P@ssw0rd |
      
@Geoboundaries_Done_Data2
Scenario Outline: Select States From the Active grid details
Given the users has entered"<username>"
And the users has entered1"<password>"
And  User click on the LogIn 
Then Users navigated to the home page
Then Click on the Activities module main menus
And click on the Geo Boundaries Done Plots menu
Then Check with the Select Location details  
And Check with the Select States from the Geoboundaries Done Plots screen 
Examples: 
      | username | password | 
      | admin    | P@ssw0rd |
      
@Geoboundaries_Done_Data3
Scenario Outline: Select Districts From the Active grid details
Given the users has entered"<username>"
And the users has entered1"<password>"
And  User click on the LogIn 
Then Users navigated to the home page
Then Click on the Activities module main menus
And click on the Geo Boundaries Done Plots menu
Then Check with the Select Location details  
And Check with the Select States from the Geoboundaries Done Plots screen 
And Check with the Select Districts from the Geoboundaries Done Plots screen
Examples: 
      | username | password | 
      | admin    | P@ssw0rd |
      
@Geoboundaries_Done_Data4
Scenario Outline: Select Mandals from the Active grid details
Given the users has entered"<username>"
And the users has entered1"<password>"
And  User click on the LogIn 
Then Users navigated to the home page
Then Click on the Activities module main menus
And click on the Geo Boundaries Done Plots menu
Then Check with the Select Location details  
And Check with the Select States from the Geoboundaries Done Plots screen 
And Check with the Select Districts from the Geoboundaries Done Plots screen
And Check with the Select Mandals from the Geoboundaries Done plots screen
Examples: 
      | username | password | 
      | admin    | P@ssw0rd |
      

@GeoBoundaries_Done_Data5
Scenario Outline: Select Villages from the Active grid details
Given the users has entered"<username>"
And the users has entered1"<password>"
And  User click on the LogIn 
Then Users navigated to the home page
Then Click on the Activities module main menus
And click on the Geo Boundaries Done Plots menu
Then Check with the Select Location details  
And Check with the Select States from the Geoboundaries Done Plots screen 
And Check with the Select Districts from the Geoboundaries Done Plots screen
And Check with the Select Mandals from the Geoboundaries Done plots screen
And Check with the Select Villages from the Geoboundaries Done plots screen
Examples: 
      | username | password | 
      | admin    | P@ssw0rd |
      
@GeoBoundaries_Done_Data6
Scenario Outline: Check with the Clicking on the Search button
Given the users has entered"<username>"
And the users has entered1"<password>"
And User click on the LogIn
Then Users navigated to the home page
Then Click on the Activities module main menus
And click on the Geo Boundaries Done Plots menu
Then Check with the Select Location details  
And Check with the Select States from the Geoboundaries Done Plots screen 
And Check with the Select Districts from the Geoboundaries Done Plots screen
And Check with the Select Mandals from the Geoboundaries Done plots screen
And Check with the Select Villages from the Geoboundaries Done plots screen
Then Check with the Clicking on the Search button
Examples: 
      | username | password | 
      | admin    | P@ssw0rd |
      
@GeoBoundaries_Done_Data7
Scenario Outline: Check with the Data between From date and Todate
Given the users has entered"<username>"
And the users has entered1"<password>"
And User click on the LogIn
Then Users navigated to the home page
Then Click on the Activities module main menus
And click on the Geo Boundaries Done Plots menu
Then Check with the From date selection from the Active grid
Then Check with the Clicking on the Search button
Examples: 
      | username | password | 
      | admin    | P@ssw0rd |
      
@GeoBoundaries_Done_Data8
Scenario Outline: Verify the All documents submiited correct or not 
Given the users has entered"<username>"
And the users has entered1"<password>"
And User click on the LogIn
Then Users navigated to the home page
Then Click on the Activities module main menus
And click on the Geo Boundaries Done Plots menu
Then Check with the From date selection from the Active grid
Then Check with the Clicking on the Search button
And Check with the All Documents Submitted checkbox selection
And check with the Bank details Confirmation popup window
Examples: 
      | username | password | 
      | admin    | P@ssw0rd |
      
@GeoBoundaries_Done_Data9
Scenario Outline: Verify the All documents submiited correct or not 
Given the users has entered"<username>"
And the users has entered1"<password>"
And User click on the LogIn
Then Users navigated to the home page
Then Click on the Activities module main menus
And click on the Geo Boundaries Done Plots menu
Then Check with the From date selection from the Active grid
Then Check with the Clicking on the Search button
And Check with the All Documents Submitted checkbox selection
And check with the Bank details Confirmation popup window
And check with the All details correct or not checkbox input
Examples: 
      | username | password | 
      | admin    | P@ssw0rd |

@GeoBoundaries_Done_Data10
Scenario Outline: Verify the Geo Boundaries verification Details 
Given the users has entered"<username>"
And the users has entered1"<password>"
And User click on the LogIn
Then Users navigated to the home page
Then Click on the Activities module main menus
And click on the Geo Boundaries Done Plots menu
Then Check with the From date selection from the Active grid
Then Check with the Clicking on the Search button
And check with the All details correct or not checkbox input
And check with the Geo Boundaries verification Checkbox input
Examples: 
      | username | password | 
      | admin    | P@ssw0rd |    

@GeoBoundaries_Done_Data11
Scenario Outline: Verify confirmation from the actions
Given the users has entered"<username>"
And the users has entered1"<password>"
And User click on the LogIn
Then Users navigated to the home page
Then Click on the Activities module main menus
And click on the Geo Boundaries Done Plots menu
Then Check with the From date selection from the Active grid
Then Check with the Clicking on the Search button
And check with the verify action confirmation
Examples: 
      | username | password | 
      | admin    | P@ssw0rd | 