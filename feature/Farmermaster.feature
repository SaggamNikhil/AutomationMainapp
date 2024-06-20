@OilPalm_Requirement
Feature: Farmer master screen functionality
@Farmer_master
 Scenario: Login page with valid data
  Given User is on login page nav
  When User enters username and password
  And Clicks on login button
  Then Click on the Otp opt submit button
  Then Navigate to the Dashboard home screen
  
  @Farmer_master
  Scenario: Navigated to the to the farmer master screen 
  Given User is on login page nav
  When User enters username and password
  And Clicks on login button
  Then Click on the Otp opt submit button
  Then Navigate to the Dashboard home screen
  When user click on the snapshot module name
  Then Click on the Farmermaster screen
  
  @Farmer_master
  Scenario: Filter with location details 
  Given User is on login page nav
  When User enters username and password
  And Clicks on login button
  Then Click on the Otp opt submit button
  Then Navigate to the Dashboard home screen
  When user click on the snapshot module name
  Then Click on the Farmermaster screen
  And Click on the Search button
  
  @Farmer_master
  Scenario: Update Farmer details by personal details
  Given User is on login page nav
  When User enters username and password
  And Clicks on login button
  Then Click on the Otp opt submit button
  Then Navigate to the Dashboard home screen
  When user click on the snapshot module name
  Then Click on the Farmermaster screen
  And Click on the Search button
  And Check with Farmer Edit button click
  When User able firstname update details
  And Update with Lastname details 
  Given User enters input for Fathername
  And Enter Manual inputs in dateofbirth field
  Then Update with Address1 details
  And Update with Address2 details 
  Then Update with Landmark details
  And Update with State selection 
  Then Update With District Selection
  And Update With Mandal Selection
  Given User update with Village details
  When User Update Contact number details 
  Then Update with source of contact
  And Update With Category details
  Then modify with Annual income
  When User update with Eduction details
  Then Check with Img sel
  And Click on save button
  
  @Farmer_Master
  Scenario: Add or Update Identity proof details 
  Given User is on login page nav
  When User enters username and password
  And Clicks on login button
  Then Click on the Otp opt submit button
  Then Navigate to the Dashboard home screen
  When user click on the snapshot module name
  Then Click on the Farmermaster screen
  And Click on the Search button
  And Check with Farmer Edit button click
  When User able firstname update details
  And Update with Lastname details 
  Given User enters input for Fathername
  And Enter Manual inputs in dateofbirth field
  Then Update with Address1 details
  And Update with Address2 details 
  Then Update with Landmark details
  And Update with State selection 
  Then Update With District Selection
  And Update With Mandal Selection
  Given User update with Village details
  When User Update Contact number details 
  Then Update with source of contact
  And Update With Category details
  Then modify with Annual income
  When User update with Eduction details
  Then Check with Img sel
  And Click on save button
   Given User update IdentityProof 
  Then Enter aadhar number details 
  And Click on the Submit button
  
  @Farmer_Master
  Scenario: Add or Update Farmer Bank details 
  Given User is on login page nav
  When User enters username and password
  And Clicks on login button
  Then Click on the Otp opt submit button
  Then Navigate to the Dashboard home screen
  When user click on the snapshot module name
  Then Click on the Farmermaster screen
  And Click on the Search button
  And Check with Farmer Edit button click
  When User able firstname update details
  And Update with Lastname details 
  Given User enters input for Fathername
  And Enter Manual inputs in dateofbirth field
  Then Update with Address1 details
  And Update with Address2 details 
  Then Update with Landmark details
  And Update with State selection 
  Then Update With District Selection
  And Update With Mandal Selection
  Given User update with Village details
  When User Update Contact number details 
  Then Update with source of contact
  And Update With Category details
  Then modify with Annual income
  When User update with Eduction details
  Then Check with Img sel
  And Click on save button
  Given User update IdentityProof 
  Then Enter aadhar number details 
  And Click on the Submit button
  When Click on the Bank update details 
  Then Update account number input field
  And Update with Account name input field
  Then Check with Ifsc code
  Given user update with Bankimage
  And Click on the Update button
   
  @Farmer_Master
  Scenario: Check with the Farmer master grid validations
  Given User is on login page nav
  Then Check with Invalid Username and valid password
  And Clicks on the login button
  Then Click on the Otp opt submit button
  Then login with Valid credentials
  And Navigate to the Dashboard page
  When user click on the module snapshot
  Then Click on the Farmermaster submodule
  And user select location from the grid page
  Then select State from Dropdown option
  And click on the District Select option
  Then check with the Mandal select
  And check with the Village select
  And Check with the fromdate update
  Then Select Date from the Calender view
  Then Select farmer from the grid
  And click on the Edit action button
  And check personal details with Validations
  Then check with Father name validations
  And check with Age details validation
  And Check with address details Validations
  And Check with Address2 details validations
  Then check with State details validations
  And check with District details validations 
  And check with Mandal details validations
  Then check with Village details validations
  And check with Mobileno details validations 
  Then check with Identityproof Validations
  Then click on the Cancel action button 
  And check with the Bank update validations
  Then check with account no validations
  And check with Accountholder name validations
  And check with Ifsc code field validations
  Then click on the cancel button from updatedetails