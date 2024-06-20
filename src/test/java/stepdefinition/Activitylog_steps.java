package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Activitylog;

public class Activitylog_steps {
	Activitylog Activitylog = new Activitylog();
	@Given("^login with respective user role$")
	public void login_with_respective_user_role() throws Throwable {
		Activitylog.login_with_respective_user_role();
	}
    @Then ("^Navigate to the Dashboard details screen$")
    public void Navigate_to_the_Dashboard_details_screen() throws Throwable {
    	Activitylog.Navigate_to_the_Dashboard_details_screen();
    }
    @And ("^the user click on the snapshot page$")
    public void the_user_click_on_the_snapshot_page() throws Throwable {
    	Activitylog.the_user_click_on_the_snapshot_page();
    }
    @And ("^click on the Activitylogs screen$")
    public void click_on_the_Activitylogs_screen() throws Throwable {
    	Activitylog.click_on_the_Activitylogs_screen();
    }
    @Then ("^check with the Employees dropdown field$")
    public void check_with_the_Employees_dropdown_field() throws Throwable {
    	Activitylog.check_with_the_Employees_dropdown_field();
    }
    @And ("^check with From date sel validation$")
    public void check_with_From_date_sel_validation() throws Throwable {
    	Activitylog.check_with_From_date_sel_validation();
    }
    @And ("^click on the search button value$")
    public void click_on_the_search_button_value() throws Throwable{
    	Activitylog.click_on_the_search_button_value();
    }
    @And ("^check with By farmer code details$")
    public void check_with_By_farmer_code_details() throws Throwable {
    	Activitylog.check_with_By_farmer_code_details();
    }
    @And ("^Click on the Contact history button$")
    public void Click_on_the_Contact_history_button() throws Throwable {
    	Activitylog.Click_on_the_Contact_history_button();
    }
    @And ("^Click on the Edit action details button$")
    public void Click_on_the_Edit_action_details_button() throws Throwable {
    	Activitylog.Click_on_the_Edit_action_details_button();
    }
    @Then ("^Check with Farmer Lastname details validations$")
    public void Check_with_Farmer_Lastname_details_validations() throws Throwable {
    	Activitylog.Check_with_Farmer_Lastname_details_validations();
    }
    @And ("^check with farmer Fathername details validations$")
    public void check_with_farmer_Fathername_details_validations() throws Throwable {
    	Activitylog.check_with_farmer_Fathername_details_validations();
    }
    @And ("^check with Age input details validations$")
    public void check_with_Age_input_details_validations() throws Throwable {
    	Activitylog.check_with_Age_input_details_validations();
    }
    @And ("^check with address one details validations$")
    public void check_with_address_one_details_validations() throws Throwable {
    	Activitylog.check_with_address_one_details_validations();
    }
    @And ("^check with address two details validations$")
    public void check_with_address_two_details_validations() throws Throwable {
    	Activitylog.check_with_address_two_details_validations();
    }
    @And ("^check with State sel Dropdown validations$")
    public void check_with_State_sel_Dropdown_validations() throws Throwable {
    	Activitylog.check_with_State_sel_Dropdown_validations();
    }
    @And ("^check with District sel dropdown validations$")
    public void check_with_District_sel_dropdown_validations() throws Throwable {
    	Activitylog.check_with_District_sel_dropdown_validations();
    }
    @And ("^check with Mandal sel dropdown validations$")
    public void check_with_Mandal_sel_dropdown_validations() throws Throwable {
    	Activitylog.check_with_Mandal_sel_dropdown_validations();
    }
    @And ("^check with Village sel dropdown validations$")
    public void check_with_Village_sel_dropdown_validations() throws Throwable {
    	Activitylog.check_with_Village_sel_dropdown_validations();
    }
    @Then ("^check with the Mobile no input validation$")
    public void check_with_the_Mobile_no_input_validation() throws Throwable {
    	Activitylog.check_with_the_Mobile_no_input_validation();
    	
    }
    @And ("^check with the Upload farmer image details$")
    public void check_with_the_Upload_farmer_image_details() throws Throwable {
    	Activitylog.check_with_the_Upload_farmer_image_details();
    }
    @And ("^check with the save details$")
    public void check_with_the_save_details() throws Throwable {
    	Activitylog.check_with_the_save_details();
    }
    @Then ("^check with the Identity proof details update$")
    public void check_with_the_Identity_proof_details_update() throws Throwable {
    	Activitylog.check_with_the_Identity_proof_details_update();
    }
    @And ("^check with the Bank proof details update$")
    public void check_with_the_Bank_proof_details_update() throws Throwable {
    	Activitylog.check_with_the_Bank_proof_details_update();
    }
    @And ("^check with the bank account no update$")
    public void check_with_the_bank_account_no_update() throws Throwable {
    	Activitylog.check_with_the_bank_account_no_update();
    }
    @And ("^check with the Bank account name update$")
    public void check_with_the_Bank_account_name_update() throws Throwable {
    	Activitylog.check_with_the_Bank_account_name_update();
    }
    @And ("^check with the IFSC code update$")
    public void check_with_the_IFSC_code_update() throws Throwable {
    	Activitylog.check_with_the_IFSC_code_update();
    }
    @And ("^check with the update bank img$")
    public void check_with_the_update_bank_img() throws Throwable{
    	Activitylog.check_with_the_update_bank_img();
    }
    @And ("^check with the save bank details$")
    public void check_with_the_save_bank_details() throws Throwable {
    	Activitylog.check_with_the_save_bank_details();
    	
    }
}
