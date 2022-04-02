package zimin.task.system;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {

    private static Chrome instance;
    private WebDriver webDriver;

    private Chrome() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize(); //сделал максимизацию окна, чтобы можно было посмотреть
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public static synchronized Chrome getInstance() {
        if (instance == null) {
            instance = new Chrome();
        }
        return instance;
    }

    public void navigatePage (String page) {
        webDriver.get(page);
    }

    public void write (WebElement element, String value) {
        element.sendKeys(value);
    }

    public void click(WebElement element) {
        element.click();
    }

}
