package tests;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import pages.SearchPage;
import utils.VisualGridConfig;

public class BaseTests {

  protected static WebDriver driver;
  protected static SearchPage page;


  @BeforeAll
  public static void setUp() {
    Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
    WebDriverManager.chromedriver().setup();
    Properties props = System.getProperties();
    try {
      props.load(
              new FileInputStream(new File("resources/test.properties")));
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(-1);
    }

    driver = new ChromeDriver();
    driver.get(System.getProperty("app.url"));
    page = new SearchPage(driver);
  }


  @AfterAll
  public static void tearDown() {
    driver.quit();
  }
}
