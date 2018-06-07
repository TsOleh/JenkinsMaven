package com.epam.lab.busines_objects.gmailBO;
import com.epam.lab.WebDriverUtils;
import com.epam.lab.pages_objects.gmail.LogMailPage;
import static com.epam.lab.utils.PropertiesFiles.properties;
public class LogMailPageBO {
    LogMailPage logMailPage = new LogMailPage();
    public LogMailPageBO() {
        WebDriverUtils.getDriver().get(properties.getProperty("gmailUrl"));
    }
    public void signInLogin(String log) {
        logMailPage.getLogin().sendKeys(log);
        logMailPage.getClickLogin().click();
    }
    public void signInPassword(String pass ) {
        logMailPage.getPassword().waitUntilVisible().sendKeys(pass);
        logMailPage.getClickPassword().click();
    }
}
