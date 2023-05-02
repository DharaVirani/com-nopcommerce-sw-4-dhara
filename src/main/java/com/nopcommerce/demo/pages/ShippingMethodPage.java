package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShippingMethodPage extends Utility {



    By nextDayAirRadiobutton = By.id("shippingoption_1");
    By secondDayAirRadioButton = By.xpath("//input[@id='shippingoption_2']");

    By continueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    public void clickOnNextDayAirShippingMethod(){
        clickOnElement(nextDayAirRadiobutton);
    }

    public void clickOnSecondDayAirShippingMethod(){
        clickOnElement(secondDayAirRadioButton);
    }

    public void clickOnContinueForPaymentMethod(){
        clickOnElement(continueButton);
    }
}
