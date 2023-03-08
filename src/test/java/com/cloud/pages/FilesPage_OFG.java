package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage_OFG {
    public FilesPage_OFG(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//th[@class='column-selection']")
    public WebElement selectAllCheckbox;

    @FindBy(id = "//input[@class='selectCheckBox checkbox']")
    public List<WebElement> availableCheckboxes;

}
