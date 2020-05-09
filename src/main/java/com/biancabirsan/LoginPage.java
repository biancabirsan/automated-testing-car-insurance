package com.biancabirsan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {


    private WebDriver driver;

    @FindBy(id = "login")
    public WebElement loginNavBtn;

    @FindBy(id = "login_username")
    private WebElement userField;

    @FindBy(id = "login_password")
    private WebElement userPassword;

    @FindBy(className = "btn")
    private WebElement loginBtn;


    public LoginPage(WebDriver driver) {
        this.driver = driver;

        // This initElements method will create all web elements
        PageFactory.initElements(driver, this);
    }

    public void clickLoginNavBtn(){
        loginNavBtn.click();
    }

    public void clickUserField() {

        userField.click();
    }

    public void enterUserFieldText(String text) throws InterruptedException {
        Thread.sleep(2000);
        userField.sendKeys(text);
    }

    public void clickUserPassword() {
        userPassword.click();
    }

    public void enterUserFieldPassword(String text) throws InterruptedException {
        Thread.sleep(2000);
        userPassword.sendKeys(text);
    }

    public void clickLoginBtn() {
        loginBtn.click();

    }

}


