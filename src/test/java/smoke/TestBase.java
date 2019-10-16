package smoke;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class TestBase {
    public static AppiumDriver driver;
    protected static WebDriverWait wait;

    public  String login = "elena@mail.com";
    public String passOld = "P@ssword12"; //старый пароль
    public String pass = "P@ssword123"; //новый пароль

    @BeforeClass
    public static void setUp() throws Exception {
        File appDir = new File(".//app//");
        File app = new File(appDir, "app-localServer-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("deviceName", "Nexus");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("unicodeKeyboard",true);
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        WebDriverRunner.setWebDriver(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown(){
        wait = null;
        driver.closeApp();
    }
}