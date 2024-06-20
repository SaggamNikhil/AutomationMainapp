package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TotalUprootment;

public class TotalUprootment_steps {
	TotalUprootment TotalUprootment = new TotalUprootment();
	
	@Given ("^user signin with the Respective user roles details$")
	public void user_signin_with_the_Respective_user_roles_details() throws Throwable {
		TotalUprootment.user_signin_with_the_Respective_user_roles_details();
	}
    @Then ("^the page will Navigate to the Dashboard screen of the oilpalm screen$")
    public void the_page_will_Navigate_to_the_Dashboard_screen_of_the_oilpalm_screen() throws Throwable {
    	TotalUprootment.the_page_will_Navigate_to_the_Dashboard_screen_of_the_oilpalm_screen();
    }
    @Then ("^Side navgation click on the Crop Maintenance screen$")
    public void Side_navgation_click_on_the_Crop_Maintenance_screen() throws Throwable {
    	TotalUprootment.Side_navgation_click_on_the_Crop_Maintenance_screen();
    }
    @And ("^Click on the menu as a Total Uprootment screen$")
    public void Click_on_the_menu_as_a_Total_Uprootment_screen() throws Throwable {
    	TotalUprootment.Click_on_the_menu_as_a_Total_Uprootment_screen();
    }
    @Then ("^check with the select location type$")
    public void check_with_the_select_location_type() throws Throwable {
    	TotalUprootment.check_with_the_select_location_type();
    }
    @Then ("^select States from the Dropdown list data$")
    public void select_States_from_the_Dropdown_list_data() throws Throwable{
    	TotalUprootment.select_States_from_the_Dropdown_list_data();
    }
    @And ("^select Districts from the Dropdown list data$")
    public void select_Districts_from_the_Dropdown_list_data() throws Throwable {
    	TotalUprootment.select_Districts_from_the_Dropdown_list_data();
    }
    @And ("^select Mandals from the Dropdown list data$")
    public void select_Mandals_from_the_Dropdown_list_data() throws Throwable {
    	TotalUprootment.select_Mandals_from_the_Dropdown_list_data();
    }
    @And ("^select villages from the Dropdown list data$")
    public void select_villages_from_the_Dropdown_list_data() throws Throwable {
    	TotalUprootment.select_villages_from_the_Dropdown_list_data();
    }
    @Then ("^click on the Search button from the Total uprootment active grid$")
    public void click_on_the_Search_button_from_the_Total_uprootment_active_grid() throws Throwable {
    	TotalUprootment.click_on_the_Search_button_from_the_Total_uprootment_active_grid();
    }
    @Then ("^Verify with Click on the Cluster manager Approvals$")
    public void Verify_with_Click_on_the_Cluster_manager_Approvals() throws Throwable {
    	TotalUprootment.Verify_with_Click_on_the_Cluster_manager_Approvals();
    }
    @And ("^verify with Uprootment save button$")
    public void verify_with_Uprootment_save_button() throws Throwable {
    	TotalUprootment.verify_with_Uprootment_save_button();
    }
    @Then ("^Verify with Click on the State Head approvals$")
    public void Verify_with_Click_on_the_State_Head_approvals() throws Throwable {
    	TotalUprootment.Verify_with_Click_on_the_State_Head_approvals();
    }
    @And ("^Verify with click on the Agrihead approval action$")
    public void Verify_with_click_on_the_Agrihead_approval_action() throws Throwable {
    	TotalUprootment.Verify_with_click_on_the_Agrihead_approval_action();
    }
}
