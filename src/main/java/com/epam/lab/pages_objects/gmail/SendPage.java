package com.epam.lab.pages_objects.gmail;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Element;
import com.epam.lab.decorator.Name;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;

public class SendPage extends PageObject {
    private static final Logger LOGGER = Logger.getLogger(SendPage.class.getName());

    @FindBy(css = "input[name='to']")
    private Element fieldTo;

    @FindBy(css = "input[name='cc']")
    private Element fieldCc;

    @FindBy(css = "input[name='bcc']")
    private Element fieldBcc;

    @FindBy(css = "input[name='subjectbox']")
    private Element subject;

    @FindBy(xpath = "//td//div[@role='textbox'][@hidefocus='true']")
    private Element message;

    @Name("Send")
    @FindBy(xpath = "//td/div/div[@role='button']")
    private Element sendButton;

    public Element getFieldTo(){
        return fieldTo;
    }
    public Element getFieldCc(){
        return fieldCc;
    }
    public Element getFieldBcc(){
        return fieldBcc;
    }
    public Element getSubject(){
        return subject;
    }
    public Element getMessage(){
        return message;
    }
    public Element getSendButton(){
        return sendButton;
    }
}
