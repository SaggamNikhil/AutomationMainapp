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

public class GapFilling extends DriverFactory{
	Utilities utilities        = new Utilities();
	By text                    = By.xpath("//input[@type='text']");
  	By code                    = By.xpath("//input[@type='password']");
  	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
  	By dashboard               = By.xpath("//section[@class='content-header']");
	By sidebar_Ngt             = By.xpath("//a[@class='sidebar-toggle']");
  	By Activities_menu_clk     = By.xpath("//span[text()='Activities']");
  	By gap_filling_clk         = By.xpath("//a[@href='#/gapFilling']");
  	By From_date_Sel           = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
  	By from_date_tst_msgs      = By.xpath("//div[text()='The entered value is not a date!']");
  	By Search_btn_click        = By.xpath("//button[@ng-click='initGapFilling(request)']");
  	By Gap_filling_initiate    = By.xpath("//a[@href='#/initiateGapFilling']");
  	By Print_screen_name       = By.xpath("//div[@class='box-header border-bottom side-padding spacing']");
  	By Search_farmer_click     = By.xpath("//input[@aria-label='Select Farmer']");
  	By Without_Search_farmer   = By.xpath("//div[@ng-messages='addForm.autocompleteField.$error']");
  	By Auto_suggestions        = By.xpath("//ul[contains(@class, 'md-autocomplete-suggestions')]/li");
  	By plotSelectCheckbox      = By.xpath("(//md-checkbox[@ng-model='row.isSelected'])[1]");
  	By imported_saplings_ip    = By.xpath("//input[@ng-model='Request.ImportedSaplingsToBeIssued']");
  	By Indigenous_sap_ip       = By.xpath("//input[@ng-model='Request.IndigenousSaplingsToBeIssued']");
  	By Exp_date_pickup         = By.xpath("//input[@class='md-datepicker-input md-input']");
  	By Without_exp_pickup      = By.xpath("//div[@ng-messages='advanceForm.ExpectedDateofPickup.$error']");
  	By Gap_filling_reason      = By.xpath("//md-select[@ng-model='Request.GapFillingReasonTypeId']");
  	By Choose_file_upload      = By.xpath("//input[@id='fileToUploadForm']");
  	By Save_click_btn          = By.xpath("//button[@ng-click='saveGapFilling()']");
  	By Cluster_manager_app     = By.xpath("(//button[@aria-label='Cluster Manager Approve'])[1]");
  	By Cluster_manager_cmt     = By.xpath("//textarea[@name='Comments']");
  	By Cluster_mang_app        = By.xpath("//button[@ng-click='GapFillingApproveOrDecline()']");
  	By State_head_click        = By.xpath("//button[@aria-label='State Head Approve']");
  	By State_head_cmt          = By.xpath("//textarea[@name='Comments']");
  	By State_mang_app          = By.xpath("//button[@ng-click='GapFillingApproveOrDecline()']");
  	By Add_gap_advance_details = By.xpath("//button[@ng-click='addAdvSaplings(row)']"); 
  	By Amount_rec_date         = By.xpath("(//input[@class='md-datepicker-input md-input'])[3]");
  	By mode_of_payment         = By.xpath("//md-select[@ng-model='SelectedModeOfPayment']");
  	By No_imp_saplings_ip      = By.xpath("//input[@ng-model='Request.NoOfImportedSaplingsAmountReceivedFor']");
  	By No_Indi_Saplings_ip     = By.xpath("//input[@ng-model='Request.NoOfIndigenousSaplingsAmountReceivedFor']");
  	By Add_print_btn_click     = By.xpath("//button[@ng-click='updateAdvanceDetails(Request, advanceForm,1)']");
  	By Adv_State_head_app      = By.xpath("(//button[@aria-label='Advance State Head Approve'])[1]");
  	By Final_app_state         = By.xpath("//button[@ng-click='approveOrDecline()']");
  	By Nursery_saplings_ip     = By.xpath("(//button[@ng-click='addNurSaplings(row)'])[1]");
  	By Nursery_opt             = By.xpath("//md-select[@ng-model='nursery']");
  	By Batch_sel               = By.xpath("//md-select[@ng-model='Batch']");
  	By Advance_receipt_sel     = By.xpath("//md-select[@ng-model='AdvanceDetails']");
  	By Variety_sel             = By.xpath("//md-select[@ng-model='nurseryCross']");
  	By Vendor_sel              = By.xpath("//md-select[@ng-model='nurseryVendor']");
  	By No_of_imp_enter         = By.xpath("(//input[@name='NoOfImportedSaplingsIssued'])[2]");
    By Save_details            = By.xpath("//button[@ng-click='addnurserySaplings($event)']");
  
  	
  			
  			
  	
  	
	public void the_user_has_entered_text_an(String username) throws Throwable {
		driver.get(prop.getProperty("url"));
        utilities.webDriverWait(driver, text);
		 driver.findElement(text).sendKeys(username);
		 utilities.MaximumWait(driver);
	}

