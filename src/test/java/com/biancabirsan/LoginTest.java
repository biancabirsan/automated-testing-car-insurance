package com.biancabirsan;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTest extends Setup {


    @Test
     public void loginTest1() throws Throwable{

      // Class LoginPage - Use POM (Page Object Model);
        LoginPage loginPage = new LoginPage(driver);
 //     loginPage.loginNavBtn.click();
        loginPage.clickLoginNavBtn();
        loginPage.clickUserField();
        loginPage.enterUserFieldText("ken");

        loginPage = new LoginPage(driver);
        loginPage.clickUserPassword();
        loginPage.enterUserFieldPassword("123");
        Thread.sleep(2000);
  }
    @Test
    public void loginTest2() throws Exception {

        // Class LoginPage - Use POM (Page Object Model);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginNavBtn();
        loginPage.clickUserField();
        loginPage.enterUserFieldText("ken");

        loginPage = new LoginPage(driver);
        loginPage.clickUserPassword();
        loginPage.enterUserFieldPassword("123456");
    }

    @Test
    public void loginTest3() throws Exception {
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();

        // Class LoginPage - Use POM (Page Object Model);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickUserField();
        loginPage.enterUserFieldText("Bianca");

        loginPage = new LoginPage(driver);
        loginPage.clickUserPassword();
        loginPage.enterUserFieldPassword("123456");
    }



}
