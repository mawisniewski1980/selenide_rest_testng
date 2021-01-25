package org.web;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.ScreenShooter;
import org.BaseWebTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.config.SelenideConfig;

import static org.assertj.core.api.Assertions.assertThat;
import static org.config.SelenideConfig.cleanUp;
import static org.web.enums.PageUrls.GOOGLE_SEARCH;

@Listeners({ScreenShooter.class})
public class GoogleSearch_IT extends BaseWebTest {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        LOG.info("beforeMethod");
        SelenideConfig.setUp(false);
        Selenide.open(GOOGLE_SEARCH.getUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        LOG.info("afterMethod");
        cleanUp();
    }

    @Test(testName = "googleTest1", groups = {"GOOGLE"})
    public void googleTest1() {
        googleSearchController.search("selenide");
        assertThat(googleSearchController.isResultsAreEmpty()).isFalse();
    }

    @Test(testName = "googleTest2", groups = {"GOOGLE"})
    public void googleTest2() {
        googleSearchController.search("selenide");
        //((SelenideElement) google.getResults().get(0)).click();
        assertThat("Selenide: concise UI tests in Java").isEqualTo(Selenide.title());
    }

    @Test(testName = "googleTest3", groups = {"GOOGLE"})
    public void googleTest3() {
        googleSearchController.search("selenide");
        assertThat(googleSearchController.isResultsAreEmpty()).isFalse();
    }
}
