@OilPalm_Requirements
Feature: feature to test navigation functionality

@Collection_farmer1
Scenario: navigated to the Collection Farmer master screen
  Given User login with admin role 
  Then Navigate to the Dashboard screen
  When click on the snapshot module name
  Then Click on the Collectionfarmer screen
  When the user update from date details 
  Given user click on the search button
  Then Select Farmer from Collectionfarmer screen
  And Click on the Edit button 
  Then Update Farmer FirstName and Lastname
  And Update with Father name details
  Then Update with Dateofbirth 
  When user update address details 
  And Update with State District Mandal village selection
  Given user update mobile number details 
  Then Update and select Source of contact
  And update Category option details 
  When user update Annual income details 
  Then select and modify Education details
  Given user update with farmer Img
  And Click on the Save button
  When User able to update aadhar with Edit button click
  Then Update Account Details grid 
  And Click on the Updatebank button
     
@Collection_grid_flow
Scenario: Verify with Farmer details Active grid
  Given User login with admin role 
  Then Navigate to the Dashboard screen
  When click on the snapshot module name
  Then Click on the Collectionfarmer screen
  When user select location from the grid
  Then select State from Dropdown
  And Select District from the dropdown
  Then Select Mandal from the Dropdown 
  Then Select Village from the Dropdown
  And Search with From date selection
  Then Click on the Search button view grid data
  And Check with Clear button perform
 
 @Collection_farmer_validations
 Scenario: Verify with Farmer details update
 Given User login with admin role 
  Then Navigate to the Dashboard screen
  When click on the snapshot module name
  Then Click on the Collectionfarmer screen
  When the user update from date details 
  Given user click on the search button
  Then Select Farmer from Collectionfarmer screen
  And Click on the Edit button 
  And check with Farmer First name validations
  And Check with Farmer Last name validations
  Then check with Farmer Father name validations
  And check with Farmer age validations
  And check with farmer address one validations
  And check with farmer address two validations
  Then Check with the Landmark validations
  And Check with the State modify validations
  And Check with the District modify validations
  Then Check with the Mandal modify validations
  And Check with the Village modify validations
  Then Check with the Mobile number Validations
  And check with the Source of contact validations
  Then check with the Category selection validations
  And Check with the Annual Income selection validations
  And check with the Education selection validations
  Given user update with farmer Img validations
  And check with the Save button validations
  And Check with the Add Identity proof validations
  And Check with the Identity proof name validations
  Then check with the Save form
  And Click on the Bank info validations
  Then check with the account number validations
  And check with the Account holder name validations
  And check with the Ifsc code validations
  Then check with the Bank img selection
  And check with the update button click
  
  
  