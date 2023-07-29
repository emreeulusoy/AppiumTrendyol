package Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities capabilities;
    public WebDriverWait wait;

    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {

        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 31");
        capabilities.setCapability(MobileCapabilityType.VERSION, "4.4");
        capabilities.setCapability("appPackage", "trendyol.com");
        capabilities.setCapability("appActivity", "com.trendyol.common.splash.impl.ui.SplashActivity");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        TimeUnit.SECONDS.sleep(5);
        wait = new WebDriverWait(driver, 10);

    }

    @AfterTest
    public void tearDown() {

        driver.quit();

    }
}

