package org.web;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.ScreenShooter;
import org.BaseWebTest;
import org.config.SelenideConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.config.SelenideConfig.cleanUp;
import static org.dictionaries.PageUrls.GOOGLE_SEARCH;

@Listeners({ScreenShooter.class})
public class GoogleSearch_IT extends BaseWebTest {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        LOG.info("beforeMethod");
        SelenideConfig.setUp(headless);
        Selenide.open(GOOGLE_SEARCH.getUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        LOG.info("afterMethod");
        cleanUp();
    }

    @Test(testName = "googleTest1", groups = {"GOOGLE"})
    public void googleTest1() {
        googleSearchController.validateAndSearch("selenide");
        assertThat(googleSearchController.isResultsAreEmpty()).isFalse();
    }

    @Test(testName = "googleTest2", groups = {"GOOGLE"})
    public void googleTest2() {
        googleSearchController.validateAndSearch("selenide");
        googleSearchController.clickByText("Selenide: concise UI tests in Java");
        assertThat("Selenide: concise UI tests in Java").isEqualTo(Selenide.title());
    }


}
