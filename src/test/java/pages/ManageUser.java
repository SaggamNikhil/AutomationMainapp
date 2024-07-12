package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class ManageUser extends DriverFactory {
	Utilities utilities    = new Utilities();
	By username            = By.xpath("//input[@type='text']");
	By password            = By.xpath("//input[@type='password']");
	By Login               = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Dashboard           = By.xpath("//section[@class='content-header']");
	By sidebar_Navgat      = By.xpath("//a[@class='sidebar-toggle']");
	By settings_module     = By.xpath("//span[text()='Settings']");
	By User_menu           = By.xpath("//span[text()='User']");
	By Manage_user_click   = By.xpath("//a[@href='#/user']");
	By Add_new_user        = By.xpath("//button[@ng-click='addNewUser()']");
	By Firstname_ip        = By.xpath("//input[@ng-model='addForm.FirstName']");
	By First_name_toast    = By.xpath("//div[@ng-messages='rowForm.FirstName.$error']");
	By lastname_ip         = By.xpath("//input[@ng-model='addForm.LastName']");
	By lastname_toast      = By.xpath("//div[@ng-messages='rowForm.LastName.$error']");
	By username_click      = By.xpath("//input[@ng-model='addForm.UserName']");
	By usernaem_toasts     = By.xpath("//div[@ng-messages='rowForm.UserName.$error']");
	By password_ip_click   = By.xpath("//input[@ng-model='addForm.Password']");
	By password_toasts     = By.xpath("//div[@ng-messages='rowForm.Password.$error']");
	By Confirm_password_ip = By.xpath("//input[@ng-model='addForm.ConfirmPassword']");
	By Contact_number_ip   = By.xpath("//input[@ng-model='addForm.ContactNumber']");
    By Contact_num_toasts  = By.xpath("//div[@ng-messages='rowForm.ContactNumber.$error']");
    By Role_selection      = By.xpath("//md-select[@ng-model='addForm.RoleId']");
    By Role_toast_msg      = By.xpath("//div[@ng-messages='rowForm.RoleId.$error']");
    By Role_option_sel     = By.xpath("(//md-option[@value='22'])[4]");
    By Final_assessment    = By.xpath("//md-select[@ng-model='addForm.FinalAssessmentDoneBy']");
    By Final_assessment_c  = By.xpath("//div[text()='admin admin ']");
    By reporting_man_click = By.xpath("//md-select[@ng-model='addForm.ManagerId']");
    By reporting_man_opt   = By.xpath("(//div[text()='Adinarayana Toleti'])[3]");
    By L1_manager_click    = By.xpath("//md-select[@ng-model='addForm.L1ManagerId']");
    By L1_mana_opt_selct   = By.xpath("(//div[text()='Ajay Babu Veeramalla'])[3]");
    By L2_manager_click    = By.xpath("//md-select[@ng-model='addForm.L2ManagerId']");
    By L2_man_opt_select   = By.xpath("(//div[text()='Anand Gouda'])[3]");
    By Employee_code_click = By.xpath("//input[@ng-model='addForm.EmployeeCode']");
    By Employee_toast      = By.xpath("//div[@ng-messages='rowForm.EmployeeCode.$error']");
    By State_sel_click     = By.xpath("//md-select[@ng-model='selectedStates']");
    By State_sel_opt       = By.xpath("//div[text()='AP - Andhra Pradesh']");
    By state_sel_opt_two   = By.xpath("//div[text()='AR - Arunachal Pradesh']");
    By Cluster_click       = By.xpath("//md-select[@ng-model='GeoLocation.ClusterIds']");
    By Cluster_opt_one     = By.xpath("//div[text()='AS - A.S.Peta']");
    By Cluster_opt_two     = By.xpath("//div[text()='AB - Amberpeta']");
    By Select_office_type  = By.xpath("//md-select[@ng-model='addForm.OfficeTypeId']");
    By Save_click          = By.xpath("//button[@ng-click='addNewUser(addForm)']");
    
	public void User_is_on_login_page_screen_of_oilpalm_projects() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		utilities.MaximumWait(driver);
	}

	public void The_User_enter_with_the_valid_username_and_password_inputs_details() throws Throwable {
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void the_page_will_be_Navigated_to_the_Dashboards_home_menu_pages_details() throws Throwable {
		utilities.webDriverWait(driver, Dashboard);
		WebElement message = driver.findElement(Dashboard);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, sidebar_Navgat);
		driver.findElement(sidebar_Navgat).click();
		utilities.MinimumWait(driver);
	}

	public void check_with_the_click_on_the_Settings_modules() throws Throwable {
		utilities.webDriverWait(driver, settings_module);
		driver.findElement(settings_module).click();
		utilities.MaximumWait(driver);
		driver.findElement(User_menu).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_click_on_the_Manage_user_screen() throws Throwable {
		utilities.webDriverWait(driver, Manage_user_click);
		driver.findElement(Manage_user_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Click_on_the_Add_user_action_button() throws Throwable {
		utilities.webDriverWait(driver, Add_new_user);
		driver.findElement(Add_new_user).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_First_name_input_field_details() throws Throwable {
		utilities.webDriverWait(driver, Firstname_ip);
		driver.findElement(Firstname_ip).sendKeys("Ram sr");
		utilities.MaximumWait(driver);
		driver.findElement(Firstname_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(First_name_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		String maxLengthInput = "A while back";
		driver.findElement(Firstname_ip).sendKeys(maxLengthInput);
		utilities.MaximumWait(driver);
		String inputValue = driver.findElement(Firstname_ip).getAttribute("value");
		int actualLength = inputValue.length();
		int expectedMaxLength = 10;
		System.out.println("Input value length: " + actualLength);
		System.out.println("Input value: " + inputValue);

		if (actualLength == expectedMaxLength) {
			System.out.println("Maximum length validation passed.");
		} else {
			System.out.println(
					"Maximum length validation failed. Expected: " + expectedMaxLength + ", Actual: " + actualLength);
		}
		driver.findElement(Firstname_ip).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Firstname_ip).sendKeys("Rama Rao");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Last_name_input_field_details() throws Throwable {
		utilities.webDriverWait(driver, lastname_ip);
		driver.findElement(lastname_ip).sendKeys("Ram sr");
		utilities.MaximumWait(driver);
		driver.findElement(lastname_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(lastname_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		String maxLengthInput = "A while back";
		driver.findElement(lastname_ip).sendKeys(maxLengthInput);
		utilities.MaximumWait(driver);
		String inputValue = driver.findElement(lastname_ip).getAttribute("value");
		int actualLength = inputValue.length();
		int expectedMaxLength = 10;
		System.out.println("Input value length: " + actualLength);
		System.out.println("Input value: " + inputValue);

		if (actualLength == expectedMaxLength) {
			System.out.println("Maximum length validation passed.");
		} else {
			System.out.println(
					"Maximum length validation failed. Expected: " + expectedMaxLength + ", Actual: " + actualLength);
		}
		driver.findElement(lastname_ip).clear();
		utilities.MaximumWait(driver);
		driver.findElement(lastname_ip).sendKeys("Rama Rao");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Username_input_field_details() throws Throwable {
		utilities.webDriverWait(driver, username_click);
		driver.findElement(username_click).sendKeys("Ram sr");
		utilities.MaximumWait(driver);
		driver.findElement(username_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(usernaem_toasts);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		String maxLengthInput = "AwhilebackIneededtocounttheamountoflettersthatapiece";
		driver.findElement(username_click).sendKeys(maxLengthInput);
		utilities.MaximumWait(driver);
		String inputValue = driver.findElement(username_click).getAttribute("value");
		int actualLength = inputValue.length();
		int expectedMaxLength = 50;
		System.out.println("Input value length: " + actualLength);
		System.out.println("Input value: " + inputValue);

		if (actualLength == expectedMaxLength) {
			System.out.println("Maximum length validation passed.");
		} else {
			System.out.println(
					"Maximum length validation failed. Expected: " + expectedMaxLength + ", Actual: " + actualLength);
		}
		driver.findElement(username_click).clear();
		utilities.MaximumWait(driver);
		driver.findElement(username_click).sendKeys("Rama sri");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Password_input_field_validation_details() throws Throwable {
		utilities.webDriverWait(driver, password_ip_click);
		WebElement passwordInput = driver.findElement(password_ip_click);
		String longPassword = "ThisIsAVeryLongPasswordThatExceedsTheMaximumLengthAl";
		passwordInput.sendKeys(longPassword);
		utilities.MaximumWait(driver);
		String enteredPassword = passwordInput.getAttribute("value");
		if (enteredPassword.length() > 50) {
			System.out.println("Password length exceeds 50 characters. Validation failed.");
		} else {
			System.out.println("Password length is within the allowed limit.");
		}
		passwordInput.clear();
		utilities.MaximumWait(driver);
		// Password with exactly 50 characters (should be allowed)
		String validPassword = "ThisIsAPasswordWithExactly50CharactersAllowedyouca";
		passwordInput.sendKeys(validPassword);
		utilities.MaximumWait(driver);
		enteredPassword = passwordInput.getAttribute("value");
		if (enteredPassword.length() == 50) {
			System.out.println("Password length is exactly 50 characters. Validation passed.");
		} else {
			System.out.println("Password length is not exactly 50 characters. Validation failed.");
		}
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Confirm_Password_input_field_validation_details() throws Throwable {
		utilities.webDriverWait(driver, Confirm_password_ip);
		WebElement passwordInput = driver.findElement(Confirm_password_ip);
		String longPassword = "ThisIsAVeryLongPasswordThatExceedsTheMaximumLengthAl";
		passwordInput.sendKeys(longPassword);
		utilities.MaximumWait(driver);
		String enteredPassword = passwordInput.getAttribute("value");
		if (enteredPassword.length() > 50) {
			System.out.println("Confirm Password length exceeds 50 characters. Validation failed.");
		} else {
			System.out.println("Confirm Password length is within the allowed limit.");
		}
		passwordInput.clear();
		utilities.MaximumWait(driver);
		// Password with exactly 50 characters (should be allowed)
		String validPassword = "ThisIsAPasswordWithExactly50CharactersAllowedyouca";
		passwordInput.sendKeys(validPassword);
		utilities.MaximumWait(driver);
		enteredPassword = passwordInput.getAttribute("value");
		if (enteredPassword.length() == 50) {
			System.out.println("Password length is exactly 50 characters. Validation passed.");
		} else {
			System.out.println("Password length is not exactly 50 characters. Validation failed.");
		}
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Contact_number_input_field_validation_details() throws Throwable {
		utilities.webDriverWait(driver, Contact_number_ip);
		driver.findElement(Contact_number_ip).sendKeys("r1231q43223");
		utilities.MaximumWait(driver);
		driver.findElement(Contact_number_ip).clear();
		WebElement message = driver.findElement(Contact_num_toasts);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Contact_number_ip).sendKeys("5468973210369");
		WebElement ActualElement = driver.findElement(Contact_number_ip);
        String contactNumber = ActualElement.getAttribute("value");
        System.out.println("Entered Contact Number: " + contactNumber);
        System.out.println("Length of Contact Number: " + contactNumber.length());
        if (contactNumber.length() > 12) {
        System.out.println("Error: Contact number input exceeds maximum length of 12 characters.");
        } else {
 	    System.out.println("Contact number input is valid: " + contactNumber);
        }	
    }

	public void check_with_the_Role_selection_input_field_validations() throws Throwable {
		utilities.webDriverWait(driver, Role_selection);
		driver.findElement(Role_selection).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Role_toast_msg);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
        driver.findElement(Role_selection).click();
		utilities.MaximumWait(driver);
        driver.findElement(Role_option_sel).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Final_assessment_done_by_input_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Final_assessment);
		driver.findElement(Final_assessment).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
        driver.findElement(Final_assessment).click();
		utilities.MaximumWait(driver);
        driver.findElement(Final_assessment_c).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Reporting_manager_selection_input_field_validations() throws Throwable {
		utilities.webDriverWait(driver, reporting_man_click);
		driver.findElement(reporting_man_click).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
        driver.findElement(reporting_man_click).click();
		utilities.MaximumWait(driver);
        driver.findElement(reporting_man_opt).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_L_one_manager_selection_input_field_validations() throws Throwable {
		utilities.webDriverWait(driver, L1_manager_click);
		driver.findElement(L1_manager_click).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
        driver.findElement(L1_manager_click).click();
		utilities.MaximumWait(driver);
        driver.findElement(L1_mana_opt_selct).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_L_two_manager_selection_input_field_validations() throws Throwable {
		utilities.webDriverWait(driver, L2_manager_click);
		driver.findElement(L2_manager_click).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
        driver.findElement(L2_manager_click).click();
		utilities.MaximumWait(driver);
        driver.findElement(L2_man_opt_select).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Employee_code_input_validation_details() throws Throwable {
		utilities.webDriverWait(driver, Employee_code_click);
		driver.findElement(Employee_code_click).sendKeys("qwerty123456");
		utilities.MaximumWait(driver);
		driver.findElement(Employee_code_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Employee_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Employee_code_click).sendKeys("5468973210369");
		WebElement ActualElement = driver.findElement(Employee_code_click);
        String Employeecode = ActualElement.getAttribute("value");
        System.out.println("Entered Employee code: " + Employeecode);
        System.out.println("Length of Contact Number: " + Employeecode.length());
        if (Employeecode.length() > 10) {
        System.out.println("Error: Contact number input exceeds maximum length of 10 characters.");
        } else {
 	    System.out.println("Contact number input is valid: " + Employeecode);
		utilities.MaximumWait(driver);

        }	

	}

	public void check_with_the_State_selection_dropdown_input_details() throws Throwable {
		utilities.webDriverWait(driver, State_sel_click);
		driver.findElement(State_sel_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_sel_opt).click();
		utilities.MaximumWait(driver);
		driver.findElement(state_sel_opt_two).click();
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);


	}

	public void check_with_the_Cluster_selection_dropdown_input_details() throws Throwable {
		utilities.webDriverWait(driver, Cluster_click);
		driver.findElement(Cluster_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Cluster_opt_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Cluster_opt_two).click();
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_select_office_type_option_details() throws Throwable {
		utilities.webDriverWait(driver, Select_office_type);
		driver.findElement(Select_office_type).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
	    r.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);



	}

	public void check_with_the_click_on_the_Save_action_button() throws Throwable {
		utilities.webDriverWait(driver, Save_click);
		driver.findElement(Save_click).click();
		utilities.MaximumWait(driver);
	}
	
}


