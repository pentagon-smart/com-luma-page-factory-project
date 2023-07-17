package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {

    MenPage menPage;
    ProductPage productPage;
    ShoppingCartPage shoppingCartPage;


    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        menPage = new MenPage();
        productPage = new ProductPage();
        shoppingCartPage = new ShoppingCartPage();
    }
    @Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        //* Mouse Hover on Men Menu
        //* Mouse Hover on Bottoms
        //* Click on Pants
        menPage.mouseHoverAndClickOnPants();
        Thread.sleep(1000);

        //* Mouse Hover on product name
        productPage.mouseHoverOnProduct();
        Thread.sleep(1000);

        //‘Cronus Yoga Pant’ and click on size 32.
        productPage.mouseHoverAndClickOnSize();
        Thread.sleep(1000);

        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        productPage.mouseHoverAndClickOnColour();
        Thread.sleep(1000);

        //* Mouse Hover on product name Cronus Yoga Pant’ and click on Add To Cart’ Button.
        productPage.mouseHoverOnProduct();
        shoppingCartPage.mouseHoverAndClickOnCart();
        Thread.sleep(1000);

        //* Verify the text You added Cronus Yoga Pant to your shopping cart.
        Thread.sleep(1000);

        //* Click on ‘shopping cart’ Link into message
        shoppingCartPage.clickOnShoppingCart();
        Thread.sleep(1000);

        //* Verify the text ‘Shopping Cart.’
        Assert.assertEquals(shoppingCartPage.getShoppingCart(),"Shopping Cart","Shopping Cart is not dispalyed");
        Thread.sleep(1000);

        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCartPage.getProductName(),"Cronus Yoga PantCronus Yoga Pant","Product is not dispalyed");

        //* Verify the product size ‘32’
        Assert.assertEquals(shoppingCartPage.getProductSize(),"32","Size is not dispalyed");
        Thread.sleep(1000);

        //* Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCartPage.getProductColour(),"Black","Black is not dispalyed");
        Thread.sleep(1000);
    }
}
