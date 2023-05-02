package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    /**
     * 2.5 Verify the Text "Build your own computer"
     * 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
     * 2.7.Select "8GB [+$60.00]" using Select class.
     * 2.8 Select HDD radio "400 GB [+$100.00]"
     * 2.9 Select OS radio "Vista Premium [+$60.00]"
     * 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
     * [+$5.00]"
     * 2.11 Verify the price "$1,475.00"
     * 2.12 Click on "ADD TO CARD" Button.
     * 2.13 Verify the Message "The product has been added to your shopping cart" on Top
     * green Bar
     * After that close the bar clicking on the cross button.
     * 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
     */

    /**
     * Electronics
     * //2.6 Verify the text “Nokia Lumia 1020”
     *  2.7 Verify the price “$349.00”
     *  2.8 Change quantity to 2
     *  2.9 Click on “ADD TO CART” tab
     *  2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
     *  After that close the bar clicking on the cross button.
     *  2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
     */

    By buildYourOwnComputerText = By.xpath("//h1[normalize-space()='Build your own computer']");
    By processorOfBuildYourOwnComputer = By.id("product_attribute_1");
    By ramOfBuildYourOwnComputer = By.id("product_attribute_2");
    By hddOfBuildYourOwnComputer = By.id("product_attribute_3_7");
    By osOfBuildYourOwnComputer = By.id("product_attribute_4_9");
    By softwareOfBuildYourOwnComputer = By.id("product_attribute_5_12");
    By priceOfTotalText = By.id("price-value-1");
    By addToCartButton = By.id("add-to-cart-button-1");
    By productAddedToCartMessage =By.xpath("//div[@class='bar-notification success']");// By.xpath("//p[@class='content']");
    By closeMessage = By.xpath(" //span[@title='Close']");
    By shoppingCartLink = By.id("topcartlink");
    By goToCartButton = By.xpath("//button[contains(text(),'Go to cart')]");
    By priceOfBuildYourOwnComputer = By.id("price-value-1");

    By nokiaLumiaText = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By priceTextOfNokiaLumia = By.id("price-value-20");
    By qtyTextBox = By.id("product_enteredQuantity_20");
    By addToCartTab = By.id("add-to-cart-button-20");
  //  By productAddedSuccessfulMessage = By.xpath("//div[@class='bar-notification success']");
//    By closeTabOfMessageBar = By.xpath("//span[@title='Close']");
//    /*By shoppingCartLink = By.xpath("//a[@class='ico-cart']");
   // By goToCartButton = By.xpath("//button[normalize-space()='Go to cart']");*/

    public String verifyTitleOfBuildYourOwnComputerProduct(){
        waitUntilVisibilityOfElementLocated(buildYourOwnComputerText,5);
        return getTextElement(buildYourOwnComputerText);
    }

    public void selectProcessorsOfBuildYourOwnComputer(String processor){
        selectByVisibleTextFromDropDown(processorOfBuildYourOwnComputer,processor);
    }

    public void selectRamOfBuildYourOwnComputer(String ram){
        selectByVisibleTextFromDropDown(ramOfBuildYourOwnComputer, ram);
    }

    public void clickOnHddOfBuildYourOwnComputer(){
       clickOnElement(hddOfBuildYourOwnComputer);
    }

    public void clickOnOsOfBuildYourOwnComputer(){
        clickOnElement(osOfBuildYourOwnComputer);
    }

    public void clickOnSoftwareOfBuildYourOwnComputer(){
        clickOnElement(softwareOfBuildYourOwnComputer);
    }

    public String verifyPriceOfBuildYourOwnComputer(){
       return getTextElement(priceOfBuildYourOwnComputer) ;
    }



    public void clickOnAddToCartAfterFiltersAdded(){
        waitUntilVisibilityOfElementLocated(addToCartButton,5);
        clickOnElement(addToCartButton);
    }

    public String verifyMessageOfProductAddedToCart(){
       return getTextElement(productAddedToCartMessage);
    }

    public void clickOnCloseBarToCloseMessage(){
        clickOnElement(closeMessage);
    }

    public void mouseHoverOnShoppingCartLink(){
        waitUntilVisibilityOfElementLocated(shoppingCartLink,5);
        mouseHoverToElement(shoppingCartLink);
    }

    public void mouseHoverAndClickOnGoToCartButton(){
        waitUntilVisibilityOfElementLocated(goToCartButton,5);
        mouseHoverToElementAndClick(goToCartButton);
    }

    public String verifyNokiaLumia1020(){
        return getTextElement(nokiaLumiaText);
    }

    public String verifyPriceOfNokiaLumia(){
        return getTextElement(priceTextOfNokiaLumia);
    }

    public void changeTheQty(String qty){
        clearField(qtyTextBox);
        sendTextToElement(qtyTextBox,qty);
    }

    public void addToCartNokiaLumiaCellPhone(){
        waitUntilVisibilityOfElementLocated(addToCartTab,5);
        clickOnElement(addToCartTab);
    }

}
