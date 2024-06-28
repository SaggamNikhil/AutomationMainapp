@OilPalm_Requirement
Feature: feature to test Modules functionality
@SetPlantation_category_smoke1
Scenario Outline: User navigates to Login page
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |
      
@SetPlantation_category_smoke2
Scenario Outline: Navigated to the Activities Screen
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |
      
@SetPlantation_category_smoke3
Scenario Outline: Navigated to the Geoboundaries Done Plots Menu
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
And click on the Setplantation category screen
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |
      
@SetPlantation_category_Data1
Scenario Outline: Check with the Select Financial year data
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
And click on the Setplantation category screen
Then check with the Select financial year wise data
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |
      
      
@SetPlantation_category_Data2
Scenario Outline: Check with the Select location type details data
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
And click on the Setplantation category screen
Then check with the Select financial year wise data
And check with the Select location type from the Active grid data details
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |
      
@SetPlantation_category_Data3
Scenario Outline: Check with the Select Sates type details data
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
And click on the Setplantation category screen
Then check with the Select financial year wise data
And check with the Select location type from the Active grid data details
And check with the Select States from the Dropdown list data details
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |

@SetPlantation_category_Data4
Scenario Outline: Check with the Select District type details data
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
And click on the Setplantation category screen
Then check with the Select financial year wise data
And check with the Select location type from the Active grid data details
And check with the Select States from the Dropdown list data details
And check with the Select Districts from the Dropdowm list data details
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |

@SetPlantation_category_Data4
Scenario Outline: Check with the Select Mandal type details data
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
And click on the Setplantation category screen
Then check with the Select financial year wise data
And check with the Select location type from the Active grid data details
And check with the Select States from the Dropdown list data details
And check with the Select Districts from the Dropdowm list data details
And check with the Select Mandal from the Dropdown list data details
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |
      
@SetPlantation_category_Data5
Scenario Outline: Check with the Select Villages type details data
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
And click on the Setplantation category screen
Then check with the Select financial year wise data
And check with the Select location type from the Active grid data details
And check with the Select States from the Dropdown list data details
And check with the Select Districts from the Dropdowm list data details
And check with the Select Mandal from the Dropdown list data details
And check with the Select Villages from the Dropdown list data details 
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |
      
@SetPlantation_category_Data6
Scenario Outline: Check with the Clicking on the Search button results
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
And click on the Setplantation category screen
Then check with the Select financial year wise data
And check with the Select location type from the Active grid data details
And check with the Select States from the Dropdown list data details
And check with the Select Districts from the Dropdowm list data details
And check with the Select Mandal from the Dropdown list data details
And check with the Select Villages from the Dropdown list data details 
Then check with the clicking on the search button results
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |
      
      
@SetPlantation_category_Data6
Scenario Outline: Check with the Clicking on the Add plantation category button
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
And click on the Setplantation category screen
Then check with the Select financial year wise data
When click on the Add plantation category button
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |
      
@SetPlantation_category_Data7
Scenario Outline: Check with the Comments input details
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
And click on the Setplantation category screen
Then check with the Select financial year wise data
When click on the Add plantation category button
Then check with the Comments Input details 
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |
      
@SetPlantation_category_Data8
Scenario Outline: Check with the save input details
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
And click on the Setplantation category screen
Then check with the Select financial year wise data
When click on the Add plantation category button
Then check with the Comments Input details 
And check with the Save input details 
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |
     
      
@SetPlantation_category_Data9
Scenario Outline: Check with the View Category Comments input details
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
Then Click on the Activities module main menu
And click on the Setplantation category screen
Then check with the Select financial year wise data
When click on the Add plantation category button
Then check with the Comments Input details 
And check with the Save input details 
Then check with the View Plantation category Comments input details
Examples: 
      | username | password | 
      | Admin    | P@ssw0rd |