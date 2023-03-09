package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US99_AddCommentsPageAG {

    public US99_AddCommentsPageAG() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(xpath = "//a[@data-action='menu']")
//    public WebElement actionIcon;

    @FindBy(xpath = "//a[@data-action='menu']")
    public WebElement actionIcon;

    @FindBy(xpath = "//a[@data-action='Details']")
    public WebElement detailOption;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement commentTab;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement inputBox;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@id='commentsTabView']//li//div[@class='message']")
    public List<WebElement> comments;

    

}
