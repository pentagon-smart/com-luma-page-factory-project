package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Gear')]")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Bags')]")
    WebElement bags;



    public void mouseHoverAndClickOnBags(){
       mouseHoverTwo(gearMenu,bags);
    }



}
