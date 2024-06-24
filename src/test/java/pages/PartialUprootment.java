package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class PartialUprootment extends DriverFactory {
	Utilities utilities = new Utilities();
	By username                = By.xpath("//input[@type='text']");
  	By password                = By.xpath("//input[@type='password']");
  	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
  	By sidebar_Ngt             = By.xpath("//a[@class='sidebar-toggle']");
  	By Activities_menu_click   = By.xpath("//span[text()='Activities']");
  	By Partial_uprootment_clk  = By.xpath("//a[@href='#/partialUprootment']");
  	By Search_farmer           = By.xpath("//input[@aria-label='Select Farmer']");
  	By without_search_farmer   = By.xpath("//div[@ng-messages='addForm.autocompleteField.$error']");
  	By Auto_suggestions        = By.xpath("//ul[contains(@class, 'md-autocomplete-suggestions')]/li");
  	By Select_farmer_plot      = By.xpath("(//div[@class='md-container md-ink-ripple'])[1]");
  	By Total_plot_area         = By.xpath("//input[@name='TotalPlotArea']");
  	By with_out_plot_area      = By.xpath("//div[@ng-messages='plotForm.TotalPlotArea.$error']");
  	By Total_Palm_area         = By.xpath("//input[@ng-model='plotDetails.TotalPalmArea']");
  	By Crop_In_Left_out_area   = By.xpath("//md-select[@ng-model='plotDetails.LeftOutAreaCropId']");
    By Select_crop_left_area_o = By.xpath("//div[text()='Cocoa Mature']");
    
	public void the_user_signin_with_the_Respective_role_credential_details() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}


	public void the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_pages() throws Throwable {
		utilities.webDriverWait(driver, sidebar_Ngt);
		driver.findElement(sidebar_Ngt).click();
		utilities.MaximumWait(driver);
	}


	public void click_on_the_dashboard_menu_as_Activities_module_name() throws Throwable {
		utilities.webDriverWait(driver, Activities_menu_click);
		driver.findElement(Activities_menu_click).click();
		utilities.MaximumWait(driver);
	}


	public void click_on_the_Partial_Uprootment_screen() throws Throwable {
		utilities.webDriverWait(driver, Partial_uprootment_clk);
		driver.findElement(Partial_uprootment_clk).click();
		utilities.MaximumWait(driver);
	}


	public void click_on_the_search_farmer_input_field() throws Throwable {
		utilities.webDriverWait(driver, Search_farmer);
		driver.findElement(Search_farmer).click();
		utilities.MaximumWait(driver);
		driver.findElement(Search_farmer).sendKeys("145");
		utilities.MaximumWait(driver);
		driver.findElement(Search_farmer).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(without_search_farmer);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
	
	}


	public void Select_farmer_from_the_auto_suggestion_keywords_list() throws Throwable {
		utilities.webDriverWait(driver, Search_farmer);
        WebElement searchField = driver.findElement(Search_farmer);
        searchField.sendKeys("179");
        utilities.MaximumWait(driver);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Auto_suggestions));
            System.out.println("Number of suggestions found: " + suggestions.size());
            for (WebElement suggestion : suggestions) {
                System.out.println("Suggestion text: " + suggestion.getText());
                if (suggestion.getText().contains("179")) {
                    suggestion.click();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception while waiting for suggestions: " + e.getMessage());
        }
        utilities.MaximumWait(driver);
    }


	public void check_with_the_selected_farmer_plot_details() throws Throwable {
		utilities.webDriverWait(driver, Select_farmer_plot);
		driver.findElement(Select_farmer_plot).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Total_plot_area_input_details() throws Throwable {
		utilities.webDriverWait(driver, Total_plot_area);
		driver.findElement(Total_plot_area).click();
		utilities.MaximumWait(driver);
		driver.findElement(Total_plot_area).sendKeys("1.1214544898789798712365746468534635465844685746854");
		utilities.MaximumWait(driver);
		driver.findElement(Total_plot_area).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(with_out_plot_area);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Total_plot_area).sendKeys("1.5s");
		utilities.MaximumWait(driver);

	}


	public void check_with_the_Total_Palm_area_input_details() throws Throwable {
		utilities.webDriverWait(driver, Total_Palm_area);
		driver.findElement(Total_Palm_area).click();
		utilities.MaximumWait(driver);
		driver.findElement(Total_Palm_area).sendKeys("1.1214544898789798712365746468534635465844685746854");
		utilities.MaximumWait(driver);
		driver.findElement(Total_Palm_area).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Total_Palm_area).sendKeys("0.1s");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Crop_in_Left_out_area_dropdown_selection() throws Throwable {
		utilities.webDriverWait(driver, Crop_In_Left_out_area);
		driver.findElement(Crop_In_Left_out_area).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_crop_left_area_o).click();
		utilities.MaximumWait(driver);

	}

		
	}


