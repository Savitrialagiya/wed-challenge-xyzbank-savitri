package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By postcode = By.xpath("//input[@placeholder='Post Code']");
    By clickAddCustomerButton = By.xpath("//button[@type='submit' and contains(text(),'Add Customer')]");

    public void enterTextInFirstNameField(String firstNm) {
        sendTextToElement(firstName, firstNm);
    }

    public void enterTextInLastNameField(String lastNm) {
        sendTextToElement(lastName, lastNm);
    }

    public void enterTextInPostcodeField(String postCd) {
        sendTextToElement(postcode, postCd);
    }

    public void clickOnAddCustomerButton() {
        clickOnElement(clickAddCustomerButton);
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
