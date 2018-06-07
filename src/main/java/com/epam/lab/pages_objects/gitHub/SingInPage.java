package com.epam.lab.pages_objects.gitHub;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Name;
import com.epam.lab.decorator.Element;
import org.openqa.selenium.support.FindBy;

public class SingInPage extends PageObject {
    @Name("SignUp header")
    @FindBy(css = "a[href='/login']")
    private Element signIn;

    public Element getSingIn() {
      return  signIn;
    }
}
