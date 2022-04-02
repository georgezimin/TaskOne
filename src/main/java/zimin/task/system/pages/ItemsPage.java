package zimin.task.system.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import zimin.task.system.Chrome;

import java.util.List;

public class ItemsPage extends Page{

    public ItemsPage(Chrome chrome) {
        super(chrome);
    }

    @FindBy(css = "div.item-title.desktop-only")
    @Getter
    private List<WebElement> itemTitle;

    @FindBy(className="item-price")
    @Getter
    private List<WebElement> itemPrice;

}
