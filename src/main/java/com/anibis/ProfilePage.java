/**
 * Created with IntelliJ IDEA.
 * User: Alan
 * Date: 24/04/13
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */

package com.anibis;

import com.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfilePage extends BasePage {
    @FindBy(xpath = "//strong")
    List<WebElement> infomationList;

    public String getUsername() {
        return infomationList.get(0).getText();
    }
}
