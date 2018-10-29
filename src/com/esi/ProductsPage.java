package com.esi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageObject {


    @FindBy(xpath="//ul[li/@r='1']") private WebElement item;



    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void selectFirstItem(){
        WebElement first = item.findElement(By.tagName("a"));
        first.click();
    }
}
