package com.anibis;

import com.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAnibis extends BaseTest {
    DefaultPage defaultPage;
    LoginPage loginPage;
    MemberPage memberPage;
    AdvertlistPage advertlistPage;
    ProfilePage profilePage;

    @BeforeTest
    public void Setup(){
    defaultPage =new

    DefaultPage();

    loginPage =new

    LoginPage();

    memberPage =new

    MemberPage();

    profilePage =new

    ProfilePage();

    advertlistPage =new

    AdvertlistPage();

}
    @Test
    public void testLoginUnsuccess() {
        String username = "";
        String password = "";
        loginPage.open();
        loginPage.login(username, password);
        assertEquals(loginPage.user.getCssValue("background"), "rgb(255, 236, 236) none repeat scroll 0% 0% / auto padding-box border-box");
    }

    @Test
    public void testLoginSuccess() {
        String username = "ani_test_2";
        String password = "ani_test_2";
        loginPage.open();
        loginPage.login(username, password);
        memberPage.navigateToProfilePage();
        assertEquals(profilePage.getUsername(), username);
    }

    @Test
    public void testSearchAValue() {
        String searchValueCatalogue = "Immobilien";
        String valueSearch = null;
        String location = "Zurich";
        String priceRangeFrom = null;
        String priceRangeTo = null;
        String locationDistance = "10 km";
        testLoginSuccess();
        memberPage.navigateToSearchPage();
        defaultPage.setItemSearch(searchValueCatalogue);
        advertlistPage.sendValueToField(valueSearch, priceRangeFrom, priceRangeTo, location, locationDistance);
        advertlistPage.sortListByDate();
        advertlistPage.getResultListData();
        System.out.println(advertlistPage.getResultListData().size());
    }
}
