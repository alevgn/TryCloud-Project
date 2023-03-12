package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.ExistFileUpload_Page_Bobby;
import com.cloud.pages.LoginPage;
import com.cloud.pages.UploadFilePageAG;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class B28G31_97_StepDefinitions_Bobby extends BasePage {
    String expectedFileName="ProjectSampleFile_Bobby";
    LoginPage loginPage = new LoginPage();

    ExistFileUpload_Page_Bobby existFileUpload_page_bobby = new ExistFileUpload_Page_Bobby();

    UploadFilePageAG uploadFilePageAG = new UploadFilePageAG();

    @Given("Users on login page and login the app already")
    public void usersOnLoginPageAndLoginTheAppAlready() {

        BrowserUtils.sleep(2);
        loginPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    }


    @When("User clicks an existing folder")
    public void user_clicks_an_existing_folder() {
        BrowserUtils.sleep(2);
        existFileUpload_page_bobby.Talk_Button.click();
    }

    @Then("User clicks + button")
    public void user_clicks_button() {
        BrowserUtils.sleep(2);
        existFileUpload_page_bobby.plus_button.click();
    }

    @Then("User select a file and upload it")
    public void user_select_a_file_and_upload_it() {

        File file = new File("src/test/resources/ProjectSampleFile_Bobby.txt");

        WebElement uploadFileElement = uploadFilePageAG.hiddenUploadFile;
        uploadFileElement.sendKeys(file.getAbsolutePath());
    }

    @Then("Verify file uploaded and displayed on the page")
    public void verify_file_uploaded_and_displayed_on_the_page() {

        Assert.assertTrue(existFileUpload_page_bobby.verifiedFileName.isDisplayed());



    }



}
