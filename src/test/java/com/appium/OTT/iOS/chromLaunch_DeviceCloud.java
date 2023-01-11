package com.appium.OTT.iOS;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.rules.Timeout;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class chromLaunch_DeviceCloud {
    private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo4ODg0NTk2LCJ4cC5wIjo1ODE0NTAzLCJ4cC5tIjoxNjYxMTY4NjE3NTczLCJleHAiOjE5NzY1Mjg2MTgsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.pDcD06nI00StpEoW2TR3YOF-i5N4N8yakMeqjj24NPg";
    protected AndroidDriver driver = null;
    DesiredCapabilities dc=new DesiredCapabilities();

    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("testName", "Quick Start Android Browser Demo");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='android' and @category='PHONE'");
        dc.setBrowserName(MobileBrowserType.CHROMIUM);
        dc.setCapability(MobileCapabilityType.UDID,"320074f6b43365cd");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Samsung");
        driver = new AndroidDriver(new URL("https://tscloud.vodafone.com/wd/hub"), dc);
    }

    @Test
    public void quickStartAndroidBrowserDemo() {
        driver.rotate(ScreenOrientation.PORTRAIT);
        driver.get("https://www.google.com");
        WebElement searchBar = new WebDriverWait(driver, 10 ).until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        searchBar.sendKeys("Experitest");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    @After
    public void tearDown() {
        System.out.println("Report URL: "+ driver.getCapabilities().getCapability("reportUrl"));
        driver.quit();
    }

}

