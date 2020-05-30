package org.enums;

public enum PageUrls {

    GOOGLE_SEARCH("https://www.google.pl/");

    private String url;

    PageUrls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
