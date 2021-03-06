package com.epam.lab.pages_objects.gitHub;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Element;
import com.epam.lab.decorator.Name;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SortItemPage extends PageObject {
    private static final Logger LOGGER = Logger.getLogger(SortItemPage.class.getName());
    @FindBy(className ="pr-4")
    private List<Element> allTitles;

    @FindBy(css =".pb-3 h3")
    private Element countElement;

    @Name("Search or jump to…")
    @FindBy(className = "js-site-search-focus")
    private Element search;

    public List<Element> getTitle() {
        return allTitles;
    }
    public Element getTitlesCount() {
        return countElement;
    }
    public Element getSearchValue() {
        return  search;
    }
}
