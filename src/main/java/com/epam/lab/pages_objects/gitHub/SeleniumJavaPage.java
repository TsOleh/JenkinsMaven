package com.epam.lab.pages_objects.gitHub;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Name;
import com.epam.lab.decorator.Element;
import org.openqa.selenium.support.FindBy;

public class SeleniumJavaPage extends PageObject {
    @Name("Search or jump to…")
    @FindBy(className = "js-site-search-focus")
    private Element search ;

    @FindBy(xpath = "//img[@alt='@Poltor22']")
    private Element signUpHeader;

    public Element getTextOfHeader() {
      return  signUpHeader;
    }
    public Element getSearchValue() {
        return  search;
    }
}
