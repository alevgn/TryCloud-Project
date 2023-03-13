package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.FilesPage;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FavoritesAddStep_definitions extends BasePage {


    public void perform(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).click().perform();
    }


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        System.out.println("User is on the main page");

        String expectedTitle = "Files - Ceallo - QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        BasePage.navigateToTab(string);
    }

    FilesPage filesPage = new FilesPage();

    @When("the user clicks action-icon from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(filesPage.actionIcon));
        wait.until(ExpectedConditions.elementToBeClickable(filesPage.actionIcon));
        perform(filesPage.actionIcon);
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        FilesPage.navigateActionsMenu(string);

    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
        FilesPage.navigateFilesMenu(string);
    }

    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {

        Boolean verify = Driver.getDriver().findElement(By.xpath("//tr[@data-file='Talk']")).isEnabled();
        System.out.println(verify);
    }

}
