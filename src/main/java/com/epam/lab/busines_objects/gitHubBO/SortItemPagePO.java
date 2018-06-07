package com.epam.lab.busines_objects.gitHubBO;
import com.epam.lab.pages_objects.gitHub.SortItemPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

public class SortItemPagePO {
    SortItemPage sortItemPage = new SortItemPage();
    private static final Logger LOGGER = Logger.getLogger(SortItemPage.class.getName());
    public void printTitleCount() {
        for (WebElement title : sortItemPage.getTitle()) {
            LOGGER.info(title.getText());
        }
        LOGGER.info("--- " + sortItemPage.getTitlesCount().getText() + " ---\n");
    }
    public void clearSearch() {
        sortItemPage.getSearchValue().clear();
    }
    public void newSearch(String value ) {
        sortItemPage.getSearchValue().sendKeys(value);
        sortItemPage.getSearchValue().submit();
    }
}
