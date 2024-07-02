package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class NurseryFarmerRegistartion extends DriverFactory {
	Utilities utilities        = new Utilities();
	By text                    = By.xpath("//input[@type='text']");
  	By code                    = By.xpath("//input[@type='password']");
  	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
  	By dashboard               = By.xpath("//section[@class='content-header']");
	By sidebar_Ngt             = By.xpath("//a[@class='sidebar-toggle']");
  	By Activities_menu_clk     = By.xpath("//span[text()='Activities']");
  	By Nursery_farmer_reg      = By.xpath("//a[@href='#/outofzone']");
  	By Type_selection          = By.xpath("//md-select[@name='Type']");
  	By Title_select            = By.xpath("//md-select[@name='Title']");
  	By first_name_click        = By.xpath("//input[@name='FarmerFirstName']"); 
  	By Without_first_name      = By.xpath("//div[@ng-messages='farmerForm.FarmerFirstName.$error']");   
  	By Last_name_click         = By.xpath("//input[@name='FarmerLastName']");
  	By Without_lastname        = By.xpath("//div[@ng-messages='farmerForm.FarmerLastName.$error']");
  	By father_name_click       = By.xpath("//input[@name='GuardianName']");
  	By Without_fathername      = By.xpath("//div[@ng-messages='farmerForm.GuardianName.$error']");
  	By Age_ip                  = By.xpath("//input[@name='Age']");
  	By Without_Age_ip          = By.xpath("//div[@ng-messages='farmerForm.Age.$error']");
  	By Gender_ip               = By.xpath("//md-select[@name='Gender']");
  	By Without_gender_sel      = By.xpath("//div[@ng-messages='farmerForm.Gender.$error']");
  	By address_one_ip          = By.xpath("//input[@name='AddressLine1']");
  	By Without_Address_one_ip  = By.xpath("//div[@ng-messages='farmerForm.AddressLine1.$error']");
  	By address_two_ip          = By.xpath("//input[@name='AddressLine2']");
  	By State_name_clk          = By.xpath("//input[@name='StateName']");
  	By Without_state_sel       = By.xpath("//div[@ng-messages='farmerForm.StateName.$error']");
  	By District_name_clk       = By.xpath("//input[@name='DistrictName']");
  	By Without_dis_sel         = By.xpath("//div[@ng-messages='farmerForm.DistrictName.$error']");
  	By Mandal_name_clk         = By.xpath("//input[@name='MandalName']");
  	By Without_mdl_sel         = By.xpath("//div[@ng-messages='farmerForm.MandalName.$error']");
  	By Village_name_clk        = By.xpath("//input[@name='VillageName']");
  	By without_vill_sel        = By.xpath("//div[@ng-messages='farmerForm.VillageName.$error']");
  	By Mobile_no_ip            = By.xpath("//input[@name='ContactNumber']");
  	By Without_mbl_ip          = By.xpath("//div[@ng-messages='farmerForm.ContactNumber.$error']");
  	By Sourceof_contact        = By.xpath("//md-select[@name='SourceOfContactTypeId']");
  	By Without_source_cnt      = By.xpath("//div[@ng-messages='farmerForm.SourceOfContactTypeId.$error']");
  	By Category_sel            = By.xpath("//md-select[@name='CategoryTypeId']");
  	By Without_category        = By.xpath("//div[@ng-messages='farmerForm.CategoryTypeId.$error']");	
  	By Farmer_img_upload       = By.xpath("//input[@name='fileInput']");
  	By Add_Identity_proof_clk  = By.xpath("//button[@ng-click='addNewIdentityProof()']");
 	By Add_identity_none_sel   = By.xpath("//div[@ng-messages='addIDProof.autocompleteField.$error']");
 	By Add_identity_click      = By.xpath("//input[@aria-label='IDProof Type']");
 	By with_out_id_select      = By.xpath("(//div[@ng-messages='addIDProof.IdProofNumber.$error'])[1]"); 
 	By Id_proof_sel            = By.xpath("//span[text()='Aadhar Card']");
 	By ID_number_ip            = By.xpath("(//input[@name='IdProofNumber'])[2]"); 
    By Save_ip_identity        = By.xpath("//button[@aria-label='Save']");
    By account_number_ip       = By.xpath("//input[@name='AccountNumber']");
    By Without_acc_num_ip      = By.xpath("//div[@ng-messages='addBankForm.AccountNumber.$error']");
    By Account_name_ip         = By.xpath("//input[@name='AccountHolderName']");
    By with_out_acc_name_ip    = By.xpath("//div[@ng-messages='addBankForm.AccountHolderName.$error']");
    By Ifsc_code_click         = By.xpath("//input[@name='IFSCCode']");
    By With_out_Ifsc           = By.xpath("//div[@ng-messages='addBankForm.IFSCCode.$error ||addBankForm.IFSCCode.$touched']");
    By Ifsc_code_selection     = By.xpath("//span[text()='SBIN0006835']");
    By bank_img_upload         = By.xpath("//input[@id='BankfileInput']");
    By save_details            = By.xpath("(//button[@class='btn btn-sm btn-theme'])[1]");
 	By Middle_name_ip          = By.xpath("//input[@ng-model='FarmerDetails.MiddleName']");
 	By mother_ip               = By.xpath("//input[@ng-model='FarmerDetails.MotherName']");
 	By Address_three_ip        = By.xpath("//input[@ng-model='FarmerDetails.AddressLine3']");
 	By land_mark_ip            = By.xpath("//input[@ng-model='FarmerDetails.Landmark']");
 	By Alter_mbl_input         = By.xpath("//input[@ng-model='FarmerDetails.MobileNumber']");
 	By Email_ip                = By.xpath("//input[@ng-model='FarmerDetails.Email']");
  	
  	
	public void the_user_has_entered_text_a(String username) throws Throwable {
		driver.get(prop.getProperty("url"));
        utilities.webDriverWait(driver, text);
		 driver.findElement(text).sendKeys(username);
		 utilities.MaximumWait(driver);
		
	}

	public void the_user_has_entered1_text_a(String password) throws Throwable {
		 utilities.webDriverWait(driver, code);
		 driver.findElement(code).sendKeys(password);
		 utilities.MaximumWait(driver);
	}

	public void User_In_the_page_click_on_the_LogIn_button() throws Throwable {
		 utilities.webDriverWait(driver, Login);
		 driver.findElement(Login).click();
		 utilities.MaximumWait(driver);		
	}

	public void the_User_navigated_to_the_dashboard_of_home_page() throws Throwable {
		 utilities.webDriverWait(driver, dashboard);
		 WebElement message = driver.findElement(dashboard);
	     String actualMessage = message.getText();
	     System.out.println("Validation message: " + actualMessage);
		 utilities.MaximumWait(driver);
		 driver.findElement(sidebar_Ngt).click();
		 utilities.MaximumWait(driver);	
	}

	public void check_with_the_user_click_on_the_Activities_screen() throws Throwable {
		utilities.webDriverWait(driver, Activities_menu_clk);
		driver.findElement(Activities_menu_clk).click();
		utilities.MaximumWait(driver);
	}

	public void Check_with_the_click_on_the_Nursery_Farmer_registration_screen() throws Throwable {
		utilities.webDriverWait(driver, Nursery_farmer_reg);
		driver.findElement(Nursery_farmer_reg).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Type_selection_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Type_selection);
		driver.findElement(Type_selection).click();
        utilities.MaximumWait(driver);
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		t.keyPress(KeyEvent.VK_ENTER);
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Title_selection_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Title_select);
		driver.findElement(Title_select).click();
        utilities.MaximumWait(driver);
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		t.keyPress(KeyEvent.VK_ENTER);
        utilities.MaximumWait(driver);
	}

	public void check_with_the_First_name_input_field_validation() throws Throwable {
		utilities.webDriverWait(driver, first_name_click);
		driver.findElement(first_name_click).sendKeys("Nursery farmer one");
        utilities.MaximumWait(driver);
        driver.findElement(first_name_click).clear();
        WebElement message = driver.findElement(Without_first_name);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        driver.findElement(first_name_click).sendKeys("A while back I needed to count the amount of letters");
        utilities.MaximumWait(driver);
        driver.findElement(first_name_click).clear();
        utilities.MaximumWait(driver);
        driver.findElement(first_name_click).sendKeys("Sri@");
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Lastname_input_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Last_name_click);
		driver.findElement(Last_name_click).sendKeys("Nursery farmer one");
        utilities.MaximumWait(driver);
        driver.findElement(Last_name_click).clear();
        WebElement message = driver.findElement(Without_lastname);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        driver.findElement(Last_name_click).sendKeys("A while back I needed to count the amount of letters");
        utilities.MaximumWait(driver);
        driver.findElement(Last_name_click).clear();
        utilities.MaximumWait(driver);
        driver.findElement(Last_name_click).sendKeys("Ram");
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Father_name_input_field_validation() throws Throwable {
		utilities.webDriverWait(driver, father_name_click);
		driver.findElement(father_name_click).sendKeys("Nursery farmer one");
        utilities.MaximumWait(driver);
        driver.findElement(father_name_click).clear();
        WebElement message = driver.findElement(Without_fathername);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        driver.findElement(father_name_click).sendKeys("A while back I needed to count the amount of letters");
        utilities.MaximumWait(driver);
        driver.findElement(father_name_click).clear();
        utilities.MaximumWait(driver);
        driver.findElement(father_name_click).sendKeys("Saikrish@");
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Age_input_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Age_ip);
		driver.findElement(Age_ip).sendKeys("Nursery farmer @ one 12");
        utilities.MaximumWait(driver);
        driver.findElement(Age_ip).clear();
        WebElement message = driver.findElement(Without_Age_ip);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        driver.findElement(Age_ip).sendKeys("25");
        utilities.MaximumWait(driver);
	}

	public void check_with_the_gender_selection_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Gender_ip);
		driver.findElement(Gender_ip).click();
        utilities.MaximumWait(driver);
    	Robot P = new Robot();
		P.keyPress(KeyEvent.VK_TAB);
        utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_gender_sel);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
		driver.findElement(Gender_ip).click();
        utilities.MaximumWait(driver);
        Robot w = new Robot();
		w.keyPress(KeyEvent.VK_DOWN);
		Robot t = new Robot();
        utilities.MinimumWait(driver);
		t.keyPress(KeyEvent.VK_ENTER);
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Address_one_input_field_validations() throws Throwable {
		utilities.webDriverWait(driver, address_one_ip);
		driver.findElement(address_one_ip).sendKeys("Street number1@3");
        utilities.MaximumWait(driver);	
        driver.findElement(address_one_ip).clear();
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(Without_Address_one_ip);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        driver.findElement(address_one_ip).sendKeys("Street Number 123&");
        utilities.MaximumWait(driver);


	}

	public void check_with_the_Address_two_input_field_validations() throws Throwable {
		utilities.webDriverWait(driver, address_two_ip);
		driver.findElement(address_two_ip).sendKeys("Street number1@3");
        utilities.MaximumWait(driver);
        driver.findElement(address_two_ip).clear();
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(Without_Address_one_ip);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        driver.findElement(address_two_ip).sendKeys("Street Number 123&");
        utilities.MaximumWait(driver);
	}

	public void check_with_State_selection_from_the_dropdown_selections() throws Throwable {
		utilities.webDriverWait(driver, State_name_clk);
		driver.findElement(State_name_clk).click();
	    Robot P = new Robot();
	    utilities.MinimumWait(driver);
		P.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
	    P.keyPress(KeyEvent.VK_ENTER);
	    utilities.MaximumWait(driver);
		driver.findElement(State_name_clk).clear();
		utilities.MaximumWait(driver);
        WebElement message = driver.findElement(Without_state_sel);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        driver.findElement(State_name_clk).click();
        Robot p = new Robot();
        utilities.MinimumWait(driver);
        p.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		p.keyPress(KeyEvent.VK_ENTER);
        utilities.MaximumWait(driver);
	}

	public void check_with_the_District_selection_from_the_Dropdown_selections() throws Throwable {
		utilities.webDriverWait(driver, District_name_clk);
		driver.findElement(District_name_clk).click();
	    Robot P = new Robot();
	    utilities.MinimumWait(driver);
		P.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
	    P.keyPress(KeyEvent.VK_ENTER);
	    utilities.MaximumWait(driver);
		driver.findElement(District_name_clk).clear();
		utilities.MaximumWait(driver);
        WebElement message = driver.findElement(Without_dis_sel);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        driver.findElement(District_name_clk).click();
        Robot p = new Robot();
        utilities.MinimumWait(driver);
        p.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		p.keyPress(KeyEvent.VK_ENTER);
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Mandal_selection_from_the_Dropdown_selections() throws Throwable {
		utilities.webDriverWait(driver, Mandal_name_clk);
		driver.findElement(Mandal_name_clk).click();
	    Robot P = new Robot();
	    utilities.MinimumWait(driver);
		P.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
	    P.keyPress(KeyEvent.VK_ENTER);
	    utilities.MaximumWait(driver);
		driver.findElement(Mandal_name_clk).clear();
		utilities.MaximumWait(driver);
        WebElement message = driver.findElement(Without_mdl_sel);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        driver.findElement(Mandal_name_clk).click();
        Robot p = new Robot();
        utilities.MinimumWait(driver);
        p.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		p.keyPress(KeyEvent.VK_DOWN);
	    utilities.MinimumWait(driver);
     	p.keyPress(KeyEvent.VK_ENTER);
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Village_selection_from_the_Dropdown_selections() throws Throwable {
		utilities.webDriverWait(driver, Village_name_clk);
		driver.findElement(Village_name_clk).click();
	    Robot P = new Robot();
	    utilities.MinimumWait(driver);
		P.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
	    P.keyPress(KeyEvent.VK_ENTER);
	    utilities.MaximumWait(driver);
		driver.findElement(Village_name_clk).clear();
		utilities.MaximumWait(driver);
        WebElement message = driver.findElement(without_vill_sel);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        driver.findElement(Village_name_clk).click();
        Robot p = new Robot();
        utilities.MinimumWait(driver);
        p.keyPress(KeyEvent.VK_DOWN);
	    utilities.MinimumWait(driver);
     	p.keyPress(KeyEvent.VK_ENTER);
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Mobile_number_input_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Mobile_no_ip);
		driver.findElement(Mobile_no_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mobile_no_ip).sendKeys("1234657890");
		utilities.MaximumWait(driver);
		driver.findElement(Mobile_no_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_mbl_ip);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Mobile_no_ip).sendKeys("1314121516");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Source_of_contact_Drodown_list_selection() throws Throwable {
		utilities.webDriverWait(driver, Sourceof_contact);
		driver.findElement(Sourceof_contact).click();
	 	utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);	
	 	utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_source_cnt);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
        driver.findElement(Sourceof_contact).click();
        Robot p = new Robot();
        utilities.MinimumWait(driver);
        p.keyPress(KeyEvent.VK_DOWN);
	    utilities.MinimumWait(driver);
     	p.keyPress(KeyEvent.VK_ENTER);
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Category_selection_from_the_Dropdown_list() throws Throwable {
		driver.findElement(Category_sel).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_category);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Category_sel).click();
		  Robot p = new Robot();
	      utilities.MinimumWait(driver);
	      p.keyPress(KeyEvent.VK_DOWN);
		  utilities.MinimumWait(driver);
	      p.keyPress(KeyEvent.VK_ENTER);
	      utilities.MaximumWait(driver);
	}

	public void check_with_the_Farmer_Image_upload_from_the_source_folder() throws Throwable {
		utilities.webDriverWait(driver, Farmer_img_upload);
		driver.findElement(Farmer_img_upload).sendKeys("D:/3f/Img/farmer.jpeg");
		utilities.MaximumWait(driver);
	}

	public void check_with_click_on_the_Add_Identity_proof_details() throws Throwable {
		utilities.webDriverWait(driver, Add_Identity_proof_clk);
		driver.findElement(Add_Identity_proof_clk).click();
		utilities.MaximumWait(driver);
		driver.findElement(Add_identity_click).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Add_identity_none_sel);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Add_identity_click).click();
		utilities.MaximumWait(driver);
        driver.findElement(Id_proof_sel).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Id_proof_number_input_validation() throws Throwable {
		utilities.webDriverWait(driver, ID_number_ip);
		driver.findElement(ID_number_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(ID_number_ip).sendKeys("258963147236");
		utilities.MaximumWait(driver);
		driver.findElement(ID_number_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(with_out_id_select);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(ID_number_ip).sendKeys("259989664133");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_clicking_on_the_save_id_details() throws Throwable {
		utilities.webDriverWait(driver, Save_ip_identity);
		driver.findElement(Save_ip_identity).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Account_Number_field_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, account_number_ip);
		driver.findElement(account_number_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(account_number_ip).sendKeys("45645230416354");
		utilities.MaximumWait(driver);
		driver.findElement(account_number_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_acc_num_ip);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(account_number_ip).sendKeys("356214856325479");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Account_name_field_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Account_name_ip);
		driver.findElement(Account_name_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(Account_name_ip).sendKeys("Account holder Rama ji");
		utilities.MaximumWait(driver);
		driver.findElement(Account_name_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(with_out_acc_name_ip);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Account_name_ip).sendKeys("Rama A while back I needed to c");
		utilities.MaximumWait(driver);
		driver.findElement(Account_name_ip).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Account_name_ip).sendKeys("Rama account");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Ifsc_code_details_input_details_selection() throws Throwable {
		utilities.webDriverWait(driver, Ifsc_code_click);
		driver.findElement(Ifsc_code_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Ifsc_code_selection).click();
		utilities.MaximumWait(driver);
		driver.findElement(Ifsc_code_click).clear();
		WebElement message = driver.findElement(With_out_Ifsc);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Ifsc_code_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Ifsc_code_selection).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Bank_proof_Image_details_Upload() throws Throwable {
		utilities.webDriverWait(driver, bank_img_upload);
		driver.findElement(bank_img_upload).sendKeys("D:/3f/Img/passbook.jpeg");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Save_Bank_details() throws Throwable {
		utilities.webDriverWait(driver, save_details);
		driver.findElement(save_details).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Add_Middle_name_input_details() throws Throwable {
		utilities.webDriverWait(driver, Middle_name_ip);
        driver.findElement(Middle_name_ip).sendKeys("A while back I needed to count the amount of letters");
        utilities.MaximumWait(driver);
        driver.findElement(Middle_name_ip).clear();
        utilities.MaximumWait(driver);
        driver.findElement(Middle_name_ip).sendKeys("S@");
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Add_Mother_name_input_details() throws Throwable {
		utilities.webDriverWait(driver, mother_ip);
        driver.findElement(mother_ip).sendKeys("A while back I needed to count the amount of letters");
        utilities.MaximumWait(driver);
        driver.findElement(mother_ip).clear();
        utilities.MaximumWait(driver);
        driver.findElement(mother_ip).sendKeys("Mathrusri@");
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Add_Address_three_input_details() throws Throwable {
		utilities.webDriverWait(driver, Address_three_ip);
        driver.findElement(Address_three_ip).sendKeys("A while back I needed to count the amount of letters");
        utilities.MaximumWait(driver);
        driver.findElement(Address_three_ip).clear();
        utilities.MaximumWait(driver);
        driver.findElement(Address_three_ip).sendKeys("Street number 3");
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Add_landmark_input_details() throws Throwable {
		utilities.webDriverWait(driver, land_mark_ip);
        driver.findElement(land_mark_ip).sendKeys("A while back I needed to count the amount of letters");
        utilities.MaximumWait(driver);
        driver.findElement(land_mark_ip).clear();
        utilities.MaximumWait(driver);
        driver.findElement(land_mark_ip).sendKeys("Abc Colony@");
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Add_Alter_mobile_number_input_details() throws Throwable {
		utilities.webDriverWait(driver, Alter_mbl_input);
        driver.findElement(Alter_mbl_input).sendKeys("12345679845163445364");
        utilities.MaximumWait(driver);
        driver.findElement(Alter_mbl_input).clear();
        utilities.MaximumWait(driver);
        driver.findElement(Alter_mbl_input).sendKeys("4584594456");
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Email_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Email_ip);
        driver.findElement(Email_ip).sendKeys("abc11~!@g");
        utilities.MaximumWait(driver);
        driver.findElement(Email_ip).clear();
        utilities.MaximumWait(driver);
        driver.findElement(Email_ip).sendKeys("abc@gmail.com");
        utilities.MaximumWait(driver);
	}
}
