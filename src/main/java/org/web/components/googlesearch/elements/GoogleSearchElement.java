package org.web.components.googlesearch.elements;

public enum GoogleSearchElement {

    INPUT("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"),
    LIST_VALUES("#search .rc h3"),
    AGREE_BUTTON("//*[@id=\"introAgreeButton\"]/span/span");

    private final String selector;

    GoogleSearchElement(String selector) {
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }
}
