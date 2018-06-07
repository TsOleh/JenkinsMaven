package com.epam.lab;

import com.epam.lab.busines_objects.gmailBO.*;
import com.epam.lab.parsing.GmailFileXLSX;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class GmailTest {
    ComposePageBO composePageBO;
    LogMailPageBO logMailPageBO;
    MessageFormPageBO messageFormPageBO;
    SavedMassagePageBO savedMassagePageBO;
    SendPageBO sendPageBO;

    @Test(dataProvider = "gmailData", dataProviderClass = GmailFileXLSX.class)
    public void testDecorator(String log,String pass,String to,String cc, String bcc,String sub,String mess){
        logMailPageBO = new LogMailPageBO();
        logMailPageBO.signInLogin(log);
        logMailPageBO.signInPassword(pass);
        composePageBO = new ComposePageBO();
        composePageBO.clickButtomCompose();
        messageFormPageBO = new MessageFormPageBO();
        messageFormPageBO.fillForm(to,cc,bcc,sub,mess);
        savedMassagePageBO = new SavedMassagePageBO();
        savedMassagePageBO.openSavedMessage();
        sendPageBO = new SendPageBO();
        Assert.assertTrue(sendPageBO.verifyMessage(to,cc,bcc,sub,mess));
    }

    @AfterClass
    public void cleanUp() {
        WebDriverUtils.close();
    }
}
