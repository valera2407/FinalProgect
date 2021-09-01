package UI.bussines.layer.pages;

import UI.BaseTestUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInLogOutPage {

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[1]/div[1]/div[3]/div/ul/li[5]/div")
    WebElement login;

    @FindBy (id = "auth")
    WebElement email;

    @FindBy (id = "v-login-password")
    WebElement passwd;

    @FindBy(xpath = "//*[@id=\"form-validate-login\"]/div/button")
    WebElement signIn;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[1]/div[1]/div[3]/div/ul/li[5]/div")
    WebElement account;

    @FindBy(xpath = "//*[@id=\"customer-popup-menu\"]/li[10]")
    WebElement logOut;

    public void loginInAccount(String mail, String password){
        login.click();
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(email));
        email.sendKeys(mail);
        passwd.sendKeys(password);
        signIn.click();
    }

    public void logOutAccount(){
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(account));
        account.click();
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(logOut));
        logOut.click();
    }
}