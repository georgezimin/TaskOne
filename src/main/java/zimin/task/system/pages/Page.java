package zimin.task.system.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import zimin.task.system.Chrome;

public class Page {
    protected WebDriver driver;

    public Page (Chrome chrome){
        PageFactory.initElements(chrome.getWebDriver(),this);
        this.driver = chrome.getWebDriver();
    }
}
