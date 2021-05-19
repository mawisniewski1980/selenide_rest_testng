package org.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.Primitives;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class FileLoader {

    public static synchronized <T> T loadJsonFile(String pathWithFile, Class<T> tClass) {
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

    public static synchronized Iterator<Object[]> loadCSVFile(String pathWithFile) {
        ArrayList<Object[]> myEntries = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(pathWithFile))) {
            reader.skip(1);
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
