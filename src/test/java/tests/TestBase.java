package tests;

import io.appium.java_client.AppiumDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static AppiumDriver driver;
    protected static WebDriverWait wait;

    @BeforeClass //
    public static void setUp() throws MalformedURLException {
        File appDir = new File(".//app//");
        File app = new File(appDir, "app-release.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // параметры для установки Appium
        capabilities.setCapability("automationName",  "UiAutomator2");
        capabilities.setCapability("deviceName","192.168.123.101:5555");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("unicodeKeyboard", true);
        try{
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown(){
        wait = null;
        driver.quit();
    }

}
