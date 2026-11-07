
package com.orangehrm.tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.orangehrm.factory.BrowserLaunch;

public class BrowserLaunchTest {

    public static void main(String[] args) {

        Browser browser = BrowserLaunch.launchBrowser();
        Page page = browser.newPage();
        page.navigate("https://opensource-demo.orangehrmlive.com/");

        page.waitForTimeout(5000);

        BrowserLaunch.closeBrowser();
    }
}
