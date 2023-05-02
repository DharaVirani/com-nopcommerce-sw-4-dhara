package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By allTopMenu = By.xpath("//ul[@class='top-menu notmobile']/child::li");
    By computersTopMenuTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By computersTopMenuPageTitle = By.xpath("//h1[contains(text(),'Computers')]");
    By electronicsTopMenuTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By electronicsTopMenuPageTitle = By.xpath("//h1[contains(text(),'Electronics')]");
    By apparelTopMenuPageTitle = By.xpath("//h1[contains(text(),'Apparel')]");
    By digitalDownloadsTopMenuPageTitle = By.xpath("//h1[contains(text(),'Digital downloads')]");
    By booksTopMenuPageTitle = By.xpath("//h1[contains(text(),'Books')]");
    By jewelryTopMenuPageTitle= By.xpath("//h1[contains(text(),'Jewelry')]");
    By giftsCardsTopMenuPageTitle= By.xpath("//h1[contains(text(),'Gift Cards')]");
    By desktopDropDownLinkOfComputers = By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']");
    By cellPhonesLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    public void selectAllTopMenuTabs(String text){
        listOfElements(allTopMenu,text);
    }

    public void clickOnComputersTopMenu(){
        clickOnElement(computersTopMenuTab);
    }

    public String verifyPaveNavigationOfComputerTopMenuTab(){
        return getTextElement(computersTopMenuPageTitle);
    }


    public String verifyPaveNavigationOfElectronicsTopMenuTab(){
        return getTextElement(electronicsTopMenuPageTitle);
    }






    public String verifyPaveNavigationOfApparelTopMenuTab(){
        return getTextElement(apparelTopMenuPageTitle);
    }



    public String verifyPaveNavigationOfDigitalDownloadsTopMenuTab() {
        return getTextElement(digitalDownloadsTopMenuPageTitle);
    }



    public String verifyPaveNavigationOfBooksTopMenuTab(){
        return getTextElement(booksTopMenuPageTitle);
    }




    public String verifyPaveNavigationOfJewelryTopMenuTab(){
        return getTextElement(jewelryTopMenuPageTitle);
    }


    public String verifyPaveNavigationOfGiftCardsTopMenuTab(){
        return getTextElement(giftsCardsTopMenuPageTitle);
    }


    public void clickOnDesktopLinkInComputersTopMenuDropdown(){
        clickOnElement(desktopDropDownLinkOfComputers);
    }

    public void mouseHoverOnElectronicsTopMenuTab(){
        mouseHoverToElement(electronicsTopMenuTab);

    }

    public void mouseHoverAndClickOnCellPhonesOptionInElectronics(){
        mouseHoverToElementAndClick(cellPhonesLink);
    }




}
