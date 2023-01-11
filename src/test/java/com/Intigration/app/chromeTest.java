package com.Intigration.app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class chromeTest {

    WebDriver driver;
    WebDriverManager manager;
    WebDriverWait wait;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/documentation/");
        wait=new WebDriverWait(driver,500);
    }
    @Test
    public void execution() throws Exception{

        driver.findElement(By.id("m-documentationwebdriver-li")).click();
    }


    @AfterClass
    public void close(){
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //driver.quit();
    }
}
