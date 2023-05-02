package com.nopcommerce.demo.testsuite;

/**
 * 1. create class "TopMenuTest"
 * 1.1 create method with name "selectMenu" it has one parameter name "menu" of type
 * string
 * 1.2 This method should click on the menu whatever name is passed as parameter.
 * 1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
 * select the Menu and click on it and verify the page navigation.
 */

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();


    @Test
    public void verifyTextOfComputerTopMenuTabSuccessfully() {

        homePage.selectAllTopMenuTabs("Computers");
        Assert.assertEquals(homePage.verifyPaveNavigationOfComputerTopMenuTab(), "Computers");
    }

        @Test
        public void verifyPageNavigationOfElectronicsTopMenuTabSuccessfully() {

            homePage.selectAllTopMenuTabs("Electronics");
            Assert.assertEquals(homePage.verifyPaveNavigationOfElectronicsTopMenuTab(), "Electronics");
        }
        @Test
        public void verifyPageNavigationOfApparelTopMenuTabSuccessfully() {
         homePage.selectAllTopMenuTabs("Apparel");
        Assert.assertEquals( homePage.verifyPaveNavigationOfApparelTopMenuTab(),"Apparel");
        }

         @Test
         public void verifyPageNavigationOfDigitalDownloadsTopMenuTabSuccessfully() {
            homePage.selectAllTopMenuTabs("Digital downloads");
             Assert.assertEquals(homePage.verifyPaveNavigationOfDigitalDownloadsTopMenuTab(), "Digital downloads");
         }

         @Test
         public void verifyPageNavigationOfBooksTopMenuTabSuccessfully() {
        homePage.selectAllTopMenuTabs("Books");
        Assert.assertEquals(homePage.verifyPaveNavigationOfBooksTopMenuTab(), "Books");
    }

        @Test
        public void verifyPageNavigationOfJewelryTopMenuTabSuccessfully() {
        homePage.selectAllTopMenuTabs("Jewelry");
        Assert.assertEquals(homePage.verifyPaveNavigationOfJewelryTopMenuTab(), "Jewelry");
    }

        @Test
        public void verifyPageNavigationOfGiftCardsTopMenuTabSuccessfully() {
        homePage.selectAllTopMenuTabs("Gift cards");
        Assert.assertEquals(homePage.verifyPaveNavigationOfGiftCardsTopMenuTab(), "Gift Cards");
    }


    }



