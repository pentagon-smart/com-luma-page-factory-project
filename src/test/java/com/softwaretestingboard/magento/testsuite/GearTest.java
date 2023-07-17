package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {

    GearPage gearPage;
    ProductPage productPage;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT()
    {
        gearPage = new GearPage();
        productPage = new ProductPage();
        shoppingCartPage = new ShoppingCartPage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        //* Mouse Hover on Gear Menu
        //* Click on Bags
        gearPage.mouseHoverAndClickOnBags();
        Thread.sleep(1000);

        //* Click on Product Name ‘Overnight Duffle’
        productPage.clickOnProduct();
        Thread.sleep(1000);

        //* Verify the text ‘Overnight Duffle’
        Assert.assertEquals(productPage.getProductText(),"Overnight Duffle","Overnight Duffle is not dispalyed");
        Thread.sleep(1000);

        //* Change Qty 3
        productPage.changeQty();
        Thread.sleep(1000);

        //* Click on ‘Add to Cart’ Button.
        productPage.clickOnaddToCart();
        Thread.sleep(1000);

        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(shoppingCartPage.getMessageText(),"You added Overnight Duffle to your shopping cart.","Message is not dispalyed");
        Thread.sleep(1000);

        //* Click on ‘shopping cart’ Link into message
        shoppingCartPage.clickOnShoppingCart1();
        Thread.sleep(1000);

        //* Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(shoppingCartPage.getProductOvernightDuffel(),"Overnight Duffle","Overnight Duffle is not dispalyed");
        Thread.sleep(1000);

        //* Verify the Qty is ‘3’
        //* Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingCartPage.getProductPrice(),"$135.00","$135.00 is not dispalyed");
        Thread.sleep(1000);

        //* Change Qty to ‘5’
        shoppingCartPage.enterQty();
        Thread.sleep(1000);

        //* Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();
        Thread.sleep(1000);

        //* Verify the product price ‘$225.00’
        Assert.assertEquals(shoppingCartPage.getProductPrice1(),"$225.00","$225.00 is not dispalyed");
        Thread.sleep(1000);
    }
}
