package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OilpalmValidationloginpage;

public class OilpalmValidation_steps {
	OilpalmValidationloginpage OilpalmValidationloginpage =new OilpalmValidationloginpage();

	@Given ("^User is login page$")
	public void User_is_login_page() throws Throwable {
		OilpalmValidationloginpage.User_is_login_page();
		
	}
	@Then ("^Check with Invalid Username and valid password$")
	public void Check_with_Invalid_Username_and_valid_password() throws Throwable {
		OilpalmValidationloginpage.Check_with_Invalid_Username_and_valid_password();
}
	@And ("^Clicks on the login button$")
	public void Clicks_on_the_login_button() throws Throwable {
		OilpalmValidationloginpage.Clicks_on_the_login_button();
}
	@Then("^login with Valid credentials$")
	public void login_with_Valid_credentials() throws Throwable {
		OilpalmValidationloginpage.login_with_Valid_credentials();
		
	}
	@And ("^Navigate to the Dashboard page$")
	public void Navigate_to_the_Dashboard_page() throws Throwable {
		OilpalmValidationloginpage.Navigate_to_the_Dashboard_page();
	}
	@When ("^user click on the module snapshot$")
	public void user_click_on_the_module_snapshot() throws Throwable {
		OilpalmValidationloginpage.user_click_on_the_module_snapshot();
}
	@Then ("^Click on the Farmermaster submodule$")
	public void Click_on_the_Farmermaster_submodule() throws Throwable {
		OilpalmValidationloginpage.Click_on_the_Farmermaster_submodule();
}
	@And ("^user select location from the grid page$")
	public void user_select_location_from_the_grid_page() throws Throwable {
		OilpalmValidationloginpage.user_select_location_from_the_grid_page();
}
	@Then ("^select State from Dropdown option$")
	public void select_State_from_Dropdown_option() throws Throwable {
		OilpalmValidationloginpage.select_State_from_Dropdown_option();
}
	@And ("^click on the District Select option$")
	public void click_on_the_District_Select_option() throws Throwable {
		OilpalmValidationloginpage.click_on_the_District_Select_option();
	}
	@Then ("^check with the Mandal select$")
	public void check_with_the_Mandal_select() throws Throwable {
		OilpalmValidationloginpage.check_with_the_Mandal_select();
}
	@And ("^check with the Village select$")
	public void check_with_the_Village_select() throws Throwable {
		OilpalmValidationloginpage.check_with_the_Village_select();
	}
	@And ("^Check with the fromdate update$")
	public void Check_with_the_fromdate_update() throws Throwable {
		OilpalmValidationloginpage.Check_with_the_fromdate_update();
	}
	@Then ("^Select Date from the Calender view$")
	public void Select_Date_from_the_Calender_view () throws Throwable {
		OilpalmValidationloginpage.Select_Date_from_the_Calender_view ();
	}
	@Then ("^Select farmer from the grid$")
	public void Select_farmer_from_the_grid () throws Throwable {
		OilpalmValidationloginpage.Select_farmer_from_the_grid ();
	}
	@And ("^click on the Edit action button$")
	public void click_on_the_Edit_action_button () throws Throwable {
		OilpalmValidationloginpage.click_on_the_Edit_action_button ();
	}
	@And ("^check personal details with Validations$")
	public void check_personal_details_with_Validations () throws Throwable {
		OilpalmValidationloginpage.check_personal_details_with_Validations ();
	}
	@Then ("^check with Father name validations$")
	public void check_with_Father_name_validations() throws Throwable {
		OilpalmValidationloginpage.check_with_Father_name_validations ();
	}
	@And ("^check with Age details validation$")
	public void check_with_Age_details_validation() throws Throwable {
		OilpalmValidationloginpage.check_with_Age_details_validation ();
   }
   @And ("^Check with address details Validations$")
    public void Check_with_address_details_Validations() throws Throwable {
		OilpalmValidationloginpage.Check_with_address_details_Validations ();
   }
   @And ("^Check with Address2 details validations$")
   public void Check_with_Address2_details_Validations() throws Throwable {
		OilpalmValidationloginpage.Check_with_Address2_details_Validations ();
   }
   @Then ("^check with State details validations$")
   public void check_with_State_details_validations() throws Throwable {
		OilpalmValidationloginpage.check_with_State_details_validations ();
    }
   @And ("^check with District details validations$")
   public void check_with_District_details_validations() throws Throwable {
		OilpalmValidationloginpage.check_with_District_details_validations ();
   }
   @And ("^check with Mandal details validations$")
   public void check_with_Mandal_details_validations() throws Throwable {
		OilpalmValidationloginpage.check_with_Mandal_details_validations ();
}
   @Then ("^check with Village details validations$")
   public void check_with_Village_details_validations() throws Throwable {
		OilpalmValidationloginpage.check_with_Village_details_validations ();
}

   @And ("^check with Mobileno details validations$")
   public void check_with_Mobileno_details_validations() throws Throwable {
		OilpalmValidationloginpage.check_with_Mobileno_details_validations ();
   }
   @Then ("^check with Identityproof Validations$")
   public void check_with_Identityproof_Validations() throws Throwable {
		OilpalmValidationloginpage.check_with_Identityproof_Validations ();
}
   @Then ("^click on the Cancel action button$")
   public void click_on_the_Cancel_action_button() throws Throwable {
		OilpalmValidationloginpage.click_on_the_Cancel_action_button ();
}
   @And ("^check with the Bank update validations$")
   public void check_with_the_Bank_update_validations() throws Throwable {
		OilpalmValidationloginpage.check_with_the_Bank_update_validations ();
}
   @Then ("^check with account no validations$")
   public void check_with_account_no_validations() throws Throwable {
		OilpalmValidationloginpage.check_with_account_no_validations ();
}
   @And ("^check with Accountholder name validations$")
   public void check_with_Accountholder_name_validations() throws Throwable {
		OilpalmValidationloginpage.check_with_Accountholder_name_validations ();
   
}
  @And ("^check with Ifsc code field validations$")
  public void check_with_Ifsc_code_field_validations() throws Throwable {
		OilpalmValidationloginpage.check_with_Ifsc_code_field_validations ();
  
}
  @Then ("^click on the cancel button from updatedetails$")
  public void click_on_the_cancel_button_from_updatedetails() throws Throwable {
		OilpalmValidationloginpage.click_on_the_cancel_button_from_updatedetails ();
}
}