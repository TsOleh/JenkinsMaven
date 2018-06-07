package com.epam.lab.parsing;

import com.opencsv.CSVReader;
import org.testng.annotations.DataProvider;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.epam.lab.utils.PropertiesFiles.properties;

public class GitHubFileCSV {

    @DataProvider(name = "gitHubData")
    public static Object[][] gitHubDataProvider() throws IOException {
        Object[][] data = csvReader(properties.getProperty("gitHubFilePath"));
        return data;
    }

    public static Object[][] csvReader(String paths) throws IOException {
        Object[][] gitHubDataMap = null;
        try (Reader reader = Files.newBufferedReader(Paths.get(paths));
             CSVReader csvReader = new CSVReader(reader)) {
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                int linesCount = (int) csvReader.getLinesRead();
                gitHubDataMap = new Object[linesCount][nextRecord.length];
                for (int i = 0; i < linesCount; i++) {
                    for (int j = 0; j < nextRecord.length; j++) {
                        gitHubDataMap[i][j] = nextRecord[j];
                    }

                }
            }
            return gitHubDataMap;
        }
    }
}

