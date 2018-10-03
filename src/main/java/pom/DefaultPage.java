/**
 * Created with IntelliJ IDEA.
 * User: Alan
 * Date: 24/04/13
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */

package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class DefaultPage extends pom.BasePage {
    @FindBy(id = "ctl00_Header1_ctlHeaderMetaBar_ucMainLinks_hypMyAnibis")
    WebElement loginElement;

    @FindBy(xpath = "//a[@id='ctl00_Header1_ctlHeaderMetaBar_ucMainLinks_hypSearch']")
    WebElement searchButton;

    @FindBy(id = "ctl00_phlContent_ctlHeaderSearchFilter_ctlKeywordAutocomplete_divKeyword")
    public WebElement inputSearchText;

//    @FindBy(id = "ctl00_phlContent_ctlHeaderSearchFilter_ctlKeywordAutocomplete_btnSearch")
//    public WebElement searchButton;

    @FindBy(xpath = "//li[@class = 'link-list-item']/a")
    public List<WebElement> listItemCatalogues;

    public void navigateTo(String url){
        driver.get(url);
    }
    public void navigateToLoginPage(){
    loginElement.click();
    }
    public void setItemSearch(String itemNameSearch) {
        for (WebElement listItemCatalogue : listItemCatalogues) {
            if (listItemCatalogue.getAttribute("outerText").equals(itemNameSearch)) {
                listItemCatalogue.click();
                break;
            }
        }
    }
    public void navigateToSearchPage(){
        searchButton.click();
    }
}
