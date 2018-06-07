package com.epam.lab.pages_objects.gmail;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Element;
import com.epam.lab.decorator.Name;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComposePage extends PageObject {
    @Name("Compose")
    @FindBy(xpath = "//div[@jscontroller='DUNnfe']//div[@role='button']")
    private Element composeMessage;

    public Element getButtomCompose(){
        return composeMessage;
    }
}
