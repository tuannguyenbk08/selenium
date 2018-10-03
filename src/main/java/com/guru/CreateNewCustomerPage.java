/**
 * Created with IntelliJ IDEA.
 * User: Alan
 * Date: 24/04/13
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */

package com.guru;

import com.BasePage;
import com.guru.model.Customer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomerPage extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    private WebElement customerName;

    @FindBy(xpath = "//input[@value='m']")
    private WebElement male;

    @FindBy(xpath = "//input[@value='f']")
    private WebElement female;

    @FindBy(xpath = "//input[@type='date']")
    private WebElement dayOfBirth;

    @FindBy(xpath = "//textarea[@name='addr']")
    private WebElement adress;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    private WebElement state;

    @FindBy(xpath = "//input[@name='pinno']")
    private WebElement pinNo;

    @FindBy(xpath = "//input[@name='telephoneno']")
    private WebElement mobileNumber;

    @FindBy(xpath = "//input[@name='emailid']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='sub']")
    private WebElement submitButton;

    String[] customer = {"a", "b"};

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void addNewCUstomer(Customer customer) {
        customerName.sendKeys(customer.getName());
        if (customer.getGender().equals("male")) {
            male.click();
        } else if (customer.getGender().equals("female")) {
            female.click();
        }
        dayOfBirth.sendKeys(customer.getDayOfBirth());
        adress.sendKeys(customer.getAddress());
        city.sendKeys(customer.getCity());
        state.sendKeys(customer.getState());
        pinNo.sendKeys(customer.getPin());
        mobileNumber.sendKeys(customer.getMobileNumber());
        email.sendKeys(customer.getEmail());
        password.sendKeys(customer.getPassword());
        submitButton.click();
    }
}