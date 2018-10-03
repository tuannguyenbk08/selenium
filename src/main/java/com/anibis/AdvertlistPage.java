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
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AdvertlistPage extends BasePage {

    @FindBy(id = "ctl00_phlContent_Filter_ctlPriceRange_txtFrom")
    WebElement priceRangeFromText;

    @FindBy(id = "ctl00_phlContent_Filter_ctlPriceRange_txtTo")
    WebElement priceRangeToText;

    @FindBy(id = "ctl00_phlContent_Filter_ctlLocation_ctlLocationAutocomplete_divLocation")
    WebElement locationText;

    @FindBy(id = "ctl00_phlContent_Filter_ctlLocation_ddlDistance")
    WebElement locationDistanceText;

    @FindBy(xpath = "//div[@class = 'column span-three']/a")
    List<WebElement> resultListDatas;

    @FindBy(id = "ctl00_phlContent_ResList_ddlSorting")
    WebElement listSort;

    public void sendValueToField(String valueSearch, String priceFrom,String priceTo, String location,String locationDistance) {
//        priceRangeFromText.sendKeys(priceFrom);
//        priceRangeToText.sendKeys(priceTo);
        locationText.sendKeys(location);
        locationDistanceText.sendKeys(locationDistance);

    }

    public void sortListByDate(){
        Select dropdown = new Select(listSort);
        dropdown.selectByIndex(2);
    }

    public List<String> getResultListData(){
        List<String> list = new ArrayList<String>();
        for (WebElement resultListData : resultListDatas){
            list.add(resultListData.getText());
        }
        return list;
    }
}
