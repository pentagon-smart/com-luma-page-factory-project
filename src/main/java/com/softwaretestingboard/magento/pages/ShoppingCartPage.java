package com.softwaretestingboard.magento.pages;


import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyproductName;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifyproductSize;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyProductColour;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-success success message']")
    WebElement verifyText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart1;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productOvernightDuffel;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col subtotal']//span[text()='$135.00']")
    WebElement verifyPrice;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col subtotal']//span[text()='$225.00']")
    WebElement verifyPrice1;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qtyChage;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppigCart;


    public void mouseHoverAndClickOnCart(){
        mouseHoverToElementAndClick(addToCart);
    }
    public String getShoppingCart(){
        return getTextFromElement(verifyCart);
//        verifyText(verifyCart,"You added Cronus Yoga Pant to your shopping cart.","Message is not displayed");
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartLink);
    }
    public String getShoppingCartText(){
        return getTextFromElement(shoppingCart);
    }
    public String getProductName(){
        return getTextFromElement(verifyproductName);
    }
    public String getProductSize(){
        return getTextFromElement(verifyproductSize);
    }
    public String getProductColour(){
        return getTextFromElement(verifyProductColour);
    }
    public String getMessageText(){
        return getTextFromElement(verifyText);
    }
    public void clickOnShoppingCart1(){
        clickOnElement(shoppingCart1);
    }
    public String getProductOvernightDuffel(){
        return getTextFromElement(productOvernightDuffel);
    }
    public String getProductPrice(){
        return getTextFromElement(verifyPrice);
    }
    public void enterQty(){
        driver.findElement(By.xpath("//input[@class='input-text qty']")).clear();
        sendTextToElement(qtyChage,"5");
    }
    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateShoppigCart);
    }
    public String getProductPrice1(){
        return getTextFromElement(verifyPrice1);
    }
}
