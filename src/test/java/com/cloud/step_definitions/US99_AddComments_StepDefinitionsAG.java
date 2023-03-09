package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.US99_AddCommentsPageAG;
import com.cloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class US99_AddComments_StepDefinitionsAG extends BasePage{

    @Given("user on the home page")
    public void user_on_the_home_page() {
        BrowserUtils. verifyTitle("Files - Ceallo - QA");
        filesOption.click();
    }
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
      activityOption.click();

    }

    US99_AddCommentsPageAG us99_addCommentsPageAG= new US99_AddCommentsPageAG();
    @When("user choose the Details option")
    public void user_choose_the_option() {

        us99_addCommentsPageAG.detailOption.click();

    }
    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        us99_addCommentsPageAG.commentTab.sendKeys("Second Comment");
    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
      us99_addCommentsPageAG.submitButton.click();
    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
