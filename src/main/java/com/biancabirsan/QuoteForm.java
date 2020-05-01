package com.biancabirsan;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QuoteForm {
    private WebDriver driver;

    @FindBy(name = "make")
    private WebElement carMake;

    @FindBy(name = "model")
    private WebElement carModel;

    @FindBy(name = "price")
    private WebElement carPrice;

    @FindBy(name = "engine")
    private WebElement carEngine;

    @FindBy(name = "size")
    private WebElement engineSize;

    @FindBy(name = "area")
    private WebElement locationArea;

    @FindBy(name = "garage1")
    private WebElement garageRadioButtonYes;

    @FindBy(name = "garage2")
    private WebElement garageRadioButtonNo;

    @FindBy(name = "age")
    private WebElement driverAge;

    @FindBy(name = "claim1")
    private WebElement claimRadioButtonYes;

    @FindBy(name = "claim2")
    private WebElement claimRadioButtonNo;

    @FindBy(name = "submitbutton")
    private WebElement submitButton;

    public QuoteForm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMakeField() {
        carMake.click();
    }

    public void selectCarMake(String text) throws InterruptedException {
        Select makeDropdown = new Select(carMake);
        makeDropdown.selectByVisibleText(text);
    }

    public void selectCarModel(String text) throws InterruptedException {
        Select modelDropdown = new Select(carModel);
        modelDropdown.selectByValue(text);
    }

    public void clickPriceField() {
        carPrice.click();
    }

    public void setPrice(String text) throws InterruptedException {
        Thread.sleep(2000);
        carPrice.sendKeys(text);
    }

    public void clickEngineTypeField() {
        carEngine.click();
    }

    public void selectEngineType(String text) throws InterruptedException {
        Select engineDropdown = new Select(carEngine);
        engineDropdown.selectByValue(text);
    }

    public void selectEngineSize(String text) throws InterruptedException {
        Select engineSizeDropdown = new Select(engineSize);
        engineSizeDropdown.selectByValue(text);
    }

    public void clickAreaField() {
        locationArea.click();
    }

    public void selectArea(String text) throws InterruptedException {
        Select areaDropdown = new Select(locationArea);
        areaDropdown.selectByValue(text);
    }

    public void carKeptInGarage(boolean bool) throws InterruptedException {
        if (bool) {
            garageRadioButtonNo.click();
        } else {
            garageRadioButtonYes.click();
        }
    }

    public void clickdriverAgeField() {
        driverAge.click();
    }

    public void addDriverAge(String text) throws InterruptedException {
        Thread.sleep(2000);
        driverAge.sendKeys(text);
    }


    public void selectClaim(boolean bool) throws InterruptedException {
        if (bool) {
            claimRadioButtonNo.click();
        } else {
            claimRadioButtonYes.click();
        }
    }

        public void submitForm(){
            submitButton.click();
        }

}
