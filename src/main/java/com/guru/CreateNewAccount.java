package com.guru;
import com.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount extends BasePage {

    @FindBy(xpath = "//input[@name = 'cusid']")
    WebElement customerId;

    @FindBy(xpath = "//select[@name = 'selaccount']")
    WebElement accountType;

    @FindBy(xpath = "//input[@name = 'inideposit']")
    WebElement initialDeposit;

    @FindBy(xpath = "//input[@name = 'button2']")
    WebElement submitButton;

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void addNewAccount(String[] accountData) {
        customerId.sendKeys(accountData[0]);

        Select selectAccountType = new Select(accountType);
        if (accountData[1].equals("Savings")) {
            selectAccountType.getOptions().get(0).click();
        } else if (accountData[1].equals("Current")) {
            selectAccountType.getOptions().get(1).click();
        }

        initialDeposit.sendKeys(accountData[2]);
        submitButton.click();
    }
}
