package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Grader;

public class Grader_steps {
	Grader Grader = new Grader();
	
	@Given ("^User is on login page screen of oilpalm link page$")
	public void User_is_on_login_page_screen_of_oilpalm_link_page() throws Throwable {
		Grader.User_is_on_login_page_screen_of_oilpalm_link_page();
	}
	@When ("^The User enters with the valid username and password inputs data details$")
	public void The_User_enters_with_the_valid_username_and_password_inputs_data_details() throws Throwable {
		Grader.The_User_enters_with_the_valid_username_and_password_inputs_data_details();
	}
	@Then ("^the page will be Navigated to the Dashboards home menus details$")
	public void the_page_will_be_Navigated_to_the_Dashboards_home_menus_details() throws Throwable {
		Grader.the_page_will_be_Navigated_to_the_Dashboards_home_menus_details();
	}
	@And ("^check with the click on the Settings modules name$")
	public void check_with_the_click_on_the_Settings_modules_name() throws Throwable {
		Grader.check_with_the_click_on_the_Settings_modules_name();
	}
	@Then ("^check with the Click on the Users module name$")
	public void check_with_the_Click_on_the_Users_module_name() throws Throwable {
		Grader.check_with_the_Click_on_the_Users_module_name();
	}
	@Then ("^check with the Click on the Grader module screen$")
	public void check_with_the_Click_on_the_Grader_module_screen() throws Throwable {
		Grader.check_with_the_Click_on_the_Grader_module_screen();
	}
    @And ("^check with the click on the Add grader action button$")
    public void check_with_the_click_on_the_Add_grader_action_button() throws Throwable {
    	Grader.check_with_the_click_on_the_Add_grader_action_button();
    }
    @And ("^check with the Mobile number input details validations$")
    public void check_with_the_Mobile_number_input_details_validations() throws Throwable {
    	Grader.check_with_the_Mobile_number_input_details_validations();
    }
    @Then ("^check with the select village from the dropdown field$")
    public void check_with_the_select_village_from_the_dropdown_field() throws Throwable {
    	Grader.check_with_the_select_village_from_the_dropdown_field();
    }
    @And ("^check with the collection center from the dropdown field$")
    public void check_with_the_collection_center_from_the_dropdown_field() throws Throwable {
    	Grader.check_with_the_collection_center_from_the_dropdown_field();
    }
    @And ("^check with the click on the save button input details$")
    public void check_with_the_click_on_the_save_button_input_details() throws Throwable {
    	Grader.check_with_the_click_on_the_save_button_input_details();
    }
    @Then ("^check with the Click on the Edit button from the active grid details$")
    public void check_with_the_Click_on_the_Edit_button_from_the_active_grid_details() throws Throwable {
    	Grader.check_with_the_Click_on_the_Edit_button_from_the_active_grid_details();
    }
    @And ("^check with the update details and click on the Update button$")
    public void check_with_the_update_details_and_click_on_the_Update_button() throws Throwable {
    	Grader.check_with_the_update_details_and_click_on_the_Update_button();
    }
    @Then ("^check with the delete action button from the grid details$")
    public void check_with_the_delete_action_button_from_the_grid_details() throws Throwable {
    	Grader.check_with_the_delete_action_button_from_the_grid_details();
    }
 }
