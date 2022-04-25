package com.Intigration.app;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.URL;

public class androidDemo {
  DesiredCapabilities dc;
  AndroidDriver driver;
  WebDriverWait wait;
  private String ANDROID_APP = "https://github.com/cloudgrey-io/the-app/releases/download/v1.4.0/TheApp-v1.4.0.apk";
  private String IOS_APP = "https://github.com/cloudgrey-io/the-app/releases/download/v1.4.0/TheApp-v1.4.0.app.zip";
  private String AVD_NAME = "emu27";
  private String APPIUM_SERVER = "http://localhost:4723/wd/hub";


  @BeforeClass
  public void setup()throws IOException {
    dc=new DesiredCapabilities();
    dc.setCapability("platformName", "Android");
    dc.setCapability("deviceName", "Android Emulator");
    dc.setCapability("automationName", "UiAutomator2");
    dc.setCapability("avd", AVD_NAME);
    dc.setCapability("app", ANDROID_APP);

    AndroidDriver driver = new AndroidDriver(new URL(APPIUM_SERVER), dc);

  }



  private By clipboardNav = MobileBy.AccessibilityId("Clipboard Demo");
  private By refreshClipboardBtn = MobileBy.AccessibilityId("refreshClipboardText");
  private By clipboardInput = MobileBy.AccessibilityId("messageInput");
  private By setTextBtn = MobileBy.AccessibilityId("setClipboardText");

  @Test
  public void testClipboard_Android() throws IOException {

    driver.openNotifications();
    String location=driver.location().toString();
   // driver.setGsmVoice(GsmVoiceState.off);
   // driver.makeGsmCall("5551237890", GsmCallActions.CALL);
  //  driver.setNetworkConnection(GsmSignalStrength.GOOD);


  }


}
