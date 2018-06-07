package com.epam.lab.busines_objects.gitHubBO;

import com.epam.lab.pages_objects.gitHub.AfterSortChange;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

public class AfterSortChangeBO {
    private static final Logger LOGGER = Logger.getLogger(AfterSortChangeBO.class.getName());
    AfterSortChange afterSortChange = new AfterSortChange();

    public void printTitleCount() {
        for (WebElement title : afterSortChange.getTitle()) {
            LOGGER.info(title.getText());
        }
        LOGGER.info("--- " + afterSortChange.getTitlesCount().getText() + " ---\n");
    }
}
