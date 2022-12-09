package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BankManagerLoginPage extends Utility {

    By clickOnAddCustomer = By.xpath("//button[contains(text(),'Add Customer')]");
    By clickOnOpenAccount = By.xpath("//button[contains(text(),'Open Account')]");

    public void clickOnAddCustomerTab() {
        clickOnElement(clickOnAddCustomer);
    }

    public void clickOnOpenAccountTab() {
        clickOnElement(clickOnOpenAccount);
    }


}
