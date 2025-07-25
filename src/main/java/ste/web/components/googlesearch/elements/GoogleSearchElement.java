package ste.web.components.googlesearch.elements;

public enum GoogleSearchElement {

    INPUT("//*[@id='input']"),
    LIST_VALUES("#search h3"),
    AGREE_BUTTON("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div");

    private final String selector;

    GoogleSearchElement(String selector) {
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }
}
