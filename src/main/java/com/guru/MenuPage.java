/**
 * Created with IntelliJ IDEA.
 * User: Alan
 * Date: 24/04/13
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */

package com.guru;

import com.model.Meal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MenuPage {
    WebDriver driver;
    public void navigateTo(String url) {
        driver.get(url);
    }

    public List<Meal> getMeals() {
        String MEALS_XPATH = "";
        String NAME_XPATH="";
        String PRICE_XPATH = "";
        String IMAGE_URL_XPATH = "";
        List<WebElement> mealElements = driver.findElements(By.xpath(MEALS_XPATH));
        List<Meal> meals = new ArrayList<Meal>();
        for(int i=0;i<mealElements.size();i++){
            Meal meal = new Meal();
            String name;
            String price;
            String imageUrl;
            name = driver.findElement(By.xpath(MEALS_XPATH+NAME_XPATH)).getAttribute("");
            price = driver.findElement(By.xpath(MEALS_XPATH+PRICE_XPATH)).getAttribute("");
            imageUrl = driver.findElement(By.xpath(MEALS_XPATH+IMAGE_URL_XPATH)).getAttribute("");

            meal.setName(name);
            meal.setPrice(price);
            meal.setImageUrl(imageUrl);
            meals.add(meal);
        }

        return meals;
    }
}
