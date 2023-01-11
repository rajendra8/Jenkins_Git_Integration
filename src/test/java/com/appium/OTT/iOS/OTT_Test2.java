package com.appium.OTT.iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class OTT_Test2 {
    String udid="00008110-0002754202F8801E";
    private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo4ODg0NTk2LCJ4cC5wIjo1ODE0NTAzLCJ4cC5tIjoxNjYxMTY4NjE3NTczLCJleHAiOjE5NzY1Mjg2MTgsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.pDcD06nI00StpEoW2TR3YOF-i5N4N8yakMeqjj24NPg";
    IOSDriver driver;
    DesiredCapabilities dc;



    @Test
    public void setUp() throws Exception{

        dc= new DesiredCapabilities();

        dc.setCapability("testName", "Quick Start iOS Native Demo");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
        dc.setCapability(MobileCapabilityType.APP, "cloud:com.QACOE.OTT");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.QACOE.OTT");
        dc.setCapability(MobileCapabilityType.UDID, udid);
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"iPhone13");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"15.0");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        driver= new IOSDriver(new URL("http://localhost:4723/wd/hub"),dc);
    }


}
