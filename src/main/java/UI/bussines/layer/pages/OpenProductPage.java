package UI.bussines.layer.pages;

import UI.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpenProductPage {

    @FindBy (xpath = "//div[5]/ul/li[2]")
    WebElement promotion;

    @FindBy (xpath = "//div[9]/ul/li[2]")
    WebElement product;

    @FindBy (xpath = "//div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div/div[8]/ul/li[2]")
    WebElement withFilters;

    @FindBy (xpath = "//div[1]/div[1]/div/div/div[2]/div[1]/div/div[5]/ul/li[5]")
    WebElement search;

    @FindBy (xpath = "//div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div/div[9]/ul/li[2]/div[2]")
    WebElement biggestPrice;

    public void openPromotionProduct(){
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(promotion));
        promotion.click();
    }

    public void openProductWithFilter(){
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(withFilters));
        withFilters.click();
    }

    public void openDefaultProduct(){
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(product));
        product.click();
    }

    public void openSearchProduct(){
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(search));
        search.click();
    }

    public void openBiggest(){
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(biggestPrice));
        biggestPrice.click();
    }
}
