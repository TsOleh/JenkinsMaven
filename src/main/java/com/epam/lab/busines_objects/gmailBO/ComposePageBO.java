package com.epam.lab.busines_objects.gmailBO;
import com.epam.lab.pages_objects.gmail.ComposePage;
public class ComposePageBO {
    ComposePage composePage =new ComposePage();

    public void clickButtomCompose(){
        composePage.getButtomCompose().waitUntilVisible().click();
    }
}
