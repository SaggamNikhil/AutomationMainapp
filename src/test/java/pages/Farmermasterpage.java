package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class Farmermasterpage extends DriverFactory {
	Utilities utilities    = new Utilities();
    
	By username            = By.xpath("//input[@type='text']");
	By password            = By.xpath("//input[@type='password']");
	By Login               = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Otp_submit_check    = By.xpath("//button[@ng-click='submit(login)']");
	By sidebar             = By.xpath("//a[@class='sidebar-toggle']");
	By snapshot            = By.xpath("//span[text()='Snapshot']");
	By Farmermaster        = By.xpath("//li[@class='ng-scope']/./a[@href='#/farmer']");
	By Selecting_Farmer_Id = By.xpath("(//tr[@class='ng-scope']/td[@ng-click='showFarmerDetails(row, $event)'])[3]");
	By From_select         = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By Search_Click        = By.xpath("(//button[@class='btn btn-sm btn-theme'])[1]");
	By Farmer_Edit         = By.xpath("(//button[@class='btn btn-sm btn-theme'])[2]");
	By First_name          = By.xpath("//input[@name='FarmerFirstName']");
	By Last_name           = By.xpath("//input[@name='FarmerLastName']");
	By Father_name         = By.xpath("//input[@name='GuardianName']");
	By Date_selection      = By.xpath("//input[@class='md-datepicker-input md-input']");
	By Address1            = By.xpath("//input[@ng-model='farmerEdit.AddressLine1']");
	By Address2            = By.xpath("//input[@ng-model='farmerEdit.AddressLine2']");
	By Landmark            = By.xpath("//input[@ng-model='farmerEdit.Landmark']");
	By State_selection     = By.xpath("//input[@id='fl-input-22']");
	By DropDown_select     = By.xpath("//li[@ng-click='$mdAutocompleteCtrl.select($index)']");
	By District            = By.xpath("//input[@id='fl-input-23']");
	By District_select     = By.xpath("//span[text()='West Godavari - WG']");
	By Mandal              = By.xpath("//input[@id='fl-input-24']");
	By Mandal_Select       = By.xpath("//span[text()='Tadepalligudem - TP']");
	By Village             = By.xpath("//input[@id='fl-input-25']");
	By Village_select      = By.xpath("//span[text()='Amruthapuram - AM']");
	By Contact_no          = By.xpath("//input[@ng-model='farmerEdit.ContactNumber']");
	By Sourceof_Contact    = By.xpath("//md-select-value[@id='select_value_label_5']");
	By Change_source_opt   = By.xpath("//md-option[@id='select_option_40']");
	By category            = By.xpath("//md-select[@ng-model='farmerEdit.CategoryTypeId']");
	By Change_category     = By.xpath("//md-option[@id='select_option_44']");
	By Annual_Income       = By.xpath("//md-select[@ng-model='farmerEdit.AnnualIncomeTypeId']");
	By Modify_Ann_inc      = By.xpath("//md-option[@id='select_option_53']");
	By Education           = By.xpath("//md-select[@ng-model='farmerEdit.EducationTypeId']");
	By Education_opt_chg   = By.xpath("//md-option[@id='select_option_60']");
	By Farmer_pi           = By.xpath("//input[@id='fileInputFarmer']");
	By Save_Click          = By.xpath("//button[@ng-click='updateFarmer(farmerEdit)']");
	
	By Aadhar_edit         = By.xpath("//button[@ng-click ='editIdentityProof(row)']");
	By Click_event         = By.xpath("//md-input-container[@class='ng-scope md-input-has-value']");
	By Enter_aadhar        = By.xpath("(//input[@ng-model='rowEdit.IdProofNumber'])[2]");
	By update_aadhar       = By.xpath("//button[@class='btn btn-success btn-xs ng-scope']");
	By Bank_Update         = By.xpath("(//div[@class='pull-right']//button)[2]");
	By Enter_accountno     = By.xpath("//input[@ng-model='BankRequest.AccountNumber']");
	By Update_accountname  = By.xpath("//input[@ng-model='BankRequest.AccountHolderName']");
	By Ifsc_code           = By.xpath("//input[@name='IFSCcode']");
	By Select_Ifsc		   = By.xpath("//span[text()='SBIN0011663']");
	By Bank_pi             = By.xpath("//input[@id='fileInput']");
	By updateby_bank       = By.xpath("//button[@ng-click='updateFarmerBank(BankRequest)']");
	

	public void User_is_on_login_page_nav() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);

	}

	public void User_enters_username_and_password() throws Throwable {
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.MinimumWait(driver);

	}

	public void Clicks_on_login_button() throws Throwable {
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
		
	}
	public void Click_on_the_Otp_opt_submit_button() throws Throwable {
		  utilities.webDriverWait(driver,Otp_submit_check);
		   driver.findElement(Otp_submit_check).click();
		   utilities.MaximumWait(driver);
	}
	public void Navigate_to_the_Dashboard_home_screen() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MaximumWait(driver);
	}

	public void user_click_on_the_snapshot_module_name() throws Throwable {
		utilities.webDriverWait(driver, snapshot);
		driver.findElement(snapshot).click();
		utilities.MaximumWait(driver);
	}

	public void Click_on_the_Farmermaster_screen() throws Throwable {
		utilities.webDriverWait(driver, Farmermaster);
		driver.findElement(Farmermaster).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, From_select);
		driver.findElement(From_select).clear();
		driver.findElement(From_select).sendKeys("01/11/2023");
		utilities.MaximumWait(driver);
	}
		public void Click_on_the_Search_button() throws Throwable {
		utilities.webDriverWait(driver, Search_Click);
		driver.findElement(Search_Click).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Selecting_Farmer_Id);
		driver.findElement(Selecting_Farmer_Id).click();
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

	public void Check_with_Farmer_Edit_button_click() throws Throwable {
		utilities.webDriverWait(driver, Farmer_Edit);
		driver.findElement(Farmer_Edit).click();
		utilities.MaximumWait(driver);
	}

	public void User_able_firstname_update_details() throws Throwable {
		utilities.webDriverWait(driver, First_name);
		driver.findElement(First_name).clear();
		driver.findElement(First_name).sendKeys("kotesh");
		utilities.MaximumWait(driver);

	}

	public void Update_with_Lastname_details() throws Throwable {
		utilities.webDriverWait(driver, Last_name);
		driver.findElement(Last_name).clear();
		driver.findElement(Last_name).sendKeys("auto user");
		utilities.MaximumWait(driver);

	}

	public void User_enters_input_for_Fathername() throws Throwable {
		utilities.webDriverWait(driver, Father_name);
		driver.findElement(Father_name).clear();
		driver.findElement(Father_name).sendKeys("Father");
		utilities.MaximumWait(driver);

	}

	public void Enter_Manual_inputs_in_dateofbirth_field() throws Throwable {
		utilities.webDriverWait(driver, Date_selection);
		driver.findElement(Date_selection).clear();
		driver.findElement(Date_selection).sendKeys("18/11/1995");
		utilities.MaximumWait(driver);

	}

	public void Update_with_Address1_details() throws Throwable {
		utilities.webDriverWait(driver, Address1);
		driver.findElement(Address1).clear();
		driver.findElement(Address1).sendKeys("Street number line1");
		utilities.MaximumWait(driver);

	}

	public void Update_with_Address2_details() throws Throwable {
		utilities.webDriverWait(driver, Address2);
		driver.findElement(Address2).clear();
		driver.findElement(Address2).sendKeys("Abc line street1");
		utilities.MaximumWait(driver);

	}

	public void Update_with_Landmark_details() throws Throwable {
		utilities.webDriverWait(driver, Landmark);
		driver.findElement(Landmark).clear();
		driver.findElement(Landmark).sendKeys("Near Abcd Building road");
		utilities.MaximumWait(driver);

	}

	public void Update_with_State_selection() throws Throwable {
		utilities.webDriverWait(driver, State_selection);
		driver.findElement(State_selection).clear();
		driver.findElement(State_selection).click();
		driver.findElement(DropDown_select).click();
		utilities.MaximumWait(driver);

	}

	public void Update_With_District_Selection() throws Throwable {
		utilities.webDriverWait(driver, District);
		driver.findElement(District).clear();
		driver.findElement(District).click();
		driver.findElement(District_select).click();
		utilities.MaximumWait(driver);
	}

	public void Update_With_Mandal_Selection() throws Throwable {
		utilities.webDriverWait(driver, Mandal);
		driver.findElement(Mandal).clear();
		driver.findElement(Mandal).click();
		driver.findElement(Mandal_Select).click();
		utilities.MaximumWait(driver);

	}

	public void User_update_with_Village_details() throws Throwable {
		utilities.webDriverWait(driver, Village);
		driver.findElement(Village).clear();
		driver.findElement(Village).click();
		driver.findElement(Village_select).click();
		utilities.MaximumWait(driver);

	}

	public void User_Update_Contact_number_details() throws Throwable {
		utilities.webDriverWait(driver, Contact_no);
		driver.findElement(Contact_no).clear();
		driver.findElement(Contact_no).sendKeys("1752441119");
		utilities.MaximumWait(driver);

	}

	public void Update_with_source_of_contact() throws Throwable {
		utilities.webDriverWait(driver, Sourceof_Contact);
		driver.findElement(Sourceof_Contact).click();
		driver.findElement(Change_source_opt).click();
		utilities.MaximumWait(driver);

	}

	public void Update_With_Category_details() throws Throwable {
		utilities.webDriverWait(driver, category);
		driver.findElement(category).click();
		driver.findElement(Change_category).click();
	}

	public void modify_with_Annual_income() throws Throwable {
		utilities.webDriverWait(driver, Annual_Income);
		driver.findElement(Annual_Income).click();
		driver.findElement(Modify_Ann_inc).click();

	}

	public void User_update_with_Eduction_details() throws Throwable {
		utilities.webDriverWait(driver, Education);
		driver.findElement(Education).click();
		driver.findElement(Education_opt_chg).click();
		utilities.MaximumWait(driver);

	}

	public void Check_with_Img_sel() throws Throwable {
		utilities.webDriverWait(driver, Farmer_pi);
		driver.findElement(Farmer_pi).sendKeys("D:/3f/Img/farmer.jpeg");
		utilities.MaximumWait(driver);

	}

	public void Click_on_save_button() throws Throwable {
		utilities.webDriverWait(driver, Save_Click);
		driver.findElement(Save_Click).click();
		utilities.MaximumWait(driver);

	}

	public void User_update_IdentityProof() throws Throwable {
		utilities.webDriverWait(driver, Aadhar_edit);
		driver.findElement(Aadhar_edit).click();
		driver.findElement(Click_event).click();
		utilities.MaximumWait(driver);

	}

	public void Enter_aadhar_number_details() throws Throwable {
		utilities.webDriverWait(driver, Enter_aadhar);
		driver.findElement(Enter_aadhar).click();
		driver.findElement(Enter_aadhar).clear();
		driver.findElement(Enter_aadhar).sendKeys("143366623469");
		utilities.MaximumWait(driver);

	}

	public void Click_on_the_Submit_button() throws Throwable {
		utilities.webDriverWait(driver, update_aadhar);
		driver.findElement(update_aadhar).click();
		utilities.MaximumWait(driver);

	}

	public void Click_on_the_Bank_update_details() throws Throwable {
		utilities.webDriverWait(driver, Bank_Update);
		driver.findElement(Bank_Update).click();
		utilities.MaximumWait(driver);
		
	}

	public void Update_account_number_input_field() throws Throwable {
		utilities.webDriverWait(driver, Enter_accountno);
		driver.findElement(Enter_accountno).click();
		driver.findElement(Enter_accountno).sendKeys("133335646149147");
		utilities.MaximumWait(driver);
		
	}

	public void Update_with_Account_name_input_field() throws Throwable {
		utilities.webDriverWait(driver, Update_accountname);
		driver.findElement(Update_accountname).click();
		driver.findElement(Update_accountname).sendKeys("kotesh");
		utilities.MaximumWait(driver);
		
		
	}

	public void Check_with_Ifsc_code() throws Throwable {
		utilities.webDriverWait(driver, Ifsc_code);
		driver.findElement(Ifsc_code).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Ifsc_code).click();
		utilities.MaximumWait(driver);
        driver.findElement(Select_Ifsc).click();
		utilities.MaximumWait(driver);

		
	}

	public void user_update_with_Bankimage() throws Throwable {
		utilities.webDriverWait(driver, Bank_pi);
		driver.findElement(Bank_pi).sendKeys("D:/3f/Img/passbook.jpeg");
		utilities.MaximumWait(driver);
		
	}

	public void Click_on_the_Update_button() throws Throwable {
		utilities.webDriverWait(driver, updateby_bank );
		driver.findElement(updateby_bank).click();
		utilities.MaximumWait(driver);
		
	}




	
	
	

}
