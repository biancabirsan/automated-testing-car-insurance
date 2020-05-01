package com.biancabirsan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QuoteFormTest {
    public static void main(String args[]) throws Exception{
       testSubmitForm();
    }

    public static void testSubmitForm() throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/InsuranceProject/index.php");
        driver.manage().window().maximize();

        QuoteForm quoteForm = new QuoteForm(driver);
        quoteForm.clickMakeField();
        quoteForm.selectCarMake("BMW");

        quoteForm = new QuoteForm(driver);
        quoteForm.selectCarModel("X3");

        quoteForm = new QuoteForm(driver);
        quoteForm.clickPriceField();
        quoteForm.setPrice("3000");

        quoteForm = new QuoteForm(driver);
        quoteForm.clickEngineTypeField();
        quoteForm.selectEngineType("Diesel");

        quoteForm = new QuoteForm(driver);
        quoteForm.selectEngineSize("3L - 3.99L");

        quoteForm = new QuoteForm(driver);
        quoteForm.clickAreaField();
        quoteForm.selectArea("Dublin");

        quoteForm = new QuoteForm(driver);
        quoteForm.carKeptInGarage(true);

        quoteForm = new QuoteForm(driver);
        quoteForm.clickdriverAgeField();
        quoteForm.addDriverAge("25");

        quoteForm = new QuoteForm(driver);
        quoteForm.selectClaim(true);

        quoteForm = new QuoteForm(driver);
        quoteForm.submitForm();
        Thread.sleep(2000);
        driver.close();
        }


}
