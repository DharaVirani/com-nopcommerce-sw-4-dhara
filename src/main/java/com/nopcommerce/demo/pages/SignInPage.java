package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {


    By signInText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By checkoutAsGuestButton = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By checkoutWithRegister = By.xpath("//button[contains(text(),'Register')]");

    public String verifyTitleOfSignPage(){
       return getTextElement(signInText);
    }

    public void clickOnCheckoutAsGuestButton(){
        waitUntilVisibilityOfElementLocated(checkoutAsGuestButton,5);
        clickOnElement(checkoutAsGuestButton);
    }

    public void clickOnRegisterTab(){
        waitUntilVisibilityOfElementLocated(checkoutWithRegister,5);
        clickOnElement(checkoutWithRegister);
    }



}
