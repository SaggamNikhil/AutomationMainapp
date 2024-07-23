package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class AssignClusterKRA extends DriverFactory{
  	Utilities utilities        =  new Utilities();
  	By username                = By.xpath("//input[@type='text']");
	By password                = By.xpath("//input[@type='password']");
	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Dashboard               = By.xpath("//section[@class='content-header']");
	By sidebar_Navgat          = By.xpath("//a[@class='sidebar-toggle']");
	By settings_module         = By.xpath("//span[text()='Settings']");
	By KRA_menu_click          = By.xpath("(//i[@class='fa fa-user']/../span)[3]");
	By Assign_cluster_nav      = By.xpath("//a[@href='#/assignClusterkra']");
	By Sel_Finan_click         = By.xpath("//md-select[@ng-model='assignkra.FinancialYear']");
	By Sele_finan_yr_opt       = By.xpath("(//div[text()='2024-2025'])[2]");
	By Select_state_click      = By.xpath("//md-select[@ng-model='assignkra.stateid']");
	By Without_state_toast     = By.xpath("//div[@ng-messages='rowForm.stateid.$error']");
	By Sel_state_opt           = By.xpath("//div[text()='Andhra Pradesh']");
	By District_select_clk     = By.xpath("//md-select[@ng-model='assignkra.districtid']");
	By Side_click_bar          = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
	By Without_dis_toast       = By.xpath("//div[@ng-messages='rowForm.districtid.$error']");
	By sel_Dis_opt             = By.xpath("//div[text()='EAST GODAVARI']");
	By Cluster_select_clk      = By.xpath("//md-select[@ng-model='assignkra.ClusterId']");
	By With_out_cluster        = By.xpath("//div[@ng-messages='rowForm.ClusterId.$error']");
	By Sel_Cluster_opt         = By.xpath("//div[text()='Ayyavaram']");
	By Sel_Cluster_opt_t       = By.xpath("(//md-option[@ng-value='cluster.ClusterId'])[3]");
	By Select_Department_c     = By.xpath("//md-select[@ng-model='assignkra.DepartmentTypeId']");
	By Without_sel_depart      = By.xpath("//div[@ng-messages='rowForm.DepartmentTypeId.$error']");
	By Department_opt_sel  	   = By.xpath("//div[text()='Admin ']");
	By Department_opt_two      = By.xpath("//div[text()='Agriculture ']");
	By Search_button_click     = By.xpath("//button[@ng-click='initAssignedKras(assignkra)']");
	By Assign_cluster_action   = By.xpath("//button[@ng-click='assignclusterkra()']");
	By Select_financ_sel       = By.xpath("(//md-select[@name='FinancialYear'])[2]");
	By Side_bar_menu           = By.xpath("//div[@class='md-toolbar-tools']");
    By Without_sel_finan_op    = By.xpath("//div[@ng-messages='rowForm.FinancialYear.$error']");
    By Select_financ_opti      = By.xpath("(//div[text()='2024-2025'])[3]");
    By Sel_state_click         = By.xpath("//md-select[@ng-model='AssignKRA.stateid']");
    By without_state_sel       = By.xpath("(//div[@ng-messages='rowForm.stateid.$error'])[2]");
    By State_sel_option        = By.xpath("(//md-option[@value='1']//div[text()='Andhra Pradesh'])[2]");
    By Sel_Dist_click          = By.xpath("//md-select[@ng-model='AssignKRA.districtid']");
    By without_dis_toast       = By.xpath("(//div[@ng-messages='rowForm.districtid.$error'])[2]");
    By Sel_dis_opt             = By.xpath("//div[text()='EAST GODAVARI']");
    By Sel_cluster_click       = By.xpath("//md-select[@ng-model='AssignKRA.ClusterId']");
    By Without_Cluster_toast   = By.xpath("(//div[@ng-messages='rowForm.ClusterId.$error'])[2]");
    By Cluster_one_sel         = By.xpath("(//div[text()='Ayyavaram'])[3]");
    By Cluster_two_sel         = By.xpath("(//div[text()='Chagallu'])[3]");
    By Cluster_three_sel       = By.xpath("(//div[text()='Finance&accounts '])[2]");
    By Selec_KRA_click         = By.xpath("//md-select[@ng-model='AssignKRA.kraIds']");
    By With_out_kra_toast      = By.xpath("//div[@ng-messages='rowForm.kraIds.$error']");
    By Sele_kra_one            = By.xpath("//div[text()='Area Expansion- Palm Area']");
    By Sele_kra_two            = By.xpath("//div[text()='Area expansion- Crop Maintenance Visits']");
    By Select_depart_click     = By.xpath("//md-select[@ng-model='AssignKRA.DepartmentTypeId']");
    By Without_depart_toast    = By.xpath("(//div[@ng-messages='rowForm.DepartmentTypeId.$error'])[2]");
    By Select_depart_one       = By.xpath("(//div[text()='Admin '])[3]");
    By Select_depart_two       = By.xpath("(//div[text()='Agriculture '])[3]");
    By Verify_save_click       = By.xpath("//button[@ng-click='assignclusterkradata(AssignKRA)']");
    By Edit_cluster_kra_click  = By.xpath("//button[@ng-click='updateassignkra()']");
    By Select_finan_yr_edit    = By.xpath("//md-select[@ng-model='AssignKRA.FinancialYear']");
    By Select_finan_opt_edit   = By.xpath("(//div[text()='2024-2025'])[3]");
    By save_update_details     = By.xpath("//button[@ng-click='UpdateassignClusterKRA(AssignKRA)']");
    
	public void User_is_login_page_of_oilpalm_project_screen() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.MaximumWait(driver);
	}

	public void The_Users_enters_with_the_verify_username_and_password_input_details() throws Throwable {
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void the_page_will_be_Navigated_to_the_Dashboards_Main_menu_screens() throws Throwable {
		utilities.webDriverWait(driver, Dashboard);
		WebElement message = driver.findElement(Dashboard);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, sidebar_Navgat);
		driver.findElement(sidebar_Navgat).click();
		utilities.MinimumWait(driver);
	}

	public void verify_with_the_click_on_the_Settings_module_navigate_menu() throws Throwable {
		utilities.webDriverWait(driver, settings_module);
		driver.findElement(settings_module).click();
		utilities.MaximumWait(driver);
		driver.findElement(KRA_menu_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Navigation_to_the_AssignKRA_screen() throws Throwable {
		utilities.webDriverWait(driver, Assign_cluster_nav);
		driver.findElement(Assign_cluster_nav).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_Financial_year_selection_from_the_Dropdown_option_field() throws Throwable {
		utilities.webDriverWait(driver, Sel_Finan_click);
		driver.findElement(Sel_Finan_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sele_finan_yr_opt).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_State_from_the_Dropdown_input_field() throws Throwable {
		utilities.webDriverWait(driver, Select_state_click);
		driver.findElement(Select_state_click).click();
		Robot i = new Robot();
		i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_state_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Select_state_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sel_state_opt).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_Districts_from_the_Dropdown_field_selection() throws Throwable {
		utilities.webDriverWait(driver, District_select_clk);
		driver.findElement(District_select_clk).click();
		utilities.MaximumWait(driver);
        driver.findElement(Side_click_bar).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_dis_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(District_select_clk).click();
		utilities.MaximumWait(driver);
		driver.findElement(sel_Dis_opt).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_Clusters_from_the_Dropdown_field_selection() throws Throwable {
		utilities.webDriverWait(driver, Cluster_select_clk);
		driver.findElement(Cluster_select_clk).click();
		utilities.MaximumWait(driver);
        driver.findElement(Side_click_bar).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_cluster);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Cluster_select_clk).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sel_Cluster_opt).click();
		utilities.MaximumWait(driver);
        driver.findElement(Sel_Cluster_opt_t).click();
		Robot q = new Robot();
		q.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_Department_type_from_the_Dropdown_field_selection() throws Throwable {
		utilities.webDriverWait(driver, Select_Department_c);
		driver.findElement(Select_Department_c).click();
		utilities.MaximumWait(driver);
		Robot q = new Robot();
		q.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_sel_depart);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Select_Department_c).click();
		utilities.MaximumWait(driver);
		driver.findElement(Department_opt_sel).click();
		utilities.MaximumWait(driver);
		driver.findElement(Department_opt_two).click();
		q.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_clicking_on_the_Search_button_from_the_Assign_kra_screen() throws Throwable {
		utilities.webDriverWait(driver, Search_button_click);
		driver.findElement(Search_button_click).click();
		utilities.MaximumWait(driver);
	}

	public void User_click_on_the_AssignKRA_action_button() throws Throwable {
		utilities.webDriverWait(driver, Assign_cluster_action);
		driver.findElement(Assign_cluster_action).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_select_financial_year_from_the_Dropdown_input_list() throws Throwable {
		utilities.webDriverWait(driver, Select_financ_sel);
		driver.findElement(Select_financ_sel).click();
        utilities.MaximumWait(driver);
		driver.findElement(Select_financ_opti).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Select_State_from_the_Dropdown_input_list() throws Throwable {
		utilities.webDriverWait(driver, Sel_state_click);
		driver.findElement(Sel_state_click).click();
        utilities.MaximumWait(driver);
        Robot w = new Robot();
		w.keyPress(KeyEvent.VK_TAB);
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(without_state_sel);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Sel_state_click).click();
		utilities.MaximumWait(driver);
        driver.findElement(State_sel_option).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Select_District_from_the_Dropdown_input_list() throws Throwable {
		utilities.webDriverWait(driver, Sel_Dist_click);
		driver.findElement(Sel_Dist_click).click();
        utilities.MaximumWait(driver);
        Robot w = new Robot();
		w.keyPress(KeyEvent.VK_TAB);
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(without_dis_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Sel_Dist_click).click();
		utilities.MaximumWait(driver);
		w.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		w.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		w.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Select_Clusters_from_the_Dropdown_input_list() throws Throwable {
		utilities.webDriverWait(driver, Sel_cluster_click);
		driver.findElement(Sel_cluster_click).click();
        utilities.MaximumWait(driver);
        Robot w = new Robot();
		w.keyPress(KeyEvent.VK_TAB);
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(Without_Cluster_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Sel_cluster_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Cluster_one_sel).click();
		utilities.MaximumWait(driver);
		//utilities.PerformClickUsingJavaScriptExecutor(driver, Cluster_one_sel);
		driver.findElement(Cluster_two_sel).click();
		utilities.MaximumWait(driver);
        //utilities.PerformClickUsingJavaScriptExecutor(driver, Cluster_two_sel);
		w.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Select_KRA_from_the_Dropdown_input_list() throws Throwable {
		utilities.webDriverWait(driver, Selec_KRA_click);
		driver.findElement(Selec_KRA_click).click();
        utilities.MaximumWait(driver);
        Robot w = new Robot();
		w.keyPress(KeyEvent.VK_TAB);
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(With_out_kra_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Selec_KRA_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sele_kra_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sele_kra_two).click();
		w.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_Department_type_from_the_Dropdown_input_list() throws Throwable {
		utilities.webDriverWait(driver, Select_depart_click);
		driver.findElement(Select_depart_click).click();
        utilities.MaximumWait(driver);
        Robot w = new Robot();
		w.keyPress(KeyEvent.VK_TAB);
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(Without_depart_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Select_depart_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_depart_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_depart_two).click();
		w.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Clicking_on_the_Save_button_from_the_popup_grid() throws Throwable {
		utilities.webDriverWait(driver, Verify_save_click);
		driver.findElement(Verify_save_click).click();
        utilities.MaximumWait(driver);
	}

	public void check_with_the_Clicking_on_the_Edit_Cluster_KRA_action_button() throws Throwable {
		utilities.webDriverWait(driver, Edit_cluster_kra_click);
		driver.findElement(Edit_cluster_kra_click).click();
        utilities.MaximumWait(driver);
	}

	public void check_with_the_update_by_Financial_year_dropdown_selection_details() throws Throwable {
		utilities.webDriverWait(driver, Select_finan_yr_edit);
		driver.findElement(Select_finan_yr_edit).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_finan_opt_edit).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_update_by_State_selection_from_the_Dropdown_selection_field() throws Throwable {
		utilities.webDriverWait(driver, Sel_state_click);
		driver.findElement(Sel_state_click).click();
		Robot i = new Robot();
		i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(without_state_sel);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
        utilities.PerformClickUsingJavaScriptExecutor(driver, Sel_state_click);
		utilities.MaximumWait(driver);
		driver.findElement(State_sel_option).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_update_by_Districts_selecton_from_the_Dropdown_selection_field() throws Throwable {
		utilities.webDriverWait(driver, Sel_Dist_click);
		driver.findElement(Sel_Dist_click).click();
        utilities.MaximumWait(driver);
        Robot w = new Robot();
		w.keyPress(KeyEvent.VK_TAB);
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(without_dis_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Sel_Dist_click).click();
		utilities.MaximumWait(driver);
		w.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		w.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		w.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_update_by_Clusters_selection_from_the_Dropdown_selection_field() throws Throwable {
		utilities.webDriverWait(driver, Sel_cluster_click);
		driver.findElement(Sel_cluster_click).click();
        utilities.MaximumWait(driver);
        Robot w = new Robot();
		w.keyPress(KeyEvent.VK_TAB);
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(Without_Cluster_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Sel_cluster_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Cluster_two_sel).click();
		w.keyPress(KeyEvent.VK_TAB);
		driver.findElement(Cluster_three_sel).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_update_by_click_on_the_save_action_button() throws Throwable {
		utilities.webDriverWait(driver, save_update_details);
		driver.findElement(save_update_details).click();
        utilities.MaximumWait(driver);
	}

}
