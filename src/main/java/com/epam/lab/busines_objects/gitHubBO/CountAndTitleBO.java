package com.epam.lab.busines_objects.gitHubBO;

import com.epam.lab.pages_objects.gitHub.CountAndTitle;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CountAndTitleBO {
    CountAndTitle countAndTitle = new CountAndTitle();
    private static final Logger LOGGER = Logger.getLogger(CountAndTitle.class.getName());
    public void printTitleCount() {
        for (WebElement title : countAndTitle.getTitle()) {
            LOGGER.info(title.getText());
        }
        LOGGER.info("--- " + countAndTitle.getTitlesCount().getText() + " ---\n");
    }
    public void sort() {
        countAndTitle.getSortButton().click();
        countAndTitle.getChangeSort().click();
    }

    int count=0;
    public int checkForTagSelenium() {
        for (WebElement element : countAndTitle.getTitle()) {
            if(element.findElements(By.xpath("//*[.='selenium']")).size()>0){
                count++;
            }
        }
        return count;
    }

}
