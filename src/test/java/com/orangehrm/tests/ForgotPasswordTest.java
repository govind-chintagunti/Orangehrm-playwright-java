package com.orangehrm.tests;

import com.orangehrm.base.Basetest;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends Basetest {

    @Test
    public void forgotPassword() {
        loginPage.navigateToLoginPage();
        loginPage.clickForgotPassword();
        page.waitForTimeout(5000);
    }
}