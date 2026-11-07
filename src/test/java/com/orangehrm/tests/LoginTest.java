package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.LoginPage;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void initializeLoginPage() {

        loginPage = new LoginPage(page);
    }

    @Test
    public void verifyLogin() {

        loginPage.enterUsername("Admin");

        loginPage.enterPassword("admin123");

        loginPage.clickLogin();

        page.waitForTimeout(5000);

        Assert.assertTrue(
                page.url().contains("dashboard"),
                "Login failed! Dashboard URL was not found.");

    }
}