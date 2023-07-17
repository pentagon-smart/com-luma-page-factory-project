package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacket;

    public void clickOnJacket(){
        mouseHoverThree(womenMenu,tops,jacket);

    }

}
