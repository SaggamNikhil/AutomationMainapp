@OilPalm_Requirement
Feature: feature to test Modules functionality
@Gap_Filling_smoke1
Scenario Outline: User navigates to Dashboard Screen
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details 
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_smoke2
Scenario Outline: User navigates to Activities Menu Screen
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_smoke3
Scenario Outline: User navigates to Gap filing Menu Screen
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data1
Scenario Outline: Verify with the From date selection input details
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data2
Scenario Outline: Verify with the Search button details
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |

@Gap_Filling_Data3
Scenario Outline: Verify with the Navigated to the Initiate Gap filling screen
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data4
Scenario Outline: check with the Search farmer by using keywords
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data5
Scenario Outline: check with the Imported saplings To be Issued Input field details
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data6
Scenario Outline: check with the Indigenous saplings To be Issued Input field details
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details

 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data7
Scenario Outline: check with the Expected Date of Pickup details Update
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details
Then check with the Exp Date of Pickup input details validations

 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |      

@Gap_Filling_Data8
Scenario Outline: check with the Gap Filling Reason details input
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details
Then check with the Exp Date of Pickup input details validations
And check with the Gap filling Reason Details update
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data9
Scenario Outline: check with the Upload file input details
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details
Then check with the Exp Date of Pickup input details validations
And check with the Gap filling Reason Details update
Then check with the Upload file input details
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data10
Scenario Outline: check with the Save from details
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details
Then check with the Exp Date of Pickup input details validations
And check with the Gap filling Reason Details update
Then check with the Upload file input details
And check with the Save details from the Initiate gap filling
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data11
Scenario Outline: Verify with the gap fillings screen by Cluster manager Approvals
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details
Then check with the Exp Date of Pickup input details validations
And check with the Gap filling Reason Details update
Then check with the Upload file input details
And check with the Save details from the Initiate gap filling
Then check with the Gap filling screen by Cluster manager Approvals
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data12
Scenario Outline: Verify with the gap fillings screen by State head manager Approvals
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details
Then check with the Exp Date of Pickup input details validations
And check with the Gap filling Reason Details update
Then check with the Upload file input details
And check with the Save details from the Initiate gap filling
Then check with the Gap filling screen by Cluster manager Approvals
And check with the Gap filling screen by State head manager Approvals
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data13
Scenario Outline: Verify with the gap fillings screen by State head manager Approvals
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details
Then check with the Exp Date of Pickup input details validations
And check with the Gap filling Reason Details update
Then check with the Upload file input details
And check with the Save details from the Initiate gap filling
Then check with the Gap filling screen by Cluster manager Approvals
And check with the Gap filling screen by State head manager Approvals
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data14
Scenario Outline: Verify with the gap fillings screen by check with the Add gap filling advance details
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details
Then check with the Exp Date of Pickup input details validations
And check with the Gap filling Reason Details update
Then check with the Upload file input details
And check with the Save details from the Initiate gap filling
Then check with the Gap filling screen by Cluster manager Approvals
And check with the Gap filling screen by State head manager Approvals
Then check with the Add gap filling advance details 
And check with the Mode of Payement selection details
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data15
Scenario Outline: check with the Add gap Filling Advance details 
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details
Then check with the Exp Date of Pickup input details validations
And check with the Gap filling Reason Details update
Then check with the Upload file input details
And check with the Save details from the Initiate gap filling
Then check with the Gap filling screen by Cluster manager Approvals
And check with the Gap filling screen by State head manager Approvals
Then check with the Add gap filling advance details 
And check with the Mode of Payement selection details
And check with the No of imp saplings Amount Received for 
And check with the No of Indi saplings Amount received for
Then check with the Add Print button click
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |

@Gap_Filling_Data16
Scenario Outline: check with the Advance state head approvals
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details
Then check with the Exp Date of Pickup input details validations
And check with the Gap filling Reason Details update
Then check with the Upload file input details
And check with the Save details from the Initiate gap filling
Then check with the Gap filling screen by Cluster manager Approvals
And check with the Gap filling screen by State head manager Approvals
Then check with the Add gap filling advance details 
And check with the Mode of Payement selection details
And check with the No of imp saplings Amount Received for 
And check with the No of Indi saplings Amount received for
Then check with the Add Print button click
When click on the Advance state head approval
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data17
Scenario Outline: check with the Imported saplings in Add gap filing Nursery details
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details
Then check with the Exp Date of Pickup input details validations
And check with the Gap filling Reason Details update
Then check with the Upload file input details
And check with the Save details from the Initiate gap filling
Then check with the Gap filling screen by Cluster manager Approvals
And check with the Gap filling screen by State head manager Approvals
Then check with the Add gap filling advance details 
And check with the Mode of Payement selection details
And check with the No of imp saplings Amount Received for 
And check with the No of Indi saplings Amount received for
Then check with the Add Print button click
When click on the Advance state head approval
Then check with the Add gap filling Nursery details
And check with the Advance receipt number selection details
And check with the Variety option selection details
And check with the vendor option selection details
And check with the Imported saplings Issues Ip
And check with the Save imp details
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |
      
@Gap_Filling_Data18
Scenario Outline: check with the Indigenous saplings in Add gap filing Nursery details
Given the user has entered text an"<username>"
And the user has entered1 text an"<password>"
And User In the page click on the LogIn button input 
Then the User navigated to the dashboard of home page details
And check with the click on the Activities Menu screen
Then check with the Click on the Gapfilling menu screen
Then check with the From Date selection input details
When click on the search button
And check with the navigated to the Initiate gap filling screen
Then check with the Search farmer from the Initiate gap filling screen
And check with the Auto search farmer using keywords details
And check with the Imported Saplings To be Issued input field details
And check with the Indigenous Saplings To be Issued input field details
Then check with the Exp Date of Pickup input details validations
And check with the Gap filling Reason Details update
Then check with the Upload file input details
And check with the Save details from the Initiate gap filling
Then check with the Gap filling screen by Cluster manager Approvals
And check with the Gap filling screen by State head manager Approvals
Then check with the Add gap filling advance details 
And check with the Mode of Payement selection details
And check with the No of imp saplings Amount Received for 
And check with the No of Indi saplings Amount received for
Then check with the Add Print button click
When click on the Advance state head approval
Then check with the Add gap filling indi Nursery details
And check with the Advance receipt number selection details
And check with the Variety option selection details
And check with the vendor option selection details
And check with the Indigenous saplings Issues Ip
And check with the Save Indi details
 Examples: 
      | username  | password | 
      | admin     | P@ssw0rd |