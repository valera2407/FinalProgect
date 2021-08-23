package UI;

import UI.bussines.layer.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    WebDriver webDriver;
    LogInPage logIn;
    SearchPage search;
    CartPage cart;
    OpenProductPage openProduct;
    FilterPage filters;
    SortedPage sorted;

    @BeforeClass
    public void beforeClass(){
        webDriver = new ChromeDriver();
        logIn = PageFactory.initElements(webDriver, LogInPage.class);
        search = PageFactory.initElements(webDriver, SearchPage.class);
        cart = PageFactory.initElements(webDriver, CartPage.class);
        openProduct = PageFactory.initElements(webDriver, OpenProductPage.class);
        filters = PageFactory.initElements(webDriver, FilterPage.class);
        sorted = PageFactory.initElements(webDriver, SortedPage.class);
        webDriver.manage().window().maximize();
        webDriver.get("https://makeup.com.ua/");
        logIn.loginInAccount("ffoto4418@gmail.com", "ffoto", webDriver);
    }

    @AfterClass
    public void afterClass(){
        webDriver.quit();
    }
}
