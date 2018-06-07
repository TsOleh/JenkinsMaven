package com.epam.lab.pages_objects.gitHub;
import com.epam.lab.PageObject;
import com.epam.lab.decorator.Element;
import com.epam.lab.decorator.Name;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CountAndTitle extends PageObject {
    private static final Logger LOGGER = Logger.getLogger(CountAndTitle.class.getName());

    @FindBy(className ="pr-4")
    private  List<Element> allTitles;

    @FindBy(css =".pb-3 h3")
    private Element countElement;

    @Name("Sort button")
    @FindBy(className = "js-menu-target")
    private Element sortButton;

    @Name("select-menu-item-text")
    @FindBy(xpath = "//*[.='Most forks']")
    private Element changeSort;

    public Element getSortButton(){
        return sortButton;
    }
    public Element getChangeSort(){
        return changeSort;
    }
    public List<Element> getTitle() {
        return allTitles;
    }
    public Element getTitlesCount() {
        return countElement;
    }
}
