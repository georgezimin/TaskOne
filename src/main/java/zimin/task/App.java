package zimin.task;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.WebElement;
import zimin.task.data.Item;
import zimin.task.system.Chrome;
import zimin.task.system.Excel;
import zimin.task.system.pages.ItemsPage;
import zimin.task.system.pages.Page;
import zimin.task.system.pages.SearchPage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Chrome chrome = Chrome.getInstance();
        chrome.navigatePage("https://sbermegamarket.ru/");
        SearchPage searchPage = new SearchPage(chrome);
        chrome.write(searchPage.getSearchTextField(), "rtx 3080");
        chrome.click(searchPage.getSearchButton());
        ItemsPage itemsPage = new ItemsPage(chrome);
        List<WebElement> titles = itemsPage.getItemTitle();
        List<WebElement> prices = itemsPage.getItemPrice();
        List<Item> items = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            items.add(new Item(titles.listIterator(j).next().getText(),
                                prices.listIterator(j).next().getText()));
        }
        chrome.closeChrome();
        Excel excel = new Excel();
        excel.writeValues(System.getenv("FILE_PATH"), items);
    }
}
