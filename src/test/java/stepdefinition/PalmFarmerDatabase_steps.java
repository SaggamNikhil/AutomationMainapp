package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PalmFarmerDatabase;

public class PalmFarmerDatabase_steps {
	
	PalmFarmerDatabase PalmFarmerDatabase = new PalmFarmerDatabase();
	@Given("^User login with respective roles$")
	public void User_login_with_respective_roles() throws Throwable {
		PalmFarmerDatabase.User_login_with_respective_roles();
	}
	@Then("^The System Navigate to the Dashboard screen$")
	public void The_System_Navigate_to_the_Dashboard_screen() throws Throwable {
		PalmFarmerDatabase.The_System_Navigate_to_the_Dashboard_screen();
	}
	@When("^click on the module of snapshot$")
	public void click_on_the_module_of_snapshot() throws Throwable {
		PalmFarmerDatabase.click_on_the_module_of_snapshot();
	}
	@Then ("^Click on the PalmFarmerDatabase screen$")
	public void Click_on_the_PalmFarmerDatabase_screen() throws Throwable {
		PalmFarmerDatabase.Click_on_the_PalmFarmerDatabase_screen ();
	}
	@When ("^the user update from date format$")
	public void the_user_update_from_date_format() throws Throwable {
		PalmFarmerDatabase.the_user_update_from_date_format();
	}
	@And ("^user click on the search action button$")
	public void click_on_the_search_action_button () throws Throwable {
		PalmFarmerDatabase.click_on_the_search_action_button ();
	}
	@Then ("^Select Farmer from PalmFarmerDatbase screen$")
	public void Select_Farmer_from_PalmFarmerDatbase_screen() throws Throwable {
		PalmFarmerDatabase.Select_Farmer_from_PalmFarmerDatbase_screen();
		}
	@And ("^Click on the Edit button from the Grid$")
	public void Click_on_the_Edit_button_from_the_Grid() throws Throwable {
		PalmFarmerDatabase.Click_on_the_Edit_button_from_the_Grid ();	
	}
	@And("^checks the FirstName update$")
	public void checks_the_FirstName_update() throws Throwable{
		PalmFarmerDatabase.checks_the_FirstName_update();
	
	}
	@And ("^checks the LastName update$")
	public void checks_the_LastName_update() throws Throwable{
		PalmFarmerDatabase.checks_the_LastName_update();
}
	@And ("^checks the Father name update$")
	public void checks_the_Father_name_update() throws Throwable{
		PalmFarmerDatabase.checks_the_Father_name_update();
}
	@And ("^checks the Date of Birth update$")
	public void checks_the_Date_of_Birth_update() throws Throwable{
		PalmFarmerDatabase.checks_the_Date_of_Birth_update();
}
	@And ("^updates the address details$")
	public void updates_the_address_details () throws Throwable {
		PalmFarmerDatabase.updates_the_address_details ();
	}
	@And ("^updates the address2 details$")
	public void updates_the_address2_details () throws Throwable {
		PalmFarmerDatabase.updates_the_address2_details ();
	}
	@And ("^updates the State selection$")
	public void updates_the_State_details () throws Throwable {
		PalmFarmerDatabase.updates_the_State_details ();
}
	@And ("^updates the District selection$")
	public void updates_the_District_selection () throws Throwable {
		PalmFarmerDatabase.updates_the_District_selection ();
	}
	@And ("^updates the Mandal selection$")
	public void updates_the_Mandal_selection () throws Throwable {
		PalmFarmerDatabase.updates_the_Mandal_selection ();
}
	@And ("^updates the village selection$")
	public void updates_the_village_selection () throws Throwable {
		PalmFarmerDatabase.updates_the_village_selection ();
}
	@And ("^updates the mobile number details$")
	public void updates_the_mobile_number_selection () throws Throwable {
		PalmFarmerDatabase.updates_the_mobile_number_selection ();
}
	@And ("^updates the Source of contact selection$")
	public void updates_the_Source_of_contact_selection () throws Throwable {
		PalmFarmerDatabase.updates_the_Source_of_contact_selection ();
}
	@And ("^updates the Category option details$")
	public void updates_the_Category_option_details () throws Throwable {
		PalmFarmerDatabase.updates_the_Category_option_details ();
	}
	@And ("^updates the Annual income details$")
	public void updates_the_Annual_income_details () throws Throwable {
		PalmFarmerDatabase.updates_the_Annual_income_details ();
}
	@And ("^updates the Education details$")
	public void updates_the_Education_details () throws Throwable {
		PalmFarmerDatabase.updates_the_Education_details ();
}
	@And ("^updates the farmer Img$")
	public void updates_the_farmer_Img() throws Throwable {
			PalmFarmerDatabase.updates_the_farmer_Img ();
}
	@And ("^clicks the Save button$")
	public void clicks_the_Save_button() throws Throwable {
		PalmFarmerDatabase.clicks_the_Save_button ();
}
	@When ("^User update Identity proof grid details$")
	public void User_update_Identity_proof_grid_details() throws Throwable {
		PalmFarmerDatabase.User_update_Identity_proof_grid_details ();
}
	@ Then ("^User Update Account Details grid$")
	public void User_Update_Account_Details_grid() throws Throwable {
		PalmFarmerDatabase.User_Update_Account_Details_grid ();
}
	@ And ("^Click on the button Update$")
	public void Click_on_the_button_Update() throws Throwable {
		PalmFarmerDatabase.Click_on_the_button_Update ();
    }
	@And ("^Verify with the Select location type$")
	public void Verify_with_the_Select_location_type() throws Throwable {
		PalmFarmerDatabase.Verify_with_the_Select_location_type ();
		
	}
	@And ("^check with the state selection type$")
	public void check_with_the_state_selection_type () throws Throwable {
		PalmFarmerDatabase.check_with_the_state_selection_type ();
	}
	@And ("^check with the District selection type$")
	public void check_with_the_District_selection_type () throws Throwable {
		PalmFarmerDatabase.check_with_the_District_selection_type ();
	}
	@Then ("^check with the Mandal selection type$")
	public void check_with_the_Mandal_selection_type() throws Throwable {
		PalmFarmerDatabase.check_with_the_Mandal_selection_type ();
	}
	@And ("^check with the Village selection type$")
	public void check_with_the_Village_selection_type() throws Throwable {
		PalmFarmerDatabase.check_with_the_Village_selection_type ();
	}
	@Then ("^check with the from date validations$")
	public void check_with_the_from_date_validations() throws Throwable {
		PalmFarmerDatabase.check_with_the_from_date_validations();
	}
	@And ("^check with the Search button click$")
	public void check_with_the_Search_button_click() throws Throwable {
		PalmFarmerDatabase.check_with_the_Search_button_click();
	}
	@Then ("^Select Farmer from the grid screen$")
	public void Select_Farmer_from_the_grid_screen() throws Throwable {
		PalmFarmerDatabase.Select_Farmer_from_the_grid_screen ();
}
	@And ("^Click on the Edit details action button$")
	public void Click_on_the_Edit_details_action_button()throws Throwable {
		PalmFarmerDatabase.Click_on_the_Edit_details_action_button();
	}
	@And ("^Check with the Farmer First name Validations$")
	public void Check_with_the_Farmer_First_name_Validations() throws Throwable {
		PalmFarmerDatabase.Check_with_the_Farmer_First_name_Validations();
	}
	@Then ("^check with the farmer Last name validations$")
	public void check_with_the_farmer_Last_name_validations() throws Throwable {
		PalmFarmerDatabase.check_with_the_farmer_Last_name_validations ();
	}
	@And ("^check with the Farmer Father name Validations$")
	public void check_with_the_Farmer_Father_name_Validations() throws Throwable{
		PalmFarmerDatabase.check_with_the_Farmer_Father_name_Validations ();
	}
	@And ("^check with the Age validations$")
	public void check_with_the_Age_validations () throws Throwable {
		PalmFarmerDatabase.check_with_the_Age_validations();
	}
	@Then ("^check with the Address validations$")
	public void check_with_the_Address_validations() throws Throwable {
		PalmFarmerDatabase.check_with_the_Address_validations();
	}
	@And ("^check with the Address two validations$")
	public void check_with_the_Address_two_validations() throws Throwable{
		PalmFarmerDatabase.check_with_the_Address_two_validations ();
	}
	@And ("^Check with the State dropdown validations$")
	public void Check_with_the_State_dropdown_validations() throws Throwable {
		PalmFarmerDatabase.Check_with_the_State_dropdown_validations();
	}
	@And ("^Check with the District dropdown validations$")
	public void Check_with_the_District_dropdown_validations()throws Throwable {
		PalmFarmerDatabase.Check_with_the_District_dropdown_validations();
	}
	@Then ("^Check with the Mandal dropdown validations$")
	public void Check_with_the_Mandal_dropdown_validations()throws Throwable {
		PalmFarmerDatabase.Check_with_the_Mandal_dropdown_validations();
	}
	@And ("^Check with the Village dropdown validations$")
	public void Check_with_the_Village_dropdown_validations() throws Throwable {
		PalmFarmerDatabase.Check_with_the_Village_dropdown_validations();
	}
	@And ("^check with the Mobile number input validations$")
	public void check_with_the_Mobile_number_input_validations()throws Throwable{
		PalmFarmerDatabase.check_with_the_Mobile_number_input_validations();
	}
	@Then ("^check with the Source of contact dropdown validations$")
	public void check_with_the_Source_of_contact_dropdown_validations() throws Throwable {
		PalmFarmerDatabase.check_with_the_Source_of_contact_dropdown_validations();
	}
	@And ("^check with the Image validations$")
	public void check_with_the_Image_validations() throws Throwable {
		PalmFarmerDatabase.check_with_the_Image_validations();
	}
	@Then ("^check with the save button$")
	public void check_with_the_save_button() throws Throwable {
		PalmFarmerDatabase.check_with_the_save_button ();
	}
	@And ("^check with Identity proof Edit validations$")
	public void check_with_Identity_proof_Edit_validations () throws Throwable {
		PalmFarmerDatabase.check_with_Identity_proof_Edit_validations();
	}
	@And ("^check with the Identity details Update$")
	public void check_with_the_Identity_details_Update() throws Throwable {
		PalmFarmerDatabase.check_with_the_Identity_details_Update();
	}
	@Then ("^check with the Bank details validations$")
	public void check_with_the_Bank_details_validations() throws Throwable {
		PalmFarmerDatabase.check_with_the_Bank_details_validations();
	}
	@And ("^check with the Account Number input validations$")
	public void check_with_the_Account_Number_input_validations() throws Throwable {
		PalmFarmerDatabase.check_with_the_Account_Number_input_validations();
	}
	@And ("^check with the Account Name input validations$")
	public void check_with_the_Account_Name_input_validations() throws Throwable{
		PalmFarmerDatabase.check_with_the_Account_Name_input_validations();
	}
	@And ("^check with the Ifsc code dropdown sel validations$")
	public void check_with_the_Ifsc_code_dropdown_sel_validations() throws Throwable {
		PalmFarmerDatabase.check_with_the_Ifsc_code_dropdown_sel_validations();
	}
	@Then ("^check with the Bank upload image update$")
	public void check_with_the_Bank_upload_image_update() throws Throwable {
		PalmFarmerDatabase.check_with_the_Bank_upload_image_update();
	}
	@And ("^check with click on the update button$")
	public void check_with_click_on_the_update_button() throws Throwable {
		PalmFarmerDatabase.check_with_click_on_the_update_button();
	}
}