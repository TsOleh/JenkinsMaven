package com.epam.lab;
import com.epam.lab.decoratorimpl.MyDefaultFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import java.util.concurrent.TimeUnit;

public abstract class PageObject {
    protected final WebDriver driver;
    public PageObject() {
    this.driver = WebDriverUtils.getDriver();
    WebDriverUtils.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebDriverUtils.getDriver().manage().window().maximize();
    PageFactory.initElements(
            new MyDefaultFieldDecorator(
                    new DefaultElementLocatorFactory(driver)
            ), this);
    }

}
