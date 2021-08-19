package UI;

import UI.bussines.layer.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UITest {

    WebDriver webDriver;

    @BeforeClass
    public void beforeClass(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://makeup.com.ua/");
        LogInPage logIn = PageFactory.initElements(webDriver, LogInPage.class);
        logIn.loginInAccount("ffoto4418@gmail.com", "ffoto", webDriver);
    }

    @AfterClass
    public void afterClass(){
        webDriver.quit();
    }

    @Test
    public void test(){
        SearchPage search = PageFactory.initElements(webDriver, SearchPage.class);
        CartPage cart = PageFactory.initElements(webDriver, CartPage.class);
        OpenProductPage openProduct = PageFactory.initElements(webDriver, OpenProductPage.class);
        search.openFaceBlock(webDriver);
        openProduct.openProduct(webDriver);
        cart.addToCart(webDriver);
        cart.makeOrder(webDriver);
    }
}
