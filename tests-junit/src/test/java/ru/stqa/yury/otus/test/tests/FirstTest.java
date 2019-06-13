package ru.stqa.yury.otus.test.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
  private WebDriver driver;
  private static final Logger logger = LogManager.getLogger(FirstTest.class);

  @Test
  public void test() {
    try {
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
      driver.get("https://otus.ru/"); //запуск браузера с заданным URL
      String URL = driver.getCurrentUrl(); //берем актуальный URL
      Assert.assertEquals(URL, "https://otus.ru/" );//сравниваем
    } finally {
      if (driver != null) {
        driver.quit();
        driver = null;
      }
    }
    logger.info("INFO", new Throwable());
    logger.debug("DEBUG", new Throwable());
    logger.error("ERROR", new Throwable());
    logger.fatal("FATAL", new Throwable());
    logger.warn("WARN", new Throwable());
  }
}

