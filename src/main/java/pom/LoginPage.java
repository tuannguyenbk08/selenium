/**
 * Created with IntelliJ IDEA.
 * User: Alan
 * Date: 24/04/13
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */

package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

public class LoginPage extends pom.BasePage {
    JavascriptExecutor js;


    @FindBy(id = "ctl00_phlContent_txtUsername")
    public
    WebElement user;

    @FindBy(id = "ctl00_phlContent_txtPassword")
    WebElement pass;

    @FindBy(id = "ctl00_phlContent_btnLogin")
    WebElement btnLogin;

    @FindBy(id = "ctl00_phlContent_txtUsername-error")
    WebElement errorMsgUsername;

    @FindBy(id = "ctl00_phlContent_txtPassword-error")
    WebElement errorMsgPassword;

    public void open() {

        driver.get(LOGIN_URL);
        assertTrue(btnLogin.isDisplayed());
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void moveCursorToUsername() {
        js = (JavascriptExecutor)driver;
        String selectionStart = "";
        String rightPossition = "";
    }

    public void login(String username, String password) {
        user.sendKeys(username);
        pass.sendKeys(password);
        btnLogin.click();

        if (((username == "")) && (errorMsgUsername.getText().equals("Wir benötigen diese Angabe"))) {
            errorMsgUsername.getText().equals("Wir benötigen diese Angabe");
        }
    }
    public boolean isCursorOnUsernameTextbox(){
        String slectionStart = "";
        String rightPossition = "";
        return true;
    }
}
