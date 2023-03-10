package com.cloud.pages;


import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="user")
    public static WebElement userName;


    @FindBy(id="password")
    public static WebElement password;


    @FindBy(xpath="//input[@id='submit-form']")
    public static WebElement submit;


    public static void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

}
