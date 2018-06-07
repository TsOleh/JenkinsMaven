package com.epam.lab.busines_objects.gitHubBO;
import com.epam.lab.pages_objects.gitHub.LogGitHubPage;


public class LogGitHubPageBO {
    LogGitHubPage logGitHubPage = new LogGitHubPage();

    public void putLoginPassword(String log, String pass) {
        logGitHubPage.getLogin().sendKeys(log);
        logGitHubPage.getPassword().sendKeys(pass);
        logGitHubPage.getSubmit().submit();
    }

}
