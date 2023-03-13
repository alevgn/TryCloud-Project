package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage_B28G31_101_MG {

    public SearchPage_B28G31_101_MG(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(name = "query")
        public WebElement searchMagnifier;

    @FindBy(xpath = "//input[@class='unified-search__form-input']")
    public WebElement searchBox;

    @FindBy(xpath = "(//h3[@title='Talk'])[2]")
    public WebElement displaysElement;








}
