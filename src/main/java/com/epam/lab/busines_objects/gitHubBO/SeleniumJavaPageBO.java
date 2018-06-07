package com.epam.lab.busines_objects.gitHubBO;
import com.epam.lab.pages_objects.gitHub.SeleniumJavaPage;

public class SeleniumJavaPageBO {
    SeleniumJavaPage seleniumJavaPage = new SeleniumJavaPage();

    public void searchValue(String value ) {
        seleniumJavaPage.getSearchValue().sendKeys(value);
        seleniumJavaPage.getSearchValue().submit();
    }
}
