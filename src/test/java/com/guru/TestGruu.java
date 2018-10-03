package com.guru;

import com.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.guru.model.Customer;
//import org.openqa.selenium.WebDriver;
//import org.testng.Reporter;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import com.factory.DriverFactory;
//
//import java.util.logging.Logger;
//
public class TestGruu extends BaseTest{
    GruuLoginPage gruuLoginPage;

    @BeforeTest
    public void Setup(){
    gruuLoginPage = new GruuLoginPage();
    }

    @Test
    public void testLoginPage(){
        String username = "mngr154062";
        String password = "vUvejyn";
        gruuLoginPage.open();
        gruuLoginPage.login(username,password);

    }

}
//    WebDriver driver;
//    private static Logger Log = Logger.getLogger(Log.class.getName());
//    GruuLoginPage gruuLoginPage;
//    CreateNewCustomerPage createNewCustomerPage;
//    CreateNewAccount createNewAccount;
//    Deposit deposit;
//    Customer customer;
//
//    @BeforeTest
//    public void Setup() throws InterruptedException{
//
//        this.driver = DriverFactory.getInstance().getDriver();
//        Log.info("New driver instantiated");
//        gruuLoginPage = new GruuLoginPage(driver);
//        createNewCustomerPage = new CreateNewCustomerPage(driver);
//        createNewAccount = new CreateNewAccount(driver);
//        deposit = new Deposit(driver);
//    }
//
//    @Test
//    public void testLoginToGruu(){
//        DOMConfigurator.configure("log4j.xml");
//        String username = "mngr154062";
//        String password = "vUvejyn";
//        driver.get("http://demo.guru99.com/v4/");
//        Log.info("Open url");
//        gruuLoginPage.login(username, password);
//        Reporter.log("Sign In Successful | " );
//    }
//
//    @Test
//    public void testCreateNewCustumer(){
//        customer = new Customer();
//        customer.setName("Nguyen Van A");
//        customer.setGender("Female");
//        customer.setDayOfBirth("01/01/1999");
//        customer.setAddress("01 Street A");
//        customer.setCity("HCM City");
//        customer.setState("Binh Thanh");
//        customer.setPin("123456");
//        customer.setEmail("abc123456@gmail.com");
//        customer.setMobileNumber("0908888888");
//        customer.setPassword("Abc123");
//        testLoginToGruu();
//        createNewCustomerPage.navigateTo("http://demo.guru99.com/v4/manager/addcustomerpage.php");
//        createNewCustomerPage.addNewCUstomer(customer);
//    }
//
//    @Test
//    public void testCreateNewAccount(){
//        String[] accountData = {"123","Current","5000"};
//        testLoginToGruu();
//        createNewAccount.navigateTo("http://demo.guru99.com/v4/manager/addAccount.php");
//        createNewAccount.addNewAccount(accountData);
//        Log.info("create new account");
//        Reporter.log("Create account Successful | " );
//    }
//
//    @Test
//    public void testDeposit(){
//        String[] depositData = {"123456","5000","abc def"};
//        testLoginToGruu();
//        deposit.navigateTo("http://demo.guru99.com/v4/manager/DepositInput.php");
//        deposit.amountDeposit(depositData);
//    }
//    @Test
//    public void test(){
//
//    }
//
//}
