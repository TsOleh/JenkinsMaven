package com.epam.lab.pages_objects.gmail;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Element;
import com.epam.lab.decorator.Name;
import org.openqa.selenium.support.FindBy;

public class MessageFormPage extends PageObject {

    @Name("field 'To'")
    @FindBy(css = "textarea[name='to']")
    private Element fieldTo;

    @Name("field 'Cc'")
    @FindBy(xpath= "//span[span/@role='link']")
    private Element clickCc;

    @Name("field 'Cc'")
    @FindBy(css = "textarea[name='cc']")
    private Element fieldCc;

    @Name("field 'Bcc'")
    @FindBy(xpath= "//span[span[2]/@role='link']")
    private Element clickBcc;

    @Name("field 'Bcc'")
    @FindBy(css = "textarea[name='bcc']")
    private Element fieldBcc;

    @Name("field 'Subject'")
    @FindBy(css= "input[name='subjectbox']")
    private Element subject;

    @Name("text box 'To'")
    @FindBy(xpath = "//td//div[@role='textbox'][@hidefocus='true']")
    private Element message;

    @Name("'Save&Close'")
    @FindBy(xpath = "//td/img[3]")
    private Element messsaveClose;

    @Name("'Drafts'")
    @FindBy(css = "a[href='https://mail.google.com/mail/u/0/#drafts']")
    private Element draftsButton;

    public Element getFieldTo(){
        return fieldTo;
    }
    public Element getClickCc(){
        return clickCc;
    }
    public Element getFieldCc(){
        return fieldCc;
    }
    public Element getClickBcc(){
        return clickBcc;
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
    public Element getMassageClose(){
        return messsaveClose;
    }
    public Element getDraftsButton(){
        return draftsButton;
    }
}
