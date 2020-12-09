package org.web;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.ScreenShooter;
import org.BaseWebTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.web.config.SelenideConfig.cleanUp;
import static org.web.config.SelenideConfig.setUp;
import static org.web.enums.PageUrls.GOOGLE_SEARCH;

@Listeners({ScreenShooter.class})
public class GoogleSearch_IT extends BaseWebTest {

    @BeforeMethod
    public void beforeMethod() {
        LOG.info("beforeMethod");
        setUp(false);
        Selenide.open(GOOGLE_SEARCH.getUrl());
    }

    @AfterMethod
    public void afterMethod() {
        LOG.info("afterMethod");
        cleanUp();
    }

    @Test
    public void googleTest1() {
        googleSearchController.search("selenide");
        assertThat(googleSearchController.isResultsAreEmpty()).isFalse();
    }

    @Test
    public void googleTest2() {
        googleSearchController.search("selenide");
        //((SelenideElement) google.getResults().get(0)).click();
        assertThat("Selenide: concise UI tests in Java").isEqualTo(Selenide.title());
    }
}
