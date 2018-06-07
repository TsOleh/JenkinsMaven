package com.epam.lab.pages_objects.gitHub;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Name;
import com.epam.lab.decorator.Element;
import org.openqa.selenium.support.FindBy;

public class LogGitHubPage extends PageObject {
    @Name("User Name text input")
    @FindBy(id = "login_field")
    private Element loginInput ;

    @Name("User Password text input")
    @FindBy(name = "password")
    private Element password ;

    public Element getLogin(){
      return loginInput;
    }
    public Element getPassword(){
       return password;
    }
    public Element getSubmit(){
      return password;
    }

}
