package com.epam.lab.busines_objects.gitHubBO;
import com.epam.lab.WebDriverUtils;
import com.epam.lab.pages_objects.gitHub.SingInPage;
import static com.epam.lab.utils.PropertiesFiles.properties;

import java.util.Properties;


public class SingInPageBO {
    SingInPage singInPage = new SingInPage();
    public SingInPageBO() {
        WebDriverUtils.getDriver().get(properties.getProperty("gitHubUrl"));
    }
    public void clickSingIn() {
        singInPage.getSingIn().click();
    }
}
