package com.epam.lab.parsing;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.epam.lab.utils.PropertiesFiles.properties;

public class GmailFileXLSX {

    @DataProvider(name = "gmailData")
    public static Object[][] gitHubDataProvider() throws IOException {
        Object[][] data = parse(properties.getProperty("gmailFilePath"));
        return data;
    }

    public static Object[][] parse(String name) {
        List<String> gmailData = new ArrayList<>();
        InputStream inSt = null;
        XSSFWorkbook workbook = null;
        try {
            inSt = new FileInputStream(name);
            workbook = new XSSFWorkbook(inSt);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int counter = 0;
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
            counter++;
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cellValue = cells.next();
                gmailData.add(cellValue.getStringCellValue());
            }
        }
        Object[] obj = gmailData.toArray();
        Object[][] objects = new Object[counter][gmailData.size()];
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < gmailData.size(); j++) {
                objects[i][j] = obj[j].toString();
            }
        }
        return objects;
    }
}
