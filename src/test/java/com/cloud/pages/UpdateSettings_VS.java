package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateSettings_VS {


    public UpdateSettings_VS(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//header[@id='header']")
    public WebElement dashBoard;

    @FindBy(xpath = "//li[@data-id='files']")
    public WebElement filesOption;

    @FindBy(xpath = "//div[@id='app-settings-header']")
    public WebElement mainPageSettings;


    @FindBy(xpath = "//div[@id='files-setting-richworkspace']")
    public WebElement firstCheckBox;



}