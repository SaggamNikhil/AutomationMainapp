package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Oilpalmloginpage;

public class Oilpalmloginpage_steps {
	Oilpalmloginpage Oilpalmloginpage = new Oilpalmloginpage();

	@Given("^User is on login screen$")
	public void User_is_on_login_screen() throws Throwable {
		Oilpalmloginpage.User_is_on_login_screen();
	}

	@When("^User enter username and password$")
	public void User_enter_username_and_password() throws Throwable {
		Oilpalmloginpage.User_enter_username_and_password();
	}

	@And("^Clicks With the logins button$")
	public void Clicks_With_the_logins_button() throws Throwable {
		Oilpalmloginpage.Clicks_With_the_logins_button();
	}
	@Then ("^Click on the Otp submit button$")
	public void Click_on_the_Otp_submit_button() throws Throwable {
		Oilpalmloginpage.Click_on_the_Otp_submit_button();
	}
	@Then("^Navigate to the Dashboard falsh screen$")
	public void Navigate_to_the_Dashboard_falsh_screen() throws Throwable {
		Oilpalmloginpage.Navigate_to_the_Dashboard_falsh_screen();
	}
	@Then ("^Check with the Invalid Username and valid password$")
	public void Check_with_the_Invalid_Username_and_valid_password() throws Throwable {
		Oilpalmloginpage.Check_with_the_Invalid_Username_and_valid_password();
}

}

	