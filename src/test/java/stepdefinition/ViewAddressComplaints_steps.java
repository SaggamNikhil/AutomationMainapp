package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ViewAddressComplaints;

public class ViewAddressComplaints_steps {
	ViewAddressComplaints ViewAddressComplaints = new ViewAddressComplaints();

	@Given ("^user signin with the Respective users roles details$")
	public void user_signin_with_the_Respective_users_roles_details() throws Throwable {
		ViewAddressComplaints.user_signin_with_the_Respective_users_roles_details();
	}
	@Then ("^the page will Navigate to the Dashboard screen of the main menu screen$")
	public void the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_menu_screen() throws Throwable {
		ViewAddressComplaints.the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_menu_screen();
	}
	@Then ("^Side navgation click on the Crop Maintenances screen$")
	public void Side_navgation_click_on_the_Crop_Maintenances_screen() throws Throwable {
		ViewAddressComplaints.Side_navgation_click_on_the_Crop_Maintenances_screen();
	}
	@And ("^Click on the View Address Complaints screen name$")
	public void Click_on_the_View_Address_Complaints_screen_name() throws Throwable {
		ViewAddressComplaints.Click_on_the_View_Address_Complaints_screen_name();
	}
	@Then ("^check with the Status wise details$")
	public void check_with_the_Status_wise_details() throws Throwable {
		ViewAddressComplaints.check_with_the_Status_wise_details();
	}
	@And ("^check with the From date selection$")
	public void check_with_the_From_date_selection() throws Throwable {
		ViewAddressComplaints.check_with_the_From_date_selection();
	}
	@When ("^click on the Search action button$")
	public void click_on_the_Search_action_button() throws Throwable {
		ViewAddressComplaints.click_on_the_Search_action_button();
	}
	@And ("^check with the Complaint type details wise$")
	public void check_with_the_Complaint_type_details_wise() throws Throwable {
		ViewAddressComplaints.check_with_the_Complaint_type_details_wise();
	}
	@Then ("^check with the View Image action button$")
	public void check_with_the_View_Image_action_button() throws Throwable {
		ViewAddressComplaints.check_with_the_View_Image_action_button();
	}
	@And ("^check with the View recording action button$")
	public void check_with_the_View_recording_action_button() throws Throwable {
		ViewAddressComplaints.check_with_the_View_recording_action_button();
	}
}
