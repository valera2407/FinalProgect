package UI.bussines.layer.pages;

import UI.BaseTestUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ComparePage {

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div/div[3]/div[1]/div/div[2]/div[2]")
    WebElement first;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[3]/div[1]/div/div[2]/div[2]")
    WebElement second;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/button[2]")
    WebElement comp;

    public void addToCompare2devices(){
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(first));
        first.click();
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(second));
        second.click();
    }

    public void compare(){
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(comp));
        comp.click();
    }
}
