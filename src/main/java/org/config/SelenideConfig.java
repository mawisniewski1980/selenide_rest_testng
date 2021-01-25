package org.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Browsers.CHROME;

public class SelenideConfig {

    public static void setUp(boolean headless) {
        System.setProperty("selenide.browser", "chrome");
        System.setProperty("chromeoptions.args", "--disable-gpu, --no-sandbox," +
                "--allow-insecure-localhost, --disable-dev-shm-usage," +
                "--ignore-certificate-errors,--disable-popup-blocking," +
                "--incognito");
        Configuration.driverManagerEnabled = true;
        Configuration.reportsFolder = "target/failsafe-reports";
        Configuration.savePageSource = true;
        Configuration.screenshots = true;
        Configuration.browser = CHROME;
        Configuration.headless = headless;
        Configuration.fastSetValue = true;
        Configuration.startMaximized = true;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 8000;
        Configuration.pageLoadTimeout = 60000;
    }

    public static void cleanUp() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWebDriver();
    }
}
