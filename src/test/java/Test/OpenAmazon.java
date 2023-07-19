package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAmazon {
  @Test
  public void amazonHomepage() {
	  
	 System.setProperty("webdriver.chrome.driver","E:\\AutomationPathFiles\\chromedriver.exe");
	 ChromeOptions co = new ChromeOptions();
	 co.addArguments("--remote-allow-origins=*");
	 WebDriver driver = new ChromeDriver(co);
	 driver.get("https://www.amazon.in/");
  }
}
