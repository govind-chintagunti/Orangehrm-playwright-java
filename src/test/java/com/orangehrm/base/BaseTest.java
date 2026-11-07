
package com.orangehrm.base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.orangehrm.factory.BrowserLaunch;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest {

    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeMethod
    public void setUp() {

        browser = BrowserLaunch.launchBrowser();

        context = browser.newContext();

        page = context.newPage();
        page.navigate("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterMethod
    public void tearDown() {

        context.close();

        BrowserLaunch.closeBrowser();
    }
}
