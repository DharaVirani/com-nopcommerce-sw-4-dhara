package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility {




    By paymentMethodText = By.xpath("//span[normalize-space()='Credit Card']");
    By shippingMethodText = By.xpath("//li[@class='shipping-method']");
    By totalPriceText = By.xpath("//td[@class='subtotal']");
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    By greetingMessage = By.xpath("//h1[normalize-space()='Thank you']");
    By orderSuccessMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueButton = By.xpath("//button[normalize-space()='Continue']");



    public String verifyPaymentMethodName(){
       return getTextElement(paymentMethodText);
    }

    public String verifyShippingMethodName(){
       return getTextElement(shippingMethodText);
    }

    public String verifyTotalPrice(){
        return getTextElement(totalPriceText);
    }

    public void clickOnConfirmButton(){
        waitUntilVisibilityOfElementLocated(confirmButton,5);
        clickOnElement(confirmButton);
    }

    public String verifyGreetingMessage(){
       return getTextElement(greetingMessage);
    }

    public String verifyOrderSuccessMessage(){
        return getTextElement(orderSuccessMessage);
    }

    public void clickOnContinueToStorePage(){
        waitUntilVisibilityOfElementLocated(continueButton,5);
        clickOnElement(continueButton);
    }

}
