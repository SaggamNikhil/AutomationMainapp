package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class NewFarmerRegistration extends DriverFactory {
	Utilities utilities        = new Utilities();
    
	By username                = By.xpath("//input[@type='text']");
 	By password                = By.xpath("//input[@type='password']");
 	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
 	By sidebar_Navgat          = By.xpath("//a[@class='sidebar-toggle']");
 	By Activities_menu_click   = By.xpath("//span[text()='Activities']");
 	By New_farmer_reg_menu     = By.xpath("//a[@href='#/newFarmerReg']");
 	By farmer_title_selec      = By.xpath("//md-select[@ng-model='FarmerDetails.TitleTypeId']");
 	By Title_sel_option        = By.xpath("//div[text()='Dr']");
 	By First_name_click        = By.xpath("//input[@name='FirstName']");
 	By with_out_firstname      = By.xpath("//div[@ng-messages='farmerForm.FirstName.$error']");
 	By Middle_name_click       = By.xpath("//input[@ng-model='FarmerDetails.MiddleName']");
 	By last_name_click         = By.xpath("//input[@ng-model='FarmerDetails.LastName']");
 	By With_out_lastname       = By.xpath("//div[@ng-messages='farmerForm.FarmerLastName.$error']");
 	By farmer_img_upload       = By.xpath("//input[@id='fileInput']");
 	By Father_name_click       = By.xpath("//input[@name='GuardianName']");
 	By With_out_fathername     = By.xpath("//div[@ng-messages='farmerForm.GuardianName.$error']");
 	By Mother_name_click       = By.xpath("//input[@ng-model='FarmerDetails.MotherName']");  
 	By date_of_birth_ip        = By.xpath("//input[@class='md-datepicker-input md-input']");
 	By Gender_select           = By.xpath("//md-select[@name='Gender']");
 	By With_out_Gender_sel     = By.xpath("//div[@ng-messages='farmerForm.Gender.$error']");
 	By Gender_option_select    = By.xpath("//div[text()='Male']");
 	By Address_one             = By.xpath("//input[@ng-model='FarmerDetails.AddressLine1']");
 	By Without_address_one_ip  = By.xpath("//div[@ng-messages='farmerForm.AddressLine1.$error']");
 	By Address_two             = By.xpath("//input[@ng-model='FarmerDetails.AddressLine2']");
 	By Without_address_two_ip  = By.xpath("//div[@ng-messages='farmerForm.AddressLine2.$error']");
 	By Address_three           = By.xpath("//input[@name='AddressLine3']");
 	By Landmark_click          = By.xpath("//input[@name='Landmark']");
 	By Email_input             = By.xpath("//input[@ng-model='FarmerDetails.Email']");
 	By Annualincome_click      = By.xpath("//md-select[@ng-model='FarmerDetails.AnnualIncomeTypeId']");
 	By Annualincome_sel_opt    = By.xpath("//div[text()='3,00,001-5,00,000']");
 	By Education_click         = By.xpath("//md-select[@ng-model='FarmerDetails.EducationTypeId']");
 	By Education_opt_sel       = By.xpath("//div[text()='Graduate']");
 	By State_name_click        = By.xpath("//input[@name='StateName']");
 	By State_name_sel_opt      = By.xpath("//span[text()='Andhra Pradesh - AP']");
 	By With_out_State_sel      = By.xpath("//div[@ng-messages='farmerForm.StateName.$error']");
 	By District_name_click     = By.xpath("//input[@name='DistrictName']");
 	By District_name_sel_opt   = By.xpath("//span[text()='EAST GODAVARI - EG']");
 	By with_out_dist_sel       = By.xpath("//div[@ng-messages='farmerForm.DistrictName.$error']");
 	By Mandal_name_click       = By.xpath("//input[@name='MandalName']");
 	By Mandal_name_sel_opt     = By.xpath("//span[text()='Devarapalli - DP']");
 	By With_out_Mand_sel       = By.xpath("//div[@ng-messages='farmerForm.MandalName.$error']");
 	By Village_name_click      = By.xpath("//input[@name='VillageName']");
 	By Village_name_sel_opt    = By.xpath("//span[text()='Devarapalli - I - DV']");
 	By With_out_Vill_sel       = By.xpath("//div[@ng-messages='farmerForm.VillageName.$error']");
 	By Mobile_num_ip           = By.xpath("//input[@ng-model='FarmerDetails.ContactNumber']");
 	By With_out_mbl_ip         = By.xpath("//div[@ng-messages='farmerForm.ContactNumber.$error']");
 	By Source_of_contact       = By.xpath("//md-select[@ng-model='FarmerDetails.SourceOfContactTypeId']");
 	By With_out_Source_cnct    = By.xpath("//div[@ng-messages='farmerForm.SourceOfContactTypeId.$error']");
 	By Source_of_cont_sel      = By.xpath("//div[text()='Farmer Reference']");
 	By Category_click          = By.xpath("//md-select[@ng-model='FarmerDetails.CategoryTypeId']");
 	By With_out_category       = By.xpath("//div[@ng-messages='farmerForm.CategoryTypeId.$error']");
 	By Category_sel_opt        = By.xpath("//div[text()='BC']");
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
    By Ifsc_code_click         = By.xpath("//input[@name='IFSCcode']");
    By With_out_Ifsc           = By.xpath("//div[@ng-messages='addBankForm.IFSCcode.$error']");
    By Ifsc_code_selection     = By.xpath("//span[text()='SBIN0006835']");
    By bank_img_upload         = By.xpath("//input[@id='BankfileInput']");
    By save_details            = By.xpath("(//button[@class='btn btn-sm btn-theme'])[1]");
 	
 	
	public void the_user_signin_with_the_Respective_users_roles_details() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}


	public void the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_menus_screen() throws Throwable {
		utilities.webDriverWait(driver, sidebar_Navgat);
		driver.findElement(sidebar_Navgat).click();
		utilities.MinimumWait(driver);		
	}


	public void click_on_the_Module_name_of_Activities_module() throws Throwable {
		utilities.webDriverWait(driver, Activities_menu_click);
		driver.findElement(Activities_menu_click).click();
		utilities.MinimumWait(driver);	
	}


	public void click_on_the_Submodule_name_of_New_farmer_Registration_screen() throws Throwable {
		utilities.webDriverWait(driver, New_farmer_reg_menu);
		driver.findElement(New_farmer_reg_menu).click();
		utilities.MinimumWait(driver);	
		
	}


	public void Check_with_the_Title_selection_input_field() throws Throwable {
		utilities.webDriverWait(driver, farmer_title_selec);
		driver.findElement(farmer_title_selec).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);		
		driver.findElement(farmer_title_selec).click();
		utilities.MinimumWait(driver);		
        driver.findElement(Title_sel_option).click();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);	

	}


	public void check_with_the_Firstname_field_input_details() throws Throwable {
	utilities.webDriverWait(driver, First_name_click);
	driver.findElement(First_name_click).sendKeys("First name");
	utilities.MaximumWait(driver);		
	driver.findElement(First_name_click).clear();
	utilities.MaximumWait(driver);		
    WebElement message = driver.findElement(with_out_firstname);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
	utilities.MaximumWait(driver);
	driver.findElement(First_name_click).sendKeys("Rama");
	utilities.MaximumWait(driver);
	driver.findElement(First_name_click).clear();
	utilities.MaximumWait(driver);
	driver.findElement(First_name_click).sendKeys("Rama A while back I needed to count the amount of letters");
	utilities.MaximumWait(driver);
	driver.findElement(First_name_click).clear();
	utilities.MaximumWait(driver);
	driver.findElement(First_name_click).sendKeys("Rama");
	utilities.MaximumWait(driver);



	}


	public void check_with_the_Middlename_field_input_details() throws Throwable {
		utilities.webDriverWait(driver, Middle_name_click);
		driver.findElement(Middle_name_click).sendKeys("First name");
		utilities.MaximumWait(driver);		
		driver.findElement(Middle_name_click).sendKeys("Rama");
		utilities.MaximumWait(driver);
		driver.findElement(Middle_name_click).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Middle_name_click).sendKeys("Rama A while back I needed to count the amount of letters");
		utilities.MaximumWait(driver);
		driver.findElement(Middle_name_click).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Middle_name_click).sendKeys("S");
		utilities.MaximumWait(driver);
		
	}


	public void check_with_the_Lastname_field_input_details() throws Throwable {
		utilities.webDriverWait(driver, last_name_click);
		driver.findElement(last_name_click).sendKeys("First name");
		utilities.MaximumWait(driver);		
		driver.findElement(last_name_click).clear();
		utilities.MaximumWait(driver);		
	    WebElement message = driver.findElement(With_out_lastname);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(last_name_click).sendKeys("Rama");
		utilities.MaximumWait(driver);
		driver.findElement(last_name_click).clear();
		utilities.MaximumWait(driver);
        driver.findElement(last_name_click).sendKeys("Rama A while back I needed to count the amount of letters");
		utilities.MaximumWait(driver);
		driver.findElement(last_name_click).clear();
		utilities.MaximumWait(driver);
		driver.findElement(last_name_click).sendKeys("Rama");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Farmer_image_upload_preview() throws Throwable {
		utilities.webDriverWait(driver, farmer_img_upload);
		driver.findElement(farmer_img_upload).sendKeys("D:/3f/Img/farmer.jpeg");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Father_name_field_input_details() throws Throwable {
		utilities.webDriverWait(driver, Father_name_click);
		driver.findElement(Father_name_click).sendKeys("First name");
		utilities.MaximumWait(driver);		
		driver.findElement(Father_name_click).clear();
		utilities.MaximumWait(driver);		
	    WebElement message = driver.findElement(With_out_fathername);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Father_name_click).sendKeys("Rama");
		utilities.MaximumWait(driver);
		driver.findElement(Father_name_click).clear();
		utilities.MaximumWait(driver);
        driver.findElement(Father_name_click).sendKeys("Rama A while back I needed to count the amount of letters");
		utilities.MaximumWait(driver);
		driver.findElement(Father_name_click).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Father_name_click).sendKeys("Rama");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Mother_name_field_input_details() throws Throwable {
		utilities.webDriverWait(driver, Mother_name_click);
		driver.findElement(Mother_name_click).sendKeys("First name");
		utilities.MaximumWait(driver);		
		driver.findElement(Mother_name_click).sendKeys("Rama");
		utilities.MaximumWait(driver);
		driver.findElement(Mother_name_click).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Mother_name_click).sendKeys("Rama A while back I needed to count the amount of letters");
		utilities.MaximumWait(driver);
		driver.findElement(Mother_name_click).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Mother_name_click).sendKeys("S");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Date_of_birth_field_input_details() throws Throwable {
		utilities.webDriverWait(driver, date_of_birth_ip);
		driver.findElement(date_of_birth_ip).clear();
		driver.findElement(date_of_birth_ip).sendKeys("18/11/1995");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Gender_selection_details() throws Throwable {
		utilities.webDriverWait(driver, Gender_select);
		driver.findElement(Gender_select).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumLongWait(driver);
	    WebElement message = driver.findElement(With_out_Gender_sel);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumLongWait(driver);
		driver.findElement(Gender_option_select).click();
		utilities.MaximumWait(driver);

	}


	public void check_with_the_Address_details_input_validations() throws Throwable {
		utilities.webDriverWait(driver, Address_one);
		driver.findElement(Address_one).click();
		utilities.MaximumWait(driver);		
		driver.findElement(Address_one).sendKeys("address one street");
		utilities.MaximumWait(driver);	
		driver.findElement(Address_one).clear();
		utilities.MaximumWait(driver);	
	    WebElement message = driver.findElement(Without_address_one_ip);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Address_one).sendKeys("Rama");
		utilities.MaximumWait(driver);
		driver.findElement(Address_one).clear();
		utilities.MaximumWait(driver);
        driver.findElement(Address_one).sendKeys("Rama A while back I needed to count the amount of letters");
		utilities.MaximumWait(driver);
		driver.findElement(Address_one).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Address_one).sendKeys("Street line one");
		utilities.MaximumWait(driver);	
	}


	public void check_with_the_Address_two_details_input_validations() throws Throwable {
		utilities.webDriverWait(driver, Address_two);
		driver.findElement(Address_two).click();
		utilities.MaximumWait(driver);
		driver.findElement(Address_two).sendKeys("address one street");
		utilities.MaximumWait(driver);	
		driver.findElement(Address_two).clear();
		utilities.MaximumWait(driver);		
	    WebElement message = driver.findElement(Without_address_two_ip);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Address_two).sendKeys("Rama");
		utilities.MaximumWait(driver);
		driver.findElement(Address_two).clear();
		utilities.MaximumWait(driver);
        driver.findElement(Address_two).sendKeys("Rama A while back I needed to count the amount of letters");
		utilities.MaximumWait(driver);
		driver.findElement(Address_two).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Address_two).sendKeys("Street number 2");
		utilities.MaximumWait(driver);	
	}


	public void check_with_the_State_selection_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, State_name_click);
		driver.findElement(State_name_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_name_sel_opt).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_name_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_State_sel);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(State_name_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_name_sel_opt).click();
		utilities.MaximumWait(driver);



	}


	public void check_with_the_District_selection_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, District_name_click);
		driver.findElement(District_name_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(District_name_sel_opt).click();
		utilities.MaximumWait(driver);
		driver.findElement(District_name_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(with_out_dist_sel);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(District_name_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(District_name_sel_opt).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Mandal_selection_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Mandal_name_click);
		driver.findElement(Mandal_name_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mandal_name_sel_opt).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mandal_name_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_Mand_sel);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Mandal_name_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mandal_name_sel_opt).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Village_selection_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Village_name_click);
		driver.findElement(Village_name_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Village_name_sel_opt).click();
		utilities.MaximumWait(driver);
		driver.findElement(Village_name_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_Vill_sel);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Village_name_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Village_name_sel_opt).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Mobile_number_input_field_validations() throws Throwable {
		utilities.webDriverWait(driver, Mobile_num_ip);
		driver.findElement(Mobile_num_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mobile_num_ip).sendKeys("1234657890");
		utilities.MaximumWait(driver);
		driver.findElement(Mobile_num_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_mbl_ip);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Mobile_num_ip).sendKeys("4567891330");
		utilities.MaximumWait(driver);


	}


	public void check_with_the_Source_of_contact_selection_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Source_of_contact);
		driver.findElement(Source_of_contact).click();
	 	utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);	
	 	utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_Source_cnct);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
        driver.findElement(Source_of_contact).click();
		utilities.MaximumWait(driver);	
        driver.findElement(Source_of_cont_sel).click();
		utilities.MaximumWait(driver);	
	}
	public void check_with_the_Category_selection_from_the_dropdown_field() throws Throwable {
		driver.findElement(Category_click).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_category);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Category_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Category_sel_opt).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Address_three_input_field_details() throws Throwable {
		utilities.webDriverWait(driver, Address_three);
		driver.findElement(Address_three).sendKeys("Street number");
		utilities.MaximumWait(driver);		
		driver.findElement(Address_three).sendKeys("12345");
		utilities.MaximumWait(driver);
		driver.findElement(Address_three).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Address_three).sendKeys("12345 line Rama A while back I needed to count the amount of letters");
		utilities.MaximumWait(driver);
		driver.findElement(Address_three).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Address_three).sendKeys("Street one");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_landmark_input_field_details() throws Throwable {
		utilities.webDriverWait(driver, Landmark_click);
		driver.findElement(Landmark_click).sendKeys("Street number");
		utilities.MaximumWait(driver);		
		driver.findElement(Landmark_click).sendKeys("12345");
		utilities.MaximumWait(driver);
		driver.findElement(Landmark_click).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Landmark_click).sendKeys("12345 line Rama A while back I needed to count the amount of letters");
		utilities.MaximumWait(driver);
		driver.findElement(Landmark_click).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Landmark_click).sendKeys("Street New one");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Email_address_input_validations() throws Throwable {
		utilities.webDriverWait(driver, Email_input);
		driver.findElement(Email_input).sendKeys("abc@gmail.com");
		utilities.MaximumWait(driver);	
		driver.findElement(Email_input).clear();
		utilities.MaximumWait(driver);	
		driver.findElement(Email_input).sendKeys("abc@gmailc.om");
		utilities.MaximumWait(driver);	

	}

	public void check_with_the_Annual_Income_selection_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Annualincome_click);
		driver.findElement(Annualincome_click).click();
		utilities.MaximumWait(driver);		
		driver.findElement(Annualincome_sel_opt).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Education_selection_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Education_click);
		driver.findElement(Education_click).click();
		utilities.MaximumWait(driver);		
		driver.findElement(Education_opt_sel).click();
		utilities.MaximumWait(driver);
	}

	public void Click_on_the_Add_Identity_proof_button() throws Throwable {
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

	public void check_with_Idenityproof_Number_Input_field_validation() throws Throwable {
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
		driver.findElement(ID_number_ip).sendKeys("259989664125");
		utilities.MaximumWait(driver);
		}


	public void click_on_the_Save_button_from_the_Identity_proof_details() throws Throwable {
		utilities.webDriverWait(driver, Save_ip_identity);
		driver.findElement(Save_ip_identity).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Account_number_input_validations_details() throws Throwable {
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
	    driver.findElement(account_number_ip).sendKeys("356214856325478");
		utilities.MaximumWait(driver);


	}


	public void check_with_the_Account_Name_input_validations_details() throws Throwable {
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


	public void check_with_the_IFSC_Code_input_validation_details() throws Throwable {
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


	public void Check_with_the_bank_Image_upload_file() throws Throwable {
		utilities.webDriverWait(driver, bank_img_upload);
		driver.findElement(bank_img_upload).sendKeys("D:/3f/Img/passbook.jpeg");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Save_details() throws Throwable {
		utilities.webDriverWait(driver, save_details);
		driver.findElement(save_details).click();
		utilities.MaximumWait(driver);
	}
}
