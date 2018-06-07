package com.epam.lab.busines_objects.gmailBO;

import com.epam.lab.pages_objects.gmail.SendPage;

public class SendPageBO {
    SendPage sendPage = new SendPage();
    boolean result;
    public boolean verifyMessage(String to, String cc,String bcc,String sub,String mess){
        boolean resultTo = sendPage.getFieldTo().getAttribute("value").equals(to);
        boolean resultCc = sendPage.getFieldCc().getAttribute("value").equals(cc);
        boolean resultBcc = sendPage.getFieldBcc().getAttribute("value").equals(bcc);
        boolean resultSub = sendPage.getSubject().getAttribute("value").equals(sub);
        boolean resultMess = sendPage.getMessage().getText().equals(mess);
        if (resultTo && resultCc && resultBcc && resultSub && resultMess) {
            result = true;
        }else{
            result =false;
        }
        sendPage.getSendButton().click();
        return result;
    }
}
