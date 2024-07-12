package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Managetablet;

public class Managetablet_steps {
	Managetablet Managetablet = new Managetablet();
	
	@Given ("^User is on login page of oilpalm projects$")
	public void User_is_on_login_page_of_oilpalm_projects() throws Throwable {
		Managetablet.User_is_on_login_page_of_oilpalm_projects();
	}
	@When ("^The User enter with the valid username and password inputs data details$")
	public void The_User_enter_with_the_valid_username_and_password_inputs_data_details() throws Throwable {
		Managetablet.The_User_enter_with_the_valid_username_and_password_inputs_data_details();
	}
	@Then ("^the page will be Navigated to the Dashboards home main menu pages details$")
	public void the_page_will_be_Navigated_to_the_Dashboards_home_main_menu_pages_details() throws Throwable {
		Managetablet.the_page_will_be_Navigated_to_the_Dashboards_home_main_menu_pages_details();
	}
	@And ("^verfiy with the click on the Settings modules$")
	public void verfiy_with_the_click_on_the_Settings_modules() throws Throwable {
		Managetablet.verfiy_with_the_click_on_the_Settings_modules();
	}
	@Then ("^check with the click on the Manage tablet screen$")
	public void check_with_the_click_on_the_Manage_tablet_screen() throws Throwable {
		Managetablet.check_with_the_click_on_the_Manage_tablet_screen();
	}
	@And ("^check with the clicking on the Add tablet action button$")
	public void check_with_the_clicking_on_the_Add_tablet_action_button() throws Throwable {
		Managetablet.check_with_the_clicking_on_the_Add_tablet_action_button();
	}
	@Then ("^check with the IMEI number input details validations$")
	public void check_with_the_IMEI_number_input_details_validations() throws Throwable {
		Managetablet.check_with_the_IMEI_number_input_details_validations();
	}
	@And ("^check with the IMEI number two input details validations$")
	public void check_with_the_IMEI_number_two_input_details_validations() throws Throwable {
		Managetablet.check_with_the_IMEI_number_two_input_details_validations();
	}
	@Then ("^check with the Brand name input details$")
	public void check_with_the_Brand_name_input_details() throws Throwable {
		Managetablet.check_with_the_Brand_name_input_details();
	}
	@And ("^check with the Save action button input details$")
	public void check_with_the_Save_action_button_input_details() throws Throwable {
		Managetablet.check_with_the_Save_action_button_input_details();
	}
	@Then ("^check with the Click on the Edit action button$")
	public void check_with_the_Click_on_the_Edit_action_button() throws Throwable {
		Managetablet.check_with_the_Click_on_the_Edit_action_button();
	}
 }
