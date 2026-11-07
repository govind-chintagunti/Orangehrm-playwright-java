package com.orangehrm.pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;

    // Locators
    private final String usernameField = "input[name='username']";
    private final String passwordField = "input[name='password']";
    private final String loginButton = "button[type='submit']";

    // Constructor
    public LoginPage(Page page) {
        this.page = page;
    }

    // Enter username
    public void enterUsername(String username) {
        page.locator(usernameField).fill(username);
    }

    // Enter password
    public void enterPassword(String password) {
        page.locator(passwordField).fill(password);
    }

    // Click login button
    public void clickLogin() {
        page.locator(loginButton).click();
    }
}