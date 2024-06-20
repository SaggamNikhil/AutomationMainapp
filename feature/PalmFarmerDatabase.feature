@OilPalm_Requirements
Feature: feature to test navigation functionality

@Regression1
Scenario: Navigated to the PalmFarmerDatabase screen
  Given User login with respective roles 
  Then The System Navigate to the Dashboard screen
  When click on the module of snapshot
  Then Click on the PalmFarmerDatabase screen
  When the user update from date format 
  And user click on the search action button
  Then Select Farmer from PalmFarmerDatbase screen
  And Click on the Edit button from the Grid
  And checks the FirstName update
  And checks the LastName update
  And checks the Father name update
  And checks the Date of Birth update
  And updates the address details
  And updates the address2 details 
  And updates the State selection
  And updates the District selection
  And updates the Mandal selection
  And updates the village selection
  And updates the mobile number details
  And updates the Source of contact selection
  And updates the Category option details
  And updates the Annual income details
  And updates the Education details
  And updates the farmer Img
  And clicks the Save button
  When User update Identity proof grid details
  Then User Update Account Details grid 
  And Click on the button Update
 
 @Palmfarmerdatabase_validations
 Scenario: feature to test update and validations in PalmFarmerdatabase screen
  Given User login with respective roles 
  Then The System Navigate to the Dashboard screen
  When click on the module of snapshot
  Then Click on the PalmFarmerDatabase screen
  And Verify with the Select location type
  And check with the state selection type
  And check with the District selection type
  Then check with the Mandal selection type
  And check with the Village selection type
  Then check with the from date validations
  And check with the Search button click
  Then Select Farmer from the grid screen
  And Click on the Edit details action button
  And Check with the Farmer First name Validations
  Then check with the farmer Last name validations
  And check with the Farmer Father name Validations
  And check with the Age validations
  Then check with the Address validations
  And check with the Address two validations
  And Check with the State dropdown validations
  And Check with the District dropdown validations
  Then Check with the Mandal dropdown validations
  And Check with the Village dropdown validations
  And check with the Mobile number input validations
  Then check with the Source of contact dropdown validations
  And check with the Image validations
  Then check with the save button
  And check with Identity proof Edit validations
  And check with the Identity details Update
  Then check with the Bank details validations
  And check with the Account Number input validations
  And check with the Account Name input validations
  And check with the Ifsc code dropdown sel validations
  Then check with the Bank upload image update
  And check with click on the update button