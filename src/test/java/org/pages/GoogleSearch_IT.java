package org.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.abstracts.AbstractTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.enums.PageUrls.GOOGLE_SEARCH;

public class GoogleSearch_IT extends AbstractTest {

    GoogleSearchPage google;

    @BeforeMethod
    public void setUp() {
        google = new GoogleSearchPage();
        Selenide.open(GOOGLE_SEARCH.getUrl());
    }

    @Test
    public void googleTest1() {
        google.search("selenide");
        assertThat(google.getResults()).isNotEmpty();
    }

    @Test
    public void googleTest2() {
        google.search("selenide");
        ((SelenideElement) google.getResults().get(0)).click();
        assertThat("Selenide: concise UI tests in Java").isEqualTo(Selenide.title());
    }
}
