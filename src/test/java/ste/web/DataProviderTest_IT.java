package ste.web;

import ste.BaseWebTest;
import ste.dataproviders.DPWeb;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners({ScreenShooter.class})
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
        LOG.info(list[0]);
        LOG.info(list[1]);
        LOG.info(list[2]);
        LOG.info("#########################");
        //Selenide.open(url);
    }

    @Test(testName = "webTest3",
            dataProvider = "getCSVUrls2",
            dataProviderClass = DPWeb.class)
    public void webTest3(String[] list) {
        LOG.info(list[0]);
        LOG.info(list[1]);
        LOG.info(list[2]);
        LOG.info("#########################");
        //Selenide.open(url);
    }

    @Test(testName = "webTest4",
            dataProvider = "getCSVUrls3",
            dataProviderClass = DPWeb.class)
    public void webTest4(String address, String number, String name) {
        LOG.info(address);
        LOG.info(number);
        LOG.info(name);
        LOG.info("#########################");
        //Selenide.open(url);
    }
}
