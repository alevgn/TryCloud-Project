package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.LoginPage;
import com.cloud.pages.RemoveFilesFavPage_ZU;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B28G31_94_RemoveFilesFavStepDefs_ZU extends BasePage {

LoginPage loginPage = new LoginPage();
RemoveFilesFavPage_ZU removeFilesFavPage_zu = new RemoveFilesFavPage_ZU();


    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String Files) {
        filesOption.click();
    }

    @When("the users click action-icon from any file on the page to remove And user choose the {string} option")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove_and_user_choose_the_option(String string) {
        removeFilesFavPage_zu.actionIcon.click();
        removeFilesFavPage_zu.removeFromFavoritesOption.click();


    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side_then_verify_that_the_file_is_not_listed_in_the_favorites_table(String string) {
   removeFilesFavPage_zu.FavoritesSubModule.click();
    }


    @Then("Verify that the file is not listed in the Favorites table")
    public void verifyThatTheFileIsNotListedInTheFavoritesTable() {
    BrowserUtils.verifyElementNotDisplayed((By.xpath("//a[@class='name']")));
    }
}
