package com.epam.lab.busines_objects.gmailBO;

import com.epam.lab.pages_objects.gmail.MessageFormPage;

public class MessageFormPageBO {
    MessageFormPage messageFormPage = new MessageFormPage();
    public void fillForm(String to, String cc,String bcc,String sub,String mess){
        messageFormPage.getFieldTo().sendKeys(to);
        messageFormPage.getClickCc().click();
        messageFormPage.getFieldCc().sendKeys(cc);
        messageFormPage.getClickBcc().click();
        messageFormPage.getFieldBcc().sendKeys(bcc);
        messageFormPage.getSubject().sendKeys(sub);
        messageFormPage.getMessage().sendKeys(mess);
        messageFormPage.getMassageClose().click();
        messageFormPage.getDraftsButton().click();
    }
}
