package com.cloud.step_definitions;

import com.cloud.pages.LoginPage;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class failedLogin_StepDefinitions {

    @Given("user is on the login page projectURL")
    public void user_is_on_the_login_page_project_url() {
        Driver.getDriver().get("https://qa.ceallo.com/index.php/login");
    }

    LoginPage loginPage = new LoginPage();

    @When("user enters invalid username {string}")
    public void user_enters_invalid_and(String invalidUsername) {
        loginPage.userName.sendKeys(invalidUsername);
    }

    @And("user enters invalid password {string}")
    public void userEntersInvalidPassword(String invalidPassword) {
        loginPage.password.sendKeys(invalidPassword);
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.submit.click();
    }



    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String expectedWarningMessage) {
        Assert.assertEquals(loginPage.warningMessage.getText(), expectedWarningMessage);
    }



}
