package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ManageKRA;

public class ManageKRA_steps {
	ManageKRA ManageKRA = new ManageKRA();

@Given ("^User first login page of oilpalm project page$")
public void User_first_login_page_of_oilpalm_project_page() throws Throwable {
	ManageKRA.User_first_login_page_of_oilpalm_project_page();
  }
@When ("^The Users enters the valid inputs for username and password$")
public void The_Users_enters_the_valid_inputs_for_username_and_password() throws Throwable {
	ManageKRA.The_Users_enters_the_valid_inputs_for_username_and_password();
  }
@Then ("^the page will be Navigated to the Dashboards main menu screens$")
public void the_page_will_be_Navigated_to_the_Dashboards_main_menu_screens() throws Throwable {
	ManageKRA.the_page_will_be_Navigated_to_the_Dashboards_main_menu_screens();
 }
@And ("^verify with the click on the Settings menu module$")
public void verify_with_the_click_on_the_Settings_menu_module() throws Throwable {
	ManageKRA.verify_with_the_click_on_the_Settings_menu_module();
	}
@Then ("^check with the click on the Manage KRA menu screen$")
public void check_with_the_click_on_the_Manage_KRA_menu_screen() throws Throwable {
	ManageKRA.check_with_the_click_on_the_Manage_KRA_menu_screen();
 }
@And ("^verify with the click on the Edit action button$")
public void verify_with_the_click_on_the_Edit_action_button() throws Throwable {
	ManageKRA.verify_with_the_click_on_the_Edit_action_button();
}
}
