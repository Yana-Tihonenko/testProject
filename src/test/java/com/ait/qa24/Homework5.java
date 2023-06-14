package com.ait.qa24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework5 {
  WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.navigate().to("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

  }

  @Test
  public void findElementByCss() {
    //driver.findElement(By.cssSelector("a[href$='logo.jpg']"));
    driver.findElement(By.cssSelector("input[class='search-box-text ui-autocomplete-input']"));
    driver.findElement(By.cssSelector("div.topic-html-content-body p:first-child"));
    driver.findElement(By.cssSelector("div#flyout-cart"));
  driver.findElement(By.cssSelector("div[class = 'block block-newsletter'] strong > font font:first-child"));
    //  driver.findElement(By.cssSelector("div#newsletter-subscribe-block span:first-child > font:first-child"));
    driver.findElement(By.cssSelector("div#newsletter-subscribe-block input[type='button']"));
    driver.findElement(By.id("nivo-slider"));
    driver.findElement(By.cssSelector("div.search-box input"));






  }
}
