package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.Pageable;

public class UploadFilePageAG {

    public UploadFilePageAG() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusButton;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement hiddenUploadFile;

    @FindBy(xpath = "//span[.='message (2)']")
    public WebElement verifiedFileName;


}
