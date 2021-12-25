package Main.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPage extends BasePage {

    By subjectField = By.name("Subject");
    By textEmailField = By.xpath("//div[@role='textbox']");
    By sendEmailButton = By.xpath("//span[@title='Отправить']");
    By writeLetterButton = By.xpath("//a[@title='Написать письмо']");
    By toLoginField = By.xpath("//input[@class='container--H9L5q size_s_compressed--2c-eV']");

    public MailPage(WebDriver driver) {
        super(driver);
    }

    public void clickWriteLetterButton(){
        click(writeLetterButton);
    }

    public void inputToLogin(String toLogin){
        sendKey(toLoginField , toLogin);
    }

    public void inputSubject(String subjectMail){
        sendKey(subjectField, subjectMail);
    }

    public void inputBodyEmail(String textMail){
        sendKey(textEmailField, textMail);
    }

    public void clickSendButton(){
        click(sendEmailButton);
    }
}
