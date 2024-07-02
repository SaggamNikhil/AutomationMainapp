@OilPalm_Requirement
Feature: feature to test Modules functionality
@Nursery_farmer_reg_smoke1
Scenario Outline: User navigates to Dashboard Screen
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page 
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_smoke2
Scenario Outline: User navigates to Activities Screen
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_smoke3
Scenario Outline: User navigates to New Nursery farmer registration Screen
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data1
Scenario Outline: User check with the Type selection from the Dropdown field
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data2
Scenario Outline: User check with the Title selection from the Dropdown field
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data3
Scenario Outline: User check with  the First name input field validation
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data4
Scenario Outline: User check with the Last name input field validation
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
 
@Nursery_farmer_reg_data5
Scenario Outline: User check with the Father name input field validation
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
 
@Nursery_farmer_reg_data6
Scenario Outline: User check with the Age input field validation
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data7
Scenario Outline: User check with the Gender selection Dropdown input validation
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data8
Scenario Outline: User check with the Address one input field validations
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
  
@Nursery_farmer_reg_data9
Scenario Outline: User check with the Address one input field validations
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
And check with the Address two input field validations
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
      
@Nursery_farmer_reg_data10
Scenario Outline: User check with the Address one input field validations
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
And check with the Address two input field validations
Then check with State selection from the dropdown selections
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data11
Scenario Outline: User check with the State selection from the Dropdown field validations
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
And check with the Address two input field validations
Then check with State selection from the dropdown selections
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data12
Scenario Outline: User check with the District selection from the Dropdown field validations
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
And check with the Address two input field validations
Then check with State selection from the dropdown selections
And check with the District selection from the Dropdown selections
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data13
Scenario Outline: User check with the Mandal selection from the Dropdown field validations
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
And check with the Address two input field validations
Then check with State selection from the dropdown selections
And check with the District selection from the Dropdown selections
And check with the Mandal selection from the Dropdown selections
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data14
Scenario Outline: User check with the Village selection from the Dropdown field validations
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
And check with the Address two input field validations
Then check with State selection from the dropdown selections
And check with the District selection from the Dropdown selections
And check with the Mandal selection from the Dropdown selections
And check with the Village selection from the Dropdown selections
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |

@Nursery_farmer_reg_data15
Scenario Outline: User check with the Mobile Number Input field validations
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
And check with the Address two input field validations
Then check with State selection from the dropdown selections
And check with the District selection from the Dropdown selections
And check with the Mandal selection from the Dropdown selections
And check with the Village selection from the Dropdown selections
Then check with the Mobile number input field validation
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |

@Nursery_farmer_reg_data16
Scenario Outline: User check with the Source of contact Dropdown list selection
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
And check with the Address two input field validations
Then check with State selection from the dropdown selections
And check with the District selection from the Dropdown selections
And check with the Mandal selection from the Dropdown selections
And check with the Village selection from the Dropdown selections
Then check with the Mobile number input field validation
And check with  the Source of contact Drodown list selection
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data17
Scenario Outline: User check with the Source of contact Dropdown list selection
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
And check with the Address two input field validations
Then check with State selection from the dropdown selections
And check with the District selection from the Dropdown selections
And check with the Mandal selection from the Dropdown selections
And check with the Village selection from the Dropdown selections
Then check with the Mobile number input field validation
And check with  the Source of contact Drodown list selection
And check with the Category selection from the Dropdown list
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data18
Scenario Outline: User check with the Famer Reference image selection
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
And check with the Address two input field validations
Then check with State selection from the dropdown selections
And check with the District selection from the Dropdown selections
And check with the Mandal selection from the Dropdown selections
And check with the Village selection from the Dropdown selections
Then check with the Mobile number input field validation
And check with  the Source of contact Drodown list selection
And check with the Category selection from the Dropdown list
Then check with the Farmer Image upload from the source folder
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data19
Scenario Outline: User check with the Identity proof details validations
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
And check with the Address two input field validations
Then check with State selection from the dropdown selections
And check with the District selection from the Dropdown selections
And check with the Mandal selection from the Dropdown selections
And check with the Village selection from the Dropdown selections
Then check with the Mobile number input field validation
And check with  the Source of contact Drodown list selection
And check with the Category selection from the Dropdown list
Then check with the Farmer Image upload from the source folder
When check with click on the Add Identity proof details 
Then check with the Id proof number input validation
And check with the clicking on the save id details
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data20
Scenario Outline: User check with the Bank details validations
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Type selection from the Dropdown field
And check with the Title selection from the Dropdown field
And check with the First name input field validation
Then check with the Lastname input field validation
And check with the Father name input field validation
And check with the Age input field validation
Then check with the gender selection from the dropdown field
And check with the Address one input field validations
And check with the Address two input field validations
Then check with State selection from the dropdown selections
And check with the District selection from the Dropdown selections
And check with the Mandal selection from the Dropdown selections
And check with the Village selection from the Dropdown selections
Then check with the Mobile number input field validation
And check with  the Source of contact Drodown list selection
And check with the Category selection from the Dropdown list
Then check with the Farmer Image upload from the source folder
When check with click on the Add Identity proof details 
Then check with the Id proof number input validation
Then check with the Account Number field input details validation
And check with the clicking on the save id details
And check with the Account name field input details validation
And check with the Ifsc code details input details selection
And check with the Bank proof Image details Upload
Then check with the Save Bank details 
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Nursery_farmer_reg_data21
Scenario Outline: Verify with the Optional fields update and check save button Enabled or Disabled
Given the user has entered text a"<username>"
And the user has entered1 text a"<password>"
And  User In the page click on the LogIn button 
Then the User navigated to the dashboard of home page
Then check with the user click on the Activities screen 
And Check with the click on the Nursery Farmer registration screen
Then check with the Add Middle name input details 
And check with the Add Mother name input details
And check with the Add Address three input details
And check with the Add landmark input details
Then check with the Add Alter mobile number input details
And check with the Email input details validation
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      