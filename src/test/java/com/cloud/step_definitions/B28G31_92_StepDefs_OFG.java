package com.cloud.step_definitions;


import com.cloud.pages.BasePage;
import com.cloud.pages.FilesPage_OFG;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class B28G31_92_StepDefs_OFG extends BasePage {

    LoginPage loginPage = new LoginPage();
    FilesPage_OFG filesPage_ofg = new FilesPage_OFG();

    @Given("User is already logged into the Ceallo")
    public void user_is_already_logged_into_the_ceallo() {
        LoginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        BrowserUtils.verifyElementDisplayed(logoIcon);
    }

    @When("the user clicks the Files module")
    public void the_user_clicks_the_files_module() {
        filesOption.click();
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        filesPage_ofg.selectAllCheckbox.click();
    }

    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        for (WebElement each : filesPage_ofg.availableCheckboxes) {
            Assert.assertTrue(each.isSelected());
        }
    }


}
