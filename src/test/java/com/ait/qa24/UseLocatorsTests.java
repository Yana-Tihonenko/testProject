package com.ait.qa24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class UseLocatorsTests {
  WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    //driver.get("https://www.bit.trade/ru/login");
    driver.navigate().to("https://ilcarro.web.app");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void findElementTest() {
    driver.findElement(By.id("city"));
    driver.findElement(By.className("navigator-link"));
    driver.findElement(By.linkText("Search"));
  }

  @Test
  public void findElementByScc() {
    driver.findElement(By.cssSelector("#city"));
    driver.findElement(By.cssSelector("[type=\"text\"]"));
    driver.findElement(By.cssSelector("[class*='offers']"));
    driver.findElement(By.cssSelector("[class^='special']"));
    driver.findElement(By.cssSelector("[class$='container']"));
  }

  @Test
  public void findElementByXpath() {
    driver.findElement(By.xpath("//*[@id='city']"));

  }
}
