package UI.bussines.layer.pages;

import UI.BaseTestUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class FilterPage {

    @FindBy (xpath = "//*[@id=\"filter_id-32000\"]")
    WebElement qled;

    public void addFilter(){
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(qled));
        qled.click();
    }
}
