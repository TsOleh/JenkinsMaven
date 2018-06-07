package com.epam.lab.pages_objects.gitHub;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Element;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AfterSortChange extends PageObject {
    private static final Logger LOGGER = Logger.getLogger(AfterSortChange.class.getName());
    @FindBy(className ="pr-4")
    private List<Element> allTitles;

    @FindBy(css =".pb-3 h3")
    private Element countElement;

    public List<Element> getTitle() {
        return allTitles;
    }
    public Element getTitlesCount() {
        return countElement;
    }
}
