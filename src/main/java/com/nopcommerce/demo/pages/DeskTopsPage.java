package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DeskTopsPage extends Utility {

    By sortByTextField = By.id("products-orderby");
    By allProductsOnPageLinks = By.xpath("//div[@class='details']/child::h2/a");
    By buildYourOwnComputer = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");




    public void selectSortByName(String text){
        selectByVisibleTextFromDropDown(sortByTextField, text);
    }



    public void addBuildYourOwnComputerProductInCart(){
        waitUntilVisibilityOfElementLocated(buildYourOwnComputer,5);
        clickOnElement(buildYourOwnComputer);
    }

    public void verifyProductsInDescendingOrder(String sortName){
        verifySortedElementsInReverseOrder(allProductsOnPageLinks,sortByTextField, sortName);
    }


}
