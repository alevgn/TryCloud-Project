package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class B28G31_98_StepDefs_SM extends BasePage {

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        BrowserUtils.verifyElementDisplayed(logoIcon);
    }

    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        actionIconSM_Delete_TEst_file.click();
    }
    @When("user choose the Delete file,folder option")
    public void user_choose_the_delete_file_folder_option() {
        deleteFileButtonFromDropDownMenu.click();
    }
    @When("the user clicks the Deleted file,folder sub-module on the left side")
    public void the_user_clicks_the_deleted_file_folder_sub_module_on_the_left_side() {
        deletedFilesButtonFromSubModule.click();
    }
    @Then("Verify the deleted file is displayed on the Deleted Files page.")
    public void verify_the_deleted_file_is_displayed_on_the_deleted_files_page() {
        BrowserUtils.sleep(2);
        //System.out.println("deletedFileWebE_UnderDeletedFiles.isDisplayed() = " + deletedFileWebE_UnderDeletedFiles.isDisplayed());
        Assert.assertTrue(deletedFileWebE_UnderDeletedFiles.isDisplayed());
        //clicking the restore button and restoring the file so this test can be performed automatically again
        restoreButtonFromDeletedFilesModuleS.click();
    }

}

