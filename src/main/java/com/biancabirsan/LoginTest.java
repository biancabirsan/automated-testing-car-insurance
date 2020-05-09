package com.biancabirsan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String args[]) throws Exception {
        testUserLogin();
    }

    public static void testUserLogin() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/InsuranceProject/index.html");
        driver.manage().window().maximize();

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();

        // Class LoginPage - Use POM (Page Object Model);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickUserField();
        loginPage.enterUserFieldText("ken");

        loginPage = new LoginPage(driver);
        loginPage.clickUserPassword();
        loginPage.enterUserFieldPassword("123");

        loginPage = new LoginPage(driver);
        loginPage.clickLoginBtn();
        Thread.sleep(2000);
        driver.close();
    }

}
