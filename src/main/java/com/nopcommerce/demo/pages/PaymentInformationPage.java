package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class PaymentInformationPage extends Utility {


    By creditCardField = By.id("CreditCardType");
    By cardHolderNameField = By.id("CardholderName");
    By cardNumberField = By.id("CardNumber");
    By expireMonthField = By.id("ExpireMonth");
    By expiredYearField = By.id("ExpireYear");
    By cardCodeField = By.id("CardCode");
    By continueButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void selectCreditCardType(String creditCardType){
        waitUntilVisibilityOfElementLocated(creditCardField,5);
        selectByVisibleTextFromDropDown(creditCardField, creditCardType);
    }

    public void enterCardHolderName(String cardHolderName){
        sendTextToElement(cardHolderNameField,cardHolderName);
    }

    public void enterCardNumber(String cardNumber){
        sendTextToElement(cardNumberField, cardNumber);
    }

    public void selectExpiryMonth(String expiredMonth){
        selectByVisibleTextFromDropDown(expireMonthField, expiredMonth);
    }
    public void selectExpiryYear(String expiredYear){
        selectByVisibleTextFromDropDown(expiredYearField, expiredYear);
    }

    public void enterCardCode(String cardCode){
        sendTextToElement(cardCodeField, cardCode);
    }

    public void clickOnContinueToConfirmOrder(){
       waitUntilVisibilityOfElementLocated(continueButton,5);
        clickOnElement(continueButton);
    }
}
