package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {
  @Test
  public void googleHomepage() {

	  WebDriverManager.chromedriver().setup();
	 
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\AutomationPathFiles\\chromedriver.exe"); ChromeOptions co = new
		 * ChromeOptions(); co.addArguments("--remote-allow-origins=*"); WebDriver
		 * driver = new ChromeDriver(co);
		 */
	 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		

  }
}
