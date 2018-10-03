/**
 * Created with IntelliJ IDEA.
 * User: Alan
 * Date: 24/04/13
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */

package com.guru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GruuManagerPage {
    WebDriver driver;
    public GruuManagerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void createNewCustumer(String name,String gender, String dayOfBirth, String address){

    }

    public void createNewAccount(){

    }

    public void deposit(){

    }
}
