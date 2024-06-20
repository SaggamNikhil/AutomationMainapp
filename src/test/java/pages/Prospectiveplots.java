package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Prospectiveplots extends DriverFactory{
	Utilities utilities       = new Utilities();
	By username               = By.xpath("//input[@type='text']");
	By password               = By.xpath("//input[@type='password']");
	By Login                  = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar_Nav            = By.xpath("//a[@class='sidebar-toggle']");
	By AreaExtension_module   = By.xpath("//span[text()='Area Extension/Conversion']");
	By Prospective_plots      = By.xpath("//a[@href='#/prosPlots']");
	By Select_loc_grid        = By.xpath("//md-select[@name='GeoLocations']");
	By State_sel_grid         = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By Select_state_grid      = By.xpath("//div[text()='Andhra Pradesh - AP']");
	By Select_state_sel_two   = By.xpath("//div[text()='Arunachal Pradesh - AR']");
	By District_sel_grid      = By.xpath("//md-select[@name='DistrictIds']");
	By District_toast         = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
	By Select_District_one    = By.xpath("//div[text()='EAST GODAVARI - EG']");
	By Select_ditrict_two     = By.xpath("//div[text()='L/Dibang Valley - LD']");
	By Mandal_sel_grid        = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By Mandal_toast           = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
	By Mandal_sel_one         = By.xpath("//div[text()='Devarapalli-II - DA']");
	By Mandal_sel_two         = By.xpath("//div[text()='Roing - RN']");
	By Village_sel_grid       = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By Village_toast          = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
	By village_sel_one        = By.xpath("//div[text()='Alumo - AL']");
	By village_sel_two        = By.xpath("(//div[text()='Yernagudem - YG'])[2]");
	By From_date_sele         = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By from_date_toast        = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_btn_click       = By.xpath("//button[@ng-click='initProspectivePlots(request)']");
	By Select_farmer_click    = By.xpath("(//tr[@ng-click='showFarmerDetails(row, $event)'])[1]");
	By Contact_his_click      = By.xpath("//button[@ng-click='viewFarmerContctHistory()']");
	By contact_popup_close    = By.xpath("//md-icon[@aria-label='Close dialog']");
	By Click_edit_action_btn  = By.xpath("//button[@ng-click='editFarmerDetails()']");
	
	By Farmer_last_name_clk   = By.xpath("//input[@ng-model='farmerEdit.LastName']");
	By Farmer_toast_alt       = By.xpath("//div[@ng-messages='farmerForm.FarmerLastName.$error']");
	By Father_name_clk        = By.xpath("//input[@ng-model='farmerEdit.GuardianName']");
	By Father_name_toast_chk  = By.xpath("//div[@ng-messages='farmerForm.GuardianName.$error']");
	By Age_ip_check           = By.xpath("//input[@name='Age']");
	By Age_ip_toast_clk       = By.xpath("//div[@ng-messages='farmerForm.Age.$error']");
	By Address_one_valid_clk  = By.xpath("//input[@name='AddressLine1']");
	By Address_one_toast_chk  = By.xpath("//div[@ng-messages='farmerForm.AddressLine1.$error']");
	By Address_two_valid_clk  = By.xpath("//input[@name='AddressLine2']");
	By Address_two_toast_chk  = By.xpath("//div[@ng-messages='farmerForm.AddressLine2.$error']");
	By State_selc_ip_clk      = By.xpath("//input[@name='StateName']");
	By State_none_sel_opt     = By.xpath("//div[@ng-messages='farmerForm.StateName.$error']");
	By State_sel_option_chk   = By.xpath("//span[text()='Andhra Pradesh - AP']");
	By District_selec_ip_clk  = By.xpath("//input[@name='DistrictName']");
	By District_valid_alt     = By.xpath("//div[@ng-messages='farmerForm.DistrictName.$error']");
	By District_sel_opt_clk   = By.xpath("//span[text()='EAST GODAVARI - EG']");
	By Mandal_sel_opt         = By.xpath("//input[@name='MandalName']");
	By Mandal_valid_alt       = By.xpath("//div[@ng-messages='farmerForm.MandalName.$error']");
	By Mandal_chng_select     = By.xpath("//span[text()='Devarapalli-II - DA']");
	By Village_sel_opt        = By.xpath("//input[@name='VillageName']");
	By Village_valid_alt      = By.xpath("//div[@ng-messages='farmerForm.VillageName.$error']");
	By Village_chng_selchk    = By.xpath("//span[text()='Chinnaigudem - CG']");
	By Mobile_num_ip_chk      = By.xpath("//input[@ng-model='farmerEdit.ContactNumber']");
	By Mobile_num_valid_clk   = By.xpath("//div[@ng-messages='farmerForm.ContactNumber.$error']");
	By upload_img_farmer      = By.xpath("//input[@name='fileInputFarmer']");
	By Click_save_btn_chk     = By.xpath("//button[@ng-click='updateFarmer(farmerEdit)']");
	By Save_toast_msg         = By.xpath("//div[text()='Farmer Personal Details Updated Successfully']");
	
	By Identity_details_add   = By.xpath("//button[@ng-click='addNewIdentityProof()']");
	By select_proof_type_val  = By.xpath("//input[@name='autocompleteField']");
	By select_proof_type      = By.xpath("//span[text()='Aadhar Card']");
	By Identity_clear_ip      = By.xpath("//div[@ng-messages='addForm.IdProofNumber.$error']");
	By Identity_number_valid  = By.xpath("(//input[@ng-model='proof.IdProofNumber'])[1]");
	By Proof_Details_updt     = By.xpath("//button[@data-ng-click='addIdentityProof(proof)']");
	By Id_proof_toast_msg     = By.xpath("//div[text()='Farmer Identity proof Details Added Successfully']");
	By Id_proof_delete_check  = By.xpath("//button[@ng-click='DeleteIdentityProof(row,ev)']");
	By Id_proof_confirmation  = By.xpath("//button[@ng-click='dialog.hide()']");
	By Bank_details_click     = By.xpath("//button[@ng-click='editFarmerBank()']");
	By Account_no_value_click = By.xpath("//input[@ng-model='BankRequest.AccountNumber']");
	By Account_no_value_check = By.xpath("//div[@ng-messages='editBankForm.AccountNumber.$error']");
	By Account_name_clk       = By.xpath("//input[@ng-model='BankRequest.AccountHolderName']");
	By Account_name_alt       = By.xpath("//div[@ng-messages='editBankForm.AccountHolderName.$error']");
	By Ifsc_code_field_check  = By.xpath("//input[@name='IFSCcode']");
	By Ifsc_code_alert        = By.xpath("//div[@ng-messages='editBankForm.IFSCcode.$error']");
	By chng_ifsc_code_val     = By.xpath("//span[text()='SBIN0011663']");
	By upload_bank_img        = By.xpath("//input[@id='fileInput']");
	By Update_button_click    = By.xpath("//button[@ng-disabled='editBankForm.$invalid||!IsValid()']");
	By toastmessage_bank_clk  = By.xpath("//div[text()='Farmer Bank Details Updated Successfully']");

	
	
	public void First_login_with_Respective_user_role_details() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);		
	}
	public void the_page_is_Navigate_to_the_Dashboard_of_oilpalm_screen() throws Throwable {
		utilities.webDriverWait(driver, sidebar_Nav);
		driver.findElement(sidebar_Nav).click();
		utilities.MinimumWait(driver);
	}
	public void Click_on_the_Areaextension_screen_name() throws Throwable {
		utilities.webDriverWait(driver, AreaExtension_module);
		driver.findElement(AreaExtension_module).click();
		utilities.MaximumWait(driver);	
	}
	public void click_on_the_Prospective_plot_screen() throws Throwable {
		utilities.webDriverWait(driver, Prospective_plots);
		driver.findElement(Prospective_plots).click();
		utilities.MaximumWait(driver);	
	}
	public void Select_Location_type_from_the_grid_view() throws Throwable {
		utilities.webDriverWait(driver, Select_loc_grid);
		driver.findElement(Select_loc_grid).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}
	public void select_state_from_the_grid_view() throws Throwable {
		utilities.webDriverWait(driver, State_sel_grid);
		driver.findElement(State_sel_grid).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_state_grid).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_state_sel_two).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);

	}
	public void select_District_from_the_grid_view() throws Throwable {
		utilities.webDriverWait(driver, District_sel_grid);
		driver.findElement(District_sel_grid).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(District_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(District_sel_grid).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_District_one).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_ditrict_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}
	public void select_mandal_from_the_grid_view() throws Throwable {
		utilities.webDriverWait(driver, Mandal_sel_grid);
		driver.findElement(Mandal_sel_grid).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(Mandal_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Mandal_sel_grid).click();
		utilities.MinimumWait(driver);
		driver.findElement(Mandal_sel_one).click();
		utilities.MinimumWait(driver);
		driver.findElement(Mandal_sel_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}
	public void select_Villages_from_the_grid_view() throws Throwable {
		utilities.webDriverWait(driver, Village_sel_grid);
		driver.findElement(Village_sel_grid).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(Village_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Village_sel_grid).click();
		utilities.MinimumWait(driver);
		driver.findElement(village_sel_one).click();
		utilities.MinimumWait(driver);
		driver.findElement(village_sel_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}
	public void select_from_date_sele_validations() throws Throwable {
		utilities.webDriverWait(driver, From_date_sele);
		driver.findElement(From_date_sele).clear();
		utilities.MinimumWait(driver);
		driver.findElement(From_date_sele).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(from_date_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(From_date_sele).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_sele).sendKeys("01/01/2022");
		utilities.MaximumWait(driver);
	}
	public void click_on_the_search_button_from_the_grid() throws Throwable {
		utilities.webDriverWait(driver, Search_btn_click);
		driver.findElement(Search_btn_click).click();
		utilities.MaximumWait(driver);
	}
	public void select_farmer_code_from_the_grid() throws Throwable {
		utilities.webDriverWait(driver, Select_farmer_click);
		driver.findElement(Select_farmer_click).click();
		utilities.MaximumWait(driver);
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				utilities.MaximumWait(driver);
			}
		}
	}
	public void click_on_the_Contact_history_button() throws Throwable {
		utilities.webDriverWait(driver, Contact_his_click);
		driver.findElement(Contact_his_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(contact_popup_close).click();
		utilities.MaximumWait(driver);
	}
	public void Click_the_Edit_action_button() throws Throwable {
		utilities.webDriverWait(driver, Click_edit_action_btn);
		driver.findElement(Click_edit_action_btn).click();
		utilities.MaximumWait(driver);
	}
	public void check_with_FarmerLast_name_input_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Farmer_last_name_clk);
		driver.findElement(Farmer_last_name_clk).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Farmer_toast_alt);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
		driver.findElement(Farmer_last_name_clk).sendKeys("Raithu two");
		utilities.MaximumWait(driver);		
	}
	public void check_with_Farmer_Father_name_input_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Father_name_clk);
		driver.findElement(Father_name_clk).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Father_name_toast_chk);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Father_name_clk).sendKeys("Sriram");
	}
	public void check_with_Farmer_Age_details_input_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Age_ip_check);
		driver.findElement(Age_ip_check).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Age_ip_toast_clk);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Age_ip_check).sendKeys("28");
		utilities.MaximumWait(driver);
	}
	public void check_with_farmer_address_input_field_validations() throws Throwable {
		utilities.webDriverWait(driver, Address_one_valid_clk);
		driver.findElement(Address_one_valid_clk).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Address_one_toast_chk);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Address_one_valid_clk).sendKeys("Street $ one");
		utilities.MaximumWait(driver);		
	}
	public void check_with_farmer_adddress_two_input_field_validations() throws Throwable {
		utilities.webDriverWait(driver, Address_two_valid_clk);
		driver.findElement(Address_two_valid_clk).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Address_two_toast_chk);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Address_two_valid_clk).sendKeys("Street $ one");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_State_sel_dropdown_field_validation() throws Throwable {
		utilities.webDriverWait(driver, State_selc_ip_clk);
	    driver.findElement(State_selc_ip_clk).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(State_none_sel_opt);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(State_selc_ip_clk).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(State_sel_option_chk).click();
	    utilities.MaximumWait(driver);
	}
	public void check_with_the_District_sel_dropdown_field_validations() throws Throwable {
		utilities.webDriverWait(driver, District_selec_ip_clk);
	    driver.findElement(District_selec_ip_clk).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(District_sel_opt_clk).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(District_selec_ip_clk).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(District_valid_alt);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(District_selec_ip_clk).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(District_sel_opt_clk).click();
	    utilities.MaximumWait(driver);		
	}
	public void check_with_the_Mandal_sel_dropdown_field_validations() throws Throwable {
		utilities.webDriverWait(driver, Mandal_sel_opt);
	    driver.findElement(Mandal_sel_opt).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Mandal_chng_select).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Mandal_sel_opt).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Mandal_valid_alt);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Mandal_sel_opt).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Mandal_chng_select).click();
	    utilities.MaximumWait(driver);
	}
	public void check_with_the_Village_sel_dropdown_field_validations() throws Throwable {
		utilities.webDriverWait(driver, Village_sel_opt);
	    driver.findElement(Village_sel_opt).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Village_chng_selchk).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Village_sel_opt).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Village_valid_alt);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Village_sel_opt).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Village_chng_selchk).click();
	    utilities.MaximumWait(driver);
	}
	public void check_with_the_Mobile_Num_input_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Mobile_num_ip_chk);
	    driver.findElement(Mobile_num_ip_chk).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Mobile_num_valid_clk);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Mobile_num_ip_chk).sendKeys("3345557870");
	    utilities.MaximumWait(driver);
	}
	public void check_with_the_update_farmer_image() throws Throwable {
		utilities.webDriverWait(driver, upload_img_farmer);
		driver.findElement(upload_img_farmer).sendKeys("D:/3f/Img/farmer.jpeg");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Farmer_details_save_button() throws Throwable {
		utilities.webDriverWait(driver, Click_save_btn_chk);
		driver.findElement(Click_save_btn_chk).click();
		utilities.MaximumWait(driver);
		WebElement toastmessage = driver.findElement(Save_toast_msg);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
	}
	public void check_with_the_Identityproof_validation() throws Throwable {
		utilities.webDriverWait(driver, Identity_details_add);
		driver.findElement(Identity_details_add).click();
		utilities.MaximumWait(driver);
		driver.findElement(select_proof_type_val).click();
		utilities.MaximumWait(driver);
        driver.findElement(select_proof_type).click();
        Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Add_idproof_details() throws Throwable {
		driver.findElement(Identity_number_valid).click();
		utilities.MaximumWait(driver);
		driver.findElement(Identity_number_valid).sendKeys("359993147652");
		driver.findElement(Identity_number_valid).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Identity_clear_ip);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Identity_number_valid).sendKeys("337774864566");
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Proof_Details_updt);
		driver.findElement(Proof_Details_updt).click();
		utilities.MaximumWait(driver);
		WebElement toastmessage = driver.findElement(Id_proof_toast_msg);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);		
	}
	public void check_with_the_delete_idproof_details() throws Throwable {
		utilities.webDriverWait(driver, Id_proof_delete_check);
		driver.findElement(Id_proof_delete_check).click();
		utilities.MaximumWait(driver);
		driver.findElement(Id_proof_confirmation).click();
		utilities.MaximumWait(driver);

	}
	public void check_with_the_Bank_proof_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Bank_details_click);
		driver.findElement(Bank_details_click).click();
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Account_no_input_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Account_no_value_click);
		driver.findElement(Account_no_value_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Account_no_value_check);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Account_no_value_click).sendKeys("265456789456186");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Account_name_input_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Account_name_clk);
		driver.findElement(Account_name_clk).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Account_name_alt);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Account_name_clk).sendKeys("farmer Account holder$");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_IFSC_code_sel_validation() throws Throwable {
		utilities.webDriverWait(driver, Ifsc_code_field_check);
		driver.findElement(Ifsc_code_field_check).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Ifsc_code_alert);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Ifsc_code_field_check).click();
		utilities.MaximumWait(driver);
	    driver.findElement(chng_ifsc_code_val).click();
	}
	public void check_with_the_Farmer_bank_image_update() throws Throwable {
		utilities.webDriverWait(driver, upload_bank_img);
		driver.findElement(upload_bank_img).sendKeys("D:/3f/Img/passbook.jpeg");
		utilities.MaximumWait(driver);	
	}
	public void check_with_the_Update_bank_details_and_save() throws Throwable {
		utilities.webDriverWait(driver, Update_button_click);
		driver.findElement(Update_button_click).click();
		utilities.MaximumWait(driver);		
		WebElement toastmessage = driver.findElement(toastmessage_bank_clk);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
		utilities.MaximumWait(driver);	

	}

	
	
	
	
}
