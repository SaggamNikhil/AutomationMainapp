@OilPalm_Requirement
Feature: feature to test Modules functionality
@UnderPlanting_smoke1
Scenario Outline: User navigates to Login page
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |

@UnderPlanting_smoke2
Scenario Outline: User navigates to Activities menu screen
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |
      
@UnderPlanting_smoke3
Scenario Outline: User navigates to Underplanting menu screen
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |
      
@UnderPlanting_Data1
Scenario Outline: Check with the Select Location type wise active grid screen
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen
Then check with the Select location type wise details
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |
      
@UnderPlanting_Data2
Scenario Outline: Check with the Select State type wise active grid screen
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen
Then check with the Select location type wise details
And check with the Select State selection wise details
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |

@UnderPlanting_Data3
Scenario Outline: Check with the Select District type wise active grid screen
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen
Then check with the Select location type wise details
And check with the Select State selection wise details
And check with the Select District wise details
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |      
 
@UnderPlanting_Data4
Scenario Outline: Check with the Select Mandal type wise active grid screen
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen
Then check with the Select location type wise details
And check with the Select State selection wise details
And check with the Select District wise details
And check with the Select Mandal wise details 
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd | 
      
@UnderPlanting_Data5
Scenario Outline: Check with the Select Villages type wise active grid screen
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen
Then check with the Select location type wise details
And check with the Select State selection wise details
And check with the Select District wise details
And check with the Select Mandal wise details 
And check with the Select Villages wise details 
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd | 

@UnderPlanting_Data6
Scenario Outline: Check with the Select from date from the active grid screen
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen
Then check with the Select location type wise details
And check with the Select State selection wise details
And check with the Select District wise details
And check with the Select Mandal wise details 
And check with the Select Villages wise details
Then check with the From date selection validations details  
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd | 
      
@UnderPlanting_Data7
Scenario Outline: Check with the Search button data results
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen
Then check with the Select location type wise details
And check with the Select State selection wise details
And check with the Select District wise details
And check with the Select Mandal wise details 
And check with the Select Villages wise details 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd | 
      
@UnderPlanting_Data8
Scenario Outline: Verify data from date and Todate wise
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd | 

@UnderPlanting_Data9
Scenario Outline: verify with the Initiate Underplantig action button
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd | 

@UnderPlanting_Data10
Scenario Outline: verify with the Initiate Underplantig action button
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |    
      
@UnderPlanting_Data11
Scenario Outline: Verify with the Select plot from the underplanting screen
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
And check with the Select plot from the underplanting screen
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |
      
@UnderPlanting_Data12
Scenario Outline: Verify with the plot details by Total plot area input details
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
And check with the Select plot from the underplanting screen
Then check with the plot details by Total Plot area ip details 
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |   
      
@UnderPlanting_Data13
Scenario Outline: Verify with the plot details by Total palm area input details
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
And check with the Select plot from the underplanting screen
Then check with the plot details by Total Plot area ip details
And check with the Plot details by Total Plam area ip details 
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |   

@UnderPlanting_Data14
Scenario Outline: Verify with the Expected month of UnderPlanting tress Date selection
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
And check with the Select plot from the underplanting screen
Then check with the plot details by Total Plot area ip details
And check with the Plot details by Total Plam area ip details 
Then check with the Expected month of Underplanting tress Date selection  
 Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |  
      
@UnderPlanting_Data15
Scenario Outline: Check with the Address Details data 
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
And check with the Select plot from the underplanting screen
Then check with the plot details by Total Plot area ip details
And check with the Plot details by Total Plam area ip details 
Then check with the Expected month of Underplanting tress Date selection  
And check with the Address one input details 
Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |  
      
@UnderPlanting_Data16
Scenario Outline: Check with the Landmark Details data 
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
And check with the Select plot from the underplanting screen
Then check with the plot details by Total Plot area ip details
And check with the Plot details by Total Plam area ip details 
Then check with the Expected month of Underplanting tress Date selection  
And check with the Address one input details 
Then check with the Landmark field input details 
Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |
      
@UnderPlanting_Data17
Scenario Outline: Verify with the Application form upload 
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
And check with the Select plot from the underplanting screen
Then check with the plot details by Total Plot area ip details
And check with the Plot details by Total Plam area ip details 
Then check with the Expected month of Underplanting tress Date selection  
And check with the Address one input details 
Then check with the Landmark field input details 
And check with the file upload application for underplanting
Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |

@UnderPlanting_Data18
Scenario Outline: Verify with the Underplanting reason
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
And check with the Select plot from the underplanting screen
Then check with the plot details by Total Plot area ip details
And check with the Plot details by Total Plam area ip details 
Then check with the Expected month of Underplanting tress Date selection  
And check with the Address one input details 
Then check with the Landmark field input details 
And check with the file upload application for underplanting
Then check with the Underplanting reason dropdown selection 
Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |
      
@UnderPlanting_Data19
Scenario Outline: Verify with the Approx height of current tress details
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
And check with the Select plot from the underplanting screen
Then check with the plot details by Total Plot area ip details
And check with the Plot details by Total Plam area ip details 
Then check with the Expected month of Underplanting tress Date selection  
And check with the Address one input details 
Then check with the Landmark field input details 
And check with the file upload application for underplanting
Then check with the Underplanting reason dropdown selection 
And check with the Approx height of current tress details 
Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |
      
@UnderPlanting_Data20
Scenario Outline: Verify with the Harvesting method details
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
And check with the Select plot from the underplanting screen
Then check with the plot details by Total Plot area ip details
And check with the Plot details by Total Plam area ip details 
Then check with the Expected month of Underplanting tress Date selection  
And check with the Address one input details 
Then check with the Landmark field input details 
And check with the file upload application for underplanting
Then check with the Underplanting reason dropdown selection 
And check with the Approx height of current tress details 
And check with the Harvesting method dropdown selection details
Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |
      
@UnderPlanting_Data21
Scenario Outline: Verify with the Plan for uprooting current Plantation details
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
And check with the Select plot from the underplanting screen
Then check with the plot details by Total Plot area ip details
And check with the Plot details by Total Plam area ip details 
Then check with the Expected month of Underplanting tress Date selection  
And check with the Address one input details 
Then check with the Landmark field input details 
And check with the file upload application for underplanting
Then check with the Underplanting reason dropdown selection 
And check with the Approx height of current tress details 
And check with the Harvesting method dropdown selection details
And check with the Plan for uprooting current plantation details
Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |

@UnderPlanting_Data22
Scenario Outline: Verify with the Plan for uprooting current Plantation details
Given the user has entered a"<username>"
And the user has entered1 a"<password>"
And  User click on the LogIn button 
Then the User navigated to the home page
Then click on the dashoboard menu as Activities
And click on the Underplanting menu screen 
Then check with the From date selection validations details 
Then check with the Click on the search button from the Underplanting screen
And check with the Click on the Initiate Underplanting action button 
Then Check with the Select Farmer search input details
And check with the Select plot from the underplanting screen
Then check with the plot details by Total Plot area ip details
And check with the Plot details by Total Plam area ip details 
Then check with the Expected month of Underplanting tress Date selection  
And check with the Address one input details 
Then check with the Landmark field input details 
And check with the file upload application for underplanting
Then check with the Underplanting reason dropdown selection 
And check with the Approx height of current tress details 
And check with the Harvesting method dropdown selection details
And check with the Plan for uprooting current plantation details
And Check with the Clicking on the Save butoon details
Examples: 
      | username  | password | 
      | Admin     | P@ssw0rd |