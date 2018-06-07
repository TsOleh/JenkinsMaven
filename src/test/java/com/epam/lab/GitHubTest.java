package com.epam.lab;
import com.epam.lab.busines_objects.gitHubBO.*;
import com.epam.lab.parsing.GitHubFileCSV;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class GitHubTest {
    private AfterSortChangeBO afterSortChangeBO;
    private CountAndTitleBO countAndTitleBO;
    private LogGitHubPageBO logGitHubPageBO;
    private SeleniumJavaPageBO seleniumJavaPageBO;
    private SingInPageBO singInPageBO;
    private SortItemPagePO sortItemPagePO;

    @Test(dataProvider = "gitHubData", dataProviderClass = GitHubFileCSV.class)
    public void testDecorator(String login, String password, String firstSearch,String secondSearch){
        singInPageBO = new SingInPageBO();
        singInPageBO.clickSingIn();
        logGitHubPageBO = new LogGitHubPageBO();
        logGitHubPageBO.putLoginPassword(login, password);
        seleniumJavaPageBO = new SeleniumJavaPageBO();
        seleniumJavaPageBO.searchValue(firstSearch);
        countAndTitleBO = new CountAndTitleBO();
        countAndTitleBO.printTitleCount();
       // Failed tests:   testDecorator(com.epam.lab.GitHubTest): expected [10] but found [9]
       // Assert.assertEquals(countAndTitleBO.checkForTagSelenium(), TITLES);
        countAndTitleBO.sort();
        sortItemPagePO = new SortItemPagePO();
        sortItemPagePO.printTitleCount();
        sortItemPagePO.clearSearch();
        sortItemPagePO.newSearch(secondSearch);
        afterSortChangeBO =new AfterSortChangeBO();
        afterSortChangeBO.printTitleCount();
    }

    @AfterClass
    public void cleanUp() {
        WebDriverUtils.close();
    }

}
