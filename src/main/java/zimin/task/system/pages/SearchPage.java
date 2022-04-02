package zimin.task.system.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import zimin.task.system.Chrome;

public class SearchPage extends Page{

    public SearchPage (Chrome chrome) {
        super(chrome);
      }

    @FindBy(className = "search-field-input")
    @Getter
    private WebElement searchTextField;

    @FindBy(className = "header-search-form__send-button")
    @Getter
    private WebElement searchButton;


}
