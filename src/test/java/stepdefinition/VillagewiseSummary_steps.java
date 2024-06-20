package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.VillagewiseSummary;

public class VillagewiseSummary_steps {


	VillagewiseSummary VillagewiseSummary = new VillagewiseSummary();
	
	@Given("^User First in login page$")
	public void User_First_in_login_page() throws Throwable {
		VillagewiseSummary.User_First_in_login_page();
	}
	@Then ("^Navigate to the Dashboard page details$")
	public void Navigate_to_the_Dashboard_page_details () throws Throwable {
		VillagewiseSummary.Navigate_to_the_Dashboard_page_details ();
		}
	@And ("^the user click on the snapshot module$")
	public void the_user_click_on_the_snapshot_module () throws Throwable {
		VillagewiseSummary.the_user_click_on_the_snapshot_module ();
	}
	@And ("^Click on the Village wise summary screen$")
	public void Click_on_the_Village_wise_summary_screen () throws Throwable {
		VillagewiseSummary.Click_on_the_Village_wise_summary_screen();
	}
	@Then ("^Select Location type from the grid$")
	public void Select_Location_type_from_the_grid () throws Throwable {
		VillagewiseSummary.Select_Location_type_from_the_grid();	
}
	@And ("^Select States from the dropdown field$")
	public void Select_States_from_the_dropdown_field () throws Throwable {
		VillagewiseSummary.Select_States_from_the_dropdown_field ();
		}
	@And ("^Select District from the dropdown option$")
	public void Select_District_from_the_dropdown_option () throws Throwable {
		VillagewiseSummary.Select_District_from_the_dropdown_option ();
	}
	@And ("^Select Mandal from the dropdown field$")
	public void Select_Mandal_from_the_dropdown_field () throws Throwable {
		VillagewiseSummary.Select_Mandal_from_the_dropdown_field ();
	}
	@And ("^Select Village from the dropdown field$")
	public void Select_Village_from_the_dropdown_field () throws Throwable {
		VillagewiseSummary.Select_Village_from_the_dropdown_field ();
	}
	@Then ("^Click on the grid Search button$")
	public void Click_on_the_grid_Search_button () throws Throwable {
		VillagewiseSummary.Click_on_the_grid_Search_button ();
    }
	@And ("^Click on the Export action button$")
	public void Click_on_the_Export_action_button () throws Throwable {
		VillagewiseSummary.Click_on_the_Export_action_button ();
	}
	@Then ("^Click on the Enable Filter Result$")
	public void Click_on_the_Enable_Filter_Result () throws Throwable {
		VillagewiseSummary.Click_on_the_Enable_Filter_Result ();
	}
	@And ("^Select States from the Dropdown field validations$")
	public void Select_States_from_the_Dropdown_field_validations() throws Throwable {
		VillagewiseSummary.Select_States_from_the_Dropdown_field_validations();
	}
	@And ("^Select Districts from the Dropdown field Validations$")
	public void Select_Districts_from_the_Dropdown_field_Validations() throws Throwable {
		VillagewiseSummary.Select_Districts_from_the_Dropdown_field_Validations();
	}
	@And ("^select Mandals from the dropdown field validations$")
	public void select_Mandals_from_the_dropdown_field_validations() throws Throwable {
		VillagewiseSummary.select_Mandals_from_the_dropdown_field_validations();
	}
	@And ("^select Villages from the dropdown field validations$")
	public void select_Villages_from_the_dropdown_field_validations() throws Throwable {
		VillagewiseSummary.select_Villages_from_the_dropdown_field_validations();
	}
	@And ("^select location as cluster$")
	public void select_location_as_cluster() throws Throwable {
		VillagewiseSummary.select_location_as_cluster();
	}
	@And ("^check with the Cluster selection$")
	public void check_with_the_Cluster_selection() throws Throwable {
		VillagewiseSummary.check_with_the_Cluster_selection();
	}
	@And ("^check with the search button$")
	public void check_with_the_search_button() throws Throwable {
		VillagewiseSummary.check_with_the_search_button();
	}
}