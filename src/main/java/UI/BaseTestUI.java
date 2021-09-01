package UI;

import UI.bussines.layer.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTestUI {

    public static WebDriver webDriver;
    public static WebDriverWait wait;
    LogInLogOutPage logInOut;
    SearchPage search;
    CartPage cart;
    OpenProductPage openProduct;
    FilterPage filter;
    ComparePage compare;

    @BeforeClass
    public void beforeClass() {
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(BaseTestUI.webDriver, 10);
        logInOut = PageFactory.initElements(webDriver, LogInLogOutPage.class);
        search = PageFactory.initElements(webDriver, SearchPage.class);
        filter = PageFactory.initElements(webDriver, FilterPage.class);
        compare = PageFactory.initElements(webDriver, ComparePage.class);
        cart = PageFactory.initElements(webDriver, CartPage.class);
        openProduct = PageFactory.initElements(webDriver, OpenProductPage.class);
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass(){
        webDriver.quit();
    }
}
