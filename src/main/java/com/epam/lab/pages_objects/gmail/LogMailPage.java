package com.epam.lab.pages_objects.gmail;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Element;
import com.epam.lab.decorator.Name;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogMailPage extends PageObject {
    private WebDriver driver;
    private WebDriverWait wait;
    @Name("login field")
    @FindBy(css = "input[type='email']")
    private Element login;

    @Name("Next")
    @FindBy(xpath = "//div[@jsname='DH6Rkf']//div[@role='button']")
    private Element logClick;

    @Name("password field")
    @FindBy(css = "input[type='password']")
    private Element password;

    @Name("Next")
    @FindBy(xpath = "//div[@jsname='DH6Rkf']//div[@role='button']")
    private Element passClick;


    public Element getLogin() {
        return login;
    }
    public Element getClickLogin() {
        return logClick;
    }
    public Element getPassword() {
        return password;
    }
    public Element getClickPassword() {
        return passClick;
    }
}
