package ste.web.components.googlesearch.test;

import ste.web.components.googlesearch.data.GoogleSearchData;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSearchTest {

    public void test(GoogleSearchData data) {
        assertThat(data.isQueryInput()).withFailMessage("Query input is not visible. Check selector.").isTrue();
    }
}
