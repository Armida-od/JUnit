package Configuration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static WebDriver driver;

    @BeforeClass
    public static void startTest(){
        driver = DriverFactory.createDriver(WEBDRIVERS.CHROMECLEAN);
    }
    @AfterClass
    public static void endTest() throws InterruptedException{
        Thread.sleep(10000);
        driver.quit();
    }
}

