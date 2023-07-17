package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottoms;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;


    public void mouseHoverAndClickOnPants(){

        mouseHoverThree(menMenu,bottoms,pants);

    }


}
