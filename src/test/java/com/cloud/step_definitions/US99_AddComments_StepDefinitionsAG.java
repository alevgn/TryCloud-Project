package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.US99_AddCommentsPageAG;
import com.cloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class US99_AddComments_StepDefinitionsAG extends BasePage{

    US99_AddCommentsPageAG us99_addCommentsPageAG= new US99_AddCommentsPageAG();
    @Given("user on the home page")
    public void user_on_the_home_page() {
        BrowserUtils. verifyTitle("Files - Ceallo - QA");


    }


    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
      us99_addCommentsPageAG.actionIcon.click();

    }


    @When("user choose the Details option")
    public void user_choose_the_option() {

        us99_addCommentsPageAG.detailOption.click();

    }
    @When("user write a comment as {string} inside the input box")
    public void user_write_a_comment_inside_the_input_box(String message) {
        us99_addCommentsPageAG.commentTab.click();
        us99_addCommentsPageAG.inputBox.sendKeys(message);
    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
      us99_addCommentsPageAG.submitButton.click();
    }

    @Then("Verify the {string} is displayed in the comment section.")
    public void verifyTheIsDisplayedInTheCommentSection(String comment) {

        BrowserUtils.sleep(3);
        List<String> actualComments= BrowserUtils.getElementsText(us99_addCommentsPageAG.comments);
       Assert.assertTrue(actualComments.contains(comment));

     
    }


}
