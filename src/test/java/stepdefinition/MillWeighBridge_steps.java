package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MillWeighBridge;

public class MillWeighBridge_steps {
	MillWeighBridge MillWeighBridge = new MillWeighBridge();
	
	@Given ("^User is on login page with oilpalm project page$")
	public void User_is_on_login_page_with_oilpalm_project_page() throws Throwable {
		MillWeighBridge.User_is_on_login_page_with_oilpalm_project_page();
	}
	@When ("^The Users enters with the valid username and password inputs data$")
	public void The_Users_enters_with_the_valid_username_and_password_inputs_data() throws Throwable {
		MillWeighBridge.The_Users_enters_with_the_valid_username_and_password_inputs_data();
	}
	@Then ("^the page will be Navigated to the Dashboards menu$")
	public void the_page_will_be_Navigated_to_the_Dashboards_menu() throws Throwable {
		MillWeighBridge.the_page_will_be_Navigated_to_the_Dashboards_menu();
	}
	@And ("^verify with the click on the Settings module from the Dashboard$")
	public void verify_with_the_click_on_the_Settings_module_from_the_Dashboard() throws Throwable {
		MillWeighBridge.verify_with_the_click_on_the_Settings_module_from_the_Dashboard();
	}
	@Then ("^verify with the click on the Mill weighbridge screen$")
	public void verify_with_the_click_on_the_Mill_weighbridge_screen() throws Throwable {
		MillWeighBridge.verify_with_the_click_on_the_Mill_weighbridge_screen();
	}
	@And ("^check with the click on the Add Mill weighbridge action button$")
	public void check_with_the_click_on_the_Add_Mill_weighbridge_action_button() throws Throwable {
		MillWeighBridge.check_with_the_click_on_the_Add_Mill_weighbridge_action_button();
	}
	@And ("^validate with the Name input field from the popup screen$")
	public void validate_with_the_Name_input_field_from_the_popup_screen() throws Throwable {
		MillWeighBridge.validate_with_the_Name_input_field_from_the_popup_screen();
	}
	@Then ("^check with the User Dropdown field from the popup screen$")
	public void check_with_the_User_Dropdown_field_from_the_popup_screen() throws Throwable {
		MillWeighBridge.check_with_the_User_Dropdown_field_from_the_popup_screen();
	}
	@And ("^check with the location dropdown input field$")
	public void check_with_the_location_dropdown_input_field() throws Throwable {
		MillWeighBridge.check_with_the_location_dropdown_input_field();
	}
	@And ("^check with the Click on the save action button$")
	public void check_with_the_Click_on_the_save_action_button() throws Throwable {
		MillWeighBridge.check_with_the_Click_on_the_save_action_button();
	}
	@Then ("^check with the Click on the active grid Edit action button$")
	public void check_with_the_Click_on_the_active_grid_Edit_action_button() throws Throwable {
		MillWeighBridge.check_with_the_Click_on_the_active_grid_Edit_action_button();
	}
	@And ("^check with the Is Automatic check box selection input$")
	public void check_with_the_Is_Automatic_check_box_selection_input() throws Throwable {
		MillWeighBridge.check_with_the_Is_Automatic_check_box_selection_input();
	}
	@Then ("^check with the click on the update action button$")
	public void check_with_the_click_on_the_update_action_button() throws Throwable {
		MillWeighBridge.check_with_the_click_on_the_update_action_button();
	}
}
