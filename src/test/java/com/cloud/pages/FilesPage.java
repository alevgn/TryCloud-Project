package com.cloud.pages;

import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {

    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




    @FindBy(xpath = "(//span[@class='icon icon-more'])[5]")
    public WebElement actionIcon;

    @FindBy(xpath = "//span[@class='icon icon-starred']")
    public WebElement addToFavorite;


    public static void navigateFilesMenu(String tab) {
        String tabLocator = "//a[.='" + tab + "']";

        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).click().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }

    }

    public static void navigateActionsMenu(String tab) {
        String tabLocator = "//span[.='" + tab + "']";

        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).click().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }

    }
}
