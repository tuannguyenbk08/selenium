/**
 * Created with IntelliJ IDEA.
 * User: Alan
 * Date: 24/04/13
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */

package com.guru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deposit {
    WebDriver driver;

    public Deposit(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name ='accountno']")
    private WebElement accountNo;

    @FindBy(xpath = "//input[@name ='ammount']")
    private WebElement amount;

    @FindBy(xpath = "//input[@name ='desc']")
    private WebElement description;

    @FindBy(xpath = "//input[@name ='AccSubmit']")
    private WebElement submitButton;

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void amountDeposit(String[] depositData) {
        accountNo.sendKeys(depositData[0]);
        amount.sendKeys(depositData[1]);
        description.sendKeys(depositData[2]);
        submitButton.click();
    }
}
