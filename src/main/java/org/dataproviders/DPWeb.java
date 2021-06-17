package org.dataproviders;

import org.testng.annotations.DataProvider;

import java.util.Iterator;

import static org.utils.FileLoader.*;

public class DPWeb {

    @DataProvider
    public Object[][] getUrls() {
        return new Object[][]{{"http://www.wp.pl"},
                {"http://www.onet.pl"},
                {"http://www.google.pl"}};
    }

    @DataProvider
    public Iterator<Object[]> getCSVUrls() {
        return loadCSVFile("src/test/resources/data.csv");
    }

    @DataProvider
    public Object[] getCSVUrls2() {
        return loadCSVFile2("src/test/resources/data.csv");
    }

    @DataProvider
    public Object[] getCSVUrls3() {
        return loadCSVFile3("src/test/resources/data.csv");
    }
}
