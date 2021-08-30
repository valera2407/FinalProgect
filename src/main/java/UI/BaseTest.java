package UI;

import UI.bussines.layer.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver webDriver;
    public static WebDriverWait wait;
    LogInLogOutPage logInOut;
    SearchPage search;
    CartPage cart;
    OpenProductPage openProduct;
    FilterPage filters;
    SortedPage sorted;

    @BeforeClass
    public void beforeClass() {
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(BaseTest.webDriver, 10);
        logInOut = PageFactory.initElements(webDriver, LogInLogOutPage.class);
        search = PageFactory.initElements(webDriver, SearchPage.class);
        cart = PageFactory.initElements(webDriver, CartPage.class);
        openProduct = PageFactory.initElements(webDriver, OpenProductPage.class);
        filters = PageFactory.initElements(webDriver, FilterPage.class);
        sorted = PageFactory.initElements(webDriver, SortedPage.class);
        webDriver.get("https://makeup.com.ua/");
        webDriver.manage().window().maximize();
        logInOut.loginInAccount("ffoto4418@gmail.com", "ffoto");
    }

    @AfterClass
    public void afterClass(){
        logInOut.logOutAccount();
        webDriver.quit();
    }
}
