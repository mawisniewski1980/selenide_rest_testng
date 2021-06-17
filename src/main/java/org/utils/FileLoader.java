package org.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.Primitives;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileLoader {

    public static <T> T loadJsonFile(String pathWithFile, Class<T> tClass) {
        Object obj = null;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileReader reader = new FileReader(pathWithFile)) {

            obj = gson.fromJson(reader, tClass);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Primitives.wrap(tClass).cast(obj);
    }

    public static Iterator<Object[]> loadCSVFile(String pathWithFile) {
        ArrayList<Object[]> myEntries = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(pathWithFile))) {
            reader.skip(1);
            myEntries.addAll(reader.readAll());
        } catch (CsvException | IOException e) {
            e.printStackTrace();
        }
        return myEntries.iterator();
    }

    public static Object[] loadCSVFile2(String pathWithFile) {
        Object[] myEntries = new Object[0];
        try (CSVReader reader = new CSVReader(new FileReader(pathWithFile))) {
            reader.skip(1);
            List<String[]> obj = reader.readAll();
            myEntries = new Object[obj.size()];
            for (int x = 0; x < obj.size(); x++) {
                for (int y = 0; y < obj.get(x).length; y++) {
                    myEntries[y] = obj.get(y);
                }
            }
        } catch (CsvException | IOException e) {
            e.printStackTrace();
        }
        return myEntries;
    }

    public static Object[][] loadCSVFile3(String pathWithFile) {
        Object[][] myEntries = new Object[0][];
        try (CSVReader reader = new CSVReader(new FileReader(pathWithFile))) {
            reader.skip(1);
            List<String[]> obj = reader.readAll();
            myEntries = new Object[obj.size()][obj.get(0).length];
            for (int x = 0; x < obj.size(); x++) {
                for (int y = 0; y < obj.get(x).length; y++) {
                    myEntries[x][y] = obj.get(x)[y];
                }
            }
        } catch (CsvException | IOException e) {
            e.printStackTrace();
        }
        return myEntries;
    }
}
