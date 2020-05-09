package com.biancabirsan;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Setup {

    static WebDriver driver;

    @BeforeClass
    public static void setupDriver(){
        Reporter.log("=====Browser Session Started=====", true);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        Reporter.log("=====Application Started=====", true);
    }

    @Before
    public void openPage() {
        driver.get("http://localhost/InsuranceProject/index.html");
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowserWindow() {
    }

    @AfterClass
    public static void close() {
     driver.close();
     Reporter.log("=====Browser Session End=====", true);
    }

}
