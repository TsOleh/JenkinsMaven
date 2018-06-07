package com.epam.lab.utils;

import org.apache.log4j.Logger;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFiles {
    public static Properties properties;
    private static final Logger LOGGER = Logger.getLogger(PropertiesFiles.class.getName());

    static {
        properties = new Properties();
        try(FileInputStream fis = new FileInputStream("src/main/resources/prop.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public static String get(String key){
        return properties.getProperty(key);
    }

}
