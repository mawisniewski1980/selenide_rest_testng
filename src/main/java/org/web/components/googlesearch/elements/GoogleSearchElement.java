package org.web.components.googlesearch.elements;

public enum GoogleSearchElement {

    INPUT("input[name='q']"),
    LIST_VALUES("#search h3"),
    _AGREE_BUTTON("//*[@id=\"introAgreeButton\"]/span/span");

    private final String selector;

    GoogleSearchElement(String selector) {
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }
}
