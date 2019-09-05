package Shopno_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class ShopnoTest {
	
	 WebDriver driver=new FirefoxDriver();
  @Test
  public void main() throws InterruptedException {
	 
		
		//SELECTION
		Select city = new Select(driver.findElement(By.id("state")));
	    city.selectByVisibleText("Dhaka");
	    Select area = new Select(driver.findElement(By.id("city")));
	    area.selectByVisibleText("Mohakhali");
	    JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
	    driver.findElement(By.id("btnFindStore")).click();
	    //REGISTRATION
	    /*driver.findElement(By.xpath("html/body/form/div[3]/center/div/div/center/div/div[1]/div[2]/div/div[2]/div[1]/div/a[2]")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.id("txtFirstName")).sendKeys("Nuzat Shorna");
	    Thread.sleep(5000);
	    driver.findElement(By.id("txtUserName")).sendKeys("nuzat.shornaalom@gmail.com");
	    //Thread.sleep(5000);
	    driver.findElement(By.id("txtMobileNo")).sendKeys("01675539600");
	    //Thread.sleep(6000);
	    driver.findElement(By.id("txtPassword")).sendKeys("1234567");
	    //Thread.sleep(5000);
	    driver.findElement(By.id("txtConfirmPassword")).sendKeys("1234567");
	    driver.findElement(By.id("btnSubmit")).click();*/
	    //LOGIN
	    driver.findElement(By.xpath("html/body/form/div[3]/center/div/div/center/div/div[1]/div[2]/div/div[2]/div[1]/div/a[1]")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_UserName")).sendKeys("nuzat.shornaalom@gmail.com");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_Password")).sendKeys("1234567");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_LoginImageButton")).click();
	    //Fruit
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("html/body/form/div[3]/center/div/div/center/div/div[1]/div[3]/div/div/ul/li[2]/a/span[2]")).click();
	    driver.findElement(By.xpath("html/body/form/div[3]/center/div/div/center/div/div[1]/div[3]/div/div/ul/li[2]/ul/li[1]/a")).click();
	    //Order
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("html/body/form/div[3]/center/div/div/center/div/div[3]/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div[2]/div/div[2]/a")).click();
	    //Scroll
	    JavascriptExecutor js1=(JavascriptExecutor)driver;
	    js1.executeScript("window.scrollBy(0,800)");
	    driver.findElement(By.xpath("html/body/form/div[3]/center/div/div/center/div/div[3]/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div[6]/div/div[2]/a")).click();
	    //Cart
	    driver.findElement(By.xpath("html/body/form/div[3]/center/div/div/center/div/div[1]/div[2]/div/div[3]/div/div[3]/div")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.className("btn_checkout")).click();
	    //Logout
	    driver.findElement(By.id("lnkLogout1")).click();

  }
  @BeforeMethod
  public void beforeMethod() {
	driver.get("http://www.shwapno.com/#");
  }

  @AfterMethod
  public void afterMethod() {
	 // driver.quit();
  }

}