	public void the_user_has_entered1_text_an(String password) throws Throwable {
		 utilities.webDriverWait(driver, code);
		 driver.findElement(code).sendKeys(password);
		 utilities.MaximumWait(driver);
	}

	public void User_In_the_page_click_on_the_LogIn_button_input() throws Throwable {
		 utilities.webDriverWait(driver, Login);
		 driver.findElement(Login).click();
		 utilities.MaximumWait(driver);	
	}

	public void the_User_navigated_to_the_dashboard_of_home_page_details() throws Throwable {
		 utilities.webDriverWait(driver, dashboard);
		 WebElement message = driver.findElement(dashboard);
	     String actualMessage = message.getText();
	     System.out.println("Validation message: " + actualMessage);
		 utilities.MaximumWait(driver);
		 driver.findElement(sidebar_Ngt).click();
		 utilities.MaximumWait(driver);
	}

	public void check_with_the_click_on_the_Activities_Menu_screen() throws Throwable {
		utilities.webDriverWait(driver, Activities_menu_clk);
		driver.findElement(Activities_menu_clk).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Click_on_the_Gapfilling_menu_screen() throws Throwable {
		utilities.webDriverWait(driver, gap_filling_clk);
		driver.findElement(gap_filling_clk).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_From_Date_selection_input_details() throws Throwable {
		utilities.webDriverWait(driver, From_date_Sel);
		driver.findElement(From_date_Sel).clear();
		utilities.MinimumWait(driver);
		driver.findElement(From_date_Sel).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(from_date_tst_msgs);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(From_date_Sel).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_Sel).sendKeys("01/01/2020");
		utilities.MaximumWait(driver);
	}

	public void click_on_the_search_button() throws Throwable {
		utilities.webDriverWait(driver, Search_btn_click);
		driver.findElement(Search_btn_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_navigated_to_the_Initiate_gap_filling_screen() throws Throwable {
		utilities.webDriverWait(driver, Gap_filling_initiate);
		driver.findElement(Gap_filling_initiate).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Print_screen_name);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Search_farmer_from_the_Initiate_gap_filling_screen() throws Throwable {
		utilities.webDriverWait(driver, Search_farmer_click);
		driver.findElement(Search_farmer_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Search_farmer_click).sendKeys("145");
		utilities.MaximumWait(driver);
		driver.findElement(Search_farmer_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_Search_farmer);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Auto_search_farmer_using_keywords_details() throws Throwable {
		utilities.webDriverWait(driver, Search_farmer_click);
        WebElement searchField = driver.findElement(Search_farmer_click);
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

        // Locate the checkbox element
        WebElement checkbox = driver.findElement(plotSelectCheckbox);

        // Check the current state of the checkbox
        if (!checkbox.getAttribute("aria-checked").equals("true")) {
            checkbox.click();
        }
    }

	public void check_with_the_Imported_Saplings_To_be_Issued_input_field_details() throws Throwable {
		utilities.webDriverWait(driver, imported_saplings_ip);
		driver.findElement(imported_saplings_ip).sendKeys("3468597777784697685947698574");
		utilities.MaximumWait(driver);
		driver.findElement(imported_saplings_ip).clear();
		utilities.MaximumWait(driver);
		driver.findElement(imported_saplings_ip).sendKeys("3");
		utilities.MaximumWait(driver);


	}

	public void check_with_the_Indigenous_Saplings_To_be_Issued_input_field_details() throws Throwable {
		utilities.webDriverWait(driver, Indigenous_sap_ip);
		driver.findElement(Indigenous_sap_ip).sendKeys("3468597777784697685947698574");
		utilities.MaximumWait(driver);
		driver.findElement(Indigenous_sap_ip).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Indigenous_sap_ip).sendKeys("3");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Exp_Date_of_Pickup_input_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Exp_date_pickup);
		driver.findElement(Exp_date_pickup).click();
		utilities.MinimumWait(driver);
		driver.findElement(Exp_date_pickup).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Without_exp_pickup);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(Exp_date_pickup).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Exp_date_pickup).sendKeys("03/07/2024");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Gap_filling_Reason_Details_update() throws Throwable {
		utilities.webDriverWait(driver, Gap_filling_reason);
		driver.findElement(Gap_filling_reason).click();
		utilities.MinimumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Upload_file_input_details() throws Throwable {
		utilities.webDriverWait(driver, Choose_file_upload);
		driver.findElement(Choose_file_upload).sendKeys("D:/3F Main App/Img/sample.pdf");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Save_details_from_the_Initiate_gap_filling() throws Throwable {
		utilities.webDriverWait(driver, Save_click_btn);
		driver.findElement(Save_click_btn).click();
		utilities.MinimumWait(driver);
	}

	public void check_with_the_Gap_filling_screen_by_Cluster_manager_Approvals() throws Throwable {
		utilities.webDriverWait(driver, Cluster_manager_app);
		driver.findElement(Cluster_manager_app).click();
		utilities.MinimumWait(driver);
		driver.findElement(Cluster_manager_cmt).sendKeys("Cluster manager approval by admin ");
		utilities.MinimumWait(driver);
		driver.findElement(Cluster_mang_app).click();
		utilities.MinimumWait(driver);

	}

	public void check_with_the_Gap_filling_screen_by_State_head_manager_Approvals() throws Throwable {
		utilities.webDriverWait(driver, State_head_click);
		driver.findElement(State_head_click).click();
		utilities.MinimumWait(driver);
		driver.findElement(State_head_cmt).sendKeys("Cluster manager approval by admin ");
		utilities.MinimumWait(driver);
		driver.findElement(State_mang_app).click();
		utilities.MinimumWait(driver);
	}

	public void check_with_the_Add_gap_filling_advance_details() throws Throwable {
		utilities.webDriverWait(driver, Add_gap_advance_details);
		driver.findElement(Add_gap_advance_details).click();
		utilities.MinimumWait(driver);
		driver.findElement(Amount_rec_date).click();
		utilities.MinimumWait(driver);
		driver.findElement(Amount_rec_date).sendKeys("03/07/2024");
		utilities.MinimumWait(driver);
	}

	public void check_with_the_Mode_of_Payement_selection_details() throws Throwable {
		utilities.webDriverWait(driver, mode_of_payment);
		driver.findElement(mode_of_payment).click();
		utilities.MinimumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);

	}

	public void check_with_the_No_of_imp_saplings_Amount_Received_for() throws Throwable {
		utilities.webDriverWait(driver, No_imp_saplings_ip);
		driver.findElement(No_imp_saplings_ip).click();
		utilities.MinimumWait(driver);
		driver.findElement(No_imp_saplings_ip).sendKeys("5");
		utilities.MaximumWait(driver);

	}

	public void check_with_the_No_of_Indi_saplings_Amount_received_for() throws Throwable {
		utilities.webDriverWait(driver, No_Indi_Saplings_ip);
		driver.findElement(No_Indi_Saplings_ip).click();
		utilities.MinimumWait(driver);
		driver.findElement(No_Indi_Saplings_ip).sendKeys("5");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Add_Print_button_click() throws Throwable {
		utilities.webDriverWait(driver, Add_print_btn_click);
		driver.findElement(Add_print_btn_click).click();
		utilities.MaximumWait(driver);
	}

	public void click_on_the_Advance_state_head_approval() throws Throwable {
		utilities.webDriverWait(driver, Adv_State_head_app);
		driver.findElement(Adv_State_head_app).click();
		utilities.MinimumWait(driver);
		driver.findElement(Final_app_state).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Add_gap_filling_Nursery_details() throws Throwable {
		utilities.webDriverWait(driver, Nursery_saplings_ip);
		driver.findElement(Nursery_saplings_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(Nursery_opt).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
		driver.findElement(Batch_sel).click();
		utilities.MaximumWait(driver);
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		t.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Advance_receipt_number_selection_details() throws Throwable {
		utilities.webDriverWait(driver, Advance_receipt_sel);
		driver.findElement(Advance_receipt_sel).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Variety_option_selection_details() throws Throwable {
		utilities.webDriverWait(driver, Variety_sel);
		driver.findElement(Variety_sel).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_vendor_option_selection_details() throws Throwable {
		utilities.webDriverWait(driver, Vendor_sel);
		driver.findElement(Vendor_sel).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Imported_saplings_Issues_Ip() throws Throwable {
		utilities.webDriverWait(driver, No_of_imp_enter);
		driver.findElement(No_of_imp_enter).click();
		utilities.MaximumWait(driver);
		driver.findElement(No_of_imp_enter).sendKeys("5");
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Save_imp_details() throws Throwable {
		utilities.webDriverWait(driver, Save_details);
		driver.findElement(Save_details).click();
		utilities.MaximumWait(driver);
	}

}
