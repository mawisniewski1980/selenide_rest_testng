package org.web;

import com.codeborne.selenide.testng.ScreenShooter;
import org.BaseWebTest;
import org.dataproviders.DPWeb;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ScreenShooter.class})
public class DataProviderTest_IT extends BaseWebTest {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        LOG.info("beforeMethod");
        //SelenideConfig.setUp(false);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        LOG.info("afterMethod");
        //SelenideConfig.cleanUp();
    }

    @Test(testName = "webTest1",
            dataProvider = "getUrls",
            dataProviderClass = DPWeb.class)
    public void webTest1(String url) {
        LOG.info(url);
        //Selenide.open(url);
    }

    @Test(testName = "webTest2",
            dataProvider = "getCSVUrls",
            dataProviderClass = DPWeb.class)
    public void webTest2(String[] list) {
        LOG.info(list[0] + " " + list[1] + " " + list[2]);
        //Selenide.open(url);
    }
}
