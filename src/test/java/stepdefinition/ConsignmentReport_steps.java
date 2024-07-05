package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConsignmentReport;

public class ConsignmentReport_steps {
	ConsignmentReport ConsignmentReport = new ConsignmentReport();
	
	@Given ("^User is on login page navgati$")
	public void User_is_on_login_page_navgati() throws Throwable {
		ConsignmentReport.User_is_on_login_page_navgati();
	}
	@When ("^User enters with the username and passwords details$")
	public void User_enters_with_the_username_and_passwords_details() throws Throwable {
		ConsignmentReport.User_enters_with_the_username_and_passwords_details();
	}
	@And ("^Clicks on the logins button from login pag$")
	public void Clicks_on_the_logins_button_from_login_pag() throws Throwable {
		ConsignmentReport.Clicks_on_the_logins_button_from_login_pag();
	}
	@Then ("^Navigate to the Dashboards home pag$")
	public void Navigate_to_the_Dashboards_home_pag() throws Throwable {
		ConsignmentReport.Navigate_to_the_Dashboards_home_pag();
	}
	@Then ("^click on the Consignment Report screen$")
	public void click_on_the_Consignment_Report_screen() throws Throwable {
		ConsignmentReport.click_on_the_Consignment_Report_screen();
	}
	@Then ("^check with the active grid Type dropdown selection$")
	public void check_with_the_active_grid_Type_dropdown_selection() throws Throwable {
		ConsignmentReport.check_with_the_active_grid_Type_dropdown_selection();
	}
	@And ("^check with the Select Status Type from the Dropdown selection field$")
	public void check_with_the_Select_Status_Type_from_the_Dropdown_selection_field() throws Throwable {
		ConsignmentReport.check_with_the_Select_Status_Type_from_the_Dropdown_selection_field();
	}
	@And ("^check with the Select Collection center from the Dropdown Field$")
	public void check_with_the_Select_Collection_center_from_the_Dropdown_Field() throws Throwable {
		ConsignmentReport.check_with_the_Select_Collection_center_from_the_Dropdown_Field();
	}
	@Then ("^check with the Validate with the From date input selection$")
	public void check_with_the_Validate_with_the_From_date_input_selection() throws Throwable {
		ConsignmentReport.check_with_the_Validate_with_the_From_date_input_selection();
	}
	@And ("^verify with the Clicking on the Search button result details$")
	public void verify_with_the_Clicking_on_the_Search_button_result_details() throws Throwable {
		ConsignmentReport.verify_with_the_Clicking_on_the_Search_button_result_details();
	}
	@Then ("^check with the View Receipt button click$")
	public void check_with_the_View_Receipt_button_click() throws Throwable {
		ConsignmentReport.check_with_the_View_Receipt_button_click();
	}
}
