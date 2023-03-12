package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExistFileUpload_Page_Bobby {


    public ExistFileUpload_Page_Bobby() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy (xpath = "//tr[@data-id='1025']")
    public WebElement Talk_Button;

    @FindBy (xpath = "//a[@class='button new']")
    public WebElement plus_button;

    @FindBy (xpath = "//label[@class='menuitem']")
    public  WebElement uploadFileDropdown;

    @FindBy(xpath = "//span[.='ProjectSampleFile_Bobby']")
    public WebElement verifiedFileName;





}
