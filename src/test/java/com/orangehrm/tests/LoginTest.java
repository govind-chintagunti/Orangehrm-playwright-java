package com.orangehrm.tests;

import org.testng.annotations.Test;

import com.orangehrm.base.Basetest;

public class LoginTest extends Basetest {

    @Test
    public void login() {
        loginPage.navigateToLoginPage();
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();
    }
}