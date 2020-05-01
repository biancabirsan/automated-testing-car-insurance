package com.biancabirsan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    // All WebElements are identified by @FindBy annotation

    private WebDriver driver;

    @FindBy(id = "register_username")
    private WebElement usernameField;

    @FindBy(id = "register_email")
    private WebElement userEmailField;

    @FindBy(id = "register_password")
    private WebElement password;

    @FindBy(id = "password_verify")
    private WebElement passwordVerify;

    @FindBy(className= "btn")
    private WebElement registerButton;


    public RegisterPage(WebDriver driver) {
        this.driver = driver;

        // This initElements method will create all web elements
        PageFactory.initElements(driver, this);
    }

    public void clickUsernameField() {
        usernameField.click();
    }

    public void enterUsernameFieldText(String text) throws InterruptedException {
        Thread.sleep(2000);
        usernameField.sendKeys(text);
    }

}
