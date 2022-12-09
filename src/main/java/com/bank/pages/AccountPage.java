package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By clickOnDepositTab = By.xpath("//button[contains(text(),'Deposit')]");
    By enterAmount100 = By.xpath("//input[@placeholder='amount']");
    By clickOnDepositTab2 = By.xpath("//div[1]/form[1]/button[1]");
    By getDepositSuccessful = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By clickOnWithDrawlTab = By.xpath("//button[contains(text(),'Withdrawl')]");
    By enterAmount50 = By.xpath("//input[@placeholder='amount']");
    By clickOnWithdrawTab = By.xpath("//div[1]/form[1]/button[1]");
    By getTransactionText = By.xpath("//span[contains(text(),'Transaction successful')]");

    public void clickOnDepositButton() {
        clickOnElement(clickOnDepositTab);
    }

    public void enterAmount100toAmountField(String text) {
        sendTextToElement(enterAmount100, text);
    }

    public void clickOnDepositButton2() {
        clickOnElement(clickOnDepositTab2);
    }

    public String verifyDepositSuccessfulText() {
        return getTextFromElement(getDepositSuccessful);
    }

    public void clickOnWithDrawlButton() {
        clickOnElement(clickOnWithDrawlTab);
    }

    public void enterAmount50toAmountField(String text) {
        sendTextToElement(enterAmount50, text);
    }

    public void clickOnWithDrawButton() {
        clickOnElement(clickOnWithdrawTab);
    }

    public String verifyTransactionSuccessfulText() {
        return getTextFromElement(getTransactionText);
    }


}
