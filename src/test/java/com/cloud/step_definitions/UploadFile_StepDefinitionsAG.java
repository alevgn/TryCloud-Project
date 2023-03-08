package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.LoginPage;
import com.cloud.pages.UploadFilePageAG;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

public class UploadFile_StepDefinitionsAG extends BasePage {

    @Given("user on the dashboard page -AG")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get("https://qa.ceallo.com/index.php/login");
        LoginPage loginPage = new LoginPage();
        loginPage.login("User1", "Userpass123");
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String files) {
        filesOption.click();
    }

    UploadFilePageAG uploadFilePageAG = new UploadFilePageAG();

    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        uploadFilePageAG.plusButton.click();
    }

    @And("the user uploads a file from {string} with the upload file option")
    public void theUserUploadsAFileFromWithTheUploadFileOption(String path) {

        File file = new File("src/test/resources/exampleFile.txt");

        path = file.getAbsolutePath();

        WebElement uploadFileElement = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        uploadFileElement.sendKeys(path);

        // File file = new File("src/test/resources/exampleFile.txt");

        //Driver.getDriver().findElement(By.xpath("//input[@type='file']")).sendKeys(file.getAbsolutePath());

        //Driver.getDriver().findElement(By.xpath("//input[@type='file']")).sendKeys(file.getAbsolutePath());

    }

    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

    }


}
