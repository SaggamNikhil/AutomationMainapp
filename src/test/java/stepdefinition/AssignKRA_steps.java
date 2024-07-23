package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AssignKRA;

public class AssignKRA_steps {
	AssignKRA AssignKRA = new AssignKRA();

@Given ("^User is on oilpalm project page login screen$")
public void User_is_on_oilpalm_project_page_login_screen() throws Throwable {
	AssignKRA.User_is_on_oilpalm_project_page_login_screen();
	}
@When ("^The Users enters with the valid inputs for username and password details$")
public void The_Users_enters_with_the_valid_inputs_for_username_and_password_details() throws Throwable {
	AssignKRA.The_Users_enters_with_the_valid_inputs_for_username_and_password_details();
    }
@Then ("^the page will be Navigated to the Dashboards menu details screen$")
public void the_page_will_be_Navigated_to_the_Dashboards_menu_details_screen() throws Throwable {
	AssignKRA.the_page_will_be_Navigated_to_the_Dashboards_menu_details_screen();
    }
@And ("^verify with the click on the Settings module navgation menu$")
public void verify_with_the_click_on_the_Settings_module_navgation_menu() throws Throwable {
	AssignKRA.verify_with_the_click_on_the_Settings_module_navgation_menu();
   }
@Then ("^check with the clicking on the Assign KRA navigation menu$")
public void Then_check_with_the_clicking_on_the_Assign_KRA_navigation_menu() throws Throwable {
	AssignKRA.Then_check_with_the_clicking_on_the_Assign_KRA_navigation_menu();
 }
@And ("^check with the click on the Assign KRA action button$")
public void check_with_the_click_on_the_Assign_KRA_action_button() throws Throwable {
	AssignKRA.check_with_the_click_on_the_Assign_KRA_action_button();
 }
@Then ("^check with the Select financial year drodpown field$")
public void check_with_the_Select_financial_year_drodpown_field() throws Throwable {
	AssignKRA.check_with_the_Select_financial_year_drodpown_field();	
}
@And ("^check with the select office type from the dropdown field$")
public void check_with_the_select_office_type_from_the_dropdown_field() throws Throwable {
	AssignKRA.check_with_the_select_office_type_from_the_dropdown_field();
}
@Then ("^check with the Select role type from the dropdowm field$")
public void check_with_the_Select_role_type_from_the_dropdowm_field() throws Throwable {
	AssignKRA.check_with_the_Select_role_type_from_the_dropdowm_field();
}
@And ("^check with the Select KRA type from the dropdown field$")
public void check_with_the_Select_KRA_type_from_the_dropdown_field() throws Throwable {
	AssignKRA.check_with_the_Select_KRA_type_from_the_dropdown_field();
}
@And ("^check with the Select Department type from the dropdown field$")
public void check_with_the_Select_Department_type_from_the_dropdown_field() throws Throwable {
	AssignKRA.check_with_the_Select_Department_type_from_the_dropdown_field();
}
@Then ("^Validate with the Weightage input details$")
public void Validate_with_the_Weightage_input_details() throws Throwable {
	AssignKRA.Validate_with_the_Weightage_input_details();
}
@And ("^check with the active grid by Clicking on the Edit KRA button$")
public void check_with_the_active_grid_by_Clicking_on_the_Edit_KRA_button() throws Throwable {
	AssignKRA.check_with_the_active_grid_by_Clicking_on_the_Edit_KRA_button();
}
@And ("^check with the Update assign KRA details$")
public void check_with_the_Update_assign_KRA_details() throws Throwable {
	AssignKRA.check_with_the_Update_assign_KRA_details();
}
@Then ("^update with the Department input details$")
public void update_with_the_Department_input_details() throws Throwable {
	AssignKRA.update_with_the_Department_input_details();
}
@And ("^check with click on the save button from the Update assign kra screen$")
public void check_with_click_on_the_save_button_from_the_Update_assign_kra_screen() throws Throwable {
	AssignKRA.check_with_click_on_the_save_button_from_the_Update_assign_kra_screen();
}
}
