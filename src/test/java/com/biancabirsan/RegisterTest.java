package com.biancabirsan;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends Setup {

    @Test
    public void registerTest() throws Exception {
        WebElement registerButton = driver.findElement(By.id("register"));
        registerButton.click();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.clickUsernameField();
        registerPage.enterUsernameFieldText("Bianca");
    }
}
