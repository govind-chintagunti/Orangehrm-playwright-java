package com.orangehrm.pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage {
    private final Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    private String usernameInputSelector = "input[name='username']";
    private String passwordInputSelector = "input[name='password']";

    public void enterUsername(String username) {
        page.fill(usernameInputSelector, username);
    }

    public void enterPassword(String password) {
        page.fill(passwordInputSelector, password);
    }

    public void clickLoginButton() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
    }

    public void navigateToLoginPage() {
        page.navigate("https://opensource-demo.orangehrmlive.com/");
    }

    public void clickForgotPassword() {
        page.locator("p.orangehrm-login-forgot-header").click();

    }

}
