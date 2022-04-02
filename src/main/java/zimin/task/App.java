package zimin.task;


import zimin.task.system.Chrome;
import zimin.task.system.pages.Page;
import zimin.task.system.pages.SearchPage;

public class App
{
    public static void main( String[] args )
    {
        Chrome chrome = Chrome.getInstance();
        chrome.navigatePage("https://sbermegamarket.ru/");
        SearchPage searchPage = new SearchPage(chrome);
        chrome.write(searchPage.getSearchTextField(), "rtx 3080");
        chrome.click(searchPage.getSearchButton());

    }
}
