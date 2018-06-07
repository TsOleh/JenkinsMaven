package com.epam.lab.pages_objects.gmail;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Element;
import com.epam.lab.decorator.Name;
import org.openqa.selenium.support.FindBy;

public class SavedMassagePage extends PageObject {

    @Name("last saved massage")
    @FindBy(xpath = "//div[@role='main']/div/div/div[not(@*)]/table/tbody/tr[1]")
    private Element lastMwssage;

    public Element getSavedMessage() {
        return lastMwssage;
    }
}
