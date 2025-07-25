package ste.dataproviders;

import org.testng.annotations.DataProvider;
import ste.utils.FileLoader;

import java.util.Iterator;

public class DPWeb {

    @DataProvider
    public Object[][] getUrls() {
        return new Object[][]{{"http://www.wp.pl"},
                {"http://www.onet.pl"},
                {"http://www.google.pl"}};
    }

    @DataProvider
    public Iterator<Object[]> getCSVUrls() {
        return FileLoader.loadCSVFile("src/test/resources/data.csv");
    }

    @DataProvider
    public Object[] getCSVUrls2() {
        return FileLoader.loadCSVFile2("src/test/resources/data.csv");
    }

    @DataProvider
    public Object[] getCSVUrls3() {
        return FileLoader.loadCSVFile3("src/test/resources/data.csv");
    }
}
