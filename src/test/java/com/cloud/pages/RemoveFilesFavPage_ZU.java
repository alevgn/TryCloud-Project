package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveFilesFavPage_ZU {

    public RemoveFilesFavPage_ZU() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//a[@data-action='menu']")
    public WebElement actionIcon;

    @FindBy(xpath="//a[@data-action='Favorite']")
    public WebElement removeFromFavoritesOption;

    @FindBy(xpath="//a[.='Favorites']")
    public WebElement FavoritesSubModule;

    @FindBy(xpath="//a[@class='name']")
    public WebElement verifiedInvisibleElement;

}
