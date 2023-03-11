package com.cloud.step_definitions;

import com.cloud.pages.B28G31_96_CreateFolderPage;
import com.cloud.pages.BasePage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B28G31_96_createAFolderStepDef extends BasePage {
    B28G31_96_CreateFolderPage createFolderPage = new B28G31_96_CreateFolderPage();
    String folderName = "";

    @Given("user clicks on add icon tab")
    public void user_clicks_on_add_icon_tab() {
        createFolderPage.addIcon.click();
    }
    @Given("user clicks on new folder button")
    public void user_clicks_on_new_folder_button() {
        createFolderPage.newFolderButton.click();
    }
    @Given("user writes {string} for new folder name")
    public void user_writes_name_for_new_folder(String newFolderName) {
        createFolderPage.newFolderInputBox.sendKeys(newFolderName);
        folderName = newFolderName;
    }
    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        createFolderPage.newFolderSubmitButton.click();
    }
    @Then("user should verify folder is displayed on homepage")
    public void user_should_verify_folder_is_displayed_on_homepage() {
        createFolderPage.isNewFolderDisplayed(folderName);
        createFolderPage.deleteFolder(folderName);
    }


}
