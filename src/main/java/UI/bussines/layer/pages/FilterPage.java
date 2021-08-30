package UI.bussines.layer.pages;

import UI.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class FilterPage {

    @FindBy (xpath = "//*[@id=\"popularinput-checkbox-2251-26085\"]")
    WebElement shampoo;

    @FindBy (xpath = "//*[@id=\"input-checkbox-2247-24195\"]")
    WebElement age;

    public void addFilters(){
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(shampoo));
        shampoo.click();
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(age));
        age.click();
    }
}
