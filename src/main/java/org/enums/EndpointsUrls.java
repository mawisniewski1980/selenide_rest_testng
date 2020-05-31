package org.enums;

public enum EndpointsUrls {

    GOOGLE_SEARCH("https://www.google.pl/"),
    STUDENT_API("http://localhost:8080/student/"),
    STUDENT_API_LIST("http://localhost:8080/student/list"),
    STUDENT_API_ID("http://localhost:8080/student/{id}");

    private String url;

    EndpointsUrls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return url;
    }
}
