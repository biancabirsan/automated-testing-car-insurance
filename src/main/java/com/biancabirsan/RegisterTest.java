package com.biancabirsan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * Selenium is used to automate web applications
 * To test web applications
 *
 *
 */
public class RegisterTest {

    public static void main( String[] args ) throws Exception {
        testThantWronfVerifyPasswordThrowsAnError();
        testEmptyField();
        testRegistrationSuccessfull();
    }

    public static void testThantWronfVerifyPasswordThrowsAnError() throws Exception {
        // Setup the test
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/InsuranceProject/index.html");
        driver.manage().window().maximize();

        // Test that wrong verify password throws an error message

        // Given that I fill in the register data with wrong verify password
        WebElement registerButton = driver.findElement(By.id("register"));
        registerButton.click();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.clickUsernameField();
        registerPage.enterUsernameFieldText("Bianca");

        WebElement emailField = driver.findElement(By.id("register_email"));
        emailField.click();
        Thread.sleep(2000);
        emailField.sendKeys("biancabirsan@gmail.com");

        WebElement passwordField = driver.findElement(By.id("register_password"));
        passwordField.click();
        Thread.sleep(2000);
        passwordField.sendKeys("Bian");

        WebElement passwordVerifyField = driver.findElement(By.id("register_password_verify"));
        passwordVerifyField.click();
        Thread.sleep(2000);
        passwordVerifyField.sendKeys("Bianca");

        // When I click register
        WebElement registerButton2 = driver.findElement(By.className("btn"));
        registerButton2.click();
        Thread.sleep(2000);

        // Then I receive an error message
        WebElement errorMessage = driver.findElement(By.className("error"));
        if (errorMessage != null) {
            System.out.println("Success");
        }
        // Clean up
        driver.close();
    }

    public static void testEmptyField() throws Exception{
        // Setup the test
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/InsuranceProject/index.html");
        driver.manage().window().maximize();

        // Given that if there is an empty field throws an error message
        WebElement registerBtn = driver.findElement(By.id("register"));
        registerBtn.click();

        PageFactory.initElements(driver, RegisterPage.class);

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.clickUsernameField();
        registerPage.enterUsernameFieldText("Bianca");

        WebElement emailField = driver.findElement(By.id("register_email"));
        emailField.click();
        emailField.sendKeys("");

        WebElement passwordField = driver.findElement(By.id("register_password"));
        passwordField.click();
        Thread.sleep(2000);
        passwordField.sendKeys("12345");

        WebElement passwordVerifyField = driver.findElement(By.id("register_password_verify"));
        passwordVerifyField.click();
        Thread.sleep(2000);
        passwordVerifyField.sendKeys("12345");

        // When I click register
        WebElement registerButton2 = driver.findElement(By.className("btn"));
        registerButton2.click();
        Thread.sleep(2000);

        // Then I receive an error message
        WebElement errorMessage = driver.findElement(By.className("error"));
        if (errorMessage != null) {
            System.out.println("Success");
        }
        // Clean up
        driver.close();
    }

    public static void testRegistrationSuccessfull() throws Exception{
        // Setup the test
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/InsuranceProject/index.html");
        driver.manage().window().maximize();

        // Test that wrong verify password throws an error message

        // Given that I fill in the register data with wrong verify password
        WebElement registerButton = driver.findElement(By.id("register"));
        registerButton.click();


        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.clickUsernameField();
        registerPage.enterUsernameFieldText("Bianca");

        WebElement emailField = driver.findElement(By.id("register_email"));
        emailField.click();
        Thread.sleep(2000);
        emailField.sendKeys("biancab@gmail.com");

        WebElement passwordField = driver.findElement(By.id("register_password"));
        passwordField.click();
        Thread.sleep(2000);
        passwordField.sendKeys("12345");

        WebElement passwordVerifyField = driver.findElement(By.id("register_password_verify"));
        passwordVerifyField.click();
        Thread.sleep(2000);
        passwordVerifyField.sendKeys("12345");

        // When I click register
        WebElement registerButton2 = driver.findElement(By.className("btn"));
        registerButton2.click();
        Thread.sleep(2000);

        // Then I receive an error message
        WebElement errorMessage = driver.findElement(By.className("error"));
        if (errorMessage == null) {
            System.out.println("Success");
        }
        // Clean up
        driver.close();
    }
}




