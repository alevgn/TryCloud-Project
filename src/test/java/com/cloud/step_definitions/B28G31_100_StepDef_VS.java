package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.LoginPage;
import com.cloud.pages.UpdateSettings_VS;
import com.cloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B28G31_100_StepDef_VS extends BasePage {


    LoginPage loginPage = new LoginPage();

    UpdateSettings_VS update_settingsVS = new UpdateSettings_VS();


    @Given("User is logged in to the Ceallo")


    @Given("user to be able to see the dashboard page")
    public void user_to_see_dashboard_page() {
        BrowserUtils.verifyElementDisplayed(update_settingsVS.dashBoard);
    }

    @When("user clicks the Files module")
    public void user_clicks_the_files_module() {
        update_settingsVS.filesOption.click();
    }

    @When("user clicks Settings on the left bottom corner")
    public void click_settings() {
        update_settingsVS.mainPageSettings.click();
    }


    @Then("the user should be able to click any checkbox")
    public void user_click_any_checkbox() {

        update_settingsVS.firstCheckBox.click();
        //String actualSelected = update_settingsVS.firstCheckBox.getText();


        // Assert.assertTrue();


    }
}