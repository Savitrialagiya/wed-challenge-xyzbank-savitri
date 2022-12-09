package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.bouncycastle.eac.jcajce.JcaPublicKeyConverter;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterTextInFirstNameField("Jack");
        addCustomerPage.enterTextInLastNameField("Jill");
        addCustomerPage.enterTextInPostcodeField("HA5 7NN");
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.popUpDisplay();
        Assert.assertTrue(addCustomerPage.verifyAlertText().contains("Customer added successfully"));
        addCustomerPage.clickOnOkButtonOnPopup();

    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnOpenAccountTab();
        openAccountPage.selectCustomerCreatedInFirstTest();
        openAccountPage.selectCurrency();
        openAccountPage.clickOnProcessButton();
        openAccountPage.popUpDisplay();
        Assert.assertTrue(openAccountPage.verifyAlertText().contains("Account created successfully"));
        openAccountPage.clickOnOkButtonOnPopup();

    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectCustomerYouCreated();
        customerLoginPage.clickOnLoginButton();
        customersPage.verifyLogoutButton();
        customersPage.clickOnLogoutButton();
        Assert.assertEquals(customersPage.verifyYourNameTextDisplayed(), "Your Name :", "Your name text not displayed");

    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectCustomerYouCreated();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmount100toAmountField("1000");
        accountPage.clickOnDepositButton2();
        Assert.assertEquals(accountPage.verifyDepositSuccessfulText(), "Deposit Successful", "Message not displayed");

    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectCustomerYouCreated();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmount100toAmountField("1000");
        accountPage.clickOnDepositButton2();
        accountPage.clickOnWithDrawlButton();
        accountPage.enterAmount50toAmountField("50");
        accountPage.clickOnWithDrawButton();
        Assert.assertEquals(accountPage.verifyTransactionSuccessfulText(), "Transaction successful", "not displayed");

    }
}
