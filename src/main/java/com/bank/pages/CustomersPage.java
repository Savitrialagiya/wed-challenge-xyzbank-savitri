package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    By getLogoutButton = By.xpath("//button[contains(text(),'Logout')]");
    By clickOnLogout = By.xpath("//button[contains(text(),'Logout')]");
    By getYourName = By.xpath("//label[contains(text(),'Your Name :')]");


    public void verifyLogoutButton() {
        Boolean logoutButton = driver.findElement(getLogoutButton).isDisplayed();
    }

    public void clickOnLogoutButton() {
        clickOnElement(clickOnLogout);
    }

    public String verifyYourNameTextDisplayed() {
        return getTextFromElement(getYourName);
    }



}
