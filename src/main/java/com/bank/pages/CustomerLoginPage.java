package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

import javax.rmi.CORBA.Util;

public class CustomerLoginPage extends Utility {
    By searchCustomerYouCreated = By.id("userSelect");
    By clickOnLogin = By.xpath("//button[contains(text(),'Login')]");


    public void selectCustomerYouCreated(){
        selectByContainsTextFromDropDown(searchCustomerYouCreated,"Harry Potter");
    }
    public void clickOnLoginButton(){
        clickOnElement(clickOnLogin);
    }



}
