package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewFarmerRegistration;

public class NewFarmerRegistration_steps {
	NewFarmerRegistration NewFarmerRegistration = new NewFarmerRegistration();
	
	@Given ("^the user signin with the Respective users roles details$")
	public void the_user_signin_with_the_Respective_users_roles_details() throws Throwable {
		NewFarmerRegistration.the_user_signin_with_the_Respective_users_roles_details();
	}
	@Then ("^the page will Navigate to the Dashboard screen of the main menus screen$")
	public void the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_menus_screen() throws Throwable {
		NewFarmerRegistration.the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_menus_screen();
	}
	@And ("^click on the Module name of Activities module$")
	public void click_on_the_Module_name_of_Activities_module() throws Throwable {
		NewFarmerRegistration.click_on_the_Module_name_of_Activities_module();
    }
	@Then ("^click on the Submodule name of New farmer Registration screen$")
	public void click_on_the_Submodule_name_of_New_farmer_Registration_screen() throws Throwable {
		NewFarmerRegistration.click_on_the_Submodule_name_of_New_farmer_Registration_screen();
	}
	@And ("^Check with the Title selection input field$")
	public void Check_with_the_Title_selection_input_field() throws Throwable {
		NewFarmerRegistration.Check_with_the_Title_selection_input_field();
	}
	@Then ("^check with the Firstname field input details$")
	public void check_with_the_Firstname_field_input_details() throws Throwable {
		NewFarmerRegistration.check_with_the_Firstname_field_input_details();
	}
	@Then ("^check with the Middlename field input details$")
	public void check_with_the_Middlename_field_input_details() throws Throwable {
		NewFarmerRegistration.check_with_the_Middlename_field_input_details();
	}
	@And ("^check with the Lastname field input details$")
	public void check_with_the_Lastname_field_input_details() throws Throwable {
		NewFarmerRegistration.check_with_the_Lastname_field_input_details();
		
	}
	@Then ("^check with the Farmer image upload preview$")
	public void check_with_the_Farmer_image_upload_preview() throws Throwable {
		NewFarmerRegistration.check_with_the_Farmer_image_upload_preview();
	}
	@And ("^check with the Father name field input details$")
	public void check_with_the_Father_name_field_input_details() throws Throwable {
		NewFarmerRegistration.check_with_the_Father_name_field_input_details();
	}
	@Then ("^check with the Mother name field input details$")
	public void check_with_the_Mother_name_field_input_details() throws Throwable {
		NewFarmerRegistration.check_with_the_Mother_name_field_input_details();
	}
	@And ("^check with the Date of birth field input details$")
	public void check_with_the_Date_of_birth_field_input_details() throws Throwable {
		NewFarmerRegistration.check_with_the_Date_of_birth_field_input_details();
	}
	@Then ("^check with the Gender selection details$")
	public void check_with_the_Gender_selection_details() throws Throwable {
		NewFarmerRegistration.check_with_the_Gender_selection_details();
	}
	@And ("^check with the Address details input validations$")
	public void check_with_the_Address_details_input_validations() throws Throwable {
		NewFarmerRegistration.check_with_the_Address_details_input_validations();
	}
	@And ("^check with the Address two details input validations$")
	public void check_with_the_Address_two_details_input_validations() throws Throwable {
		NewFarmerRegistration.check_with_the_Address_two_details_input_validations();
	}
	@Then ("^check with the State selection from the Dropdown field$")
	public void check_with_the_State_selection_from_the_Dropdown_field() throws Throwable {
		NewFarmerRegistration.check_with_the_State_selection_from_the_Dropdown_field();
	}
	@And ("^check with the District selection from the Dropdown field$")
	public void check_with_the_District_selection_from_the_Dropdown_field() throws Throwable {
		NewFarmerRegistration.check_with_the_District_selection_from_the_Dropdown_field();
	}
	@And ("^check with the Mandal selection from the Dropdown field$")
	public void check_with_the_Mandal_selection_from_the_Dropdown_field() throws Throwable {
		NewFarmerRegistration.check_with_the_Mandal_selection_from_the_Dropdown_field();
	}
	@Then ("^check with the Village selection from the Dropdown field$")
	public void check_with_the_Village_selection_from_the_Dropdown_field() throws Throwable {
		NewFarmerRegistration.check_with_the_Village_selection_from_the_Dropdown_field();
	}
	@And ("^check with the Mobile number input field validations$")
	public void check_with_the_Mobile_number_input_field_validations() throws Throwable {
		NewFarmerRegistration.check_with_the_Mobile_number_input_field_validations();
	}
	@Then ("^check with the Source of contact selection from the Dropdown field$")
	public void check_with_the_Source_of_contact_selection_from_the_Dropdown_field() throws Throwable {
		NewFarmerRegistration.check_with_the_Source_of_contact_selection_from_the_Dropdown_field();
	}
	@Then ("^check with the Category selection from the dropdown field$")
	public void check_with_the_Category_selection_from_the_dropdown_field() throws Throwable {
		NewFarmerRegistration.check_with_the_Category_selection_from_the_dropdown_field();
	}
	@And ("^check with the Address three input field details$")
	public void check_with_the_Address_three_input_field_details() throws Throwable {
		NewFarmerRegistration.check_with_the_Address_three_input_field_details();
	}
	@And ("^check with the landmark input field details$")
	public void check_with_the_landmark_input_field_details() throws Throwable {
		NewFarmerRegistration.check_with_the_landmark_input_field_details();
	}
	@And ("^check with the Email address input validations$")
	public void check_with_the_Email_address_input_validations() throws Throwable {
		NewFarmerRegistration.check_with_the_Email_address_input_validations();
	}
	@Then ("^check with the Annual Income selection from the Dropdown field$")
	public void check_with_the_Annual_Income_selection_from_the_Dropdown_field() throws Throwable {
		NewFarmerRegistration.check_with_the_Annual_Income_selection_from_the_Dropdown_field();
	}
    @Then ("^check with the Education selection from the dropdown field$")
    public void check_with_the_Education_selection_from_the_dropdown_field() throws Throwable {
    	NewFarmerRegistration.check_with_the_Education_selection_from_the_dropdown_field();
    }
    @When ("^Click on the Add Identity proof button$")
    public void Click_on_the_Add_Identity_proof_button() throws Throwable {
    	NewFarmerRegistration.Click_on_the_Add_Identity_proof_button();
    }
    @Then ("^check with Idenityproof Number Input field validation$")
    public void check_with_Idenityproof_Number_Input_field_validation() throws Throwable {
    	NewFarmerRegistration.check_with_Idenityproof_Number_Input_field_validation();
    }
    @And ("^click on the Save button from the Identity proof details$")
    public void click_on_the_Save_button_from_the_Identity_proof_details() throws Throwable {
    	NewFarmerRegistration.click_on_the_Save_button_from_the_Identity_proof_details();
    }
    @Then ("^check with the Account number input validations details$")
    public void check_with_the_Account_number_input_validations_details() throws Throwable {
    	NewFarmerRegistration.check_with_the_Account_number_input_validations_details();
    }
    @And ("^check with the Account Name input validations details$")
    public void check_with_the_Account_Name_input_validations_details() throws Throwable {
    	NewFarmerRegistration.check_with_the_Account_Name_input_validations_details();
    }
    @Then ("^check with the IFSC Code input validation details$")
    public void check_with_the_IFSC_Code_input_validation_details() throws Throwable {
    	NewFarmerRegistration.check_with_the_IFSC_Code_input_validation_details();
    }
    @And ("^Check with the bank Image upload file$")
    public void Check_with_the_bank_Image_upload_file() throws Throwable {
    	NewFarmerRegistration.Check_with_the_bank_Image_upload_file();
    }
    @Then ("^check with the Save details$")
    public void check_with_the_Save_details() throws Throwable {
    	NewFarmerRegistration.check_with_the_Save_details();
    }
}