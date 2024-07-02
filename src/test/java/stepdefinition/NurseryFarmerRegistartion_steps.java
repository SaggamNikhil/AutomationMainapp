package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NurseryFarmerRegistartion;

public class NurseryFarmerRegistartion_steps {
	NurseryFarmerRegistartion NurseryFarmerRegistartion = new NurseryFarmerRegistartion();
	
	@Given ("the user has entered text a{string}")
	public void the_user_has_entered_text_a(String username) throws Throwable {
		NurseryFarmerRegistartion.the_user_has_entered_text_a(username);
    }
	@And ("the user has entered1 text a{string}")
    public void the_user_has_entered1_text_a(String password) throws Throwable {
		NurseryFarmerRegistartion.the_user_has_entered1_text_a(password);
    }
	@And  ("^User In the page click on the LogIn button$")
	public void User_In_the_page_click_on_the_LogIn_button() throws Throwable {
		NurseryFarmerRegistartion.User_In_the_page_click_on_the_LogIn_button();
	}
	@Then ("^the User navigated to the dashboard of home page$")
	public void the_User_navigated_to_the_dashboard_of_home_page() throws Throwable {
		NurseryFarmerRegistartion.the_User_navigated_to_the_dashboard_of_home_page();
	}
	@Then ("^check with the user click on the Activities screen$")
	public void check_with_the_user_click_on_the_Activities_screen() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_user_click_on_the_Activities_screen();
	}
	@And ("^Check with the click on the Nursery Farmer registration screen$")
	public void Check_with_the_click_on_the_Nursery_Farmer_registration_screen() throws Throwable {
		NurseryFarmerRegistartion.Check_with_the_click_on_the_Nursery_Farmer_registration_screen();
	}
	@Then ("^check with the Type selection from the Dropdown field$")
	public void check_with_the_Type_selection_from_the_Dropdown_field() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Type_selection_from_the_Dropdown_field();
	}
	@And ("^check with the Title selection from the Dropdown field$")
	public void check_with_the_Title_selection_from_the_Dropdown_field() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Title_selection_from_the_Dropdown_field();
	}
	@And ("^check with the First name input field validation$")
	public void check_with_the_First_name_input_field_validation() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_First_name_input_field_validation();
	}
	@Then ("^check with the Lastname input field validation$")
	public void check_with_the_Lastname_input_field_validation() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Lastname_input_field_validation();
	}
	@And ("^check with the Father name input field validation$")
	public void check_with_the_Father_name_input_field_validation() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Father_name_input_field_validation();
	}
	@And ("^check with the Age input field validation$")
	public void check_with_the_Age_input_field_validation() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Age_input_field_validation();
	}
	@Then ("^check with the gender selection from the dropdown field$")
	public void check_with_the_gender_selection_from_the_dropdown_field() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_gender_selection_from_the_dropdown_field();
	}
	@And ("^check with the Address one input field validations$")
	public void check_with_the_Address_one_input_field_validations() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Address_one_input_field_validations();
	}
	@And ("^check with the Address two input field validations$")
	public void check_with_the_Address_two_input_field_validations() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Address_two_input_field_validations();
	}
	@Then ("^check with State selection from the dropdown selections$")
	public void check_with_State_selection_from_the_dropdown_selections() throws Throwable {
		NurseryFarmerRegistartion.check_with_State_selection_from_the_dropdown_selections();
	}
	@And ("^check with the District selection from the Dropdown selections$")
	public void check_with_the_District_selection_from_the_Dropdown_selections() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_District_selection_from_the_Dropdown_selections();
	}
	@And ("^check with the Mandal selection from the Dropdown selections$")
	public void check_with_the_Mandal_selection_from_the_Dropdown_selections() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Mandal_selection_from_the_Dropdown_selections();
	}
	@And ("^check with the Village selection from the Dropdown selections$")
	public void check_with_the_Village_selection_from_the_Dropdown_selections() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Village_selection_from_the_Dropdown_selections();
	}
	@Then ("^check with the Mobile number input field validation$")
	public void check_with_the_Mobile_number_input_field_validation() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Mobile_number_input_field_validation();
	}
	@And ("^check with  the Source of contact Drodown list selection$")
	public void check_with_the_Source_of_contact_Drodown_list_selection() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Source_of_contact_Drodown_list_selection();
	}
	@And ("^check with the Category selection from the Dropdown list$")
	public void check_with_the_Category_selection_from_the_Dropdown_list() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Category_selection_from_the_Dropdown_list();
	}
	@Then ("^check with the Farmer Image upload from the source folder$")
	public void check_with_the_Farmer_Image_upload_from_the_source_folder() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Farmer_Image_upload_from_the_source_folder();
	}
	@When ("^check with click on the Add Identity proof details$")
	public void check_with_click_on_the_Add_Identity_proof_details() throws Throwable {
		NurseryFarmerRegistartion.check_with_click_on_the_Add_Identity_proof_details();
	}
	@Then ("^check with the Id proof number input validation$")
	public void check_with_the_Id_proof_number_input_validation() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Id_proof_number_input_validation();
	}
	@And ("^check with the clicking on the save id details$")
	public void check_with_the_clicking_on_the_save_id_details() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_clicking_on_the_save_id_details();
	}
	@Then ("^check with the Account Number field input details validation$")
	public void check_with_the_Account_Number_field_input_details_validation() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Account_Number_field_input_details_validation();
	}
	@And ("^check with the Account name field input details validation$")
	public void check_with_the_Account_name_field_input_details_validation() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Account_name_field_input_details_validation();
	}
	@And ("^check with the Ifsc code details input details selection$")
	public void check_with_the_Ifsc_code_details_input_details_selection() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Ifsc_code_details_input_details_selection();
	}
	@And ("^check with the Bank proof Image details Upload$")
	public void check_with_the_Bank_proof_Image_details_Upload() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Bank_proof_Image_details_Upload();
	}
	@Then ("^check with the Save Bank details$")
	public void check_with_the_Save_Bank_details() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Save_Bank_details();	
	}
	@Then ("^check with the Add Middle name input details$")
	public void check_with_the_Add_Middle_name_input_details() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Add_Middle_name_input_details();
	}
	@And ("^check with the Add Mother name input details$")
	public void check_with_the_Add_Mother_name_input_details() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Add_Mother_name_input_details();
	}
	@And ("^check with the Add Address three input details$")
	public void check_with_the_Add_Address_three_input_details() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Add_Address_three_input_details();
	}
	@And ("^check with the Add landmark input details$")
	public void check_with_the_Add_landmark_input_details() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Add_landmark_input_details();
	}
	@Then ("^check with the Add Alter mobile number input details$")
	public void check_with_the_Add_Alter_mobile_number_input_details() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Add_Alter_mobile_number_input_details();
	}
	@And ("^check with the Email input details validation$")
	public void check_with_the_Email_input_details_validation() throws Throwable {
		NurseryFarmerRegistartion.check_with_the_Email_input_details_validation();
	}
}