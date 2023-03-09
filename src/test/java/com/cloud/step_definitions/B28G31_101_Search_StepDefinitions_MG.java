package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.SearchPage_B28G31_101_MG;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class B28G31_101_Search_StepDefinitions_MG extends BasePage {

    SearchPage_B28G31_101_MG searchPageB28G31101Mg = new SearchPage_B28G31_101_MG();


    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {

        searchMagnifier.click();

    }
    @When("users search any existing file-folder-user name")
    public void users_search_any_existing_file_folder_user_name() {
            searchPageB28G31101Mg.searchBox.sendKeys("Talk");
            BrowserUtils.sleep(20);

    }

    @Then("verify the app displays the expected result option")
    public void verify_the_app_displays_the_expected_result_option() {
          String actual = searchPageB28G31101Mg.displaysElement.getText();
          String expected = "Talk";
        Assert.assertEquals(expected, actual);


    }

}
