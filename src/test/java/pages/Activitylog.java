package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Activitylog extends DriverFactory{
	Utilities utilities       = new Utilities();
	By username               = By.xpath("//input[@type='text']");
	By password               = By.xpath("//input[@type='password']");
	By Login                  = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar                = By.xpath("//a[@class='sidebar-toggle']");
	By snapshot               = By.xpath("//span[text()='Snapshot']");
	By Activity_log_screen    = By.xpath("//a[@href='#/activityLog']");
	By Employee_opt_click     = By.xpath("//md-select[@ng-model='Emp.EmployeeIds']");
	By Sel_employee           = By.xpath("(//div[text()='admin admin - AN'])[1]");
	By Sel_employee_two       = By.xpath("(//div[text()='Srihari Alapati - AA'])[1]");
	By From_date_click        = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By Invalid_date_format    = By.xpath("//div[@ng-messages='rowForm.FromDate.$error']");
	By Search_btn_result      = By.xpath("//button[@ng-click='getReport(request)']");
	By farmer_code_click      = By.xpath("(//a[@ng-click='showFarmerDetails(row, $event)'])[1]");
	By Contact_history        = By.xpath("//button[@ng-click='viewFarmerContctHistory()']");
	By Contact_his_close      = By.xpath("//md-icon[@aria-label='Close dialog']");
	By click_edit_farmer      = By.xpath("//button[@ng-click='editFarmerDetails()']");
	By farmer_Last_name_valid = By.xpath("//input[@ng-model='farmerEdit.LastName']");
	By farmer_name_toast      = By.xpath("//div[@ng-messages='farmerForm.FarmerLastName.$error']");
	By Farmer_father_name_val = By.xpath("//input[@name='GuardianName']");
	By Farmer_father_toast    = By.xpath("//div[@ng-messages='farmerForm.GuardianName.$error']");
	By Farmer_age_chg         = By.xpath("//input[@ng-model='farmerEdit.Age']");
	By Farmer_age_toast       = By.xpath("//div[@ng-messages='farmerForm.Age.$error']");
	By Farmer_address_one_val = By.xpath("//input[@ng-model='farmerEdit.AddressLine1']");
	By Farmer_add_one_toast   = By.xpath("//div[@ng-messages='farmerForm.AddressLine1.$error']");
	By Farmer_address_two_val = By.xpath("//input[@ng-model='farmerEdit.AddressLine2']");
	By Farmer_add_two_toast   = By.xpath("//div[@ng-messages='farmerForm.AddressLine2.$error']");
	By State_sel_option       = By.xpath("//input[@name='StateName']");	
	By State_sel_toast        = By.xpath("//div[@ng-messages='farmerForm.StateName.$error']");
	By State_opt_sel          = By.xpath("//span[text()='Andhra Pradesh - AP']");
	By District_sel_option    = By.xpath("//input[@name='DistrictName']");
	By District_sel_toast     = By.xpath("//div[@ng-messages='farmerForm.DistrictName.$error']");
	By District_opt_sel       = By.xpath("//span[text()='EAST GODAVARI - EG']");
	By Mandal_sel_option      = By.xpath("//input[@name='MandalName']");
	By Mandal_sel_toast       = By.xpath("//div[@ng-messages='farmerForm.MandalName.$error']");
	By Mandal_opt_sel         = By.xpath("//span[text()='Devarapalli-II - DA']");
	By village_sel_option     = By.xpath("//input[@name='VillageName']");
	By village_sel_toast      = By.xpath("//div[@ng-messages='farmerForm.VillageName.$error']");
	By village_opt_sel        = By.xpath("//span[text()='Chinnaigudem - CG']");

	By Mobile_num_sel         = By.xpath("//input[@ng-model='farmerEdit.ContactNumber']");
	By Mobile_num_toast       = By.xpath("//div[@ng-messages='farmerForm.ContactNumber.$error']");
	By Uploaded_i             = By.xpath("//input[@name='fileInputFarmer']");
	By save_btn_click         = By.xpath("//button[@ng-click='updateFarmer(farmerEdit)']");
	By Save_btn_toast_msg     = By.xpath("//div[text()='Farmer Personal Details Updated Successfully']");
	
	By Identity_details_update= By.xpath("//button[@ng-click='editIdentityProof(row)']");
	By Identity_clear         = By.xpath("//div[@ng-messages='rowForm.IdProofNumber.$error']");
	By Identity_num_valid     = By.xpath("(//input[@ng-model='rowEdit.IdProofNumber'])[2]");
	By Proof_Details_edit     = By.xpath("//button[@ng-click='updateIdentityProof(rowEdit,rowForm)']");
	By Id_proof_toast_alert   = By.xpath("//div[text()='Farmer Identity proof Details Updated Successfully']");
	By Bank_details_click     = By.xpath("//button[@ng-click='editFarmerBank()']");
	By Account_no_click       = By.xpath("//input[@ng-model='BankRequest.AccountNumber']");
	By Account_no_valid       = By.xpath("//div[@ng-messages='editBankForm.AccountNumber.$error']");
	By Account_name_clk       = By.xpath("//input[@ng-model='BankRequest.AccountHolderName']");
	By Account_name_toast     = By.xpath("//div[@ng-messages='editBankForm.AccountHolderName.$error']");
	By Ifsc_code_dropdwn_clk  = By.xpath("//input[@name='IFSCcode']");
	By Ifsc_code_toast        = By.xpath("//div[@ng-messages='editBankForm.IFSCcode.$error']");
	By Modify_ifsc_code       = By.xpath("//span[text()='SBIN0011663']");
	By upload_bank_img        = By.xpath("//input[@id='fileInput']");
	By Update_button_cli    = By.xpath("//button[@ng-disabled='editBankForm.$invalid||!IsValid()']");
	By toast_msg_bank      = By.xpath("//div[text()='Farmer Bank Details Updated Successfully']");
	
	
	
	public void login_with_respective_user_role() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);
		
	}


	public void Navigate_to_the_Dashboard_details_screen() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MinimumWait(driver);		
	}


	public void the_user_click_on_the_snapshot_page() throws Throwable {
		utilities.webDriverWait(driver, snapshot);
		driver.findElement(snapshot).click();
		utilities.MinimumWait(driver);		
	}


	public void click_on_the_Activitylogs_screen() throws Throwable {
		utilities.webDriverWait(driver, Activity_log_screen);
		driver.findElement(Activity_log_screen).click();
		utilities.MinimumWait(driver);
	}


	public void check_with_the_Employees_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Employee_opt_click);
		driver.findElement(Employee_opt_click).click();
		utilities.MinimumWait(driver);
		driver.findElement(Sel_employee).click();
		utilities.MinimumWait(driver);
		driver.findElement(Sel_employee_two).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
		}
	public void check_with_From_date_sel_validation() throws Throwable {
		utilities.webDriverWait(driver, From_date_click);
		driver.findElement(From_date_click).clear();
		driver.findElement(From_date_click).sendKeys("01/07/20231");
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Invalid_date_format);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(From_date_click).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_click).sendKeys("01/07/2023");
		utilities.MaximumWait(driver);
	}
	public void click_on_the_search_button_value() throws Throwable {
		utilities.webDriverWait(driver, Search_btn_result);
		driver.findElement(Search_btn_result).click();
		utilities.MaximumWait(driver);
	}
	public void check_with_By_farmer_code_details() throws Throwable {
		utilities.webDriverWait(driver, farmer_code_click);
		driver.findElement(farmer_code_click).click();
		utilities.MaximumWait(driver);
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				utilities.MediumWait(driver);
			}
		}
	}


	public void Click_on_the_Contact_history_button() throws Throwable {
		utilities.webDriverWait(driver, Contact_history);
		driver.findElement(Contact_history).click();
		utilities.MaximumWait(driver);
		driver.findElement(Contact_his_close).click();
		utilities.MaximumWait(driver);

	}


	public void Click_on_the_Edit_action_details_button() throws Throwable {
		utilities.webDriverWait(driver, click_edit_farmer);
	    driver.findElement(click_edit_farmer).click();
	    utilities.MaximumWait(driver);
	}


	public void Check_with_Farmer_Lastname_details_validations() throws Throwable {
		utilities.webDriverWait(driver, farmer_Last_name_valid);
	    driver.findElement(farmer_Last_name_valid).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(farmer_name_toast);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
		driver.findElement(farmer_Last_name_valid).sendKeys("Paddy user !@#");
		utilities.MaximumWait(driver);
	}


	public void check_with_farmer_Fathername_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Farmer_father_name_val);
		driver.findElement(Farmer_father_name_val).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Farmer_father_toast);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
		driver.findElement(Farmer_father_name_val).sendKeys("Rama !@#");
		utilities.MaximumWait(driver);
	}


	public void check_with_Age_input_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Farmer_age_chg);
		driver.findElement(Farmer_age_chg).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Farmer_age_toast);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Farmer_age_chg).sendKeys("27");
		utilities.MaximumWait(driver);

	}


	public void check_with_address_one_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Farmer_address_one_val);
		driver.findElement(Farmer_address_one_val).clear();
		utilities.MaximumWait(driver);		
		WebElement message = driver.findElement(Farmer_add_one_toast);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Farmer_address_one_val).sendKeys("Street $ one");
	}


	public void check_with_address_two_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Farmer_address_two_val);
		driver.findElement(Farmer_address_two_val).clear();
		utilities.MaximumWait(driver);		
		WebElement message = driver.findElement(Farmer_add_two_toast);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Farmer_address_two_val).sendKeys("Street $ one");
	}


	public void check_with_State_sel_Dropdown_validations() throws Throwable {
		utilities.webDriverWait(driver, State_sel_option);
	    driver.findElement(State_sel_option).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(State_sel_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(State_sel_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(State_opt_sel).click();
	    utilities.MaximumWait(driver);
	}


	public void check_with_District_sel_dropdown_validations() throws Throwable {
		utilities.webDriverWait(driver, District_sel_option);
	    driver.findElement(District_sel_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(District_opt_sel).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(District_sel_option).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(District_sel_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(District_sel_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(District_opt_sel).click();
	    utilities.MaximumWait(driver);
	}


	public void check_with_Mandal_sel_dropdown_validations() throws Throwable {
		utilities.webDriverWait(driver, Mandal_sel_option);
	    driver.findElement(Mandal_sel_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Mandal_opt_sel).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Mandal_sel_option).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Mandal_sel_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Mandal_sel_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Mandal_opt_sel).click();
	    utilities.MaximumWait(driver);
	}


	public void check_with_Village_sel_dropdown_validations() throws Throwable {
		utilities.webDriverWait(driver, village_sel_option);
	    driver.findElement(village_sel_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(village_opt_sel).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(village_sel_option).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(village_sel_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(village_sel_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(village_opt_sel).click();
	    utilities.MaximumWait(driver);
	}


	public void check_with_the_Mobile_no_input_validation() throws Throwable {
		utilities.webDriverWait(driver, Mobile_num_sel);
	    driver.findElement(Mobile_num_sel).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Mobile_num_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Mobile_num_sel).sendKeys("3546557870");
	    utilities.MaximumWait(driver);		
	}


	public void check_with_the_Upload_farmer_image_details() throws Throwable {
		utilities.webDriverWait(driver, Uploaded_i);
		driver.findElement(Uploaded_i).sendKeys("D:/3f/Img/farmer.jpeg");
		utilities.MaximumWait(driver);		
	}


	public void check_with_the_save_details() throws Throwable {
		utilities.webDriverWait(driver, save_btn_click);
		driver.findElement(save_btn_click).click();
		utilities.MaximumWait(driver);
		WebElement toastmessage = driver.findElement(Save_btn_toast_msg);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
	}


	public void check_with_the_Identity_proof_details_update() throws Throwable {
		utilities.webDriverWait(driver, Identity_details_update);
		driver.findElement(Identity_details_update).click();
		utilities.MaximumWait(driver);
		driver.findElement(Identity_num_valid).clear();
		WebElement message = driver.findElement(Identity_clear);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Identity_num_valid).sendKeys("266774864566");
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Proof_Details_edit);
		driver.findElement(Proof_Details_edit).click();
		utilities.MaximumWait(driver);
		WebElement toastmessage = driver.findElement(Id_proof_toast_alert);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
	}


	public void check_with_the_Bank_proof_details_update() throws Throwable {
		utilities.webDriverWait(driver, Bank_details_click);
		driver.findElement(Bank_details_click).click();
		utilities.MaximumWait(driver);		
	}


	public void check_with_the_bank_account_no_update() throws Throwable {
		utilities.webDriverWait(driver, Account_no_click);
		driver.findElement(Account_no_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Account_no_valid);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Account_no_click).sendKeys("675456789456156");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Bank_account_name_update() throws Throwable {
		utilities.webDriverWait(driver, Account_name_clk);
		driver.findElement(Account_name_clk).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Account_name_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Account_name_clk).sendKeys("farmer three");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_IFSC_code_update() throws Throwable {
		utilities.webDriverWait(driver, Ifsc_code_dropdwn_clk);
		driver.findElement(Ifsc_code_dropdwn_clk).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Ifsc_code_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Ifsc_code_dropdwn_clk).click();
		utilities.MaximumWait(driver);
	    driver.findElement(Modify_ifsc_code).click();
	}


	public void check_with_the_update_bank_img() throws Throwable {
		utilities.webDriverWait(driver, upload_bank_img);
		driver.findElement(upload_bank_img).sendKeys("D:/3f/Img/passbook.jpeg");
		utilities.MaximumWait(driver);	
	}


	public void check_with_the_save_bank_details() throws Throwable {
		utilities.webDriverWait(driver, Update_button_cli);
		driver.findElement(Update_button_cli).click();
		utilities.MaximumWait(driver);		
		WebElement toastmessage = driver.findElement(toast_msg_bank);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
	}
	
	
	
}
