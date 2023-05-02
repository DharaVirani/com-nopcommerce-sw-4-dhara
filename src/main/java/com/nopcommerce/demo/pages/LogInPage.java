package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LogInPage extends Utility {


    By welcomeToStoreText = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By logoutLink = By.xpath("//a[contains(text(),'Log out')]");



    public String verifyTitleOfLoginPage(){
        return getTextElement(welcomeToStoreText);
    }

    public void clickOnLogoutLink(){
       waitUntilVisibilityOfElementLocated(logoutLink,5);
        clickOnElement(logoutLink);
    }





}
