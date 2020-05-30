package org.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Browsers.CHROME;

public class SelenideConfig {

    public static void setUp() {
        System.setProperty("selenide.browser", "chrome");
        Configuration.reportsFolder = "target/failsafe-reports";
        Configuration.savePageSource = false;
        Configuration.screenshots = false;
        Configuration.browser = CHROME;
        Configuration.driverManagerEnabled = true;
        Configuration.headless = false;
        Configuration.fastSetValue = true;
        Configuration.startMaximized = true;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 8000;
    }

    public static void cleanUp() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
