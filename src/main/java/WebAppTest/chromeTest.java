package WebAppTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class chromeTest {
      WebDriver driver;
      WebDriverWait wait;


      @Test
      public void setup(){
           // driver=new ChromeDriver();
          //  WebDriverManager manager=new ChromeDriverManager();
            WebDriverManager.firefoxdriver().setup();
           driver=new FirefoxDriver();
           driver.get("https://www.browserstack.com/selenium");
      }
}
