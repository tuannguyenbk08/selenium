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

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MemberPage extends BasePage {
    @FindBy(xpath = "//div[@class='column'][5]/a")
    private WebElement profile;

    @FindBy(xpath = "//a[@id='ctl00_Header1_ctlHeaderMetaBar_ucMainLinks_hypSearch']")
    WebElement searchButton;

    public void navigateToSearchPage(){
        searchButton.click();
        DefaultPage defaultPage = new DefaultPage();
        assertTrue(defaultPage.inputSearchText.isDisplayed());
        assertTrue(defaultPage.searchButton.isDisplayed());
    }

    public void navigateToProfilePage(){
        profile.click();
    }
}
