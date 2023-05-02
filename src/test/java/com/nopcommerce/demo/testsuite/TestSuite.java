package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    HomePage homePage = new HomePage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    DeskTopsPage deskTopsPage = new DeskTopsPage();
    LogInPage logInPage = new LogInPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    ProductPage productPage = new ProductPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder(){
        //1.1 Click on Computer Menu.
        homePage.clickOnComputersTopMenu();
        //1.2 Click on Desktop
        homePage.clickOnDesktopLinkInComputersTopMenuDropdown();
        //1.3 Select Sort By position "Name: Z to A"
        deskTopsPage.selectSortByName("Name: Z to A");
        //1.4 Verify the Product will arrange in Descending order.
        deskTopsPage.verifyProductsInDescendingOrder("Name: Z to A");
    }

    @Test
    public void  verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // 2.1 Click on Computer Menu.
        homePage.clickOnComputersTopMenu();
        //2.2 Click on Desktop
        homePage.clickOnDesktopLinkInComputersTopMenuDropdown();
        //2.3 Select Sort By position "Name: A to Z"
        deskTopsPage.selectSortByName("Name: A to Z");
        Thread.sleep(2000);
        //2.4 Add to Cart
        deskTopsPage.addBuildYourOwnComputerProductInCart();
        //2.5 Verify the Text "Build your own computer"
        verifyText("Invalid text","Build your own computer",productPage.verifyTitleOfBuildYourOwnComputerProduct());
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        productPage.selectProcessorsOfBuildYourOwnComputer("2.2 GHz Intel Pentium Dual-Core E2200");
        //2.7.Select "8GB [+$60.00]" using Select class.
        productPage.selectRamOfBuildYourOwnComputer("8GB [+$60.00]");
        // 2.8 Select HDD radio "400 GB [+$100.00]"
        productPage.clickOnHddOfBuildYourOwnComputer();
        // 2.9 Select OS radio "Vista Premium [+$60.00]"
        productPage.clickOnOsOfBuildYourOwnComputer();
        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
        productPage.clickOnSoftwareOfBuildYourOwnComputer();
        //2.11 Verify the price "$1,475.00"
        verifyText( "Invalid text","$1,475.00",productPage.verifyPriceOfBuildYourOwnComputer());
        //2.12 Click on "ADD TO CARD" Button.
        productPage.clickOnAddToCartAfterFiltersAdded();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(productPage.verifyMessageOfProductAddedToCart(),"The product has been added to your shopping cart");
        productPage.clickOnCloseBarToCloseMessage();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        productPage.mouseHoverOnShoppingCartLink();
        productPage.mouseHoverAndClickOnGoToCartButton();
        // 2.15 Verify the message "Shopping cart"
       verifyText( "Invalid text","Shopping Cart",  shoppingCartPage.verifyTitleOfShoppingCartPage());
        // 2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeTheQty("2");
        shoppingCartPage.clickOnUpdateShoppingCartButton();
        //  2.17 Verify the Total"$2,950.00"
        verifyText("Invalid price","$2,950.00", shoppingCartPage.verifyTotalPriceOfProduct());
        // 2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnAgreeWithTermsOfServiceBox();
        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckoutButton();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        verifyText("Invalid text", "Welcome, Please Sign In!", signInPage.verifyTitleOfSignPage());
        //2.21Click on “CHECKOUT AS GUEST” Tab
        signInPage.clickOnCheckoutAsGuestButton();
        // 2.22 Fill the all mandatory field
        checkoutPage.enterFirstName("Karuna");
        checkoutPage.enterLastName("Jagani");
        checkoutPage.enterEmail("karuna28jagani@gmail.com");
        checkoutPage.selectCountryFromCountryField("India");
        checkoutPage.enterCity("Ahmedabad");
        checkoutPage.enterAddress("13, Jagani soc");
        checkoutPage.enterPostalCode("393008");
        checkoutPage.enterNumber("07898678798");
        //2.23 Click on “CONTINUE”
        checkoutPage.clickOnContinueButtonToShippingMethod();
        // 2.24 Click on Radio Button “Next Day Air($0.00)”
        shippingMethodPage.clickOnNextDayAirShippingMethod();
        //2.25 Click on “CONTINUE”
        shippingMethodPage.clickOnContinueForPaymentMethod();
        //2.26 Select Radio Button “Credit Card”
        paymentMethodPage.clickOnCreditCardRadioButton();
        //2.27 Select “Master card” From Select credit card dropdown
        paymentMethodPage.clickOnContinueButtonToPaymentInformation();
        //2.28 Fill all the details
        paymentInformationPage.selectCreditCardType("Master card");
        paymentInformationPage.enterCardHolderName("Miss Karuna Jagani");
        paymentInformationPage.enterCardNumber("5425233430109903");
        paymentInformationPage.selectExpiryMonth("04");
        paymentInformationPage.selectExpiryYear("2026");
        paymentInformationPage.enterCardCode("676");
        //2.29 Click on “CONTINUE”
        paymentInformationPage.clickOnContinueToConfirmOrder();
        // 2.30 Verify “Payment Method” is “Credit Card”
        verifyText( "Inavlid text","Credit Card", confirmOrderPage.verifyPaymentMethodName());
        //2.32 Verify “Shipping Method” is “Next Day Air”
       verifyText( "Invalid text","Shipping Method: Next Day Air", confirmOrderPage.verifyShippingMethodName());
        //2.33 Verify Total is “$2,950.00”
        verifyText("Invalid price","$2,950.00", confirmOrderPage.verifyTotalPrice());
        //2.34 Click on “CONFIRM”
        confirmOrderPage.clickOnConfirmButton();
        //2.35 Verify the Text “Thank You”
        verifyText("Invalid greetings", "Thank you", confirmOrderPage.verifyGreetingMessage());
        // 2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(confirmOrderPage.verifyOrderSuccessMessage(),"Your order has been successfully processed!");
        // 2.37 Click on “CONTINUE”
        confirmOrderPage.clickOnContinueToStorePage();
        // 2.37 Verify the text “Welcome to our store”
        logInPage.verifyTitleOfLoginPage();






    }

}
