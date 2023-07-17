package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {

    WomenPage womenPage;
    ProductPage productPage;


    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        womenPage = new WomenPage();
        productPage = new ProductPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //* Mouse Hover on Women Menu
        //* Mouse Hover on Tops
        //* Click on Jackets
        womenPage.clickOnJacket();
        Thread.sleep(1000);

        //* Select Sort By filter “Product Name”
        productPage.selectProduct();
        Thread.sleep(1000);

        //* Verify the products name display in alphabetical order
        productPage.sortByProductName();
        Thread.sleep(1000);
    }

    @Test(groups = {"sanity", "smoke","regression"})
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //* Mouse Hover on Women Menu
        //* Mouse Hover on Tops
        //* Click on Jackets
        womenPage.clickOnJacket();
        Thread.sleep(1000);

        //* Select Sort By filter “Price”
        productPage.selectPrice();
        Thread.sleep(1000);

        //* Verify the products price display in Low to High
        productPage.sortByPrice();
        Thread.sleep(1000);
    }
}
