package com.esi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @FindBy(id="gh-ac") private WebElement searshBar;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void searsh(String keyWord){
        searshBar.sendKeys(keyWord);
    }

    public void submit(){
        searshBar.submit();
    }
}
