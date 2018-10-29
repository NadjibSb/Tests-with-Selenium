package com.esi;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPOM {
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "WebDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
    }

    @Test
    public void testEbay (){

        MainPage mainPage = new MainPage(driver);
        mainPage.searsh("shoes men");
        mainPage.submit();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.selectFirstItem();

        SingleProductPage singleProductPage = new SingleProductPage(driver);
        singleProductPage.chooseColor(2);
        singleProductPage.chooseSize(1);
        singleProductPage.setQty(2);
        singleProductPage.addCart();

    }
}
