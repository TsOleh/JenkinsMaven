package com.epam.lab;

import com.epam.lab.utils.PropertiesFiles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

    private static ThreadLocal<WebDriver> webDriver = ThreadLocal.withInitial(() -> {
        System.setProperty(PropertiesFiles.get("driver_name"), PropertiesFiles.get("driver_path"));
        return new ChromeDriver();
    });
    public static WebDriver getDriver() {
        return webDriver.get();
    }
    public static void load(String URL) {
        getDriver().get(URL);
    }

    public static void close() {
        webDriver.get().quit();
        webDriver.remove();
    }
    public static WebDriverWait newWait() {
        return new WebDriverWait(getDriver(), 20);
    }
}
