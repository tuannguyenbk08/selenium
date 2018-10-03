/**
 * Created with IntelliJ IDEA.
 * User: Alan
 * Date: 24/04/13
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */

package pom;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;
    public BasePage(){
        driver = DriverFactory.getInstance().getDriver();
        PageFactory.initElements(driver,this);
    }

    static final String LOGIN_URL = "https://www.anibis.ch/fr/login.aspx";
    static final String BASE_URL = "https://www.anibis.ch/fr/default.aspx";
    static final String MEMBER_PROFILE_URL = "https://www.anibis.ch/member/profile.aspx?lng=de";
}
