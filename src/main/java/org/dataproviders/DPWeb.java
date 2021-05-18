package org.dataproviders;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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

    private synchronized Iterator<Object[]> loadCSVFile(String pathWithFile) {
        ArrayList<Object[]> myEntries = new ArrayList<>();
        try {
            CSVReader reader = new CSVReader(new FileReader(pathWithFile));
            String[] nextLine = null;
            while ((nextLine = reader.readNext()) != null) {
                myEntries.add(new Object[]{nextLine});
            }
        } catch (CsvValidationException | IOException e) {
            e.printStackTrace();
        }
        return myEntries.iterator();
    }
}
