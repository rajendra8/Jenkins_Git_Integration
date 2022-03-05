package com.Intigration.app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("add method ca" + add(10,16));
      // WebDriver driver= new SafariDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().driverVersion("98.0.4758.109").setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.apple.com");
       String title= driver.getTitle().toString();
        System.out.println(title);
        driver.quit();
    }
    public static int add(int n1, int n2) {
        return n1 + n2;
    }
}
