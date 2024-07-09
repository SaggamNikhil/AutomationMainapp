package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LiveCollection;

public class LiveCollection_steps {
	LiveCollection LiveCollection = new LiveCollection();
	
	@Given ("^User is on login page of oilpalm screens$")
	public void User_is_on_login_page_of_oilpalm_screens() throws Throwable {
		LiveCollection.User_is_on_login_page_of_oilpalm_screens();
	}
	@When ("^The User enters with the username and passwords ipt data details$")
	public void The_User_enters_with_the_username_and_passwords_ipt_data_details() throws Throwable {
		LiveCollection.The_User_enters_with_the_username_and_passwords_ipt_data_details();
	}
	@And ("^Clicks on the logins button from the login details pag$")
	public void Clicks_on_the_logins_button_from_the_login_details_pag() throws Throwable {
		LiveCollection.Clicks_on_the_logins_button_from_the_login_details_pag();
	}
	@Then ("^the page will be Navigated to the Dashboards home menu pag$")
	public void the_page_will_be_Navigated_to_the_Dashboards_home_menu_pag() throws Throwable {
		LiveCollection.the_page_will_be_Navigated_to_the_Dashboards_home_menu_pag();
	}
	@And ("^check with the Click on the Live Collection details screen$")
	public void check_with_the_Click_on_the_Live_Collection_details_screen() throws Throwable {
		LiveCollection.check_with_the_Click_on_the_Live_Collection_details_screen();
	}
	@Then ("^check with the Click on the State selection details$")
	public void check_with_the_Click_on_the_State_selection_details() throws Throwable {
		LiveCollection.check_with_the_Click_on_the_State_selection_details();
	}
	@And ("^check with the Click on the Select collection center details$")
	public void check_with_the_Click_on_the_Select_collection_center_details() throws Throwable {
		LiveCollection.check_with_the_Click_on_the_Select_collection_center_details();
	}
	@And ("^check with the From date input selection input details$")
	public void check_with_the_From_date_input_selection_input_details() throws Throwable {
		LiveCollection.check_with_the_From_date_input_selection_input_details();
	}
	@And ("^check with the Search button resutls$")
	public void check_with_the_Search_button_resutls() throws Throwable {
		LiveCollection.check_with_the_Search_button_resutls();
	}
	@Then ("^check with the Total Collection details$")
	public void check_with_the_Total_Collection_details() throws Throwable {
		LiveCollection.check_with_the_Total_Collection_details();
	}
}
