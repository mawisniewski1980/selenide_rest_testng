package org.dataproviders;

import org.testng.annotations.DataProvider;

import java.util.Iterator;

import static org.utils.FileLoader.loadCSVFile;

public class DPWeb {

    @DataProvider
    public Object[][] getUrls() {
        return new Object[][]{{"http://www.wp.pl"},
                {"http://www.onet.pl"},
                {"http://www.google.pl"}};
    }

    @DataProvider(parallel = true)
    public Iterator<Object[]> getCSVUrls() {
        return loadCSVFile("src/test/resources/data.csv");
    }


}
