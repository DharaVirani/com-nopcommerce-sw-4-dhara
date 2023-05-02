package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {



    By cellPhonesText = By.xpath("//h1[normalize-space()='Cell phones']");
    By listViewTab = By.xpath("//a[normalize-space()='List']");
    By productNokiaLumia = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");


    public String verifyCellPhonesText(){
        waitUntilVisibilityOfElementLocated(cellPhonesText,5);
      return   getTextElement(cellPhonesText);
    }

    public void clickOnListViewTab(){
        waitUntilVisibilityOfElementLocated(listViewTab,5);
      clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumiaCellPhone(){
        waitUntilVisibilityOfElementLocated(productNokiaLumia,10);
        clickOnElement(productNokiaLumia);
    }



}
