package com.appium.OTT.iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class OTT_Test1 {
  String udid="00008110-0002754202F8801E";
    private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo4ODg0NTk2LCJ4cC5wIjo1ODE0NTAzLCJ4cC5tIjoxNjYxMTY4NjE3NTczLCJleHAiOjE5NzY1Mjg2MTgsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.pDcD06nI00StpEoW2TR3YOF-i5N4N8yakMeqjj24NPg";
    protected IOSDriver<IOSElement> driver =null;
    DesiredCapabilities dc = new DesiredCapabilities();

    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("testName", "Quick Start iOS Native Demo");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
        dc.setCapability(MobileCapabilityType.APP, "cloud:com.QACOE.OTT");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.QACOE.OTT");
        dc.setCapability(MobileCapabilityType.UDID, udid);
       // driver = new IOSDriver<>(new URL("https://tscloud.vodafone.com/wd/hub"), dc);
        this.driver = new IOSDriver<>(new URL("http://0.0.0.0:4724/wd/hub"), dc);
    }

    @Test
    public void quickStartiOSNativeDemo() {
        driver.rotate(ScreenOrientation.PORTRAIT);
        driver.findElement(By.xpath("//*[@id='usernameTextField']")).sendKeys("company");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//*[@id='passwordTextField']")).sendKeys("company");
        driver.findElement(By.xpath("//*[@id='loginButton']")).click();
        driver.findElement(By.xpath("//*[@id='makePaymentButton']")).click();
        driver.findElement(By.xpath("//*[@id='phoneTextField']")).sendKeys("0541234567");
        driver.findElement(By.xpath("//*[@id='nameTextField']")).sendKeys("Jon Snow");
        driver.findElement(By.xpath("//*[@id='amountTextField']")).sendKeys("50");
        driver.findElement(By.xpath("//*[@id='countryButton']")).click();
        driver.findElement(By.xpath("//*[@id='Switzerland']")).click();
        driver.findElement(By.xpath("//*[@id='sendPaymentButton']")).click();
        driver.findElement(By.xpath("//*[@id='Yes']")).click();
    }

    @After
    public void tearDown() {
//        System.out.println("Report URL: "+ driver.getCapabilities().getCapability("reportUrl"));
       this.driver.quit();
    }
}