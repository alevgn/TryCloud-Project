package com.cloud.pages;

import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class B28G31_96_CreateFolderPage {

    public B28G31_96_CreateFolderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    Actions actions = new Actions(Driver.getDriver());

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;

    @FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolderButton;

    @FindBy(id = "view13-input-folder")
    public WebElement newFolderInputBox;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement newFolderSubmitButton;

    @FindBy(xpath = "")
    public WebElement actionButton;

    //@FindBy(xpath = "//a[@class='menuitem action action-delete permanent']")
    //public WebElement deleteButton;

    @FindBy (xpath = "//a[@class='menu-option option-delete']")
    public WebElement deleteButton;

    public void isNewFolderDisplayed(String folderName) {
        WebElement newFolder=Driver.getDriver().findElement(By.xpath("//span[.='" + folderName + "']"));
        Assert.assertTrue(newFolder.isDisplayed());
    }

    public void deleteFolder(String folderName){
     WebElement newFolderDeleting= Driver.getDriver().findElement(By.xpath("//span[.='" + folderName + "']"));
     actions.moveToElement(newFolderDeleting).contextClick(newFolderDeleting).perform();
     //actions.contextClick(newFolderDeleting).perform();
     BrowserUtils.waitForVisibility(deleteButton,10);
     deleteButton.click();




    }





}
