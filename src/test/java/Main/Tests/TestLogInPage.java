package Main.Tests;

import Main.Page.MailPage;
import Main.Page.LogInPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.nio.file.Paths;
import java.time.Duration;

public class TestLogInPage {

    ChromeDriver driver;
    LogInPage logInPage;
    MailPage mailPage;

    @BeforeTest
    public void openLogIn() {
            System.setProperty("webdriver.chrome.driver", String.valueOf(Paths.get("src/main/resources/tools/chromedriver.exe")));
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://mail.ru/");
            mailPage = PageFactory.initElements(driver, MailPage.class);
            logInPage = PageFactory.initElements(driver, LogInPage.class);
    }

    @Parameters({"login", "password", "toLogin", "subjectMail", "textMail"})
    @Test(testName = "Авторизация в почте и отправка электоронного письма", priority = 1)
    public void switchToRecoveryPage(String login, String password, String toLogin, String subjectMail, String textMail){
        logInPage.inputLogin(login);
        logInPage.enterLogin();
        logInPage.inputPassword(password);
        logInPage.enterPassword();
        mailPage.clickWriteLetterButton();
        mailPage.inputToLogin(toLogin);
        mailPage.inputSubject(subjectMail);
        mailPage.inputBodyEmail(textMail);
        mailPage.clickSendButton();
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}



