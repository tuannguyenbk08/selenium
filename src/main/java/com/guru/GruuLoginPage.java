/**
 * Created with IntelliJ IDEA.
 * User: Alan
 * Date: 24/04/13
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */

package com.guru;

import com.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;

public class GruuLoginPage extends BasePage {
    String LOGIN_URL = "http://demo.guru99.com/v4/";

    @FindBy(xpath ="//input[@name='uid']")
    private   WebElement usernameField;

    @FindBy(xpath ="//input[@name='password']")
    private WebElement pass;

    @FindBy(xpath = "//input[@name='btnLogin']")
    private WebElement loginButton;

    public void open(){
        driver.get(LOGIN_URL);
        assertTrue(loginButton.isDisplayed());
    }

    public void login(String username, String password){
        usernameField.sendKeys(username);
        pass.sendKeys(password);
        loginButton.click();
    }
}
