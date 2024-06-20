package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Prospectiveplots;

public class Prospectiveplots_steps {
      Prospectiveplots Prospectiveplots = new Prospectiveplots();
	@Given ("^First login with Respective user role details$")
	public void First_login_with_Respective_user_role_details() throws Throwable {
    	  Prospectiveplots.First_login_with_Respective_user_role_details();
	}
	@Then ("^the page is Navigate to the Dashboard of oilpalm screen$")
	public void the_page_is_Navigate_to_the_Dashboard_of_oilpalm_screen() throws Throwable {
		Prospectiveplots.the_page_is_Navigate_to_the_Dashboard_of_oilpalm_screen();
	}
	@And ("^Click on the Areaextension screen name$")
	public void Click_on_the_Areaextension_screen_name() throws Throwable {
		Prospectiveplots.Click_on_the_Areaextension_screen_name();
	}
	@And ("^click on the Prospective plot screen$")
	public void click_on_the_Prospective_plot_screen() throws Throwable {
		Prospectiveplots.click_on_the_Prospective_plot_screen();
	}
    @And ("^Select Location type from the grid view$")
    public void Select_Location_type_from_the_grid_view() throws Throwable {
    	Prospectiveplots.Select_Location_type_from_the_grid_view();
    }
    @And ("^select state from the grid view$")
    public void select_state_from_the_grid_view() throws Throwable {
    	Prospectiveplots.select_state_from_the_grid_view();
    }
    @And ("^select District from the grid view$")
    public void select_District_from_the_grid_view() throws Throwable {
    	Prospectiveplots.select_District_from_the_grid_view();
    }
    @And ("^select mandal from the grid view$")
    public void select_mandal_from_the_grid_view() throws Throwable {
    	Prospectiveplots.select_mandal_from_the_grid_view();
    }
    @And ("^select Villages from the grid view$")
    public void select_Villages_from_the_grid_view() throws Throwable {
    	Prospectiveplots.select_Villages_from_the_grid_view();
    }
    @And ("^select from date sele validations$")
    public void select_from_date_sele_validations() throws Throwable {
    	Prospectiveplots.select_from_date_sele_validations();
    }
    @And ("^click on the search button from the grid$")
    public void click_on_the_search_button_from_the_grid() throws Throwable {
    	Prospectiveplots.click_on_the_search_button_from_the_grid();
    }
    @And ("^select farmer code from the grid$")
    public void select_farmer_code_from_the_grid() throws Throwable {
    	Prospectiveplots.select_farmer_code_from_the_grid();
    }
    @Then ("^click on the Contact history button$")
    public void click_on_the_Contact_history_button() throws Throwable {
    	Prospectiveplots.click_on_the_Contact_history_button();
    }
    @And ("^Click the Edit action button$")
    public void Click_the_Edit_action_button() throws Throwable {
    	Prospectiveplots.Click_the_Edit_action_button();
    }
    @And ("^check with FarmerLast name input field validation$")
    public void check_with_FarmerLast_name_input_field_validation() throws Throwable{
    	Prospectiveplots.check_with_FarmerLast_name_input_field_validation();
    }
    @And ("^check with Farmer Father name input field validation$")
    public void check_with_Farmer_Father_name_input_field_validation() throws Throwable {
    	Prospectiveplots.check_with_Farmer_Father_name_input_field_validation();
    }
    @And ("^check with Farmer Age details input field validation$")
    public void check_with_Farmer_Age_details_input_field_validation() throws Throwable {
    	Prospectiveplots.check_with_Farmer_Age_details_input_field_validation();
    }
    @And ("^check with farmer address input field validations$")
    public void check_with_farmer_address_input_field_validations() throws Throwable {
    	Prospectiveplots.check_with_farmer_address_input_field_validations();
    }
    @And ("^check with farmer adddress two input field validations$")
    public void check_with_farmer_adddress_two_input_field_validations() throws Throwable {
    	Prospectiveplots.check_with_farmer_adddress_two_input_field_validations();
    }
    @And ("^check with the State sel dropdown field validation$")
    public void check_with_the_State_sel_dropdown_field_validation() throws Throwable {
    	Prospectiveplots.check_with_the_State_sel_dropdown_field_validation();
    }
    @And ("^check with the District sel dropdown field validations$")
    public void check_with_the_District_sel_dropdown_field_validations() throws Throwable {
    	Prospectiveplots.check_with_the_District_sel_dropdown_field_validations();
    }
    @And ("^check with the Mandal sel dropdown field validations$")
    public void check_with_the_Mandal_sel_dropdown_field_validations() throws Throwable {
    	Prospectiveplots.check_with_the_Mandal_sel_dropdown_field_validations();
    }
    @And ("^check with the Village sel dropdown field validations$")
    public void check_with_the_Village_sel_dropdown_field_validations() throws Throwable {
    	Prospectiveplots.check_with_the_Village_sel_dropdown_field_validations();
    }
    @And ("^check with the Mobile Num input field validation$")
    public void check_with_the_Mobile_Num_input_field_validation() throws Throwable {
    	Prospectiveplots.check_with_the_Mobile_Num_input_field_validation();
    }
    @And ("^check with the update farmer image$")
    public void check_with_the_update_farmer_image() throws Throwable {
    	Prospectiveplots.check_with_the_update_farmer_image();
    }
    @And ("^check with the Farmer details save button$")
    public void check_with_the_Farmer_details_save_button() throws Throwable {
    	Prospectiveplots.check_with_the_Farmer_details_save_button();
    }
    @Then ("^check with the Identityproof validation$")
    public void check_with_the_Identityproof_validation() throws Throwable {
    	Prospectiveplots.check_with_the_Identityproof_validation();
    }
    @And ("^check with the Add idproof details$")
    public void check_with_the_Add_idproof_details() throws Throwable {
    	Prospectiveplots.check_with_the_Add_idproof_details();
    }
    @And ("^check with the delete idproof details$")
    public void check_with_the_delete_idproof_details() throws Throwable {
    	Prospectiveplots.check_with_the_delete_idproof_details();
    }
    
    @And ("^check with the Bank proof details validations$")
    public void check_with_the_Bank_proof_details_validations() throws Throwable {
    	Prospectiveplots.check_with_the_Bank_proof_details_validations();
    }
    @And ("^check with the Account no input details validations$")
    public void check_with_the_Account_no_input_details_validations() throws Throwable {
    	Prospectiveplots.check_with_the_Account_no_input_details_validations();
    }
    @And ("^check with the Account name input details validations$")
    public void check_with_the_Account_name_input_details_validations() throws Throwable {
    	Prospectiveplots.check_with_the_Account_name_input_details_validations();
    }
    @And ("^check with the IFSC code sel validation$")
    public void check_with_the_IFSC_code_sel_validation() throws Throwable {
    	Prospectiveplots.check_with_the_IFSC_code_sel_validation();
    }
    @And ("^check with the Farmer bank image update$")
    public void check_with_the_Farmer_bank_image_update() throws Throwable {
    	Prospectiveplots.check_with_the_Farmer_bank_image_update();
    }
    @And ("^check with the Update bank details and save$")
    public void check_with_the_Update_bank_details_and_save() throws Throwable {
    	Prospectiveplots.check_with_the_Update_bank_details_and_save();
    }
}
