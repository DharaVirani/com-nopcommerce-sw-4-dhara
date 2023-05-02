package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {



    By shoppingCartText = By.xpath("//div[@class='page-title']");
    By qtyTextBox = By.xpath("//td[@class='quantity']/child::input");
    By updateShoppingCartButton = By.xpath("//button[@id='updatecart']");
    By totalPriceText = By.xpath("//tr[@class='order-total']//td[@class='cart-total-right']");
    By agreementCheckbox = By.id("termsofservice");
    By checkoutButton = By.id("checkout");



    public String verifyTitleOfShoppingCartPage(){
        waitUntilVisibilityOfElementLocated(shoppingCartText,5);
      return getTextElement(shoppingCartText);
    }

    public void changeTheQty(String qty){
        clearField(qtyTextBox);
        sendTextToElement(qtyTextBox,qty);
    }

    public void clickOnUpdateShoppingCartButton(){
        waitUntilVisibilityOfElementLocated(updateShoppingCartButton,5);
        clickOnElement(updateShoppingCartButton);
    }

    public String verifyTotalPriceOfProduct(){
        return getTextElement(totalPriceText);
    }

    public void clickOnAgreeWithTermsOfServiceBox(){
        clickOnElement(agreementCheckbox);
    }

    public void clickOnCheckoutButton(){
        waitUntilVisibilityOfElementLocated(checkoutButton,5);
        clickOnElement(checkoutButton);
    }






}
