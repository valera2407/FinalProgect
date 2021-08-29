package UI.bussines.layer.pages;

import UI.BaseTest;
import UI.util.layer.PropertieReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInLogOutPage {

    @FindBy (xpath = "//div[1]/div[1]/header/div[1]/div/div[3]/div")
    WebElement login;

    @FindBy (name = "user_login")
    WebElement email;

    @FindBy (name = "user_pw")
    WebElement passwd;

    @FindBy(xpath = "//*[@id=\"form-auth\"]/div/div[2]/div[3]")
    WebElement signIn;

    @FindBy(xpath = "//div[1]/div[1]/header/div[1]/div/div[3]/a")
    WebElement account;

    @FindBy(xpath = "//div[1]/div[1]/div/div/div/ul/li[5]")
    WebElement logOut;

    public void loginInAccount(String mail, String password){
        login.click();
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(email));
        email.sendKeys(mail);
        passwd.sendKeys(password);
        signIn.click();
    }

    public void logOutAccount(){
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(account));
        account.click();
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(logOut));
        logOut.click();
    }
}