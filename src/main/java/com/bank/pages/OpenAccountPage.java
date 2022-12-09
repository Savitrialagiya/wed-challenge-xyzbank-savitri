package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By customerCreatedInFirstTest = By.name("userSelect");
    By selectCurrency = By.id("currency");
    By clickOnProcess = By.xpath("//button[contains(text(),'Process')]");



    public void selectCustomerCreatedInFirstTest(){
        selectByVisibleTextFromDropDown(customerCreatedInFirstTest,"Harry Potter");
    }
    public void selectCurrency(){
        selectByVisibleTextFromDropDown(selectCurrency,"Pound");
    }
    public void clickOnProcessButton(){
        clickOnElement(clickOnProcess);
    }
    public void popUpDisplay() {
        switchToAlert();
    }

    public String verifyAlertText() {
        String text = getTextFromAlert();
        return text;
    }

    public void clickOnOkButtonOnPopup() {
        acceptAlert();
    }
}
