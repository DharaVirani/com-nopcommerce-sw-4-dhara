package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {



    By registerTitle = By.xpath("//h1[normalize-space()='Register']");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registrationMessage = By.xpath("//div[@class='result']");
    By continueButton = By.xpath("//a[normalize-space()='Continue']");

    public String verifyRegisterTitle(){
       return getTextElement(registerTitle);
    }

    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
    }

    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField,confirmPassword);
    }

    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }

    public String verifyRegistrationMessage(){
        return getTextElement(registrationMessage);
    }

    public void clickOnContinueToShoppingCart(){
        waitUntilVisibilityOfElementLocated(continueButton,5);
        clickOnElement(continueButton);
    }

}
