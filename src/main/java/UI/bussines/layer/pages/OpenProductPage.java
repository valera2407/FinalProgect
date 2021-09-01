package UI.bussines.layer.pages;

import UI.BaseTestUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpenProductPage {

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/div[4]/div/div[2]/div/div[1]/a")
    WebElement promotion;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[2]/div/div[1]/div[2]/div[3]/div[1]/div/div[3]/a")
    WebElement search;


    public void openPromotionProduct(){
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(promotion));
        promotion.click();
    }

    public void openDefaultProduct(){
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(search));
        search.click();
    }
}
