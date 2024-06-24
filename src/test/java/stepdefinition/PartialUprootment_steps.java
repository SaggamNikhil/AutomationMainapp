package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PartialUprootment;

public class PartialUprootment_steps {
	PartialUprootment PartialUprootment = new PartialUprootment();
	
	@Given ("^the user signin with the Respective role credential details$")
	public void the_user_signin_with_the_Respective_role_credential_details() throws Throwable {
		PartialUprootment.the_user_signin_with_the_Respective_role_credential_details();
	}
	@Then ("^the page will Navigate to the Dashboard screen of the main pages$")
	public void the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_pages() throws Throwable {
		PartialUprootment.the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_pages();
	}
	@Then ("^click on the dashboard menu as Activities module name$")
	public void click_on_the_dashboard_menu_as_Activities_module_name() throws Throwable {
		PartialUprootment.click_on_the_dashboard_menu_as_Activities_module_name();
	}
	@And ("^click on the Partial Uprootment screen$")
	public void click_on_the_Partial_Uprootment_screen() throws Throwable {
		PartialUprootment.click_on_the_Partial_Uprootment_screen();
	}
	@Then ("^click on the search farmer input field$")
	public void click_on_the_search_farmer_input_field() throws Throwable {
		PartialUprootment.click_on_the_search_farmer_input_field();
	}
	@And ("^Select farmer from the auto suggestion keywords list$")
	public void Select_farmer_from_the_auto_suggestion_keywords_list() throws Throwable {
		PartialUprootment.Select_farmer_from_the_auto_suggestion_keywords_list();
	}
	@And ("^check with the selected farmer plot details$")
	public void check_with_the_selected_farmer_plot_details() throws Throwable {
		PartialUprootment.check_with_the_selected_farmer_plot_details();
	}
	@Then ("^check with the Total plot area input details$")
	public void check_with_the_Total_plot_area_input_details() throws Throwable {
		PartialUprootment.check_with_the_Total_plot_area_input_details();
	}
	@And ("^check with the Total Palm area input details$")
	public void check_with_the_Total_Palm_area_input_details() throws Throwable {
		PartialUprootment.check_with_the_Total_Palm_area_input_details();
	}
	@Then ("^check with the Crop in Left out area dropdown selection$")
	public void check_with_the_Crop_in_Left_out_area_dropdown_selection() throws Throwable{
		PartialUprootment.check_with_the_Crop_in_Left_out_area_dropdown_selection();
	}
	@And ("^Check with the Survey number input validations details$")
	public void Check_with_the_Survey_number_input_validations_details() throws Throwable {
		PartialUprootment.Check_with_the_Survey_number_input_validations_details();
	}
	@Then ("^check with the CropIncome Dropdown selection$")
	public void check_with_the_CropIncome_Dropdown_selection() throws Throwable {
		PartialUprootment.check_with_the_CropIncome_Dropdown_selection();
	}
	@And ("^check with the Is Boundary fencing checkbox selection field$")
	public void check_with_the_Is_Boundary_fencing_checkbox_selection_field() throws Throwable {
		PartialUprootment.check_with_the_Is_Boundary_fencing_checkbox_selection_field();
	}
	@And ("^check with the Is plot handled by care taker checkbox selection field$")
	public void check_with_the_Is_plot_handled_by_care_taker_checkbox_selection_field() throws Throwable {
		PartialUprootment.check_with_the_Is_plot_handled_by_care_taker_checkbox_selection_field();
	}
	@Then ("^Validate with the Caretaker name input field$")
	public void Validate_with_the_Caretaker_name_input_field() throws Throwable {
		PartialUprootment.Validate_with_the_Caretaker_name_input_field();
	}
	@And ("^validate with the Caretaker mobile number details$")
	public void validate_with_the_Caretaker_mobile_number_details() throws Throwable {
		PartialUprootment.validate_with_the_Caretaker_mobile_number_details();
		}
	@Then ("^check with the landmark input details$")
	public void check_with_the_landmark_input_details() throws Throwable {
		PartialUprootment.check_with_the_landmark_input_details();
	}
	@When ("^Click on the Plantation Details action button$")
	public void Click_on_the_Plantation_Details_action_button() throws Throwable {
		PartialUprootment.Click_on_the_Plantation_Details_action_button();
	}
	@Then ("^check with the Sapling nursery dropdown input selection$")
	public void check_with_the_Sapling_nursery_dropdown_input_selection() throws Throwable {
		PartialUprootment.check_with_the_Sapling_nursery_dropdown_input_selection();
	}
	@And ("^check with the Sprouts vendor input details$")
	public void check_with_the_Sprouts_vendor_input_details() throws Throwable {
		PartialUprootment.check_with_the_Sprouts_vendor_input_details();
	}
	@Then ("^check with the Origin of saplings input selection details$")
	public void check_with_the_Origin_of_saplings_input_selection_details() throws Throwable {
		PartialUprootment.check_with_the_Origin_of_saplings_input_selection_details();
	}
	@And ("^check with the Cross dropdown input selection details$")
	public void check_with_the_Cross_dropdown_input_selection_details() throws Throwable {
		PartialUprootment.check_with_the_Cross_dropdown_input_selection_details();
	}
	@And ("^check with the Lifted saplings Input details$")
	public void check_with_the_Lifted_saplings_Input_details() throws Throwable {
		PartialUprootment.check_with_the_Lifted_saplings_Input_details();
	}
	@Then ("^check with the Planted saplings input details$")
	public void check_with_the_Planted_saplings_input_details() throws Throwable {
		PartialUprootment.check_with_the_Planted_saplings_input_details();
	}
	@And ("^click on the Save button$")
	public void click_on_the_Save_button() throws Throwable {
		PartialUprootment.click_on_the_Save_button();
	}
}