package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
}
