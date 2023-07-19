package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Patym {
  @Test
  public void paytmHomepage() {
	  System.setProperty("webdriver.chrome.driver","E:\\AutomationPathFiles\\chromedriver.exe");
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(co);
		 driver.get("https://www.paytm.com");
  }
}
