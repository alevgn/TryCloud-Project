package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadFile_StepDefinitionsAG extends BasePage {

    @Given("user on the dashboard page -AG")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get("https://qa.ceallo.com/index.php/login");
        LoginPage loginPage= new LoginPage();
        loginPage.login("User1","Userpass123");
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String files) {
       filesOption.click();
    }
    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {

    }
    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
