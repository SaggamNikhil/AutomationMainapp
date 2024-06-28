package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class Plotsplit extends DriverFactory {
	Utilities utilities = new Utilities();

	By username                = By.xpath("//input[@type='text']");
  	By password                = By.xpath("//input[@type='password']");
  	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
  	By sidebar_Ngt             = By.xpath("//a[@class='sidebar-toggle']");
  	By Activities_menu_click   = By.xpath("//span[text()='Activities']");
  	By Plot_split_navgation    = By.xpath("//a[@href='#/plotSplit']");
  	By Search_farmer           = By.xpath("//input[@aria-label='Select Farmer']");
  	By Without_Search_farmer   = By.xpath("//div[@ng-messages='addForm.autocompleteField.$error']");
  	By Auto_suggestions        = By.xpath("//ul[contains(@class, 'md-autocomplete-suggestions')]/li");
  	By Select_farmer_plot      = By.xpath("(//div[@class='md-container md-ink-ripple'])[1]");
  	By plotdetails_one_farmer  = By.xpath("(//input[@aria-label='Select Farmer'])[2]");
  	By Plotdetails_two_farmer  = By.xpath("(//input[@aria-label='Select Farmer'])[3]");
  	By Total_plot_area_ip      = By.xpath("(//input[@name='TotalPlotArea'])[1]");
  	By Total_plot_area_two_ip  = By.xpath("(//input[@name='TotalPlotArea'])[2]");
  	By With_out_total_plot_ip  = By.xpath("(//div[@ng-messages='plotForm.TotalPlotArea.$error'])[1]");
  	By Without_total_plot_two  = By.xpath("(//div[@ng-messages='plotForm.TotalPlotArea.$error'])[2]");
  	By Total_palm_area_ip      = By.xpath("(//input[@ng-model='addPlot.plotDetails.TotalPalmArea'])[1]");
  	By Total_palm_area_two     = By.xpath("(//input[@ng-model='addPlot.plotDetails.TotalPalmArea'])[2]");
  	By With_out_total_palm_ip  = By.xpath("(//div[@ng-messages='plotForm.TotalPalmArea.$error'])[1]");
  	By With_out_total_two_ip   = By.xpath("(//div[@ng-messages='plotForm.TotalPalmArea.$error'])[2]");
  	By Crop_left_out_area_ip   = By.xpath("(//md-select[@ng-model='addPlot.plotDetails.LeftOutAreaCropId'])[1]");
  	By Crop_left_out_area_two  = By.xpath("(//md-select[@ng-model='addPlot.plotDetails.LeftOutAreaCropId'])[2]");
  	By Survey_no_ip            = By.xpath("(//input[@name='SurveyNumber'])[1]");
  	By Survey_no_two           = By.xpath("(//input[@name='SurveyNumber'])[2]");
  	By Without_survey_no_ip    = By.xpath("(//div[@ng-messages='plotForm.SurveyNumber.$error'])[1]");
  	By Without_survey_two_ip   = By.xpath("(//div[@ng-messages='plotForm.SurveyNumber.$error'])[2]");
  	By Crop_income_ip_sel      = By.xpath("(//md-select[@name='CropIncomeTypeId'])[1]");
  	By Crop_income_ip_two_sel  = By.xpath("(//md-select[@name='CropIncomeTypeId'])[2]");
  	By Checkbox_selc_fencing   = By.xpath("(//md-checkbox[@name='IsBoundryFencing'])[1]");
  	By Checkbox_two_fencing    = By.xpath("(//md-checkbox[@name='IsBoundryFencing'])[2]");
  	By Is_plot_handled_check   = By.xpath("(//md-checkbox[@name='IsPlotHandledByCareTaker'])[1]");
  	By Is_plot_handled_two     = By.xpath("(//md-checkbox[@name='IsPlotHandledByCareTaker'])[2]");
  	By Caretaker_name_ip       = By.xpath("(//input[@name='CareTakerName'])[1]");
  	By Caretaker_name_two_ip   = By.xpath("(//input[@name='CareTakerName'])[2]");
  	By Without_caretaker_ip    = By.xpath("(//div[@ng-messages='plotForm.CareTakerName.$error'])[1]");
  	By Without_caretaker_two   = By.xpath("(//div[@ng-messages='plotForm.CareTakerName.$error'])[2]");
  	By Caretaker_mobile_num    = By.xpath("(//input[@name='CareTakerContactNumber'])[1]");
  	By Caretaker_mobile_num_t  = By.xpath("(//input[@name='CareTakerContactNumber'])[2]");
  	By With_out_mbl_no_ip      = By.xpath("(//div[@ng-messages='plotForm.CareTakerContactNumber.$error'])[1]");
  	By With_out_mbl_no_ip_t    = By.xpath("(//div[@ng-messages='plotForm.CareTakerContactNumber.$error'])[2]");
  	By Landmark_ip             = By.xpath("(//input[@name='Landmark'])[1]");
  	By Landmark_ip_t           = By.xpath("(//input[@name='Landmark'])[2]");
  	By Plantation_action_click = By.xpath("(//button[@ng-click='addNewPlantationDetails(addPlot.Id)'])[1]");
  	By Plantation_action_two   = By.xpath("(//button[@ng-click='addNewPlantationDetails(addPlot.Id)'])[2]");
  	
  	By Sapling_nursery_sele    = By.xpath("(//md-select[@name='NurseryId'])[1]");
  	By Sapling_nursery_two     = By.xpath("(//md-select[@name='NurseryId'])[2]");
  	
  	By Sprouts_vendor          = By.xpath("(//md-select[@ng-model='addPlantation.SaplingVendorId'])[1]");
  	By Sprouts_vendor_t        = By.xpath("(//md-select[@ng-model='addPlantation.SaplingVendorId'])[2]");

  	By Origin_of_saplings_ip   = By.xpath("(//md-select[@name='SaplingSourceId'])[1]");
  	By Origin_of_saplings_ip_t = By.xpath("(//md-select[@name='SaplingSourceId'])[2]");
  	
  	By Cross_ip_sel            = By.xpath("(//md-select[@name='CropVarietyId'])[1]");
  	By Cross_ip_sel_t            = By.xpath("(//md-select[@name='CropVarietyId'])[2]");
  	
  	By Lifted_saplings_ip      = By.xpath("(//input[@ng-model='addPlantation.TreesCount'])[1]");
  	By Lifted_saplings_ip_t    = By.xpath("(//input[@ng-model='addPlantation.TreesCount'])[2]");
  	
  	By Without_Lifted_sap_ip   = By.xpath("(//div[@ng-messages='addPlantationDetails.TreesCount.$error'])[1]");
  	By Without_Lifted_sap_ip_t = By.xpath("(//div[@ng-messages='addPlantationDetails.TreesCount.$error'])[2]");
  	
  	By Planted_saplings_ip     = By.xpath("(//input[@ng-model='addPlantation.SaplingsPlanted'])[1]");
  	By Planted_saplings_ip_t   = By.xpath("(//input[@ng-model='addPlantation.SaplingsPlanted'])[2]");
  	By Without_planted_sap_ip  = By.xpath("(//div[@ng-messages='addPlantationDetails.SaplingsPlanted.$error'])[1]");
  	By Without_planted_sap_ip_t= By.xpath("(//div[@ng-messages='addPlantationDetails.SaplingsPlanted.$error'])[2]");
  	
  	By reason_for_missing_ip   = By.xpath("(//input[@ng-model='addPlot.PlantationDetails.MissingPlantsComments'])[1]");
  	By reason_for_missing_ip_t = By.xpath("(//input[@ng-model='addPlot.PlantationDetails.MissingPlantsComments'])[2]");
  	By Plotownership_chg       = By.xpath("(//md-select[@name='PlotOwnerShip'])[1]");
  	By Plotownership_chg_t     = By.xpath("(//md-select[@name='PlotOwnerShip'])[2]");
  	
  	By Landlord_select         = By.xpath("(//input[@name='LandLordName'])[1]");
  	By Landlord_select_t       = By.xpath("(//input[@name='Landmark'])[2]");
  	
  	By landlordname_ip         = By.xpath("(//label[text()='Landlord Name']/following-sibling::input)[1]");
  	By landlordname_ip_t       = By.xpath("(//label[text()='Landlord Name']/following-sibling::input)[2]");
  	By Landlord_mobile_no      = By.xpath("(//input[@name='LandLordContactNumber'])[1]");
  	By Landlord_mobile_no_t    = By.xpath("(//input[@name='LandLordContactNumber'])[2]");
  	By Mobile_no_ip            = By.xpath("(//input[@name='LandLordContactNumber'])[1]");
  	By Mobile_no_ip_t          = By.xpath("(//input[@name='LandLordContactNumber'])[2]");
  	By Lease_start_date        = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
  	By Lease_start_date_t      = By.xpath("(//input[@class='md-datepicker-input md-input'])[3]");
  	By no_lease_start_date     = By.xpath("(//div[@ng-messages='addPlotOwner.LeaseStartDate.$error'])[1]");
  	By no_lease_start_date_t   = By.xpath("(//div[@ng-messages='addPlotOwner.LeaseStartDate.$error'])[2]");
  	
  	By Lease_End_date          = By.xpath("(//input[@class='md-datepicker-input md-input'])[2]");
  	By Lease_End_date_t        = By.xpath("(//input[@class='md-datepicker-input md-input'])[4]");
	By no_lease_end_date       = By.xpath("(//div[@ng-messages='addPlotOwner.LeaseEndDate.$error'])[1]");
	By no_lease_end_date_t     = By.xpath("(//div[@ng-messages='addPlotOwner.LeaseEndDate.$error'])[2]");
	
	
	By Id_proof_sel            = By.xpath("(//md-select[@name='IDProofTypeId'])[1]");
	By Id_proof_sel_t          = By.xpath("(//md-select[@name='IDProofTypeId'])[2]");
	
	By Id_proof_number         = By.xpath("(//input[@name='IdProofNumber'])[1]");
	By Id_proof_number_t       = By.xpath("(//input[@name='IdProofNumber'])[3]");
	
	By Without_id_num          = By.xpath("(//div[@ng-messages='addPlotOwner.IdProofNumber.$error'])[1]");
	By Without_id_num_t        = By.xpath("(//div[@ng-messages='addPlotOwner.IdProofNumber.$error'])[2]");
	By Account_number_ip       = By.xpath("(//input[@name='AccountNumber'])[1]");
	By Account_number_ip_t     = By.xpath("(//input[@name='AccountNumber'])[2]");
	By Account_name_ip         = By.xpath("(//input[@name='AccountHolderName'])[1]");
	By Account_name_ip_t       = By.xpath("(//input[@name='AccountHolderName'])[2]");
	By Ifsc_code_ip            = By.xpath("(//input[@name='LLIFSCCode'])[1]");
	By Ifsc_code_ip_t          = By.xpath("(//input[@name='LLIFSCCode'])[2]");
	By Pdf_upload              = By.xpath("//input[@id='fileToUploadForm']");
	By Save_form               = By.xpath("//button[@ng-click='SavePlots()']");
  	
  	      
  	

	public void the_user_signin_with_the_Respective_role_credentials_details() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void the_page_will_Be_Navigate_to_the_Dashboard_screen_of_the_main_pages() throws Throwable {
		utilities.webDriverWait(driver, sidebar_Ngt);
		driver.findElement(sidebar_Ngt).click();
		utilities.MaximumWait(driver);
	}

	public void the_dashboard_menu_click_on_the_Activities_module_nav_menu() throws Throwable {
		utilities.webDriverWait(driver, Activities_menu_click);
		driver.findElement(Activities_menu_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_click_on_the_Plot_split_menu_screen() throws Throwable {
		utilities.webDriverWait(driver, Plot_split_navgation);
		driver.findElement(Plot_split_navgation).click();
		utilities.MaximumWait(driver);
	}

	public void click_on_the_search_farmer_input_fields() throws Throwable {
		utilities.webDriverWait(driver, Search_farmer);
		driver.findElement(Search_farmer).click();
		utilities.MaximumWait(driver);
		driver.findElement(Search_farmer).sendKeys("145");
		utilities.MaximumWait(driver);
		driver.findElement(Search_farmer).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_Search_farmer);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
	}

	public void Select_farmer_from_the_auto_suggestions_keywords_list() throws Throwable {
		utilities.webDriverWait(driver, Search_farmer);
        WebElement searchField = driver.findElement(Search_farmer);
        searchField.sendKeys("177");
        utilities.MaximumWait(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
        List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Auto_suggestions));
        System.out.println("Number of suggestions found: " + suggestions.size());
        for (WebElement suggestion : suggestions) {
        System.out.println("Suggestion text: " + suggestion.getText());
        if (suggestion.getText().contains("177")) {
            suggestion.click();
        break;
            }
            }
        } catch (Exception e) {
            System.out.println("Exception while waiting for suggestions: " + e.getMessage());
        }
        utilities.MaximumWait(driver);
		
	}

	public void check_with_the_selected_farmers_plot_details() throws Throwable {
		utilities.webDriverWait(driver, Select_farmer_plot);
		driver.findElement(Select_farmer_plot).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_plot_details_one_search_farmer_selection() throws Throwable {
		utilities.webDriverWait(driver, plotdetails_one_farmer);
		driver.findElement(plotdetails_one_farmer).click();
		utilities.MaximumWait(driver);
		driver.findElement(plotdetails_one_farmer).sendKeys("199");
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}

	public void check_with_the_Total_plot_area_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Total_plot_area_ip);
		driver.findElement(Total_plot_area_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(Total_plot_area_ip).sendKeys("1.1214544898789798712365746468534635465844685746854");
		utilities.MaximumWait(driver);
		driver.findElement(Total_plot_area_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_total_plot_ip);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Total_plot_area_ip).sendKeys("0.03s");
		utilities.MaximumWait(driver);		
	}

	public void check_with_the_Total_palm_area_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Total_palm_area_ip);
		driver.findElement(Total_palm_area_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(Total_palm_area_ip).sendKeys("1.1214544898789798712365746468534635465844685746854");
		utilities.MaximumWait(driver);
		driver.findElement(Total_palm_area_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_total_palm_ip);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Total_palm_area_ip).sendKeys("0.02s");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Crop_in_Left_out_area_dropdown_selections() throws Throwable {
		utilities.webDriverWait(driver, Crop_left_out_area_ip);
		driver.findElement(Crop_left_out_area_ip).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Survey_number_input_validation() throws Throwable {
	    utilities.webDriverWait(driver, Survey_no_ip);
	    String inputText = "1234567890123456789012345678901234567890123456789044";
	    driver.findElement(Survey_no_ip).sendKeys(inputText);
	    String actualValue = driver.findElement(Survey_no_ip).getAttribute("value");
	    int charactersEntered = actualValue.length();
	    System.out.println("Number of characters entered: " + charactersEntered);
        driver.findElement(Survey_no_ip).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Without_survey_no_ip);
	    String actualMessage = message.getText().trim(); 
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Survey_no_ip).sendKeys("123478");
	    utilities.MaximumWait(driver);		
	}

	public void check_with_the_Crop_income_input_selection_details() throws Throwable {
		utilities.webDriverWait(driver, Crop_income_ip_sel);
		driver.findElement(Crop_income_ip_sel).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}

	public void check_with_the_plot_details_by_Is_Boundary_fencing_field() throws Throwable {
		utilities.webDriverWait(driver, Checkbox_selc_fencing);
	    driver.findElement(Checkbox_selc_fencing).click();
	    utilities.MaximumWait(driver);
	}

	public void Check_with_the_plot_details_by_Is_PlotHandled_By_CareTaker() throws Throwable {
		utilities.webDriverWait(driver, Is_plot_handled_check);
	    driver.findElement(Is_plot_handled_check).click();
	    utilities.MaximumWait(driver);
	}

	public void check_with_the_Care_taker_name_input_validations_details() throws Throwable {
	    utilities.webDriverWait(driver, Caretaker_name_ip);
        driver.findElement(Caretaker_name_ip).sendKeys("Ram");
        utilities.MaximumWait(driver);
        driver.findElement(Caretaker_name_ip).clear();
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(Without_caretaker_ip);
	    String actualMessage = message.getText().trim(); 
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Caretaker_name_ip).sendKeys("Rana");
	    utilities.MaximumWait(driver);
	    driver.findElement(Caretaker_name_ip).clear();
	    utilities.MaximumWait(driver);
	    String inputText = "A while back I needed to count the amount of letters";
	    driver.findElement(Caretaker_name_ip).sendKeys(inputText);
	    String actualValue = driver.findElement(Caretaker_name_ip).getAttribute("value");
	    int charactersEntered = actualValue.length();
	    System.out.println("Number of characters entered: " + charactersEntered);
	}

	public void check_with_the_care_taker_mobile_number_input_validation_details() throws Throwable {
	    utilities.webDriverWait(driver, Caretaker_mobile_num);
        driver.findElement(Caretaker_mobile_num).sendKeys("12345");
        utilities.MaximumWait(driver);
        driver.findElement(Caretaker_mobile_num).clear();
        WebElement message = driver.findElement(With_out_mbl_no_ip);
	    String actualMessage = message.getText().trim(); 
	    System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        String inputText = "1234567890411";
	    driver.findElement(Caretaker_mobile_num).sendKeys(inputText);
	    String actualValue = driver.findElement(Caretaker_mobile_num).getAttribute("value");
	    int charactersEntered = actualValue.length();
	    System.out.println("Number of characters entered: " + charactersEntered);
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Landmark_input_details() throws Throwable {
	    utilities.webDriverWait(driver, Landmark_ip);
	    WebElement inputField = driver.findElement(Landmark_ip);
        utilities.MaximumWait(driver);
	    String inbuiltText = inputField.getAttribute("value");
	    System.out.println("Inbuilt text in the input field: " + inbuiltText);
        utilities.MaximumWait(driver);
	}

	public void Click_on_the_Plantation_Details_actions_button() throws Throwable {
		utilities.webDriverWait(driver, Plantation_action_click);
        driver.findElement(Plantation_action_click).click();
        utilities.MaximumWait(driver);
	}

	public void check_with_the_select_nursery_selection_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Sapling_nursery_sele); 
		driver.findElement(Sapling_nursery_sele).click();
		utilities.MaximumWait(driver);
        Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}

	public void check_with_the_select_Sapling_vendor_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Sprouts_vendor); 
		driver.findElement(Sprouts_vendor).click();
        Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}

	public void check_with_the_select_origin_of_saplings_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Origin_of_saplings_ip); 
		driver.findElement(Origin_of_saplings_ip).click();
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);		
	}

	public void check_with_the_Select_Cross_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Cross_ip_sel); 
		driver.findElement(Cross_ip_sel).click();
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);	
	}

	public void check_with_the_Lifted_saplings_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Lifted_saplings_ip); 
		driver.findElement(Lifted_saplings_ip).sendKeys("5");
		utilities.MaximumWait(driver);
		driver.findElement(Lifted_saplings_ip).clear();
		WebElement message = driver.findElement(Without_Lifted_sap_ip);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Lifted_saplings_ip).sendKeys("3");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Planted_saplings_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Planted_saplings_ip); 
		driver.findElement(Planted_saplings_ip).sendKeys("5");
		utilities.MaximumWait(driver);
		driver.findElement(Planted_saplings_ip).clear();
		WebElement message = driver.findElement(Without_planted_sap_ip);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Planted_saplings_ip).sendKeys("2");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Reason_for_missing_tress_input_details() throws Throwable {
		utilities.webDriverWait(driver, reason_for_missing_ip); 
		driver.findElement(reason_for_missing_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(reason_for_missing_ip).sendKeys("reason for missing harvest problem");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Input_option_Plotownership_details() throws Throwable {
		utilities.webDriverWait(driver, Plotownership_chg); 
		driver.findElement(Plotownership_chg).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
	}

	public void check_with_Landlord_name_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Landlord_select);
		WebElement inputElement = driver.findElement(Landlord_select);
	    String inputValue = inputElement.getAttribute("value");
		if (inputValue != null && !inputValue.isEmpty()) {
		System.out.println("Current Landlord Name: " + inputValue);
		        } 
		else {
		        inputElement.clear();
		        }
		        utilities.MaximumWait(driver);
		driver.findElement(landlordname_ip).clear();
        utilities.MaximumWait(driver);
		driver.findElement(landlordname_ip).sendKeys("test user one1");
        utilities.MaximumWait(driver);		
	}

	public void check_with_the_Landlord_mobile_number_input_details_validation() throws Throwable {
		   utilities.webDriverWait(driver, Mobile_no_ip);
	       WebElement inputElement = driver.findElement(Mobile_no_ip);
	       String inputValue = inputElement.getAttribute("value");
	       if(inputValue != null && !inputValue.isEmpty()) {
	    	   System.out.println("Current Landlord Mobile Number: " +inputValue);
	       }
	       else {
	    	   inputElement.clear();
	       }
	       utilities.MaximumWait(driver);
	       driver.findElement(Mobile_no_ip).clear();
	       utilities.MaximumWait(driver);
	       driver.findElement(Mobile_no_ip).sendKeys("1237894561");
	       utilities.MaximumWait(driver);
	}
	public void check_with_the_Lease_Start_date_and_End_date_inputs_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Lease_start_date);
		driver.findElement(Lease_start_date).click();
		utilities.MinimumWait(driver);
		driver.findElement(Lease_start_date).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
		driver.findElement(Lease_start_date).clear();
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(no_lease_start_date);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(Lease_start_date).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Lease_start_date).sendKeys("01/07/2024");
		utilities.MaximumWait(driver);
        utilities.webDriverWait(driver, Lease_End_date);
		driver.findElement(Lease_End_date).click();
		utilities.MinimumWait(driver);
		driver.findElement(Lease_End_date).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
		driver.findElement(Lease_End_date).clear();
		utilities.MinimumWait(driver);
	    WebElement message1 = driver.findElement(no_lease_end_date);
	    String actualMessage1 = message1.getText();
	    System.out.println("Validation message: " + actualMessage1);
		utilities.MinimumWait(driver);
		driver.findElement(Lease_End_date).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Lease_End_date).sendKeys("01/08/2024");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Id_proof_type_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Id_proof_sel);
        driver.findElement(Id_proof_sel).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
		
	}
	public void check_with_the_Id_proof_number_input_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Id_proof_number);
        driver.findElement(Id_proof_number).click();
		utilities.MaximumWait(driver);
        driver.findElement(Id_proof_number).clear();
        WebElement message1 = driver.findElement(Without_id_num);
	    String actualMessage1 = message1.getText();
	    System.out.println("Validation message: " + actualMessage1);
		utilities.MaximumWait(driver);
        driver.findElement(Id_proof_number).sendKeys("123456789124");
		utilities.MaximumWait(driver);

	}
	public void check_with_the_Account_number_ip_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Account_number_ip);
		WebElement inputElement = driver.findElement(Account_number_ip);
	    String inputValue = inputElement.getAttribute("value");
		if (inputValue != null && !inputValue.isEmpty()) {
		System.out.println("Current Id Proof Type*: " + inputValue);
		        } 
		else {
		        inputElement.clear();
		        }
		        utilities.MaximumWait(driver);
		driver.findElement(Account_number_ip).clear();
        utilities.MaximumWait(driver);
        driver.findElement(Account_number_ip).sendKeys("12378965402123123");
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Account_holder_name_ip_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Account_name_ip);
		WebElement inputElement = driver.findElement(Account_name_ip);
	    String inputValue = inputElement.getAttribute("value");
		if (inputValue != null && !inputValue.isEmpty()) {
		System.out.println("Current Id Proof Type*: " + inputValue);
		        } 
		else {
		        inputElement.clear();
		        }
		        utilities.MaximumWait(driver);
		driver.findElement(Account_name_ip).clear();
        utilities.MaximumWait(driver);
        driver.findElement(Account_name_ip).sendKeys("V Venkateswararaos");
        utilities.MaximumWait(driver);		
	}

	public void check_with_the_IFSc_code_ip_details_selection() throws Throwable {
		utilities.webDriverWait(driver, Ifsc_code_ip);
		WebElement inputElement = driver.findElement(Ifsc_code_ip);
	    String inputValue = inputElement.getAttribute("value");
		if (inputValue != null && !inputValue.isEmpty()) {
		System.out.println("Current Id Proof Type*: " + inputValue);
		        } 
		else {
		        inputElement.clear();
		        }
		        utilities.MaximumWait(driver);
		driver.findElement(Ifsc_code_ip).clear();
        utilities.MaximumWait(driver);
        driver.findElement(Ifsc_code_ip).click();
        utilities.MaximumWait(driver);
		driver.findElement(Ifsc_code_ip).click();
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
        utilities.MaximumWait(driver);
	}

	public void check_with_plot_details_two_search_farmer_selection() throws Throwable {
		utilities.webDriverWait(driver, Plotdetails_two_farmer);
		driver.findElement(Plotdetails_two_farmer).click();
		utilities.MaximumWait(driver);
		driver.findElement(Plotdetails_two_farmer).sendKeys("193");
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}

	public void check_with_the_plot_details_two_Total_plot_area_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Total_plot_area_two_ip);
		driver.findElement(Total_plot_area_two_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(Total_plot_area_two_ip).sendKeys("1.1214544898789798712365746468534635465844685746854");
		utilities.MaximumWait(driver);
		driver.findElement(Total_plot_area_two_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_total_plot_two);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Total_plot_area_two_ip).sendKeys("0.06s");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_plot_details_two_Total_palm_area_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Total_palm_area_two);
		driver.findElement(Total_palm_area_two).click();
		utilities.MaximumWait(driver);
		driver.findElement(Total_palm_area_two).sendKeys("1.1214544898789798712365746468534635465844685746854");
		utilities.MaximumWait(driver);
		driver.findElement(Total_palm_area_two).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_total_two_ip);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Total_palm_area_two).sendKeys("0.05s");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_plot_details_two_Crop_in_Left_out_area_dropdown_selections() throws Throwable {
		utilities.webDriverWait(driver, Crop_left_out_area_two);
		driver.findElement(Crop_left_out_area_two).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);

	}

	public void check_with_the_plot_details_two_Survey_number_input_validation() throws Throwable {
		utilities.webDriverWait(driver, Survey_no_two);
		String inputText = "1234567890123456789012345678901234567890123456789044";
		driver.findElement(Survey_no_two).sendKeys(inputText);
		String actualValue = driver.findElement(Survey_no_two).getAttribute("value");
		int charactersEntered = actualValue.length();
		System.out.println("Number of characters entered: " + charactersEntered);
	    driver.findElement(Survey_no_two).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_survey_two_ip);
		String actualMessage = message.getText().trim(); 
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Survey_no_two).sendKeys("123478");
		utilities.MaximumWait(driver);		
	}

	public void check_with_the_plot_details_two_Crop_income_input_selection_details() throws Throwable {
		utilities.webDriverWait(driver, Crop_income_ip_two_sel);
		driver.findElement(Crop_income_ip_two_sel).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}

	public void check_with_the_plot_details_two_by_Is_Boundary_fencing_field() throws Throwable {
		utilities.webDriverWait(driver, Checkbox_two_fencing);
	    driver.findElement(Checkbox_two_fencing).click();
	    utilities.MaximumWait(driver);
	}

	public void Check_with_the_plot_details_two_by_Is_PlotHandled_By_CareTaker() throws Throwable {
		utilities.webDriverWait(driver, Is_plot_handled_two);
	    driver.findElement(Is_plot_handled_two).click();
	    utilities.MaximumWait(driver);
	}

	public void check_with_the_plot_details_two_Care_taker_name_input_validations_details() throws Throwable {
		utilities.webDriverWait(driver, Caretaker_name_two_ip);
        driver.findElement(Caretaker_name_two_ip).sendKeys("Ram");
        utilities.MaximumWait(driver);
        driver.findElement(Caretaker_name_two_ip).clear();
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(Without_caretaker_two);
	    String actualMessage = message.getText().trim(); 
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Caretaker_name_two_ip).sendKeys("Rana");
	    utilities.MaximumWait(driver);
	    driver.findElement(Caretaker_name_two_ip).clear();
	    utilities.MaximumWait(driver);
	    String inputText = "A while back I needed to count the amount of letters";
	    driver.findElement(Caretaker_name_two_ip).sendKeys(inputText);
	    String actualValue = driver.findElement(Caretaker_name_two_ip).getAttribute("value");
	    int charactersEntered = actualValue.length();
	    System.out.println("Number of characters entered: " + charactersEntered);
	}

	public void check_with_the_plot_details_two_care_taker_mobile_number_input_validation_details() throws Throwable {
	    utilities.webDriverWait(driver, Caretaker_mobile_num_t);
        driver.findElement(Caretaker_mobile_num_t).sendKeys("12");
        utilities.MaximumWait(driver);
        driver.findElement(Caretaker_mobile_num_t).clear();
        WebElement message = driver.findElement(With_out_mbl_no_ip_t);
	    String actualMessage = message.getText().trim(); 
	    System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        String inputText = "1234567890411";
	    driver.findElement(Caretaker_mobile_num_t).sendKeys(inputText);
	    String actualValue = driver.findElement(Caretaker_mobile_num_t).getAttribute("value");
	    int charactersEntered = actualValue.length();
	    System.out.println("Number of characters entered: " + charactersEntered);
        utilities.MaximumWait(driver);
	}

	public void check_with_the_plot_details_two_by_Landmark_input_details() throws Throwable {
	    utilities.webDriverWait(driver, Landmark_ip_t);
	    WebElement inputField = driver.findElement(Landmark_ip_t);
        utilities.MaximumWait(driver);
	    String inbuiltText = inputField.getAttribute("value");
	    System.out.println("Inbuilt text in the input field: " + inbuiltText);
        utilities.MaximumWait(driver);
		
	}

	public void Click_on_the_Plantation_Details_two_actions_button() throws Throwable {
		utilities.webDriverWait(driver, Plantation_action_two);
        driver.findElement(Plantation_action_two).click();
        utilities.MaximumWait(driver);
	}

	public void check_with_the_plot_details_two_select_nursery_selection_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Sapling_nursery_two); 
		driver.findElement(Sapling_nursery_two).click();
		utilities.MaximumWait(driver);
        Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}

	public void check_with_the_plot_details_two_select_Sapling_vendor_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Sprouts_vendor_t); 
		driver.findElement(Sprouts_vendor_t).click();
        Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}

	public void check_with_the_plot_details_two_select_origin_of_saplings_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Origin_of_saplings_ip_t); 
		driver.findElement(Origin_of_saplings_ip_t).click();
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);		
	}

	public void check_with_the_plot_details_two_Select_Cross_from_the_Dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Cross_ip_sel_t); 
		driver.findElement(Cross_ip_sel_t).click();
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);	
		
	}

	public void check_with_the_plot_details_two_Lifted_saplings_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Lifted_saplings_ip_t); 
		driver.findElement(Lifted_saplings_ip_t).sendKeys("5");
		utilities.MaximumWait(driver);
		driver.findElement(Lifted_saplings_ip_t).clear();
		WebElement message = driver.findElement(Without_Lifted_sap_ip_t);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Lifted_saplings_ip_t).sendKeys("3");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_plot_details_two_Planted_saplings_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Planted_saplings_ip_t); 
		driver.findElement(Planted_saplings_ip_t).sendKeys("4");
		utilities.MaximumWait(driver);
		driver.findElement(Planted_saplings_ip_t).clear();
		WebElement message = driver.findElement(Without_planted_sap_ip_t);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Planted_saplings_ip_t).sendKeys("2");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_plot_details_two_Reason_for_missing_tress_input_details() throws Throwable {
		utilities.webDriverWait(driver, reason_for_missing_ip_t); 
		driver.findElement(reason_for_missing_ip_t).click();
		utilities.MaximumWait(driver);
		driver.findElement(reason_for_missing_ip_t).sendKeys("reason for missing harvest problem");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_plot_details_two_Input_option_Plotownership_details() throws Throwable {
		utilities.webDriverWait(driver, Plotownership_chg_t); 
		driver.findElement(Plotownership_chg_t).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
	}

	public void check_with_plot_details_two_Landlord_name_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Landlord_select_t);
		WebElement inputElement = driver.findElement(Landlord_select_t);
	    String inputValue = inputElement.getAttribute("value");
		if (inputValue != null && !inputValue.isEmpty()) {
		System.out.println("Current Landlord Name: " + inputValue);
		        } 
		else {
		        inputElement.clear();
		        }
		        utilities.MaximumWait(driver);
		driver.findElement(landlordname_ip_t).clear();
        utilities.MaximumWait(driver);
		driver.findElement(landlordname_ip_t).sendKeys("test user one1");
        utilities.MaximumWait(driver);	
	}

	public void check_with_the_plot_details_two_Landlord_mobile_number_input_detailsvalidation() throws Throwable {
		 utilities.webDriverWait(driver, Mobile_no_ip_t);
	       WebElement inputElement = driver.findElement(Mobile_no_ip_t);
	       String inputValue = inputElement.getAttribute("value");
	       if(inputValue != null && !inputValue.isEmpty()) {
	    	   System.out.println("Current Landlord Mobile Number: " +inputValue);
	       }
	       else {
	    	   inputElement.clear();
	       }
	       utilities.MaximumWait(driver);
	       driver.findElement(Mobile_no_ip_t).clear();
	       utilities.MaximumWait(driver);
	       driver.findElement(Mobile_no_ip_t).sendKeys("1237894561");
	       utilities.MaximumWait(driver);
	}

	public void check_with_the_plot_details_two_Lease_Start_date_and_End_date_inputs_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Lease_start_date_t);
		driver.findElement(Lease_start_date_t).click();
		utilities.MinimumWait(driver);
		driver.findElement(Lease_start_date_t).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
		driver.findElement(Lease_start_date_t).clear();
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(no_lease_start_date_t);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(Lease_start_date_t).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Lease_start_date_t).sendKeys("01/07/2024");
		utilities.MaximumWait(driver);
        utilities.webDriverWait(driver, Lease_End_date_t);
		driver.findElement(Lease_End_date_t).click();
		utilities.MinimumWait(driver);
		driver.findElement(Lease_End_date_t).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
		driver.findElement(Lease_End_date_t).clear();
		utilities.MinimumWait(driver);
	    WebElement message1 = driver.findElement(no_lease_end_date_t);
	    String actualMessage1 = message1.getText();
	    System.out.println("Validation message: " + actualMessage1);
		utilities.MinimumWait(driver);
		driver.findElement(Lease_End_date_t).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Lease_End_date_t).sendKeys("01/08/2024");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_plot_details_two_Id_proof_type_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Id_proof_sel_t);
        driver.findElement(Id_proof_sel_t).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_plot_details_two_Id_proof_number_input_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Id_proof_number_t);
        driver.findElement(Id_proof_number_t).click();
		utilities.MaximumWait(driver);
        driver.findElement(Id_proof_number_t).clear();
        WebElement message1 = driver.findElement(Without_id_num_t);
	    String actualMessage1 = message1.getText();
	    System.out.println("Validation message: " + actualMessage1);
		utilities.MaximumWait(driver);
        driver.findElement(Id_proof_number_t).sendKeys("123456789124");
		utilities.MaximumWait(driver);

	}

	public void check_with_the_plot_details_two_Account_number_ipdetails_validation() throws Throwable {
		utilities.webDriverWait(driver, Account_number_ip_t);
		WebElement inputElement = driver.findElement(Account_number_ip_t);
	    String inputValue = inputElement.getAttribute("value");
		if (inputValue != null && !inputValue.isEmpty()) {
		System.out.println("Current Id Proof Type*: " + inputValue);
		        } 
		else {
		        inputElement.clear();
		        }
		        utilities.MaximumWait(driver);
		driver.findElement(Account_number_ip_t).clear();
        utilities.MaximumWait(driver);
        driver.findElement(Account_number_ip_t).sendKeys("12378965402123123");
        utilities.MaximumWait(driver);		
	}

	public void check_with_the_plot_details_two_Account_holder_name_ip_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Account_name_ip_t);
		WebElement inputElement = driver.findElement(Account_name_ip_t);
	    String inputValue = inputElement.getAttribute("value");
		if (inputValue != null && !inputValue.isEmpty()) {
		System.out.println("Current Id Proof Type*: " + inputValue);
		        } 
		else {
		        inputElement.clear();
		        }
		        utilities.MaximumWait(driver);
		driver.findElement(Account_name_ip_t).clear();
        utilities.MaximumWait(driver);
        driver.findElement(Account_name_ip_t).sendKeys("V Venkateswararaos");
        utilities.MaximumWait(driver);		
	}

	public void check_with_the_plot_details_two_IFSc_code_ip_details_selection() throws Throwable {
		utilities.webDriverWait(driver, Ifsc_code_ip_t);
		WebElement inputElement = driver.findElement(Ifsc_code_ip_t);
	    String inputValue = inputElement.getAttribute("value");
		if (inputValue != null && !inputValue.isEmpty()) {
		System.out.println("Current Id Proof Type*: " + inputValue);
		        } 
		else {
		        inputElement.clear();
		        }
		        utilities.MaximumWait(driver);
		driver.findElement(Ifsc_code_ip_t).clear();
        utilities.MaximumWait(driver);
        driver.findElement(Ifsc_code_ip_t).click();
        utilities.MaximumWait(driver);
		driver.findElement(Ifsc_code_ip_t).click();
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
        utilities.MaximumWait(driver);
	}

	public void check_with_the_upload_in_Landlord_application_form() throws Throwable {
		utilities.webDriverWait(driver, Pdf_upload);
		driver.findElement(Pdf_upload).sendKeys("D:/3f/Img/sample.pdf");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Save_all_details() throws Throwable {
		utilities.webDriverWait(driver, Save_form);
		driver.findElement(Save_form).click();
		utilities.MaximumWait(driver);
	}



}
