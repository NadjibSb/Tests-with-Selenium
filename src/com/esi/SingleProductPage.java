package com.esi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SingleProductPage extends PageObject {

    @FindBy(id="msku-sel-1") private WebElement color;
    @FindBy(id="msku-sel-2") private WebElement size;
    @FindBy(id="qtyTextBox") private WebElement qty;
    @FindBy(id="isCartBtn_btn") private WebElement button;


    public SingleProductPage(WebDriver driver) {
        super(driver);
    }

    public void chooseColor(int index){
        Select c = new Select(color);
        c.selectByIndex(index);
    }

    public void chooseSize(int index){
        Select s = new Select(size);
        s.selectByIndex(index);
    }

    public void setQty(int q){
        qty.clear();
        qty.sendKeys(q+"");
    }

    public void addCart(){
        button.click();
    }
}
