package CRM.base;

import CRM.common.Configuration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public abstract class BaseUiTest extends Configuration {

    protected WebDriver driver;

    @BeforeAll
    public static  void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    }


    @BeforeEach
    public void beforeTest(){

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(BASE_URL+LOGIN_PATH);
    }

   // @AfterEach
    public void tearDown (){driver.quit();}
}
