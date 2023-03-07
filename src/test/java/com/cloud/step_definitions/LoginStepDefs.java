package com.cloud.step_definitions;

import com.cloud.pages.LoginPage;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.ceallo.com/index.php/login");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("user")){
            username = ConfigurationReader.getProperty("username");
            password = ConfigurationReader.getProperty("password");
        }else if(userType.equalsIgnoreCase("employee")){
            username = ConfigurationReader.getProperty("employee_username");
            password = ConfigurationReader.getProperty("employee_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }





}
