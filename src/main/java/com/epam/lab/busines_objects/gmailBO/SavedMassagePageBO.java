package com.epam.lab.busines_objects.gmailBO;
import com.epam.lab.pages_objects.gmail.SavedMassagePage;

public class SavedMassagePageBO {
    SavedMassagePage lastMwssage = new SavedMassagePage();
    public void openSavedMessage() {
        lastMwssage.getSavedMessage().waitUntilVisible().click();
    }
}
