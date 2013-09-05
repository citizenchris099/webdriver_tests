import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver_Test {
	
		private WebDriver driver;
		  private String baseUrl;
		  private boolean acceptNextAlert = true;
		  private StringBuffer verificationErrors = new StringBuffer();

		  @Before
		  public void setUp() throws Exception {
		    driver = new FirefoxDriver();
		    baseUrl = "http://studio.balfour.com/";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }

		  @Test
		  public void test2014MontgomeryHSAdv() throws Exception {
		    driver.get("http://studio.balfour.com/forms/login");
		    driver.findElement(By.xpath("//*[@id=\"_58_project\"]")).clear();
		    driver.findElement(By.xpath("//*[@id=\"_58_project\"]")).sendKeys("412193");
		    driver.findElement(By.id("_58_login")).clear();
		    driver.findElement(By.id("_58_login")).sendKeys("swadmin");
		    driver.findElement(By.id("_58_password")).clear();
		    driver.findElement(By.id("_58_password")).sendKeys("yearbook14");
		    driver.findElement(By.id("_58_signIn")).click();
		  }

		  @After
		  public void tearDown() throws Exception {
		    driver.quit();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      fail(verificationErrorString);
		    }
		  }

		  private void fail(String verificationErrorString) {
			// TODO Auto-generated method stub
			
		}

		private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }

		  private boolean isAlertPresent() {
		    try {
		      driver.switchTo().alert();
		      return true;
		    } catch (NoAlertPresentException e) {
		      return false;
		    }
		  }

		  private String closeAlertAndGetItsText() {
		    try {
		      Alert alert = driver.switchTo().alert();
		      String alertText = alert.getText();
		      if (acceptNextAlert) {
		        alert.accept();
		      } else {
		        alert.dismiss();
		      }
		      return alertText;
		    } finally {
		      acceptNextAlert = true;
		    }
		  }
		  


	

}

