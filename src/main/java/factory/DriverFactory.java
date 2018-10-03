/**
 * Created with IntelliJ IDEA.
 * User: Alan
 * Date: 24/04/13
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */

package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    protected DriverFactory(){
        //Do-nothing..Do not allow to initialize this class from outside
    }
    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance() {
        return instance;
    }

    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>(){ // thread local driver object for webdriver
        @Override
        protected WebDriver initialValue() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tien Tuan\\Downloads\\gs-spring-boot-master\\gs-spring-boot-master\\seleniumexample\\src\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            return driver; // can be replaced with other browser drivers
        }
    };

    public WebDriver getDriver(){ // call this method to get the driver object and launch the browser
        return driver.get();
    }

    public void removeDriver(){ // Quits the driver and closes the browser
        driver.get().quit();
        driver.remove();
    }
}
