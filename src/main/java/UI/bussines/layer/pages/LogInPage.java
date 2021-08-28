package UI.bussines.layer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {
    @FindBy (xpath = "//div[1]/div[1]/header/div[1]/div/div[3]/div")
    WebElement login;

    @FindBy (name = "user_login")
    WebElement email;

    @FindBy (name = "user_pw")
    WebElement passwd;

    @FindBy(xpath = "//*[@id=\"form-auth\"]/div/div[2]/div[3]")
    WebElement signIn;

    public void loginInAccount(String mail, String password, WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        login.click();
        wait.until(ExpectedConditions.elementToBeClickable(email));
        email.sendKeys(mail);
        passwd.sendKeys(password);
        signIn.click();
    }
}