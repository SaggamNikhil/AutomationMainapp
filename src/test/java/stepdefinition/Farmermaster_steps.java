package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Farmermasterpage;

public class Farmermaster_steps {
	Farmermasterpage Farmermasterpage = new Farmermasterpage();
	@Given("^User is on login page nav$")
	public void User_is_on_login_page_nav() throws Throwable {
		Farmermasterpage.User_is_on_login_page_nav();
	}

	@When("^User enters username and password$")
	public void User_enters_username_and_password() throws Throwable {
		Farmermasterpage.User_enters_username_and_password();
	}

	@And("^Clicks on login button$")
	public void Clicks_on_login_button() throws Throwable {
		Farmermasterpage.Clicks_on_login_button();
	}
	@Then ("^Click on the Otp opt submit button$")
	public void Click_on_the_Otp_opt_submit_button() throws Throwable {
	  Farmermasterpage.Click_on_the_Otp_opt_submit_button();
	}
	@Then("^Navigate to the Dashboard home screen$")
	public void Navigate_to_the_Dashboard_home_screen() throws Throwable {
		Farmermasterpage.Navigate_to_the_Dashboard_home_screen();
	}

	@When("^user click on the snapshot module name$")
	public void user_click_on_the_snapshot_module_name() throws Throwable {
		Farmermasterpage.user_click_on_the_snapshot_module_name();
	}

	@Then("^Click on the Farmermaster screen$")
	public void Click_on_the_Farmermaster_screen() throws Throwable {
		Farmermasterpage.Click_on_the_Farmermaster_screen();
	}
    @And ("^Click on the Search button$")
    public void Click_on_the_Search_button() throws Throwable {
    	Farmermasterpage.Click_on_the_Search_button();
    }
	@And("^Check with Farmer Edit button click$")
	public void Check_with_Farmer_Edit_button_click() throws Throwable {
		Farmermasterpage.Check_with_Farmer_Edit_button_click();
	}

	@When("^User able firstname update details$")
	public void User_able_firstname_update_details() throws Throwable {
		Farmermasterpage.User_able_firstname_update_details();

	}

	@And("^Update with Lastname details$")
	public void Update_with_Lastname_details() throws Throwable {
		Farmermasterpage.Update_with_Lastname_details();
	}

	@Given("^User enters input for Fathername$")
	public void User_enters_input_for_Fathername() throws Throwable {
		Farmermasterpage.User_enters_input_for_Fathername();

	}

	@And("^Enter Manual inputs in dateofbirth field$")
	public void Enter_Manual_inputs_in_dateofbirth_field() throws Throwable {
		Farmermasterpage.Enter_Manual_inputs_in_dateofbirth_field();

	}

	@Then("^Update with Address1 details$")
	public void Update_with_Address1_details() throws Throwable {
		Farmermasterpage.Update_with_Address1_details();
	}

	@And("^Update with Address2 details$")
	public void Update_with_Address2_details() throws Throwable {
		Farmermasterpage.Update_with_Address2_details();
	}

	@Then("^Update with Landmark details$")
	public void Update_with_Landmark_details() throws Throwable {
		Farmermasterpage.Update_with_Landmark_details();
	}

	@And("^Update with State selection$")
	public void Update_with_State_selection() throws Throwable {
		Farmermasterpage.Update_with_State_selection();

	}

	@Then("^Update With District Selection$")
	public void Update_With_District_Selection() throws Throwable {
		Farmermasterpage.Update_With_District_Selection();
	}

	@And("^Update With Mandal Selection$")
	public void Update_With_Mandal_Selection() throws Throwable {
		Farmermasterpage.Update_With_Mandal_Selection();
	}

	@Given("^User update with Village details$")
	public void User_update_with_Village_details() throws Throwable {
		Farmermasterpage.User_update_with_Village_details();

	}

	@When("^User Update Contact number details$")
	public void User_Update_Contact_number_details() throws Throwable {
		Farmermasterpage.User_Update_Contact_number_details();
	}

	@Then("^Update with source of contact$")
	public void Update_with_source_of_contact() throws Throwable {
		Farmermasterpage.Update_with_source_of_contact();
	}

	@And("^Update With Category details$")
	public void Update_With_Category_details() throws Throwable {
		Farmermasterpage.Update_With_Category_details();
	}

	@Then("^modify with Annual income$")
	public void modify_with_Annual_income() throws Throwable {
		Farmermasterpage.modify_with_Annual_income();
	}

	@When("^User update with Eduction details$")
	public void User_update_with_Eduction_details() throws Throwable {
		Farmermasterpage.User_update_with_Eduction_details();
	}

	@Then("^Check with Img sel$")
	public void Check_with_Img_sel() throws Throwable {
		Farmermasterpage.Check_with_Img_sel();
	}

	@And("^Click on save button$")
	public void Click_on_save_button() throws Throwable {
		Farmermasterpage.Click_on_save_button();
	}

	@Given("^User update IdentityProof$")
	public void User_update_IdentityProof() throws Throwable {
		Farmermasterpage.User_update_IdentityProof();
	}

	@Then("^Enter aadhar number details$")
	public void Enter_aadhar_number_details() throws Throwable {
		Farmermasterpage.Enter_aadhar_number_details();
	}

	@And("^Click on the Submit button$")
	public void Click_on_the_Submit_button() throws Throwable {
		Farmermasterpage.Click_on_the_Submit_button();
	}
    @When ("^Click on the Bank update details$")
    public void Click_on_the_Bank_update_details () throws Throwable {
    	Farmermasterpage.Click_on_the_Bank_update_details();
    }
    @Then ("^Update account number input field$")
    public void Update_account_number_input_field () throws Throwable {
    	Farmermasterpage.Update_account_number_input_field();
    }
    @And ("^Update with Account name input field$")
    public void Update_with_Account_name_input_field () throws Throwable {
    	Farmermasterpage.Update_with_Account_name_input_field();
    }
    @Then ("^Check with Ifsc code$")
    public void Check_with_Ifsc_code() throws Throwable {
    	Farmermasterpage.Check_with_Ifsc_code();
    }
    @Given ("^user update with Bankimage$")
    public void user_update_with_Bankimage() throws Throwable {
    	Farmermasterpage.user_update_with_Bankimage();
    }
    @And ("^Click on the Update button$")
    public void Click_on_the_Update_button() throws Throwable {
    	Farmermasterpage.Click_on_the_Update_button();
    }
}

