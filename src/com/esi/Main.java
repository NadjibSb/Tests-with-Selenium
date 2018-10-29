package com.esi;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }



    @Test
    public void testWikipediaSearch() {
        System.setProperty("webdriver.chrome.driver", "WebDriver/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");

        WebElement button = driver.findElement(By.id("gh-shop-a"));
        button.click();

        WebElement categ = driver.findElement(By.linkText("Kids toys"));
        categ.click();

        WebElement action = driver.findElement(By.linkText("Action"));
        action.click();

        WebElement cat = driver.findElement(By.linkText("Car"));
        cat.click();

        String title = driver.getTitle();
        Assert.assertEquals(title,"Action Diecast and Toy Car for sale | eBay");

    }

    @Test
    public void exercice02() {

        System.setProperty("webdriver.chrome.driver", "WebDriver/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");

        WebElement searshBar = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("gh-ac")));
        searshBar.sendKeys("shoes men");
        searshBar.submit();

        WebElement item = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[li/@r='1']")));
        WebElement firstItem = item.findElement(By.tagName("a"));
        firstItem.click();

        WebElement selector1 = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("msku-sel-1")));
        Select couleur = new Select(selector1);
        couleur.selectByIndex(2);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement selector2 = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("msku-sel-2")));
        Select size = new Select(selector2);
        size.selectByIndex(1);

        WebElement qty = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("qtyTextBox")));
        qty.clear();
        qty.sendKeys("2");

        WebElement btn = driver.findElement(By.id("isCartBtn_btn"));
        btn.click();

    }

}
