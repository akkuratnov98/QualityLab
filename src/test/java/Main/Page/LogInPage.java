package Main.Page;

import Main.Page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {

    By loginField = By.xpath("//input[@name='login']");
    By passwordField = By.xpath("//input[@name='password']");
    By sendLoginButton = By.xpath("//button[@data-testid='enter-password']");
    By sendPasswordButton = By.xpath("//button[@data-testid='login-to-mail']");


    public LogInPage(WebDriver driver) {
        super(driver);

    }

    public void inputLogin(String login){
        sendKey(loginField, login);
    }

    public void enterLogin() {
        click(sendLoginButton);
    }

    public void inputPassword(String password){
        sendKey(passwordField, password);
    }

    public void enterPassword() {
        click(sendPasswordButton);
    }
}
